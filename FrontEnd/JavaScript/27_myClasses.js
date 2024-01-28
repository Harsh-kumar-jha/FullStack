// class User {
//   constructor(username, email, password) {
//     this.username = username;
//     this.email = email;
//     this.password = password;
//   }
//   encryptPass() {
//     return `${this.password}@123`;
//   }
//   changeUserName() {
//     return `${this.username.toUpperCase()}`;
//   }
// }

// const h = new User("Harsh", "jhaharshkumar293@gmail.com", "123");

// console.log(h.encryptPass());
// console.log(h.changeUserName());

// under the hood or behind the scene workflow

function User(username, email, password) {
  this.username = username;
  this.email = email;
  this.password = password;
}

User.prototype.encryptPassword = function () {
  return `${this.password}@123`;
};
User.prototype.changeUserName = function () {
  return `${this.username.toUpperCase()}`;
};

const h = new User("Harsh", "jhaharshkumar293@gmail.com", "123");

console.log(h.encryptPassword());
console.log(h.changeUserName());
