const courses = {
  courseName: "JavaScript",
  studentName: "Harsh",
  coursePrice: 500,
};
console.log(courses.courseName);

// Object de-structuring
const { courseName } = courses;
console.log(courseName);

const { studentName: user } = courses;
console.log(user);
