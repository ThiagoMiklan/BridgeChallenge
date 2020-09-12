import React, { useState, useEffect } from 'react';
import ReactDOM from 'react-dom';
import 'bulma/css/bulma.css';
import './css/styles.css';
import FatorialPanel from './components/FatorialPanel';
import dotenv from 'dotenv';
dotenv.config();


ReactDOM.render(
  <>
    <FatorialPanel />
  </>
  ,
  document.getElementById('root')
);
