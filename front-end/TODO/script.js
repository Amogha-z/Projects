const inputBox = document.getElementById("inputBox");
const tasksContainer = document.getElementById("container");
const update = document.getElementById("updateBox");
let liTag;
var parent;
let updateInput;
let updateBox;
let filterChoice;
let prioritySet = false;
const high = document.getElementById("high");
const medium = document.getElementById("medium");
const low = document.getElementById("low");
const removePriority = document.getElementById("remove");

let sabKuch = "";

function addWork(){
    if(!inputBox.value==""){
      
      let singleParent = document.createElement("div");
      singleParent.className = "singleParent";
      
      let checkMark = document.createElement("span");
      checkMark.innerHTML = `<i class="fa-regular fa-square checkMark"></i>`;
      singleParent.appendChild(checkMark);
      
      liTag = document.createElement("li");
      liTag.className = "singleTask";

      let wrap = document.createElement("p");
      wrap.classList.add("wrap");
      wrap.textContent = inputBox.value;
      
      liTag.appendChild(wrap);

      createIcons();

      singleParent.appendChild(liTag);
      
      tasksContainer.appendChild(singleParent);
    
    } else{
        alert("Add a task! Don't be lazy!");
    }
    
    inputBox.value="";
    sabKuch = tasksContainer.innerHTML;
    theWorldisSafe();
}

function createIcons(){
  let icons = document.createElement("div");
  icons.className = "icons";
  
  let cross = document.createElement("span");
  cross.innerHTML = `<i class="fa-solid fa-xmark remove" style='text-align:center;display:flex;'></i>`;
  cross.classList.add("remove");
  icons.appendChild(cross);
  
  let modify = document.createElement("span");
  modify.innerHTML = `<i class="fa-solid fa-pen change" style='text-align:center;display:flex;'></i>`;
  modify.classList.add("change");
  icons.appendChild(modify);
  
  let filter = document.createElement("span");
  filter.innerHTML = `<i class="fa-solid fa-filter filters" style='text-align:center;display:flex;'></i>`;
  filter.classList.add("filters");
  icons.appendChild(filter);
  
  liTag.appendChild(icons); 
}

tasksContainer.addEventListener("click",function(event){
    if (event.target.tagName === "LI"){
        event.target.firstElementChild.classList.toggle("selected");
        let check = event.target.closest(".singleParent").querySelector(".checkMark");
        check.classList.toggle("fa-square");
        check.classList.toggle("fa-square-check");
        sabKuch = tasksContainer.innerHTML;
      
    } else if(event.target.tagName === "P"){
        event.target.classList.toggle("selected");
        let check = event.target.closest(".singleParent").querySelector(".checkMark");
        check.classList.toggle("fa-square");
        check.classList.toggle("fa-square-check");
        sabKuch = tasksContainer.innerHTML;
      
    } else if (event.target.classList.contains("checkMark")) {
        toggleSelectedCheckbox(event);
        sabKuch = tasksContainer.innerHTML;
      
    } else if(event.target.classList.contains("remove")){
        if(confirm("Are you sure about your action?")==true){
          event.target.closest(".singleParent").remove();
          theWorldisSafe();
          sabKuch = tasksContainer.innerHTML;
        }
      
    } else if(event.target.classList.contains("change")){
        updateBox = document.querySelector(".update");
        updateBox.style.scale = "100%";
        parent = event.target.closest(".singleParent").querySelector(".singleTask");
        updateInput = document.querySelector("#updatebox");
        updateInput.value = parent.firstElementChild.textContent;
        theWorldisSafe();
        sabKuch = tasksContainer.innerHTML;
      
    } else if(event.target.classList.contains("filters")){
        parent = event.target.closest(".singleParent").querySelector(".singleTask");
        filterChoice = document.querySelector(".priorities");
        filterChoice.style.scale = "100%";
        tasksContainer.style.pointerEvents = "none";
        sabKuch = tasksContainer.innerHTML;
      
    }
},false)


function toggleSelectedCheckbox(event) {
    event.target.classList.toggle("fa-square");
    event.target.classList.toggle("fa-square-check");
    event.target.closest(".singleParent").querySelector(".wrap").classList.toggle("selected");
}

document.querySelector("#updateButton").addEventListener("click",function(event){
    parent.firstElementChild.textContent = updateInput.value;
    updateBox.style.scale="0";
        
});

document.querySelector("#cancelButton").addEventListener("click", () => {
    updateBox.style.scale = 0;
})


