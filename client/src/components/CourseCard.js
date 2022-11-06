import {XCircleFillIcon} from '@primer/octicons-react'

function CourseCard({
    id,
    name,
    description,
    status,
    classcode,
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
                    <button type="submit" class="btn btn-danger btn-sm" onClick={onDeleteCourse} ><XCircleFillIcon size={12}  /></button>
                    <h5 class="card-title"><strong>{name}</strong></h5>
                    <p class="card-text"><i>{description}</i></p>
                    <p class="card-text">Course Status: {(status) === true ? <strong>Active</strong> : <i>Not Active</i>}</p>
                    <p class="card-text">Class Code: {classcode}</p>
                    
                </div>
            </div>
        </div>
    )
}

export default CourseCard;