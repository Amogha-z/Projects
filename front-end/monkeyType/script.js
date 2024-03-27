// const contents = [
//   "For nothing is fixed, forever and forever and forever, it is not fixed; the earth is always shifting, the light is always changing, the sea does not cease to grind down rock. Generations do not cease to be born, and we are responsible to them because we are the only witnesses they have. The sea rises, the light Fails, lovers cling to each other, and children cling to us. The moment we cease to hold each other, the moment we break Faith with one another, the sea engulfs us and the light goes out.",
//   "No matter the medicinal virtues of being a true friend or sustaining a long close relationship with another, the ultimate touchstone of friendship is not improvement, neither of the other nor of the self, the ultimate touchstone is witness, the privilege of having been seen by someone and the equal privilege of being granted the sight of the essence of another, to have walked with them and to have believed in them, and sometimes just to have accompanied them for however brief a span, on a journey impossible to accomplish alone.",
//   "For what prevents us from saying that the happy life is to have a mind that is free, lofty, fearless and steadfast - a mind that is placed beyond the reach of fear, beyond the reach of desire, that counts virtue the only good, baseness the only evil, and all else but a worthless mass of things, which come and go without increasing or diminishing the highest good, and neither subtract any part from the happy life nor add any part to it?",
//   "Everyone must leave something behind when he dies, my grandfather said. A child or a book or a painting or a house or a wall built or a pair of shoes made. Or a garden planted. Something your hand touched some way so your soul has somewhere to go when you die, and when people look at that tree or that flower you planted, you're there.",
//   "Under the influence of great fear, almost everybody becomes superstitious. Collective fear stimulates herd instinct, and tends to produce ferocity towards those who are not regarded as members of the herd. Fear generates impulses of cruelty, and therefore promotes such superstitious beliefs as seem to justify cruelty. Neither a man nor a crowd nor a nation can be trusted to act humanely or to think sanely under the influence of a great fear.",
// ];
// const TIMER = document.querySelector(".timer");
// let typed; //will store the span elements from the textarea
// let anyKey; // whatever key you click on
// let correctCharacter = 0; // for WPM 
// let wrongCharacters = 0; // for accuracy
// let indices = 0; // for next next position of letters
// let start; //for timer

// function init(){
//     let chosenPara = contents[Math.round(Math.random()*(contents.length-1))] //to get a random para
//     const charArray = chosenPara.split(""); //to split into individual letters
//     // console.log(charArray);
//     // console.log(contentLength);
//     let individual = "";
//     charArray.forEach(function(chr,index){
//         individual += `<span id='i${index}' class="characters">${chr}</span>`//to set a style to each char 
//     })
//     document.querySelector(".texts").innerHTML = individual; //adding the elements to the textarea
// }
// // init();
// function verify(event){
//     if(!start){
//         timerStart();
//     }
//     typed = document.querySelector(".texts").children[indices]; // this will have all the children which are the span elements
//     if(event.keyCode>=32 && event.keyCode<=127){ //will check the keys using ASCII
//         if(event.key==typed.textContent){
//             typed.classList.add("matched"); //will add the class "matched" to that span element if matched 
//             correctCharacter++; //will increment the count of correctly typed words
//             anyKey++ 
//         }
//         else{
//             typed.classList.add("wrong");  //will add the class "wrong" to that span element if not matched 
//             wrongCharacters++; //will increment the count of wrongly typed words
//             anyKey++
//         }
//         indices++;
//     }
//     else if(event.keyCode==8 && indices>0){ //if key is backspace, decrement the index, number of typed keys and count of wrong chars.
//         indices--;
//         wrongCharacters--;
//         anyKey--;
//         typed = document.querySelector(".texts").children[indices];
//         if(typed.classList.contains("wrong")){ //removes the class "wrong" from that span element.
//             typed.classList.remove("wrong");
//         }
//         else if(typed.classList.contains("matched")){ //if its a match , dont remove the class and stay on that position only.
//             indices=indices+1;
//         }
//     }
//     if(correctCharacter>wrongCharacters){ // if the count of matched is greater than unmatched, then wpm and accuracy can be calculated
//         calculateWPM(); // calculateAccuracy();
//     }
//     if (TIMER.textContent === "00") {
//         finish();
//     }
// }

// function calculateWPM(){ //to calculate words per minute. THIS CALCULATION IS ABSOLUELY INACCURATE!
//     let wpm = (correctCharacter/5);
//     document.querySelector(".wpm").textContent = wpm;
// }

// function calculateAccuracy(){ //to calculate the accuracy based on matching characters.
//     let totalCharacters = correctCharacter+wrongCharacters;
//     let accuracyPercentage = 0;
//     if(totalCharacters>0){
//         accuracyPercentage = ((correctCharacter/totalCharacters)*100).toFixed(2);
//     }
//     document.querySelector(".accuracy").textContent = accuracyPercentage + "%";
// }

// function finish(){ //if the time is over, stop everything.
//         document.querySelector(".timer").style.color = "";
//         document.querySelector(".accuracy").style.color = "";
        
//         window.removeEventListener("keydown",verify);
//         calculateAccuracy();
// }

// function timerStart() {
//     start = setInterval(function() {
//         TIMER.textContent = String(TIMER.textContent - 1).padStart(2, "0");
//         if (TIMER.textContent < 1) {
//             clearInterval(start);
//         }
//     }, 1000);
// }

// function replay(){
//     window.location.reload();
// }

// window.addEventListener("keydown",verify);
// init();

