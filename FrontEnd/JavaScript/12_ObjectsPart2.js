// const bumbleUser = new Object(); singleton Object
// console.log(bumbleUser);

const bumbleUser = {};
bumbleUser.id = 123861;
bumbleUser.name = "Harsh";
bumbleUser.isLoggedIn = false;
console.log(bumbleUser);

const regularUser = {
  email: "Harsh@hotmail.com",
  fullName: {
    userFullName: {
      firstName: "Harsh",
      lastName: "Jha",
    },
  },
};
console.log(regularUser.fullName.userFullName.firstName);

const obj1 = { 1: "a", 2: "b" };
const obj2 = { 3: "c", 4: "d" };
const obj3 = { obj1, obj2 };
console.log(obj3);

const obj4 = Object.assign({}, obj1, obj2);
console.log(obj4);

const obj5 = { ...obj1, ...obj2 };
console.log(obj5);

console.log(Object.keys(bumbleUser));
console.log(Object.values(bumbleUser));
console.log(Object.entries(bumbleUser));

console.log(bumbleUser.hasOwnProperty("isLoggedIn"));
