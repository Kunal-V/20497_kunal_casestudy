import React, { Component } from 'react';
import {useState, useEffect} from "react";
import { Route, Link, BrowserRouter as Router, Routes, useNavigate,useHistory} from 'react-router-dom' 


function Login(){
    const [username,setUsername]=useState("");
    const [password,setPassword]=useState("");
    const history = useHistory();
    useEffect(()=>{
        if (localStorage.getItem('info')){
            history.push("/add")
        }
    }, [])
    function login(){
        console.warn(username,password)
    }
   


   // const navigate = useNavigate();

  //const onSubmit2 = () => {
      
       //navigate("/home");
    //}
  
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
        <input type="text"  
        placeholder="Enter Username" 
        onChange={(e) => setUsername(e.target.value)}
        value={formValues.username}
        onChange={handleChange}
         required />    
        
        <br /><br />
        <label><b>Password     
        </b>    
        </label>    
        <input type="Password" 
        placeholder="Enter Password" 
        onChange={(e) => setPassword(e.target.value)}
        value={formValues.password}
        onChange={handleChange}
         required />    
         <p>{formErrors.password}</p>
        <br /><br />
		
        <button className="Submit" name="log" id="log" onClick={login}> Login </button>
		<br /><br />
		<h5> New User? Click signup below</h5>
		
        <br /> 
		<input type="button" name="sign" id="sign" value="Sign Up" />
        
        </form>
        </div> 
        
</div>
  

</React.Fragment>

    )
}
export default Login;
