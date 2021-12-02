import React, { Component } from 'react';
import {useState, useEffect} from "react";
import { Route, Link, BrowserRouter as Router, Routes, useNavigate} from 'react-router-dom' 


function Plogin(){

    const navigate = useNavigate();

  const onSubmit3 = () => {
      
       navigate("/phome");
    }

    
    const initialValues ={ username: "" , password: ""};
    const[formValues, setFormValues] = useState(initialValues);
    const[formErrors, setFormErrors] = useState({});
    const[isSubmit, setIsSubmit] = useState(false);

    const handleChange = (e) => {
        const {name ,value } = e.target;
        setFormValues({...formValues, [name]  : value});
        setIsSubmit(true);
    }

    const handleSubmit = (e) =>{
        e.preventDefault();
        setFormErrors(validate(formValues));
    };

    useEffect(() => {
        
        if(Object.keys(formErrors).length === 0 && isSubmit) {
        
        }
    }, [formErrors]);
    const validate =(values) => {
        const errors = {}
        
        if(!values.username) {
            errors.username = "Username is Required!";
        }
        
        if(!values.password) {
            errors.password = "Password is Required!";
    }
    return errors;
    }


    return(
        <React.Fragment>
            
        <div style={{
      backgroundImage: 'url("./assets/images/blur-hospital2.jpg")',
      height: "90vh",width: "150vh",backgroundSize: "cover" , backgroundRepeat: "no-repeat"}}>
    
        <h2>Welcome to Online Consultation Services</h2>
        
    <div class="login" >
    

      <form onSubmit={handleSubmit}>
        <label><b>User Name     
        </b>    
        </label>    
        <input type="text" name="username" id="Uname"  
        placeholder="Enter Username" 
        value={formValues.username}
        onChange={handleChange}
         required />    
        
        <br /><br />
        <label><b>Password     
        </b>    
        </label>    
        <input type="Password" name="password" id="Pass" 
        placeholder="Enter Password" 
        value={formValues.password}
        onChange={handleChange}
         required />    
         <p>{formErrors.password}</p>
        <br /><br />
		<a href="home.html" />
        <button className="Submit" name="log" id="log" onClick={onSubmit3}> Login </button>
		<br /><br />
		<h5> New User? Click signup below</h5>
		<a href="signup.html" />
        <br /> 
		<input type="button" name="sign" id="sign" value="Sign Up" />
        
        </form>
        </div> 
        
</div>
  

</React.Fragment>

    )
}
export default Plogin;
