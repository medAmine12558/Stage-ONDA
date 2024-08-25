import './CSS/Detail.css';
import DoneIcon from '@mui/icons-material/Done';
import DeleteIcon from '@mui/icons-material/Delete';
import Chip from '@mui/material/Chip';
import Stack from '@mui/material/Stack';
import React , { useEffect, useState } from 'react';
import axios from 'axios';
import { useParams } from 'react-router-dom';
import Dialog from '@mui/material/Dialog';
import DialogActions from '@mui/material/DialogActions';
import DialogContent from '@mui/material/DialogContent';
import DialogContentText from '@mui/material/DialogContentText';
import DialogTitle from '@mui/material/DialogTitle';
import Button from '@mui/material/Button';



export function Detail(){
  const {id}=useParams()
  const [AO,setAO]=useState(null);
  const [open, setOpen] = useState(false);
  const [loading,setLoading]=useState(false)
  useEffect(()=>{
    axios.get(`http://localhost:9999/AOs/${id}`) // Make a GET request to Spring Boot API
      .then(response => {
        setAO(response.data); // Update the AOs state with the response data
      })
      .catch(error => {
        console.error(error);
      });
  },[id]);

if(!AO){
  return <p>chargement ...</p>
}

const handleClickOpen = () => {
  setOpen(true);
};

const handleClose = () => {
  setOpen(false);
};

const hundelAccept= async()=>{
 setLoading(true)
  try{
    const res=await axios.delete(`http://localhost:9999/AOs/delete/${AO.id}`);
    if(res.status==200){
      window.location.href="/home";
    }
    else{
      return <p>erreur lors de suppression</p>
    }
  }catch(error){
    console.log(error)
  }
  finally{
    setLoading(false)
  }
}

console.log(AO)
    return(
        <div className="detail-page">
        <div className="header">
          <h1>Ticket d'appel d'offre</h1>
         <div style={{cursor:'pointer' }}>
         <Stack direction="row" spacing={1}>
      <Chip style={{ backgroundColor:'blue', color:'white'}}
        label="Modifier"
        onClick={()=>{console.log("btn de modification est clicke")}}
        //onDelete={}
        deleteIcon={<DoneIcon />}
      />
      <Chip style={{ backgroundColor:'blue' , color:'white'}}
        label="Supprimer"
        onClick={handleClickOpen}
        //onDelete={}
        deleteIcon={<DeleteIcon />}
        variant="outlined"
      />


<Dialog
        open={open}
        onClose={handleClose}
        aria-labelledby="alert-dialog-title"
        aria-describedby="alert-dialog-description"
      >
        <DialogTitle id="alert-dialog-title">
          Vous allez supprimer l'appel d'offre !!!
        </DialogTitle>
        <DialogContent>
          <DialogContentText id="alert-dialog-description">
            Veuillez accepter si vous etes sur de supprimer le ticket d'appel d'offre
          </DialogContentText>
        </DialogContent>
        <DialogActions>
          <Button onClick={handleClose}>Refuser</Button>
          <Button onClick={hundelAccept} autoFocus>
            Accepter
          </Button>
        </DialogActions>
      </Dialog>


    </Stack>
         </div>
        </div>
        <div className="content">
          <div className="info">
            <p>{AO.descrip}</p>
            <p><span>Objet :</span> {AO.objet}</p>
            <p><span>Date de création :</span> {AO.date}</p>
            <p><span>Prix :</span> {AO.prix} DHS</p>
          </div>
        </div>
        <div className="actions">
            <a href="#" className="btn">Voir les fournisseurs associés à cette AO</a>
          </div>
      </div>
    )
}