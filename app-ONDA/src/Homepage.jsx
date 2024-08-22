import Body from "./Component/home_page_package/Body"
import Navbar from "./Component/home_page_package/Navbar"
export function Homepage(){
    return(
        <>
        <div style={{ position: "fixed",zIndex: 1,width:'100%'}}>
        <Navbar />
        </div>
        <div style={{ display: "block", paddingTop: "60px" }}>
        <Body />
        <br />
        <Body />
        <Body />
        </div>
        </>
    )
}