public class User {

	private String userName;
	private String emailID;
	private String password;
	private String name;
	private String phone;

	public User() {
		// TODO - implement User.User
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userName
	 * @param emailID
	 * @param password
	 * @param name
	 * @param phone
	 */
	public User(String userName, String emailID, String password, String name, String phone) {
		// TODO - implement User.User
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param emailID
	 * @param password
	 */
	public void register(String emailID, String password) {
		// TODO - implement User.register
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param emailID
	 * @param password
	 */
	public void login(String emailID, String password) {
		// TODO - implement User.login
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 * @param phone
	 */
	public void updateProfile(String name, String phone) {
		// TODO - implement User.updateProfile
		throw new UnsupportedOperationException();
	}

	public void viewBookings() {
		// TODO - implement User.viewBookings
		throw new UnsupportedOperationException();
	}

	public String getUserName() {
		return this.userName;
	}

	/**
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailID() {
		return this.emailID;
	}

	/**
	 * 
	 * @param emailID
	 */
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	/**
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

}