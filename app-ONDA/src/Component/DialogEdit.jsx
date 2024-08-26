import * as React from 'react';
import Button from '@mui/material/Button';
import Dialog from '@mui/material/Dialog';
import DialogActions from '@mui/material/DialogActions';
import DialogContent from '@mui/material/DialogContent';
import DialogContentText from '@mui/material/DialogContentText';
import DialogTitle from '@mui/material/DialogTitle';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import DoneIcon from '@mui/icons-material/Done';
import DeleteIcon from '@mui/icons-material/Delete';
import Chip from '@mui/material/Chip';
import Stack from '@mui/material/Stack';
import EditIcon from '@mui/icons-material/Edit';
import { useParams } from 'react-router-dom';
import axios from 'axios';
import { WindowSharp } from '@mui/icons-material';


export default function DialogEdit({id,champs}) {
  const [open, setOpen] = React.useState(false);

  const handleClickOpen = () => {
    setOpen(true);
  };

  const handleClose = () => {
    setOpen(false);
  };

  const handlesucces=()=>{
    const datamodify={id: id ,[champs]: document.getElementById("filled-basic").value};
    axios.post("http://localhost:9999/AOs/update",datamodify)
    .then(response=>{
        console.log(response.data);
    }).catch(error=>{
        console.log(error);
    })
    window.location.href=`/detail/${id}`

  };

  return (
    <React.Fragment>
      <Button variant="contained"
      color="primary"
      size="small"
      style={{
      marginLeft: 10,}}
       onClick={handleClickOpen}>
        <EditIcon /> Edit 
      </Button>
      <Dialog
        open={open}
        onClose={handleClose}
        aria-labelledby="alert-dialog-title"
        aria-describedby="alert-dialog-description"
      >
        <DialogTitle id="alert-dialog-title">
          Modifier {champs}
        </DialogTitle>
        <DialogContent>
        <TextField id="filled-basic" label={`${champs}`} variant="filled" />
        </DialogContent>
        <DialogActions>
          <Button onClick={handleClose}>Refuser</Button>
          <Button onClick={handlesucces} autoFocus>
            Modifier
          </Button>
        </DialogActions>
      </Dialog>
    </React.Fragment>
  );
}
