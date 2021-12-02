import { render } from "@testing-library/react";
import react,{Component} from "react";
import login from './login.css';


render()
{
    return(
     <div>
    <h2>Welcome to Online Health Services</h2> 
    <div className="login">       
        <label><b>User Name     
        </b>    
        </label>    
        <input type="text" name="Uname" id="Uname" placeholder="Enter Username" required />    
            
        <label><b>Password     
        </b>    
        </label>    
        <input type="Password" name="Pass" id="Pass" placeholder="Enter Password" required />    
        
		<a href="home.html" />
        <input type="button" name="log" id="log" value="Log In" />  
		
		<h5> New User? Click signup below</h5>
		<a href="signup.html">
		<input type="button" name="sign" id="sign" value="Sign Up" /> 
  		</a>
       
         <a href="forgotpass.html">Forgot Password</a> 
         </div>
      </div>  
    )
}

export default login
