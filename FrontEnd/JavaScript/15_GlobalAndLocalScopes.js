// var c = 300;
let a = 300;
if (true) {
  let a = 10;
  const b = 20;
  // var c = 30;
}

console.log(a);
// console.log(b);
// console.log(c);

function one() {
  const username = "Harsh";
  function two() {
    const website = "Youtube";
    console.log(username);
  }
  // console.log(website);
  two();
}

one();

console.log(addOne(5));
function addOne(num) {
  return num + 1;
}

// console.log(addTwo(5));
const addTwo = function (num) {
  return num + 2;
};
