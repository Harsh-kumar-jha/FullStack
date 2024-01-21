const user = {
  username: "Harsh",
  level: 1000,
  welcome: function () {
    console.log(`${this.username}, Welcome`);
    console.log(this);
  },
};

user.welcome();
user.username = "SAM";
user.welcome();
console.log(this);

function one() {
  const username = "Harsh";
  console.log(this);
  console.log(this.username);
}
one();

const two = () => {
  console.log(this);
};
two();

const add = (num1, num2) => {
  return num1 + num2;
};

console.log(add(1, 2));

const add2 = (num1, num2) => num1 + num2;
console.log(add2(2, 3));
