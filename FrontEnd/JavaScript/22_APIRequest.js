const request = "https://api.github.com/users/harsh-kumar-jha";
const xhr = new XMLHttpRequest();
xhr.open("GET", request);
xhr.onreadystatechange = function () {
  console.log(xhr.readyState);
  if (xhr.readyState === 4) {
    const data = JSON.parse(this.responseText);
    const { followers } = data;
    // console.log(this.responseText);
    console.log(followers);
  }
};
xhr.send();
