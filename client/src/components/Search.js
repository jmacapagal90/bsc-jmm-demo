import React from "react";

function Search({ setSearchQuery}) {

    function handleChange(e) {
    setSearchQuery(e.target.value)
    }
  return (
        <div class="input-group input-group-sm mb-3">
            <span class="input-group-text" id="inputGroup-sizing-sm">Search</span>
            <input type="search" id="form1" class="form-control" onChange={handleChange} placeholder="Enter your class name"/>
        </div>

  );
}

export default Search;
