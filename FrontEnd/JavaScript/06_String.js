const name = "Harsh ";
const repoCount = 40;

// console.log(name + repoCount);

console.log(`Hello my name is ${name} and my repo count is ${repoCount}`);

const gameName = new String("GTA V");

console.log(gameName[0]);
console.log(gameName.__proto__);
console.log(gameName.length);
console.log(gameName.toLowerCase());
console.log(gameName.charAt(2));
console.log(gameName.indexOf("T"));

const newString = gameName.substring(0, 3);
console.log(newString);

const anotherString = gameName.slice(-2);
console.log(anotherString);

const str = "             Harsh                    ";
console.log(str);
console.log(str.trim());

const url = "https://www.google.co%20amsogmg";
console.log(url.replace("%20", "-"));
console.log(url.includes("google"));

console.log(gameName.split(" "));
