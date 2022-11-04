import { useState, useEffect } from "react";
import axios from "axios";
import CourseList from "./components/CourseList";
import CourseForm from "./components/CourseForm";

function App() {
  const [courses, setCourses] = useState([]);

  useEffect(()=>{
    axios.get("/courses").then((response)=> {
        setCourses(response.data)
    })
},[])

  function onSubmitNewCourse(newCourseObj){
    console.log(newCourseObj)
    setCourses([...courses,newCourseObj])
  }

  function handleDeleteCourse(id){
    console.log(id)
    setCourses(courses.filter((course)=> course.id !== id))
  }


  return (
    <div className="App">
      <div class="container-fluid">
        <h1 class="text-center"><strong>Add A Course To Your Syllabus</strong></h1>
        <div class="d-flex justify-content-center">
          <CourseList courses={courses} handleDeleteCourse={handleDeleteCourse}/>
          <CourseForm onSubmitNewCourse={onSubmitNewCourse}/>
        </div>
      </div>
    </div>
  );
}

export default App;