const form = document.querySelector("form");

form.addEventListener("submit", (e) => {
  e.preventDefault();

  const height = parseInt(document.getElementById("height").value);
  const weight = parseInt(document.getElementById("weight").value);
  const results = document.getElementById("results");

  if (height === "" || height < 0 || isNaN(height)) {
    results.innerHTML = `Please provide a valid height not ${height}`;
  } else if (weight === "" || weight < 0 || isNaN(weight)) {
    results.innerHTML = `Please provide a valid weight not ${weight}`;
  } else {
    const bmi = (weight / ((height * height) / 10000)).toFixed(2);
    if (bmi <= 18.6) {
      results.innerHTML = `Your bmi ${bmi} and you are under weight`;
    } else if (bmi > 18.6 && bmi <= 24.9) {
      results.innerHTML = `Your bmi ${bmi} and you are weight is normal`;
    } else {
      results.innerHTML = `Your bmi ${bmi} and you are over weight`;
    }
  }
});
