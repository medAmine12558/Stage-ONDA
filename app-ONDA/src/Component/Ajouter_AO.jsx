import TextField from '@mui/material/TextField';
import Box from '@mui/material/Box';
import { useState } from 'react';
export function Ajouter_AO(){
    const 
    return(
        <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1, width: '25ch' },
      }}
      noValidate
      autoComplete="off"
    >
      <TextField id="outlined-basic" label="Titre" variant="outlined" />
      <TextField fullWidth label="Description" id="fullWidth" />
      <TextField id="outlined-basic" label="Outlined" variant="outlined" />
      <TextField id="outlined-basic" label="Outlined" variant="outlined" />
    </Box>
    )
}