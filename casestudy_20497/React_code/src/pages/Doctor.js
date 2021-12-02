import React, { Component } from 'react'
import { useEffect, useState } from 'react/cjs/react.development'
import { Route, Link, BrowserRouter as Router, Routes} from 'react-router-dom'

  function Doctor(){
const [data,setData]=useState([])
    useEffect(()=>{
  fetch("http://localhost:8080/doctors").then((result) =>{
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
                
					<td> 
						<font size="4px"> 
            <Link to="/phome">HOME</Link>
                
				<Link to="/pservice">SERVICES</Link>

                <Link to="/doctor">DOCTOR</Link>

				<Link to="/pappointment">BOOK AN APPOINTMENT</Link>

                <Link to="/pprescription">SHOW PRESCRIPTION</Link>

                <Link to="/pfeedback">GIVE FEEDBACK</Link>

                <Link to="/homelogin">LOGIN</Link>
						</font>
					</td>
				</tr>
			</table>
		</div>
	</div>

        <h2>Doctor Profiles</h2>
        
       <table class="styled-table">
         <thead>
        <tr>
            <th>Name</th>
            <th>ID</th>
            <th>Specialization</th>
        </tr>
        </thead>
        <tbody>
    {
    data.map((doctor)=>
    <tr>

          <td>{doctor.dr_Name}</td>
          <td>{doctor.dr_Id}</td>
          <td>{doctor.specialization}</td>
         
        </tr> )}

   </tbody>
</table>
        
                </React.Fragment>
        )
    }
  
export default Doctor;

   