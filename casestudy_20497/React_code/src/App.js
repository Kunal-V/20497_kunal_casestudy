import logo from './logo.svg';
import './App.css';
import Home from './pages/Home';
import Login from './pages/Login';
import Service from './pages/Service';
import Doctor from './pages/Doctor';
import Patient from './pages/Patient';
import Appointment from './pages/Appointment';
import Pservice from './pages/Pservice';
import Phome from './pages/Phome';
import Pfeedback from './pages/Pfeedback';
import Pappointment from './pages/Pappointment';
import Feedback from './pages/Feedback';
import Homelogin from './pages/Homelogin';
import Notfound from './pages/NotFound';
import Plogin from './pages/Plogin'; 
import Prescription from './pages/Prescription';
import Pprescription from './pages/Pprescription';
import { Route, Link, BrowserRouter as Router, Routes} from 'react-router-dom' 




function App() {


 

  return (

    <Router>
          

<Routes>


<Route path="/appointment" element={<Appointment />} />

<Route path="/pappointment" element={<Pappointment/>} />

<Route path="/service" element={<Service />} />

<Route path="/pservice" element={<Pservice />} />

<Route path="/hospitallogin" element={<Login />} />

<Route path="/phome" element={<Phome />} />

<Route path="/home" element={<Home />} />

<Route path="/homelogin" element={<Homelogin />} />

<Route path="/pfeedback" element={<Pfeedback />} />

<Route path="/feedback" element={<Feedback />} />

<Route path="*" element={<Notfound />} />

<Route path="/doctor" element={<Doctor />} />

<Route path="/patient" element={<Patient />} />

<Route path="/" element={<Homelogin />} />

<Route path="/login" element={<Login />} />

<Route path="/plogin" element={<Plogin />} />

<Route path="/feeback" element={<Feedback />} />

<Route path="/pfeedback" element={<Pfeedback />} />

<Route path="/doctor" element={<Doctor />} />

<Route path="/patient" element={<Patient />} />

<Route path="/prescription" element={<Prescription />} />

<Route path="/pprescription" element={<Pprescription />} />


</Routes>

</Router>







    /*<div>

     <Home></Home>
    <Login></Login>
    <Service></Service>
    <Doctor></Doctor>
    <Patient></Patient>
  
    <Pservice></Pservice>
    <Phome></Phome>
    <Pfeedback></Pfeedback>
    <Appointment></Appointment>
    
    <Pfeedback></Pfeedback> 
    <Feedback></Feedback>
    <NotFound></NotFound>
   <Homelogin></Homelogin>
    <Pappointment></Pappointment>

    </div>*/
  //<div><Homelogin></Homelogin></div>
  //<div></div>
  );
}

export default App;
