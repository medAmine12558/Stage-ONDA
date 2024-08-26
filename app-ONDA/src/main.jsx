import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import './index.css'
import { createBrowserRouter, RouterProvider } from 'react-router-dom'
import { Homepage } from './Homepage.jsx'
import { Detailpage } from './Detailpage.jsx'
import { AddAo } from './AddAo.jsx'

const router = createBrowserRouter([
  {
    path: '/',
    element: <App />,
  },
  {
    path: '/home',
    element: <Homepage />,
  },
  {
    path: '/detail/:id',
    element: <Detailpage />,
  },
  {
    path: '/delete/:ao.id',
    element: <div />, // add a component for this route
  },
  {
    path: '/addAo',
    element: <AddAo />,
  },
]);

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>,
)