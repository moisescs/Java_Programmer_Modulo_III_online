import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Exemplo1 {

	public static void main(String[] args) {
		
		/*Strings de conexãoo
		 * 
		 * Mysql - jdbc:mysql://servidor:3306/database
		 * SQL Server - jdbc:sqlserver://servidor\\instancia:1433;databaseName=database
		 * Oracle - jdbc:oracle:thin:@servidor:1521:instancia
		 *
		 **/
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn =  DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/Ri4t4wr2kY", "Ri4t4wr2kY", "2BMsMViToj");
			System.out.println("Conexão aberta com sucesso.");
			
			Statement st = cn.createStatement();
			//st.executeUpdate("INSERT INTO users (nome_user, dtNascimento_user, obs_user) VALUES ('Moises Silva', '1992-05-28', 'Observacao testes')");
			//st.executeUpdate("UPDATE users SET nome_user='José', dtNascimento_user='1995-03-02', obs_user='teste de update via java' WHERE id_user=1");
			//st.executeUpdate("DELETE FROM users WHERE id_user=2");
			
			st.close();
			cn.close();
			System.out.println("Conexão encerrada com sucesso.");
			
		} catch (ClassNotFoundException e) {
			
			System.out.println("Falha ao carregar o driver");
			e.printStackTrace();
		} catch (Exception sqle) {
			System.out.println("Falha ao conectar com o banco de dados");
			sqle.printStackTrace();
		}
		
		
		
	}

}
