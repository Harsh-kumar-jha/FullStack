const marvel_heros = ["IronMan", "Thor", "Hulk", "SpiderMan"];
const dc_heros = ["SuperMan", "BatMan", "Flash", "AquaMan"];

// marvel_heros.push(dc_heros);

// console.log(marvel_heros);
// console.log(marvel_heros[4][1]);

const allHeros = marvel_heros.concat(dc_heros);
console.log(allHeros);

// Spread operator (...)
const all_new_Heros = [...marvel_heros, ...dc_heros];
console.log(all_new_Heros);

// flat method (flat(<depth>))
const another_array = [1, 2, 3, [4, 5, 6], 7, 8, [9, 10, [11, 12, [13, 14]]]];
const flatArr = another_array.flat(Infinity);
// console.log(another_array);
console.log(flatArr);

console.log(Array.isArray("HARSH"));
console.log(Array.from("HARSH"));
console.log(Array.from({ name: "HARSH" }));

const score1 = 111;
const score2 = 121;
const score3 = 131;
console.log(Array.of(score1, score2, score3));
