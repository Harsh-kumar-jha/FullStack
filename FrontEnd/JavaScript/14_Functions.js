// console.log("H");
// console.log("A");
// console.log("R");
// console.log("S");
// console.log("H");

function sayMyName() {
  console.log("H");
  console.log("A");
  console.log("R");
  console.log("S");
  console.log("H");
}

// sayMyName  -- reference
sayMyName();
sayMyName();

function add(num1, num2) {
  console.log(num1 + num2);
}

add(3, 4);
add(3, "4");
add(3, "a");

const result = add(3, 5);
console.log("result : ", result);

function addTwoNumber(num1, num2) {
  // const result = num1 + num2;
  // return result;
  return num1 + num2;
  // console.log("Harsh"); unreachable code
}

const res = addTwoNumber(3, 5);
console.log("Result : ", res);

function userLoggedIn(user) {
  // if (user === undefined) {
  //   console.log("Please enter a username");
  //   return;
  // }
  if (!user) {
    console.log("Please enter a username");
    return;
  }
  return `${user} just logged in`;
}
console.log(userLoggedIn("Harsh"));
console.log(userLoggedIn());

function workerLoggedIn(worker = "sam") {
  return `${worker} just logged in`;
}
console.log(workerLoggedIn("john"));
console.log(workerLoggedIn());

// rest operator(...)
function calculateCartPrice(item1Price, item2Price, ...itemPrice) {
  return itemPrice;
}
console.log(calculateCartPrice(10, 20, 40, 21, 49185, 9481));

const language = {
  course: "Python",
  price: "200",
};

function programmingLanguagePrice(anyObj) {
  console.log(`Today we are learning ${anyObj.course}`);
}
programmingLanguagePrice(language);
