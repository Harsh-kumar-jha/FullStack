// Immediately invoked function expression

// named IIFE
(function dbConnection() {
  console.log("Database is connected");
})();

// normal iife
((name) => {
  console.log(`Hey there ${name}`);
})("harsh");
