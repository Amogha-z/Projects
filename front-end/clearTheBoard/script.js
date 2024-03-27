function getId(id) {
    return document.getElementById(id);
}
const INPUTBOX = getId("userInput");
INPUTBOX.style.fontSize = "25px";

let level1 = [
    "Port",
    "Soup",
    "Lick",
    "Wind",
    "Ping",
    "Tuck",
    "Soul",
    "Melt",
    "Luck",
    "Sink",
    "Frog",
    "Desk",
    "Yarn",
    "Pool",
    "Meow",
];

let level2 = [
    "Dome",
    "Cube",
    "Bark",
    "Hike",
    "Boat",
    "Book",
    "Gold",
    "Fish",
    "Cake",
    "Duck",
    "Word",
    "Life",
    "Ball",
    "Cups",
    "Note",
    "Hill",
    "Walk",
    "Away",
    "Flow",
    "Crop",
    "Lake",
    "Love",
    "Hate",
    "Pure",
    "Fall",
    "Food",
    "Lamb",
    "Kite",
    "Star",
    "Pain",
];

let level3 = [
    "Jolt",
    "Drum",
    "Pave",
    "Wisp",
    "Lime",
    "Rave",
    "Tint",
    "Plum",
    "Grin",
    "Rusk",
    "Mule",
    "Pint",
    "Torn",
    "Fume",
    "Lure",
    "Zone",
    "Clap",
    "Mint",
    "Rust",
    "Jazz",
    "Brim",
    "Flap",
    "Glow",
    "Blur",
    "Clip",
    "Slab",
    "Knit",
    "Fret",
    "Pelt",
    "Grip",
    "Weld",
    "Bolt",
    "Wide",
    "Loom",
    "Bend",
    "Lush",
    "Sift",
    "Clog",
    "Drip",
    "Warp",
    "Gale",
    "Pore",
    "Roar",
    "Twin",
    "Skim",
];

let lvl;
let lvlCopy;
let currentLevel;
function levels(n) {
    getId("everything").style.display = "flex";
    getId("landingPage").style.display = "none";
    currentLevel = n;
    switch (n) {
        case 1:
            lvl = level1;
            lvlCopy = level1.slice();
            create();
            break;
        case 2:
            lvl = level2;
            lvlCopy = level2.slice();
            create();
            break;
        case 3:
            lvl = level3;
            lvlCopy = level3.slice();
            create();
            break;
    }
}

let rightGuesses = [];
let boxIds = [];
getId("topBar").style.pointerEvents = "none";
function create(isRestart) {
    getId("topBar").style.pointerEvents = "all";
    getId("topBar").style.display = "flex";
    getId("landingPage").style.display = "none";
    // getId("everything").style.height = "auto";
    getId("twinWords").style.opacity = "1";
    getId("start").style.display = "none";
    let words = [];
    let boxes = "";
    boxIds = [];
    if (isRestart) {
        getId("score").textContent = "0";
        hideResults();
        clearInterval(timer);
        if (lvl === level2) {
            MIN.textContent = "05";
        } else if (lvl === level3) {
            MIN.textContent = "07";
        } else {
            MIN.textContent = "03";
        }
        SEC.textContent = "00";
        runTimer();
        POPUPBOX.style.scale = "0";
        GAME.style.filter = "blur(0)";
        GAME.style.pointerEvents = "all";
        isPopupVisible = false;
        lvl.forEach(filllvl);
        rightGuesses = [];
        boxIds = [];
        for (let i = 0; i < lvl.length * 2; i++) {
            lvlCopy = lvl.slice();
            boxes += `<button type="button" class="twoLetters" id="twoLetter${i}" onclick="letterBoxClicked(this)"></button>`;
        }
        getId("twinWords").innerHTML = boxes;
    } else {
        lvlCopy.forEach(filllvl);
        for (let i = 0; i < lvlCopy.length * 2; i++) {
            boxes += `<button type="button" class="twoLetters" id="twoLetter${i}" onclick="letterBoxClicked(this)"></button>`;
        }
        getId("twinWords").innerHTML = boxes;
    }

    function filllvl(elem) {
        let splitted1 = elem.substring(0, 2);
        let splitted2 = elem.substring(2, 4);
        words.push(splitted1, splitted2);
    }
    words.forEach(randomizelvl);

    function randomizelvl(elem) {
        let randomIndex = Math.floor(Math.random() * words.length);
        while (getId(`twoLetter${randomIndex}`).textContent != "") {
            randomIndex = Math.floor(Math.random() * words.length);
        }
        getId(`twoLetter${randomIndex}`).textContent = elem.toUpperCase();
        boxIds.push(`twoLetter${randomIndex}`);
    }
}

let prevBox;

