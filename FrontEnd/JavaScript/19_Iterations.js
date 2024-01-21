//  for loops
for (let index = 0; index < 10; index++) {
  console.log(index);
}

// nested loop
for (let i = 0; i <= 5; i++) {
  console.log(`Outer loop : ${i}`);
  for (let j = 0; j <= 5; j++) {
    console.log(`Inner loop value : ${j} and Outer loop value : ${i}`);
  }
}

// break keyword
for (let i = 0; i < 10; i++) {
  if (i === 5) {
    console.log(" 5 Detected");
    break;
  }
  console.log(i);
}

// continue keyword
for (let i = 0; i < 10; i++) {
  if (i === 5) {
    console.log(" 5 Detected");
    continue;
  }
  console.log(i);
}

//  while loop
let i = 10;
while (i < 100) {
  console.log(i);
  i = i + 10;
}

// array specific loops

// 1. for of loop
const arr = [1, 2, 3, 4, 5, "SuperMan", "SpiderMan"];
for (const val of arr) {
  console.log(val);
}

const greeting = "Hello World";
for (const greet of greeting) {
  console.log(greet);
}

//  map
let myMap = new Map();
myMap.set("In", "India");
myMap.set("Ch", "China");
myMap.set("Jp", "Japan");
myMap.set("I", "Iran");

console.log(myMap);
for (const [key, val] of myMap) {
  console.log(`${key} -> ${val}`);
}

// for in loop
const myObj = {
  py: "python",
  js: "javascript",
  cpp: "C++",
  rb: "ruby",
};
for (const key in myObj) {
  console.log(`${key} is shortcut for ${myObj[key]}`);
}

// for each loop
const arr1 = ["javascript", "java", "python", "c", "c++", "solidity"];

arr1.forEach(function (item, index, arr) {
  console.log(item);
  console.log(index);
  console.log(arr);
});

const arrObj = [
  {
    language: "java",
    price: 300,
  },
  {
    language: "j2EE",
    price: 200,
  },
  {
    language: "Spring boot",
    price: 500,
  },
  {
    language: "Microservice",
    price: 1000,
  },
];

arrObj.forEach((i) => {
  console.log(i.language + " " + i.price);
});
