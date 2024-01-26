const PromiseOne = new Promise((resolve, reject) => {
  setTimeout(() => {
    console.log("Async Function completed...");
    resolve();
  }, 1000);
});

PromiseOne.then(() => {
  console.log("Promise Consumed...");
});

new Promise((resolve, reject) => {
  setTimeout(() => {
    console.log("Async Task 2 completed....");
    resolve();
  }, 1000);
}).then(() => {
  console.log("Promise Task 2 consumed...");
});

const promiseThree = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve({ userName: "Harsh", email: "jhaharshkumar293@gmail.com" });
  }, 1000);
});
promiseThree.then((user) => {
  console.log(user);
});

const promiseFour = new Promise((resolve, reject) => {
  setTimeout(() => {
    const error = false;
    if (!error) {
      resolve({ username: "Harsh", email: "jhaharshkumar293@gmail.com" });
    } else {
      reject("Error:Something went wrong....");
    }
  }, 1000);
});

promiseFour
  .then((user) => {
    console.log(user);
    return user.username;
  })
  .then((username) => {
    console.log(username);
  })
  .catch((error) => {
    console.log(error);
  })
  .finally(() => console.log("Promise either Resolved or rejected"));

const promiseFive = new Promise((resolve, reject) => {
  setTimeout(() => {
    const error = true;
    if (!error) {
      resolve({ username: "Harsh", password: "123" });
    } else {
      reject("Error:Something went wrong....");
    }
  }, 1000);
});

const consumedPromise = async () => {
  try {
    const response = await promiseFive;
    console.log(response);
  } catch (error) {
    console.log(error);
  }
};

consumedPromise();

async function getAllUser() {
  try {
    const response = await fetch("https://jsonplaceholder.typicode.com/users");
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.log("Error : ", error);
  }
}

getAllUser();
