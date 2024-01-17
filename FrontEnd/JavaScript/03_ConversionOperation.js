let score = "33";

console.log(typeof score);

let valueInNumber = Number(score);

console.log(typeof valueInNumber);

// "33" => number
// "33abc" => NaN(Not a Number)
// true => 1 ; false => 0
// undefined => 0

let isLoggedIn = 1;
let booleanLoggedIn = Boolean(isLoggedIn);
console.log(booleanLoggedIn);

// 1 => true ; 0 => false
// "" => false
// "harsh" => true

// basic maths operation
console.log(2 + 2);
console.log(2 - 2);
console.log(2 * 3);
console.log(2 ** 4);
console.log(2 / 2);
console.log(2 % 2);

let str1 = "hello";
let str2 = " Harsh";
let str3 = str1 + str2; // + can be use with string for concatenation operation
console.log(str3);

console.log("1" + 2);
console.log(1 + "2");
console.log("1" + 2 + 3);
console.log(1 + 2 + "3");

console.log(+true); // 1
console.log(+""); // 0
let num1, num2, num3;
num1 = num2 = num3 = 2 + 2;

let gameCounter = 100;
console.log(gameCounter++); // postIncrement -> first we will use then increase value by 1
console.log(++gameCounter); // preIncrement  -> first we will increase value by 1 and then use it
console.log(gameCounter--); // postDecrement
console.log(--gameCounter); // preDecrement
