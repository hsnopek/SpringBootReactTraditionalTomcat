import '../../App.css';
import logo from '../../logo.svg';
import { useEffect, useState } from 'react';
import constants from '../../constants/constants';


function HomePage(props) {

    const [testMessage, setTestMessage] = useState('');

    useEffect(() => {
        fetch(constants.API_BASE_URL + "/test-message")
          .then(res => res.text())
          .then(res => { setTestMessage(res) });
    
      }, []);

    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo" />
                <p>{testMessage}</p>
            </header>
        </div>
    );
}

export default HomePage;
