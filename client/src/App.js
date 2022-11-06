import { useState, useEffect } from "react";
import axios from "axios";
import CourseList from "./components/CourseList";
import CourseForm from "./components/CourseForm";
import Search from "./components/Search";

function App() {
  const [courses, setCourses] = useState([]);
  const [searchQuery, setSearchQuery] = useState("");

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

  const searchResults = courses.filter((course) => {
    return course.name.toLowerCase().includes(searchQuery.toLowerCase())
  })

  return (
    <div className="App">
      <div class="container-fluid">
        <h1 class="text-center"><strong>Add A Course To Your Syllabus</strong></h1>
        <div class="d-flex justify-content-center">
          <Search setSearchQuery={setSearchQuery} />
        </div>
        <div class="d-flex justify-content-center">

          <CourseList courses={searchResults} handleDeleteCourse={handleDeleteCourse}/>
          <CourseForm onSubmitNewCourse={onSubmitNewCourse}/>
        </div>

      </div>
    </div>
  );
}

export default App;