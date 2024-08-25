import * as React from 'react';
import Box from '@mui/material/Box';
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';
import { Link } from 'react-router-dom';
import axios from 'axios';
import { useState, useEffect } from 'react';
import { Aod } from '@mui/icons-material';

export default function Body() {
  const [AOs, setAOs] = useState([]); // Initialize AOs as an empty array

  useEffect(() => {
    axios.get('http://localhost:9999/AOs') // Make a GET request to Spring Boot API
      .then(response => {
        setAOs(response.data); // Update the AOs state with the response data
      })
      .catch(error => {
        console.error(error);
      });
      
  }, [AOs]);

  return (
    <Box sx={{ minWidth: 275 }}>
      {AOs.map((ao) => (
        <Card key={ao.id} variant="outlined">
          <React.Fragment>
            <CardContent>
              <Typography sx={{ fontSize: 14 }} color="text.secondary" gutterBottom>
                {ao.date}
              </Typography>
              <Typography variant="h5" component="div">
                {ao.objet}
              </Typography>
              <Typography sx={{ mb: 1.5 }} color="text.secondary">
                {ao.descrip}
              </Typography>
              <Typography variant="body2">
                {ao.prix} DHS
              </Typography>
            </CardContent>
            <CardActions>
              <Link to={`/detail/${ao.id}`} params={{id: ao.id}}>Voir plus de detailles</Link>
            </CardActions>
          </React.Fragment>
        </Card>
      ))}
    </Box>
  );
}