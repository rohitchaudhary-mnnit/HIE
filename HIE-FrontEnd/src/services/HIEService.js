import axios from 'axios';

const HIE_REST_API_URL = 'http://localhost:8080/api/serviceproviders';

class HIEService {
    getHieServices(){
        return axios.get(HIE_REST_API_URL);
    }
}

export default new HIEService();