let visible = false;
let filterations = document.querySelector("#filterations");
const addBtn = document.getElementById("addBtn");

filterations.addEventListener("change", function() {
  let filterType = document.querySelector("#filterations").value;
  showFilter(filterType);
});


function showFilter(filterType) {
  // console.log(filterType);
  if (filterType == "Completed") {
    tasksContainer.innerHTML = sabKuch;
    visible = true;
    tasksContainer.style.pointerEvents = "none";
    addBtn.style.pointerEvents = "none";
    // sabKuch = tasksContainer.innerHTML;
    let vasks = tasksContainer.querySelectorAll(".selected");
    // console.log(vasks);
    tasksContainer.innerHTML = "";
    vasks.forEach((task) => {
      let taskTextElement = task.closest(".singleParent");
      if (taskTextElement) {
        tasksContainer.innerHTML += taskTextElement.outerHTML;
      }
    });
  } else if (filterType == "High Priority") {
    visible = true;
    tasksContainer.style.pointerEvents = "none";
    addBtn.style.pointerEvents = "none";
    tasksContainer.innerHTML = sabKuch;
    let vasks = tasksContainer.querySelectorAll(".urgent");
    // console.log(vasks);
    tasksContainer.innerHTML = "";
    vasks.forEach((task) => {
      let taskTextElement = task.closest(".singleParent");
      if (taskTextElement) {
        tasksContainer.innerHTML += taskTextElement.outerHTML;
      }
    });
  } else if (filterType == "Medium Priority") {
    visible = true;
    tasksContainer.style.pointerEvents = "none";
    addBtn.style.pointerEvents = "none";
    tasksContainer.innerHTML = sabKuch;
    let vasks = tasksContainer.querySelectorAll(".medium");
    tasksContainer.innerHTML = "";
    // console.log(vasks);
    vasks.forEach((task) => {
      let taskTextElement = task.closest(".singleParent");
      if (taskTextElement) {
        tasksContainer.innerHTML += taskTextElement.outerHTML;
      }
    });
  } else if (filterType == "Low Priority") {
    visible = true;
    tasksContainer.style.pointerEvents = "none";
    addBtn.style.pointerEvents = "none";
    tasksContainer.innerHTML = sabKuch;
    let vasks = tasksContainer.querySelectorAll(".less");
    tasksContainer.innerHTML = "";
    vasks.forEach((task) => {
      let taskTextElement = task.closest(".singleParent");
      if (taskTextElement) {
        tasksContainer.innerHTML += taskTextElement.outerHTML;
      }
    });
  } else if (filterType == "All") {
    tasksContainer.innerHTML = sabKuch;
    visible = false;
    addBtn.style.pointerEvents = "all";
    tasksContainer.style.pointerEvents = "all";
  }
}



high.addEventListener("click",function(event){
  tasksContainer.style.pointerEvents = "all";
  parent.classList.remove("less");
  parent.classList.remove("medium");
  parent.classList.add("urgent");
  filterChoice.style.scale = "0";
  prioritySet = true;
  sabKuch = tasksContainer.innerHTML;
  theWorldisSafe();
  
});

medium.addEventListener("click",function(event){
  tasksContainer.style.pointerEvents = "all";
  parent.classList.remove("less");
  parent.classList.remove("urgent");
  parent.classList.add("medium");
  filterChoice.style.scale = "0";
  prioritySet = true;
  sabKuch = tasksContainer.innerHTML;
  theWorldisSafe();
});

low.addEventListener("click",function(event){
  tasksContainer.style.pointerEvents = "all";
  parent.classList.remove("medium");
  parent.classList.remove("urgent");
  parent.classList.add("less");
  filterChoice.style.scale = "0";
  prioritySet = true;
  sabKuch = tasksContainer.innerHTML;
  theWorldisSafe();
});

removePriority.addEventListener("click",function(event){
  tasksContainer.style.pointerEvents = "all";
  sabKuch = tasksContainer.innerHTML;
  if(prioritySet == true){
    parent.classList.remove("less");
    parent.classList.remove("medium");
    parent.classList.remove("urgent");
    filterChoice.style.scale = "0";
    theWorldisSafe();
  }else{
    filterChoice.style.scale = "0";
  }
});




function theWorldisSafe(){
    localStorage.setItem("tasks",tasksContainer.innerHTML)
}

function displayWorld(){
    tasksContainer.innerHTML = localStorage.getItem("tasks");
}

// function deleteFromLocalStorage(key) {
//     localStorage.removeItem(key);
// }
// deleteFromLocalStorage("tasks");


displayWorld();