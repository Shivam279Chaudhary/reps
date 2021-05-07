package com.reps.manage;

public class User {
	private int userid;
	private String username;
	private String userpass;
	private String useradd;
	private int userrole;
	private String userbadge;

	public User() {
	}

	public User(int userid, String username, String userpass, String useradd, int userrole, String userbadge) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpass = userpass;
		this.useradd = useradd;
		this.userrole = userrole;
		this.userbadge = userbadge;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public String getUseradd() {
		return useradd;
	}

	public void setUseradd(String useradd) {
		this.useradd = useradd;
	}

	public int getUserrole() {
		return userrole;
	}

	public void setUserrole(int userrole) {
		this.userrole = userrole;
	}

	public String getUserbadge() {
		return userbadge;
	}

	public void setUserbadge(String userbadge) {
		this.userbadge = userbadge;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + userpass + ", address=" + useradd
				+ ", role=" + userrole + ", badge=" + userbadge + "]";
	}

}
