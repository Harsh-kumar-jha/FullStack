let randomNumber = parseInt(Math.random() * 100 + 1);

const submit = document.querySelector("#subt");
const userInput = document.querySelector("#guessField");
const guessSlot = document.querySelector(".guesses");
const remaining = document.querySelector(".lastResult");
const lowOrHi = document.querySelector(".lowOrHi");
const starTOver = document.querySelector(".resultParas");

let p = document.createElement("p");

let prevGuess = [];
let numberOfGuesses = 1;

let playGame = true;

if (playGame) {
  submit.addEventListener("click", (e) => {
    e.preventDefault();
    const guess = parseInt(userInput.value);
    validateGuess(guess);
  });
}

const validateGuess = (guess) => {
  if (isNaN(guess)) {
    alert("Please Provide a valid number");
  } else if (guess < 1) {
    alert("Please Provide a number which is greater 0");
  } else if (guess > 100) {
    alert("Please Provide a number which is less than 100");
  } else {
    prevGuess.push(guess);
    if (numberOfGuesses === 11) {
      displayGuess(guess);
      displayMessage(`Game over and the random Number was ${randomNumber}`);
      endGame();
    } else {
      displayGuess(guess);
      checkGuess(guess);
    }
  }
};
const checkGuess = (guess) => {
  if (guess === randomNumber) {
    displayMessage("You guessed right...");
    endGame();
  } else if (guess < randomNumber) {
    displayMessage("You guessed too low...");
  } else if (guess > randomNumber) {
    displayMessage("You guessed too high...");
  }
};
const displayGuess = (guess) => {
  userInput.value = "";
  guessSlot.innerHTML += `${guess}, `;
  numberOfGuesses++;
  remaining.innerHTML = `${11 - numberOfGuesses}`;
};
const displayMessage = (message) => {
  lowOrHi.innerHTML = `<h2>${message}</h2>`;
};
const newGame = () => {
  const newGameBtn = document.querySelector("#newGame");
  newGameBtn.addEventListener("click", (e) => {
    randomNumber = parseInt(Math.random() * 100 + 1);
    prevGuess = [];
    numberOfGuesses = 1;
    guessSlot.innerHTML = "";
    remaining.innerHTML = `${11 - numberOfGuesses}`;
    userInput.removeAttribute("disabled");
    starTOver.removeChild(p);
    playGame = true;
  });
};
const endGame = () => {
  userInput.value = "";
  userInput.setAttribute("disabled", "");
  playGame = false;
  p.classList.add("button");
  p.innerHTML = `<h2 id='newGame'>Start new Game</h2>`;
  starTOver.appendChild(p);
  newGame();
};
