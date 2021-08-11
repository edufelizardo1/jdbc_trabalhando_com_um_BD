package jdbc_bd;

import java.sql.*;

public class TestaConexaoParaExercicio {

    public static void main(String[] args) throws SQLException {

        ConectionFactory conectionFactory = new ConectionFactory();
        Connection con = conectionFactory.recuperaConexao();

        con.close();

    }
}
