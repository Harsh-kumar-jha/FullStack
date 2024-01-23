const parent = document.querySelector(".parent");
console.log(parent);
console.log(parent.children);
console.log(parent.children[1].innerHtml);
// for (let i = 0; i < parent.children.length; i++) {
// console.log(parent.children[i].innerHtml)
//}
console.log(parent.firstElementChild);

const childOne = document.querySelectorAll(".day");
console.log(childOne.parentElement);
console.log(childOne.nextElementSibling);

console.log("Nodes " + parent.childNodes);

const div = document.createElement("div");
div.className = "main";
div.id = "myId";
div.style.backgroundColor = "green";
div.style.padding = "15px";
const addText = document.createTextNode("Learning Dom");
div.appendChild(addText);
document.body.appendChild(div);

function addTag(lang) {
  const tag = document.createElement("li");
  tag.innerHTML = lang;
  document.querySelector(".languages").appendChild(tag);
}
addTag("Python");