const contents = [
    "For nothing is fixed, forever and forever and forever, it is not fixed; the earth is always shifting, the light is always changing, the sea does not cease to grind down rock. Generations do not cease to be born, and we are responsible to them because we are the only witnesses they have. The sea rises, the light Fails, lovers cling to each other, and children cling to us. The moment we cease to hold each other, the moment we break Faith with one another, the sea engulfs us and the light goes out.",
    "No matter the medicinal virtues of being a true friend or sustaining a long close relationship with another, the ultimate touchstone of friendship is not improvement, neither of the other nor of the self, the ultimate touchstone is witness, the privilege of having been seen by someone and the equal privilege of being granted the sight of the essence of another, to have walked with them and to have believed in them, and sometimes just to have accompanied them for however brief a span, on a journey impossible to accomplish alone.",
    "For what prevents us from saying that the happy life is to have a mind that is free, lofty, fearless and steadfast - a mind that is placed beyond the reach of fear, beyond the reach of desire, that counts virtue the only good, baseness the only evil, and all else but a worthless mass of things, which come and go without increasing or diminishing the highest good, and neither subtract any part from the happy life nor add any part to it?",
    "Everyone must leave something behind when he dies, my grandfather said. A child or a book or a painting or a house or a wall built or a pair of shoes made. Or a garden planted. Something your hand touched some way so your soul has somewhere to go when you die, and when people look at that tree or that flower you planted, you're there.",
    "Under the influence of great fear, almost everybody becomes superstitious. Collective fear stimulates herd instinct, and tends to produce ferocity towards those who are not regarded as members of the herd. Fear generates impulses of cruelty, and therefore promotes such superstitious beliefs as seem to justify cruelty. Neither a man nor a crowd nor a nation can be trusted to act humanely or to think sanely under the influence of a great fear."
  ];
  const TIMER = document.querySelector(".timer");
  let typed; //will store the span elements from the textarea
  let anyKey; // whatever key you click on
  let correctCharacter = 0; // for WPM 
  let wrongCharacters = 0; // for accuracy
  let indices = 0; // for next next position of letters
  let start; //for timer
  
  function init(){
      let chosenPara = contents[Math.round(Math.random()*(contents.length-1))] //to get a random para
      const charArray = chosenPara.split(""); //to split into individual letters
      // console.log(charArray);
      // console.log(contentLength);
      let individual = "";
      charArray.forEach(function(chr,index){
          individual += `<span id='i${index}' class="characters">${chr}</span>`//to set a style to each char 
      })
      document.querySelector(".texts").innerHTML = individual; //adding the elements to the textarea
  }
  // init();
  function verify(event){
      if(!start){
          timerStart();
      }
      typed = document.querySelector(".texts").children[indices]; // this will have all the children which are the span elements
      if ((65 <= event.keyCode && event.keyCode <= 90) || (event.keyCode == 32) || (48 <= event.keyCode && event.keyCode <= 57) || (186 <= event.keyCode && event.keyCode <= 222)){ //will check the keys using ASCII
          if(event.key==typed.textContent){
              typed.classList.add("matched"); //will add the class "matched" to that span element if matched 
              correctCharacter++; //will increment the count of correctly typed words
              anyKey++ 
          }
          else{
              typed.classList.add("wrong");  //will add the class "wrong" to that span element if not matched 
              wrongCharacters++; //will increment the count of wrongly typed words
              anyKey++
          }
          indices++;
      }
      else if(event.keyCode==8 && indices>0){ //if key is backspace, decrement the index, number of typed keys and count of wrong chars.
          indices--;
          wrongCharacters--;
          anyKey--;
          typed = document.querySelector(".texts").children[indices];
          if(typed.classList.contains("wrong")){ //removes the class "wrong" from that span element.
              typed.classList.remove("wrong");
          }
          else if(typed.classList.contains("matched")){ //if its a match , dont remove the class and stay on that position only.
              typed.classList.remove("matched");
          }
      }
      if(correctCharacter>wrongCharacters){ // if the count of matched is greater than unmatched, then wpm and accuracy can be calculated
          calculateWPM(); // calculateAccuracy();
      }
  }
  
  function calculateWPM(){ //to calculate words per minute. THIS CALCULATION IS ABSOLUELY INACCURATE!
      let wpm = (correctCharacter/5);
      document.querySelector(".wpm").textContent = wpm;
  }
  
  function calculateAccuracy() {
    let totalCharacters = correctCharacter + wrongCharacters;
    let accuracyPercentage = 0;
    if (totalCharacters > 0) {
        accuracyPercentage = ((correctCharacter / totalCharacters) * 100).toFixed(2);
        if (accuracyPercentage > 100) {
            accuracyPercentage = 100;
        }
    }
    document.querySelector(".accuracy").textContent = accuracyPercentage + "%";
}

  function finish() {
    document.querySelector(".texts").style.opacity = "40%";
    document.querySelector(".results").style.scale = "100%";
    clearInterval(start);
    calculateAccuracy();
    window.removeEventListener("keydown", verify);
}

  function timerStart() {
      start = setInterval(function() {
          TIMER.textContent = String(TIMER.textContent - 1).padStart(2, "0");
          if (TIMER.textContent < 1) {
              finish();
              clearInterval(start);
          }
      }, 1000);
  }
  
  function replay(){
      window.location.reload();
  }
  
  let displaying = false;
  function showInfo(){
    if(TIMER.textContent !== "00"){
      if(!displaying){
        document.querySelector(".info").style.scale="100%";
        displaying=true;
        window.removeEventListener("keydown",verify);
        clearInterval(start);
      }
      else{
        document.querySelector(".info").style.scale="0%";
        displaying=false;
        window.addEventListener("keydown",verify);
        timerStart();
      }
    }
  }
  
  window.addEventListener("keydown",verify);
  init();
  
  