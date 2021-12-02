import React from 'react'

import { Route,Link, BrowserRouter as Router, Routes} from 'react-router-dom' 

 function Phome() {
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
					<td width="300px">
				

					<font color="#000" size="50px">  We are a  virtual medical center </font>
                    <br></br><br></br>

<ul>
<li> We offer wide variety of services. </li>
<li>There are 50+ Doctors available. </li>
<li>We provide consultation to all age groups.</li>
<li> We have more than 5000+ patients. </li>
<li> We provide the best services. </li>
</ul>

 </td>
				</tr>	
			</table>
		</div>
	</div>

</React.Fragment>
    )
}

export default Phome;
