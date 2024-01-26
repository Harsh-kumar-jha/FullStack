//  Object literals
const user1 = {
  username: "Harsh",
  email: "jhaharshkumar293@gmail.com",
  getUserData: () => {
    console.log(this.username);
    console.log(this); // points to current context object
  },
};

console.log(user1.email);
console.log(user1);
console.log(this);

//  constructor function (will always give new instance)

function User(username, loginCount, isLoggedIn) {
  this.username = username;
  this.loginCount = loginCount;
  this.isLoggedIn = isLoggedIn;
  return this;
}

// const userOne =  User("Harsh", 22, true);
// const userTwo =  User("Joe", 21, false); // userTwo will overwrite UserOne values

const userOne = new User("Harsh", 22, true);
const userTwo = new User("Joe", 21, false);

console.log(userOne);
console.log(userTwo);
