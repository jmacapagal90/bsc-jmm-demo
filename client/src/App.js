import { useState, useEffect } from "react";
import axios from "axios";
import CourseList from "./components/CourseList";

function App() {
  const [courses, setCourses] = useState([]);

  useEffect(()=>{
    axios.get("/courses").then((response)=> {
        setCourses(response.data)
    })
},[])

  return (
    <div className="App">
      <CourseList courses={courses}/>
    </div>
  );
}

export default App;