package spring.bean;

/**
 * @author lixuebing
 *
 */
public class User {
	private String loginname;
	private String username;
	private String password;
	

	public User() {
		super();
	}

	public User(String loginname, String username, String password) {
		super();
		this.loginname = loginname;
		this.username = username;
		this.password = password;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
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
		return "User [loginname=" + loginname + ", username=" + username + ", password=" + password + "]";
	}
	

}
