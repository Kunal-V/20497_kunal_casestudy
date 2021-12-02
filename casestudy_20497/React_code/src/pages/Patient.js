import React, { Component } from 'react'
import { useEffect, useState } from 'react/cjs/react.development'
import { Route, BrowserRouter as Router, Routes,Link} from 'react-router-dom' 



 function Patient() {
  const [data,setData]=useState([])
  useEffect(()=>{
fetch("http://localhost:8080/patients").then((result) =>{
  result.json().then((resp)=>{
    //console.warn("result", resp)
    setData(resp)
  })
})
},[])
console.warn(data)
 
        return (
            <React.Fragment>

<div class="top">
		<div>
		
		</div>
	</div>
	
	<div class="logo">
		<div>
			<table>
				<tr>
                <font color="#428bca"> Online </font><font color="#000"> Consultation</font>
					<td width="700px" />
					<td> 
						<font size="4px"> 
           
						</font>
					</td>
				</tr>
			</table>
		</div>
	</div>


            <h2>Patient Profiles</h2>

            <table class="styled-table">
         <thead>
        <tr>
            <th>Name</th>
            <th>Patient ID</th>
        </tr>
        </thead>
        <tbody>
        {
    data.map((patient)=>
    <tr>
          <td>{patient.pat_Name}</td>
          <td>{patient.pat_Id}</td>
         
        </tr> )}

          </tbody>
          </table>
            
           
            
                    </React.Fragment>
        )
    }
 

export default Patient;