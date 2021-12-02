import React, { Component } from 'react';
import { Route, Link, BrowserRouter as Router, Routes, useNavigate} from 'react-router-dom' 


 function Homelogin() {
    
  const navigate = useNavigate();

  const onSubmit = () => {
      
       navigate("/login");
    }

   const  onSubmit1 = () => {
        navigate("/plogin");
    }

        return (
             <React.Fragment>
            
        <div style={{
      backgroundImage: 'url("./assets/images/blur-hospital2.jpg")',
      height: "90vh",width: "150vh",backgroundSize: "cover" , backgroundRepeat: "no-repeat"}}>
    
        <h2>Welcome to Online Consultation Services</h2>
        
    <div class="login" >
    <button className="Submit" name="log" id="log" onClick={onSubmit}>Doctor Login </button>
	<br /> <br />

        <button className="Submit" name="log" id="log" onClick={onSubmit1}>Patient Login </button>
        </div> 
        
</div>
  

</React.Fragment>
        );

}
export default Homelogin;
