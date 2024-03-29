package jdbc_bd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {
	public static void main(String[] args) throws SQLException {
		System.out.println("Abrindo a conex�o");

        ConectionFactory conectionFactory = new ConectionFactory();
        Connection con = conectionFactory.recuperaConexao();
        
        Statement stm = con.createStatement();
        stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
        
        ResultSet rst = stm.getResultSet();
        
		while (rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println(id);
			String nome = rst.getString("NOME");
			System.out.println(nome);
			String descricao = rst.getString("DESCRICAO");
			System.out.println(descricao);
		}
        
        System.out.println("Fechando a conex�o");

        con.close();
	}
}
