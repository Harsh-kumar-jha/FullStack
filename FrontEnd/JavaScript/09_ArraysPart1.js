const myArr = [1, 2, 3, 4, 5];
console.log(myArr[2]);

const heros = ["SpiderMan", "SuperMan", "IronMan"];
console.log(heros[1]);

const myArr2 = new Array(6, 7, 8, 9, 10);
console.log(myArr2);

// Arrays Methods

myArr.push(6);
console.log(myArr);

myArr.push(7);
console.log(myArr);

myArr.pop();
console.log(myArr);

myArr.unshift(9);
console.log(myArr);

myArr.shift();
console.log(myArr);

console.log(myArr.includes(9));
console.log(myArr.indexOf(3));

const newArr = myArr.join();
console.log(typeof newArr);

// slice and splice

console.log("I : ", myArr);
const ar = myArr.slice(2, 4);
console.log(ar);
console.log("II : ", myArr);

const ar1 = myArr.splice(2, 3);
console.log(ar1);
console.log("III : ", myArr);
