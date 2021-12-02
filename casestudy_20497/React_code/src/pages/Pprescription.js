import React from 'react'
import { useState, useEffect } from 'react'
import { Route, Link, BrowserRouter as Router, Routes} from 'react-router-dom' 

export default function Pprescription() {

            const [data,setData]=useState([])
            useEffect(()=>{
          fetch("http://localhost:8080/prescriptions").then((result) =>{
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
            <h2>Appointments Available</h2>
                
                <table class="styled-table">
                  <thead>
                 <tr>
                     <th> Slot ID</th>
                     <th>prescription</th>
                     
                 </tr>
                 </thead>
                 <tbody>
             {
             data.map((prescription)=>
             <tr>
                     <td>{prescription.slot_Id}</td>
                   <td>{prescription.prescription}</td>
                   
                  
                 </tr> )}
         
            </tbody>
         </table>
        </div>
        
                    </React.Fragment>
                )
            }
        
        