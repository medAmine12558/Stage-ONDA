import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Form } from 'react-router-dom';
import Stack from '@mui/material/Stack';
import Button from '@mui/material/Button';
import { useForm } from 'react-hook-form';
import { Margin } from '@mui/icons-material';
import axios from 'axios';

export function AddAo(){
    const { register, handleSubmit } = useForm();
    const [data,setData]=React.useState({
        descrip:"",
        objet:"",
        date:"",
        prix:""
})
const onChange = (event) => {
    setData({ ...data, [event.target.name]: event.target.value });
  };
const onSubmit=async(data)=>{
    axios.post("http://localhost:9999/AOs/save",data).then(response=>{
        console.log(response.data)}).catch(error=>{
            console.log(error);
        })
}
console.log(data)
    return (
        <>
            <Form onSubmit={handleSubmit(onSubmit)}>
                <TextField style={{marginLeft:"15px"}} onChange={onChange} {...register('descrip')} label="Description" variant="standard" />
                <TextField style={{marginLeft:"15px"}} onChange={onChange} {...register('objet')} label="Objet" variant="standard" />
                <TextField style={{marginLeft:"15px"}} onChange={onChange} {...register('date')} label="Date de creation" variant="standard" />
                <TextField style={{marginLeft:"15px"}} onChange={onChange} {...register('prix')} label="Prix" variant="standard" />
                <Button style={{marginTop:"10px",marginLeft:"15px"}} variant="contained" type="submit">Ajouter</Button>
            </Form>
            

        </>
    )
}