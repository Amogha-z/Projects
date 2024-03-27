const WRAPPER = document.querySelector("#wrapper");
const questionAnswers = [
  [
    " A girl was born in 1976, and is today is her seventh birthday. How is it possible?",
    "The girl was born in hospital room number 1976.",
  ],
  ["What will grow bigger the more you end up taking away from it?", "A hole."],
  [
    "It has a head at night but nothing in the morning, what is it?",
    "A pillow",
  ],
  [
    "I am a word with more than 100 letters in it. What am I?",
    "The post office.",
  ],
  ["What can you catch, but you sure cannot throw it back?", "A cold."],
  [
    "What is in common between the letter T and an island?",
    "They both are situated in the middle of water.",
  ],
  [
    "What happens when you close your eyes?",
    "You won't know because you can't see.",
  ],
];

questionAnswers.forEach((elements) => {
  let ques_ans_container = document.createElement("div");
  ques_ans_container.className = "qaContainer";

  let question = document.createElement("div");
  question.className = "question forClick up";
  question.textContent = elements[0];

  let answer = document.createElement("div");
  answer.className = "answer";
  answer.textContent = elements[1];

  ques_ans_container.appendChild(question);
  ques_ans_container.appendChild(answer);
  WRAPPER.appendChild(ques_ans_container);
});

let eventParent;
let that_parents_child;

WRAPPER.addEventListener("click", (event) => {
  if (event.target.classList.contains("forClick")) {
    let child = event.target.closest(".qaContainer").children[1];

    if (eventParent && eventParent != event.target) {
      eventParent
        .closest(".qaContainer")
        .querySelector(".question")
        .classList.remove("down");
      eventParent
        .closest(".qaContainer")
        .querySelector(".question")
        .classList.add("up");
      eventParent
        .closest(".qaContainer")
        .querySelector(".question").style.borderRadius = "0";
      eventParent.closest(".qaContainer").style.margin = "0";
      that_parents_child.style.height = 0;
      that_parents_child.style.paddingTop = "0";
    }

    if (child.clientHeight) {
      event.target
        .closest(".qaContainer")
        .querySelector(".question")
        .classList.remove("down");
      event.target
        .closest(".qaContainer")
        .querySelector(".question")
        .classList.add("up");
      event.target
        .closest(".qaContainer")
        .querySelector(".question").style.borderRadius = "0";
      event.target.closest(".qaContainer").style.margin = "0";
      child.style.height = 0;
      child.style.paddingTop = "0";
    } else {
      event.target
        .closest(".qaContainer")
        .querySelector(".question")
        .classList.remove("up");
      event.target
        .closest(".qaContainer")
        .querySelector(".question")
        .classList.add("down");
      event.target
        .closest(".qaContainer")
        .querySelector(".question").style.borderRadius = "10px 10px 0 0";
      event.target.closest(".qaContainer").style.margin = "20px 0";
      child.style.height = child.scrollHeight + 20 + "px";
      child.style.paddingTop = "20px";
      child.style.borderRadius = "0 0 10px 10px";
    }

    eventParent = event.target;
    that_parents_child = child;
  }
});
