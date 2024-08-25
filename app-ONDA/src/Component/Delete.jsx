import axios from "axios";
import { useEffect } from "react";
import { useParams } from "react-router-dom";

export function Delete(){
    const {ao}=useParams()
    useEffect(()=>{
        axios.get(`http://localhost:9999/AOs/delete/${ao}`)
        .then()
    })
}