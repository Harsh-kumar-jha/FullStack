const score = 500;
console.log(score);

const numVal = new Number(200);
console.log(numVal);
console.log(numVal.toString().length);
console.log(numVal.toFixed(2));

let otherNum = 123.89182;
console.log(otherNum.toPrecision(3));

const hundred = 10000000000;
console.log(hundred.toLocaleString("en-IN"));

console.log(Math);
console.log(Math.abs(-2));
console.log(Math.abs(2));
console.log(Math.round(4.3));
console.log(Math.round(4.6));
console.log(Math.ceil(4.1));
console.log(Math.floor(4.9));
console.log(Math.random()); // value between 0-1
console.log(Math.random() * 10);
console.log(Math.random() * 10 + 1);
console.log(Math.floor(Math.random() * 10 + 1));

const min = 50;
const max = 100;

console.log(Math.floor(Math.random() * (max - min) + 1 + min));
