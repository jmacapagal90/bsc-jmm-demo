import { useState } from "react";

function CourseForm({onSubmitNewCourse}){
    const [courseName,setCourseName] = useState("");
    const [courseDesc,setCourseDesc] = useState("");
    const [courseStatus,setCourseStatus] = useState("");
    const [classcode,setClasscode] = useState("");

   function submitCourse(e){
    e.preventDefault();
    const newCourseObj = {
        name: courseName,
        description: courseDesc,
        status: courseStatus,
        classcode: classcode
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
                <label for="exampleInputCourseName" class="fw-bold">Course Name</label>
                <input type="name" class="form-control" id="exampleInputCourseName" aria-describedby="courseName" placeholder="Enter Course Name" 
                onChange={(e)=>setCourseName(e.target.value)} value={courseName}
                />
             </div>
            <div class="form-group">
                <label for="exampleInputDescription" class="fw-bold">Course Description</label>
                <input type="description" class="form-control" id="exampleInputDescription" placeholder="Enter a brief description"
                    onChange={(e)=>setCourseDesc(e.target.value)} value={courseDesc}
                />
            </div>
            <div class="form-group">
                <label for="exampleInputCourseStatus" class="fw-bold">Course Status</label>
                <select class="form-select" aria-label="Default select example"  
                    onChange={(e)=>setCourseStatus(e.target.value)} 
                    value={courseStatus}>
                    <option selected>Select Class Status</option>
                    <option value={true}>Active</option>
                    <option value={false}>Not Active</option>
                </select>  
            </div>
            <div class="form-group">
                <label for="exampleInputClassCode" class="fw-bold">Course Code</label>
                <input type="coursecode" class="form-control" id="exampleInputClassCode" placeholder="Enter the course code"
                onChange={(e)=>setClasscode(e.target.value)} value={classcode}
                />
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        </div>
    )

}
    

export default CourseForm;

