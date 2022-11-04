import { useState } from "react";

function CourseForm({onSubmitNewCourse}){
    const [courseName,setCourseName] = useState("");
    const [courseDesc,setCourseDesc] = useState("");
    const [courseStatus,setCourseStatus] = useState("");
    const [courseCode,setCourseCode] = useState("");

   function submitCourse(e){
    e.preventDefault();
    const newCourseObj = {
        name: courseName,
        description: courseDesc,
        status: courseStatus,
        username: courseCode
    }

    fetch('/addCourse', {
            method: 'POST',
            headers: {
              'Content-Type': 'application/json',
            },
            body: JSON.stringify(newCourseObj),
          })
          .then(response => response.json())
          .then(data => 
            onSubmitNewCourse(data)
          )
          .catch((error) => {
            console.error('Error:', error);
          });

    }



    return (
        <div class="container-fluid">
        <form onSubmit={(e)=>{submitCourse(e)}}>
            <div class="form-group">
                <label for="exampleInputCourseName">Course Name</label>
                <input type="name" class="form-control" id="exampleInputCourseName" aria-describedby="courseName" placeholder="Enter Course Name" 
                onChange={(e)=>setCourseName(e.target.value)} value={courseName}
                />
                <small id="emailHelp" class="form-text text-muted">Enter the name of your course</small>
            </div>
            <div class="form-group">
                <label for="exampleInputDescription">Course Description</label>
                <input type="description" class="form-control" id="exampleInputDescription" placeholder="Enter a brief description"
                    onChange={(e)=>setCourseDesc(e.target.value)} value={courseDesc}
                />
            </div>
            <div class="form-group">
                <label for="exampleInputCourseStatus">Course Status</label>
                <input type="description" class="form-control" id="exampleInputStatus" placeholder="Enter a brief status"
                onChange={(e)=>setCourseStatus(e.target.value)} value={courseStatus}
                />
            </div>
            <div class="form-group">
                <label for="exampleInputClassCode">Course Code</label>
                <input type="coursecode" class="form-control" id="exampleInputClassCode" placeholder="Enter the course code"
                onChange={(e)=>setCourseCode(e.target.value)} value={courseCode}
                />
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        </div>
    )

}
    

export default CourseForm;

