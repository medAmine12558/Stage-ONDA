import './CSS/Detail.css';
import DoneIcon from '@mui/icons-material/Done';
import DeleteIcon from '@mui/icons-material/Delete';
import Chip from '@mui/material/Chip';
import Stack from '@mui/material/Stack';
export function Detail(){
    return(
        <div className="detail-page">
        <div className="header">
          <h1>Titre d'AO</h1>
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
        onClick={()=>{console.log("btn de supprimer est clicke")}}
        //onDelete={}
        deleteIcon={<DeleteIcon />}
        variant="outlined"
      />
    </Stack>
         </div>
        </div>
        <div className="content">
          <div className="info">
            <p>description d'AO</p>
            <p><span>Type :</span> type d'AO</p>
            <p><span>Date de création :</span> DD-MM-YYYY</p>
          </div>
        </div>
        <div className="actions">
            <a href="#" className="btn">Voir les fournisseurs associés à cette AO</a>
          </div>
      </div>
    )
}