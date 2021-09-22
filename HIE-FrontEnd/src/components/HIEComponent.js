import React from 'react';
import HIEService from '../services/HIEService';

class HIEComponent extends React.Component {
    constructor(props){
        super(props);
        this.state = {
           serviceproviders:[]
       }
   }

   componentDidMount(){
       HIEService.getHieServices().then((response) => {
           this.setState({serviceproviders:response.data})
       });
   }
   render(){
       return(
           <>
           <div>
           <table className = "table table-striped">
               <thead className="App">
                   <tr>
                       <td>Id</td>
                       <td>ServiceProviderLocation</td>
                       <td>ServiceType</td>
                       <td>Email id</td>
                       <td>Contact no.</td>
                   </tr>
               </thead>
               <tbody className = "table-body">
                   {
                       this.state.serviceproviders.map(
                           serviceprovider =>
                           <tr key = {serviceprovider.id}>
                               <td>{serviceprovider.id}</td>
                               <td>{serviceprovider.address}</td>
                               <td>{serviceprovider.servicetype}</td>
                               <td>{serviceprovider.email}</td>
                               <td>{serviceprovider.contactNo}</td>
                           </tr>
                       )
                   }
               </tbody>
           </table>
           </div>
        </>
       )
   }
}
export default HIEComponent;
