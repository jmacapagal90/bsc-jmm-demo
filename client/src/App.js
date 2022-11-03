import { useState, useEffect } from "react";

function App() {
  const [courses, setCourses] = useState([]);

  useEffect(() => {
    fetch("/courses")
      .then((r) => r.json())
      .then((data) => setCourses(data));
  }, []);

  console.log(courses.length)

  return (
    <div className="App">
      <h1>Page Count: {courses.length}</h1>
    </div>
  );
}

export default App;