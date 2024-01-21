//  filter

const language = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const evenNumbers = language.filter((i) => i % 2 === 0);
console.log(evenNumbers);

// map

const numArr = language.map((n) => n + 10);
console.log(numArr);

// chaining
const newNum = language
  .map((n) => n * 10)
  .map((i) => i + 1)
  .filter((j) => j >= 40);

console.log(newNum);

// Reduce
const totalArr = language.reduce((acc, val) => acc + val, 0);
console.log(totalArr);

const courses = [
  {
    course: "Web dev",
    price: 500,
  },
  {
    course: "Mobile dev",
    price: 1000,
  },
  {
    course: "DevOps",
    price: 1500,
  },
  {
    course: "Data Science",
    price: 1200,
  },
];

const priceTotal = courses.reduce((acc, val) => acc + val.price, 0);
console.log(priceTotal);
