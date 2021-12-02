import React, { Component } from 'react'
import axios from "axios";
import { Route, Link, BrowserRouter as Router, Routes} from 'react-router-dom' 

export default class Pappointment extends Component {

    constructor(props) {
        super(props)

        this.state = {
         
            slot_Id:'',
            pat_Id: '',
            date:'',
            start_time:'',
            dr_Id:'',
            
            
        }
        this.changeHandler=this.changeHandler.bind(this)
        this.submitHandler=this.submitHandler.bind(this)
    }

    changeHandler (e) {
        this.setState({ [e.target.name]: e.target.value})
    }
    submitHandler (e) {
        e.preventDefault()
        console.log(this.state)
        axios
            .post('http://localhost:8080/slots', this.state)
            .then(response => {
                console.log(response)
            })
            .catch(error => {
                console.log(error)
            })
    }

    render() {
        const { pat_Id,date,start_time,dr_Id,slot_Id } = this.state
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
<div class="bottom_up">
    <div>
            Make an Appointment
            <form onSubmit={this.submitHandler}>
            <table>
                
                <tr>
                    <td width="500px"> </td>
                    <td>	<input type="text" placeholder="Doctor ID" name="dr_Id" value={dr_Id}
                            onChange={this.changeHandler}/></td>
                    <td> 	<input type="text" placeholder="Patient ID" name="pat_Id" value={pat_Id}
                            onChange={this.changeHandler}/></td>
                </tr>
                <tr height="30px">
                    
                </tr>
                <tr>
                    <td width="500px"> </td>
                    <td>	<input type="Date" placeholder="Date" name="date" value={date}
                            onChange={this.changeHandler} /></td>
                    <td> 	<input type="text" placeholder="Slot ID"  name="slot_Id" value={slot_Id}
                            onChange={this.changeHandler}/></td>
                </tr>
                
                <tr height="30px">
                    
                </tr>
                <tr>
                    <td width="500px"> </td>
                    <td>	<input type="time" placeholder="Start Time" name="start_time" value={start_time}
                            onChange={this.changeHandler}/></td>
                    
                </tr>
                
                    <tr height="30px">
                    
                </tr>
                <tr>
                    <td width="500px"> </td>
                    <td colspan="2">	<textarea placeholder="Enter a Message"> </textarea></td>
                </tr>
                
                    <tr height="30px">
                    
                </tr>
                <tr>
                    <td width="500px"> </td>
                    <td colspan="2">	<button> SUBMIT </button></td>
                </tr>
               
            </table>
            </form>	
    </div>
</div>
</div>
        </React.Fragment>
        )
    }
}
