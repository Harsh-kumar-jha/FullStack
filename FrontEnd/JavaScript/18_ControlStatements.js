//  simple if statement
const temperature = 41;

if (temperature < 45) {
  console.log("less than 45 degree C");
}

// if-else statement
if (temperature < 50) {
  console.log("Temperature is less");
} else {
  console.log("Temperature is high");
}

// if-else-if ladder
const powerLevel = 900;
if (powerLevel < 300) {
  console.log("less 300");
} else if (powerLevel < 600) {
  console.log("less 600");
} else {
  console.log("Very high");
}

// Switch
const month = "Feb";
switch (month) {
  case "jan":
    console.log("jan");
    break;
  case "Feb":
    console.log("feb");
    break;
  case "march":
    console.log("march");
    break;

  default:
    console.log("Enter valid");
    break;
}

// Falsy value

// "";
// false;
// BigInt - 0n;
// 0
// -0;
// null;
// undefined;
// NaN;

// except above rest all are truthy value

// Nullish coalescing operator(??)
let val1;
val1 = null ?? 10;
