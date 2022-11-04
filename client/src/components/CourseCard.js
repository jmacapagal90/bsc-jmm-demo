

function CourseCard({
    id,
    name,
    description,
    status,
    username,
    handleDeleteCourse
    }){

    function onDeleteCourse(){
        console.log(id)
        fetch(`/delete/${id}`, {
            method: 'DELETE',
        }).then(r => r.json());
        handleDeleteCourse(id)
    }

    return (
        <div class="col">
            <div class="card" style={{width: "22rem"}}>
                <div class="card-body">
                    <h5 class="card-title"><strong>{name}</strong></h5>
                    <p class="card-text">{description}</p>
                    <p class="card-text">Course Status: {status}</p>
                    <p class="card-text">Course Code: {username}</p>
                    <button onClick={onDeleteCourse}>Remove Course</button>
                </div>
            </div>
        </div>
    )
}

export default CourseCard;