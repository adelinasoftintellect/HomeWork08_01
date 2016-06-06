
public class CoorporativeAccount extends Account {
	private String fname;
	private String bulstat;

	public CoorporativeAccount(float sum, String fname, String bulstat) {
		super(sum);
		this.fname = fname;
		this.bulstat = bulstat;
	}

	public CoorporativeAccount() {
		this(0, "", "");
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getBulstat() {
		return bulstat;
	}

	public void setBulstat(String bulstat) {
		if (CoorporativeAccount.class.isAssignableFrom(Account.class)) {
			this.bulstat = bulstat;
		} else {
			this.bulstat = "InvalidAccountException";
		}
	}

	public void successor(Object o) throws Exception {
		if (o instanceof Account) {
			System.out.println(bulstat);
		}else {
			System.out.println("InvalidAccountException");
		}
	}
}