function letterBoxClicked(box) {
    INPUTBOX.textContent += box.textContent;
    box.style.backgroundColor = "gray";
    if (INPUTBOX.textContent.length == 4) {
        let regexChecker = new RegExp(`${INPUTBOX.textContent}`, "i");

        if (regexChecker.test(lvlCopy)) {
            getId("score").textContent++;
            rightGuesses.push(box.id, prevBox);

            box.style.opacity = "0";
            getId(prevBox).style.opacity = "0";

            box.setAttribute("disabled", "");
            getId(prevBox).setAttribute("disabled", "");

            let formattedInput =
                INPUTBOX.textContent.substring(0, 1) +
                INPUTBOX.textContent.slice(1).toLowerCase();

            let removedInd = lvlCopy.indexOf(formattedInput);
            let removedId1 = boxIds.indexOf(getId(prevBox).id);

            if (removedId1 !== -1) {
                boxIds.splice(removedId1, 2);
            } else {
                console.log("BOXIDS NOT WORKING");
            }

            if (removedInd !== -1) {
                lvlCopy.splice(removedInd, 1);
            } else {
                console.log("Oops");
            }

            INPUTBOX.style.color = "green";

            if (lvlCopy.length == 0) {
                showResult(true);
                clearInterval(timer);
            }
            setTimeout(function () {
                INPUTBOX.style.color = "white";
                INPUTBOX.textContent = "";
            }, 500);
        } else {
            INPUTBOX.style.color = "orangered";
            theWorldIsDisabled();
            setTimeout(function () {
                INPUTBOX.style.color = "white";
                theWorldIsEnabled();
                INPUTBOX.textContent = null;
                box.style.backgroundColor = "#0096c9";
                getId(prevBox).style.backgroundColor = "#0096c9";
            }, 500);
        }
    } else {
        prevBox = box.id;
    }
}

let timer;

const MIN = getId("minutes");
const SEC = getId("seconds");

function runTimer() {
    let totalSec = MIN.textContent * 60 + +SEC.textContent;
    timer = setInterval(function () {
        totalSec--;
        MIN.textContent = `${Math.floor(totalSec / 60)}`.padStart(2, "0");
        SEC.textContent = `${totalSec % 60}`.padStart(2, "0");
        if (totalSec == 0) {
            clearInterval(timer);
            theWorldIsDisabled();
            showResult(false);
            GAME.style.pointerEvents = "none";
        }
    }, 1000);
}

function theWorldIsDisabled() {
    const DIV = document.getElementsByClassName("twoLetters");
    for (let i = 0; i < DIV.length; i++) {
        DIV[i].setAttribute("disabled", "");
    }
}

function theWorldIsEnabled() {
    const DIV = document.getElementsByClassName("twoLetters");
    for (let i = 0; i < DIV.length; i++) {
        if (!rightGuesses.includes(DIV[i].id)) {
            DIV[i].removeAttribute("disabled");
        }
    }
}

const POPUPBOX = getId("popup");
const GAME = getId("everything");
let isPopupVisible = false;

function showThyPopup() {
    if (isPopupVisible) {
        runTimer();
        POPUPBOX.style.scale = "0";
        GAME.style.filter = "blur(0)";
        GAME.style.pointerEvents = "all";
        isPopupVisible = false;
    } else {
        getId("popUp-score").textContent = getId("score").textContent;
        getId("popUp-min").textContent = MIN.textContent;
        getId("popUp-sec").textContent = SEC.textContent;
        clearInterval(timer);
        POPUPBOX.style.scale = "1";
        GAME.style.filter = "blur(3px)";
        GAME.style.pointerEvents = "none";
        isPopupVisible = true;
    }
}

function shuffle() {
    rightGuesses = [];
}

function quit() {
    window.open("", "_self");
    window.close();
}

const RESULTPAGE = getId("result");
const RESULTSTATUS = getId("resultStatus");
const RESULTSCORE = getId("resultScore");
const NEXT = getId("nextLevel");
const SNOW = getId("fallingSnow");

function showResult(won) {
    RESULTPAGE.style.pointerEvents = "all";
    getId("topBar").style.pointerEvents = "none";
    rightGuesses = [];
    RESULTPAGE.style.scale = "1";
    if (won) {
        SNOW.style.display = "block";
        RESULTPAGE.style.background = "linear-gradient(#1976d2,#2196f3,#49b6ff)";
        NEXT.style.display = "block";
        RESULTSTATUS.textContent = "You won this level!";
        RESULTSCORE.textContent = getId("score").textContent;
        if (currentLevel == 3) {
            NEXT.style.display = "none";
        }
    } else {
        SNOW.style.display = "block";
        RESULTPAGE.style.background =
            "linear-gradient(315deg, #ffffff 0%, #5899e2 74%)";
        NEXT.style.display = "none";
        RESULTSTATUS.textContent = "You lost this level!";
        RESULTSCORE.textContent = getId("score").textContent;
    }
}

function hideResults() {
    SNOW.style.display = "none";
    RESULTPAGE.style.pointerEvents = "none";
    getId("topBar").style.pointerEvents = "all";
    clearInterval(timer);
    if (lvl === level2) {
        MIN.textContent = "05";
    } else if (lvl === level3) {
        MIN.textContent = "07";
    } else {
        MIN.textContent = "03";
    }
    SEC.textContent = "00";
    runTimer();
    RESULTPAGE.style.scale = "0";
}

function nxtLvl() {
    getId("score").textContent = 0;
    switch (currentLevel) {
        case 1:
            levels(2);
            hideResults();
            break;
        case 2:
            levels(3);
            hideResults();
            break;
        default:
            hideResults();
            break;
    }
}

let hintChange;
function hint() {
    hintChange;
    let randomNum = Math.floor(Math.random() * boxIds.length);
    while (randomNum % 2 != 0) {
        randomNum = Math.floor(Math.random() * boxIds.length);
    }
    let randomNum2 = randomNum + 1;
    console.log(randomNum);
    let word1Id = boxIds[randomNum];
    let word2Id = boxIds[randomNum2];
    console.log(word1Id, word2Id);
    getId(word1Id).style.backgroundColor = "#4ABFE6";
    getId(word2Id).style.backgroundColor = "#4ABFE6";
    hintChange = setTimeout(function () {
        getId(word1Id).style.backgroundColor = "#0096C9";
        getId(word2Id).style.backgroundColor = "#0096C9";
    }, 1000);
}
