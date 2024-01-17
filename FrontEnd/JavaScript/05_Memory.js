// Stack(primitive) and head(non-primitives)

let userName = "Harsh";
let userName2 = userName;
userName2 = "harsh kumar jha";

console.log(userName);
console.log(userName2);

let userOne = {
  email: "hj@hj.com",
};

let userTwo = userOne;
userTwo.email = "jhk@google.com";

console.log(userOne.email);
console.log(userTwo.email);
