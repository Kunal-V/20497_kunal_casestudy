import React, { Component } from 'react'
import { Route, BrowserRouter as Router, Routes,Link} from 'react-router-dom' 


 function Pservice() {
  
    
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
            
            <div class="middle">
            <div style={{
              backgroundImage: 'url("./assets/images/a.jpg")',
              height: "60vh",width: "100vh" ,backgroundSize: "auto", backgroundRepeat: "no-repeat"}} >
            
                </div>
            </div>
            
            <div class="bottom">
                <div>
                    <table border="0">
                        <tr>
                            <td width="700px">
                        
        
                            <font color="#000" size="5px">  SERVICES OFFERED </font> <br /> <br />
        
        <ul>
        <li> Dermatologist </li>
        <li> ENT Specialist </li>
        <li> Gynecologist </li>
        <li> Pediatrics </li>
        <li> General Physician </li>
        <li> Orthopedic </li>
        </ul>
        <br />
         </td>
                        </tr>	
                    </table>
                </div>
            </div>
        
                </React.Fragment>
        )
    }

    export default Pservice;