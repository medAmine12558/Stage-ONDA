import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import './index.css'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import { Homepage } from './Homepage.jsx'
import { Detailpage } from './Detailpage.jsx'
ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <BrowserRouter>
    <Routes>
      <Route path='/' element={<App></App>}></Route>
      <Route path='/home' element={<Homepage></Homepage>}></Route>
      <Route path='/detail/:id' element={<Detailpage></Detailpage>}></Route>
      <Route path='/delete/:ao.id' ></Route>
    </Routes>
    </BrowserRouter>
    
  </React.StrictMode>,
)
