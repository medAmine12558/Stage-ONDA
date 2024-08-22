
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import "./CSS/login.css"
export default function Login(){
    return(
        <div className='container'>
        <h1>Login</h1>
        <TextField sx={{'& .MuiInputBase-input': {color: 'black'},'& .MuiFormLabel-root': {color: 'black',},marginBottom:'10px',width:'350px'}} id="filled-basic" label="Email" variant="filled" />
        <br />
        <TextField sx={{'& .MuiInputBase-input': {color: 'black', },'& .MuiFormLabel-root': {color: 'black', },marginBottom:'10px',width:'350px'}} id="filled-basic" label="Password" variant="filled" />
        <br />
        <Button variant="contained">Submit</Button>
        
        </div>
    )
}