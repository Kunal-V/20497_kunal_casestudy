import React from 'react'
import { useState, useEffect } from 'react'
import { Route, Link, BrowserRouter as Router, Routes} from 'react-router-dom'


 function Feedback() {
    const [data,setData]=useState([])
    useEffect(()=>{
  fetch("http://localhost:8080/patientfeedbacks").then((result) =>{
    result.json().then((resp)=>{
      //console.warn("result", resp)
      setData(resp)
    })
  })
  },[])
  console.warn(data)
 
    return (
        <React.Fragment>
        <div style={{
  backgroundImage: 'url("./assets/images/blur-hospital.jpg")',
  width:'100%', height:'800px' , backgroundRepeat: "no-repeat" ,
  backgroundSize: "cover"}}>

<div class="top">
<div>

</div>
</div>

<div class="logo">
<div>
    <table>
        <tr>
    
                <td> 
                    <font size="20px"> 
                    <Link to="/home">HOME</Link>
                
                <Link to="/service">SERVICES</Link>

                <Link to="/appointment">SHOW APPOINTMENTS</Link>

                <Link to="/prescription">GIVE PRESCRIPTION</Link>

                <Link to="/feedback">VIEW FEEDBACK</Link>

                <Link to="/homelogin">LOGIN</Link>
                        
                    </font>
            </td>
        </tr>
    </table>
</div>
</div>
<h2>Review FeedBack</h2>

<table class="styled-table">
  <thead>
 <tr>
     
     <th>Patient ID</th>
     <th>Date</th>
     <th>Doctor ID</th>
     <th>FeedBack</th>
 </tr>
 </thead>
 <tbody>
{
data.map((feedback)=>
<tr>
     
   <td>{feedback.pat_Id}</td>
   <td>{feedback.date}</td>
   <td>{feedback.dr_Id}</td>
   <td>{feedback.feedback}</td>
  
 </tr> )}

</tbody>
</table>
</div>
    </React.Fragment>
    )
}
 
export default Feedback;