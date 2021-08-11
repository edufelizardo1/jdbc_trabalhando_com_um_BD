package jdbc_bd;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		
		ConectionFactory conectionFactory = new ConectionFactory();
		Connection connection = conectionFactory.recuperaConexao();
		
		Statement stm = connection.createStatement();
		stm.execute("DELETE FROM PRODUTO WHERE ID > 2");
		
		Integer linhasModificadas = stm.getUpdateCount();
		
		System.out.println("Quantas linhas foram modificadas: "  + linhasModificadas);
	}

}
