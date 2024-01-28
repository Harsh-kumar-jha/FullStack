function setUser(username) {
  this.username = username;
}

function createUser(username, email, password) {
  // setUser(username);
  setUser.call(this, username);
  this.email = email;
  this.password = password;
}

const Harsh = new createUser("Harsh", "jhaharshkumar293@gamil.com", "123");
console.log(Harsh);
