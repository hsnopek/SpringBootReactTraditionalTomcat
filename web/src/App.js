import {
  useRoutes,
} from "react-router-dom";
import TestPage from './pages/TestPage/TestPage.jsx';
import HomePage from './pages/HomePage/HomePage.jsx';

function App() {

  const routes = useRoutes([
    { path: '/', element: <HomePage /> },
    { path: '/test-page', element: <TestPage /> },
  ]);

  return (
    <div>
      {routes}
    </div>
  );
}

export default App;
