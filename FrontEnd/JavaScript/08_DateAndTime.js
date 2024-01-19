const myDate = new Date();
console.log(myDate);
console.log(myDate.toString());
console.log(myDate.toISOString());
console.log(myDate.toLocaleString());
console.log(myDate.toJSON());
console.log(myDate.toDateString());
console.log(typeof myDate);

// const myCreatedDate = new Date(2023, 0, 23);
// const myCreatedDate = new Date(2023, 0, 23, 5, 3);
const myCreatedDate = new Date("01-24-2023");

// console.log(myCreatedDate.toDateString());
console.log(myCreatedDate.toLocaleString());

const myTimeStamp = Date.now();
console.log(myTimeStamp);
console.log(myCreatedDate.getTime());

console.log(Math.round(Date.now() / 1000));

const newDate = new Date();
console.log(newDate.getMonth() + 1);
console.log(newDate.getDay());
console.log(newDate.toLocaleString("default", { weekday: "long" }));
