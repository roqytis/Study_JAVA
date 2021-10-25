import com.dao.MySQLDAO;
import com.dao.OracleDAO;
import com.service.DBService;

public class DBMain {

	
	public static void main(String[] args) {
//		OracleDAO odao=new OracleDAO();
//				odao.connectOracle();
		
//		MySQLDAO mdao = new MySQLDAO();
//		mdao.connectMySQL();
		
		DBService service=new DBService();
		//service.setDAO(new OracleDAO());
        service.setDAO(new MySQLDAO());
        service.setDAO(new OracleDAO());
	} 
}
