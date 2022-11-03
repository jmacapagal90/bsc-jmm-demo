

export default function CourseCard({
    name,
    description,
    status,
    username
    }){

    console.log(name)

    return (
        <div class="col">
            <div class="card" style={{width: "22rem"}}>
                <div class="card-body">
                    <h5 class="card-title"><strong>{name}</strong></h5>
                    <p class="card-text">{description}</p>
                    <p class="card-text">Class Status {status}</p>
                    <p class="card-text">Students: {username}</p>
                </div>
            </div>
        </div>
    )
}