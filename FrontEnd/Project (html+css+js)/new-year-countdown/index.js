const daysEl = document.getElementById("days");
const hoursEl = document.getElementById("hours");
const minutesEl = document.getElementById("minutes");
const secondsEl = document.getElementById("seconds");

const newYearTime = new Date("Jan 01,2025 00:00:00").getTime();

setInterval(() => updateCountDown(), 1000);

function updateCountDown() {
  const now = new Date().getTime();
  const gap = newYearTime - now;

  const second = 1000;
  const minute = second * 60;
  const hour = minute * 60;
  const day = hour * 24;

  const d = Math.floor(gap / day);
  const h = Math.floor((gap % day) / hour);
  const m = Math.floor((gap % hour) / minute);
  const s = Math.floor((gap % minute) / second);

  daysEl.innerText = d;
  hoursEl.innerText = h;
  minutesEl.innerText = m;
  secondsEl.innerText = s;
}
