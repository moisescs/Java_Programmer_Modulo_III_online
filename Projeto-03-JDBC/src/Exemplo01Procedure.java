

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;


public class Exemplo01Procedure {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection cn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/Ri4t4wr2kY", "Ri4t4wr2kY", "2BMsMViToj");
			Connection cn = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10298702", "sql10298702", "TBZqtadmbq");
			System.out.println("Conectado com sucesso!");
			
//			Statement st = cn.createStatement();
//			
//			st.executeUpdate("INSERT INTO users(nome_user, dtNascimento_user, obs_user ) VALUES('Novo Teste de Insert', '2019-05-22', 'ok')");
//			
//			
//			ResultSet rs = st.executeQuery("SELECT * FROM users");
//			while(rs.next()) {
//				System.out.println(
//						"+++++++++++++++++++++++++++++++++++++++\n"
//						+" " + rs.getInt("id_user") + "\n" + rs.getString("nome_user") + "\n" +rs.getString("dtNascimento_user") + "\n" + rs.getString("obs_user") 
//						);
//			}
			
			//CHAMANDO PROCEDURES
			
			CallableStatement cs = cn.prepareCall("{call prc_numero_descricao(?, ?)}");
			cs.setInt(1, 1245);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.executeUpdate();
			String result = cs.getString(2);
			System.out.println(result);
			
			
			cs.close();
			cn.close();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Driver não localizado");
			cnfe.printStackTrace();
		}catch (SQLException sqle) {
			System.out.println("Não foi possivel connectar o banco");
			sqle.printStackTrace();
		}

	}

}
