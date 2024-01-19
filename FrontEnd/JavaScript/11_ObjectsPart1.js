// singleton  - Object.create

// Object literal
const mySyn1 = Symbol("key1");
const mySyn2 = Symbol("key2");
const userData = {
  name: "Harsh",
  age: 22,
  mySyn1: "myKey1",
  [mySyn2]: "myKey2",
  location: "Japan",
  email: "123@has.com",
  isLoggedIn: false,
  lastLogIn: ["Wednesday", "Sunday"],
};
console.log(userData.email);
console.log(userData["email"]);
console.log(typeof userData.mySyn1);
console.log(userData[mySyn2]);

// userData.age = 21;
// Object.freeze(userData);
// userData.age = 22;
// console.log(userData);

userData.greeting = function () {
  console.log("Hello User");
};
userData.greetingTwo = function () {
  console.log(`Hello ${this.name}`);
};
console.log(userData.greeting);
console.log(userData.greeting());
console.log(userData.greetingTwo());
