import CourseCard from "./CourseCard";

function CourseList({ courses,handleDeleteCourse }){

    const showCourseCards = courses.map((course)=>{
        return (
            <CourseCard 
                key={course.id} 
                id={course.id}
                name={course.name}
                description={course.description}
                status={course.status}
                username={course.username}
                handleDeleteCourse={handleDeleteCourse}
            />
        )
    })

    return (
        <div class="container">
            <div class="row justify-content-center">
                {showCourseCards}
            </div>
        </div>

    )
}

export default CourseList;