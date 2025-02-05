package az.developia.librarian.entity;

public class Librarianentity {
	package az.developia.librarian.entity;

	public class Librarianentitiy {

		private int id;
		private  String name;
		private String surname;
		private String phone;
		private String addres;
		private String username;
		private String password;
		public Librarianentitiy(int id, String name, String surname, String phone, String addres, String username,
				String password) {
			super();
			this.id = id;
			this.name = name;
			this.surname = surname;
			this.phone = phone;
			this.addres = addres;
			this.username = username;
			this.password = password;
			
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddres() {
			return addres;
		}
		public void setAddres(String addres) {
			this.addres = addres;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "Librarianentitiy [id=" + id + ", name=" + name + ", surname=" + surname + ", phone=" + phone
					+ ", addres=" + addres + ", username=" + username + ", password=" + password + ", getId()=" + getId()
					+ ", getName()=" + getName() + ", getSurname()=" + getSurname() + ", getPhone()=" + getPhone()
					+ ", getAddres()=" + getAddres() + ", getUsername()=" + getUsername() + ", getPassword()="
					+ getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		
		
		
	}


