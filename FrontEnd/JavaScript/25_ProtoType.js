function multiplyBy5(num) {
  return num * 5;
}

multiplyBy5.power = 2;

console.log(multiplyBy5(5));
console.log(multiplyBy5.power);
console.log(multiplyBy5.prototype);

function createUser(username, score) {
  this.username = username;
  this.score = score;
}
createUser.prototype.increment = function () {
  this.score++;
};

createUser.prototype.printMe = function () {
  console.log(this.score);
};

const coffee = new createUser("Coffee", 20);
const iceLatte = new createUser("Ice Latte", 400);

coffee.increment();
coffee.increment();
coffee.increment();
coffee.increment();

iceLatte.increment();
iceLatte.increment();
iceLatte.increment();
iceLatte.increment();
iceLatte.increment();

coffee.printMe();
iceLatte.printMe();
