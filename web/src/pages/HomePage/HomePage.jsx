import '../../App.css';
import constants from '../../constants/constants';
import logo from '../../logo.svg';
import { useEffect, useState } from 'react';
import {
  useNavigate
} from "react-router-dom";


function HomePage(props) {

  const navigate = useNavigate();
  const [message, setMessage] = useState('');

  useEffect(() => {
    fetch(constants.API_BASE_URL + "/hello-world")
      .then(res => res.text())
      .then(res => { setMessage(res) });
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>{message}</p>
        <button onClick={() => navigate("/test-page")}>Go to test page</button>
      </header>
    </div>
  );
}

export default HomePage;
