package az.developia.librarian.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import az.developia.librarian.entity.Librarianentity.Librarianentitiy;



public class Librarianrepository {
	public  boolean checkUser(String username) {
		boolean userExists=false;
String query="SELECT count(*) FROM teacher where username='"+username+'"';
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarian_db?useSSL=false",
							"root", "1234567");

					Statement st = conn.createStatement();
					
					ResultSet result=st.executeQuery(query);
					result.next();
					
					userExists=result.getInt(1)==1?true:false;
					st.executeUpdate(query);

					conn.close();

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		return userExists;
		
		
	}

 public void add(Librarianentitiy librarian) {
	
	
	String query = "INSERT INTO librarian(name,surname,phone_number,address,username,password) VALUES " + "('"
			+ librarian.getName() + "','" + librarian.getSurname() + "','" + librarian.getPhone() + "','"
			+ librarian.getAddres() + "','" + librarian.getUsername() + "','" + librarian.getPassword() + "')";
	try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarian_db?useSSL=false",
				"root", "1234567");

		Statement st = conn.createStatement();

		
		st.executeUpdate(query);

		conn.close();

	} catch (Exception e) {
		System.out.println(e.getMessage());
		
		
	}

	
}
}
