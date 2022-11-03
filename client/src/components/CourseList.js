import CourseCard from "./CourseCard";

export default function CourseList({ courses }){

    const showCourseCards = courses.map((course)=>{
        return (
            <CourseCard 
                key={course.id} 
                name={course.name}
                description={course.description}
                status={course.status}
                username={course.username}
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