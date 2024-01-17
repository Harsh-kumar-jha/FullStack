const accountId = 124123;
let accountEmail = "12abc@gmail.com";
var accountPassword = "11231";
accountCity = "Delhi"; // not preferred
let accountState;

// accountId = 212414;  // not allowed
accountEmail = "hj@hj.com";
accountPassword = "123456";
accountCity = "Jaipur";

console.log(accountId);
console.table([
  accountId,
  accountEmail,
  accountPassword,
  accountCity,
  accountState,
]);

/*
Prefer not to use var 
because of issue in block scope and functional scope
*/
