
public class PersonalAccount extends Account {
	private String name;
	private String pn;

	public PersonalAccount(float sum, String name, String pn) {
		super(sum);
		this.name = name;
		this.pn = pn;
	}

	public PersonalAccount() {
		this(0, "", "");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getPn() {
		return pn;
	}

	public void setPn(String pn) throws Exception {
		// if (PersonalAccount.class.isAssignableFrom(Account.class)) {
		// this.pn = pn;
		// } else {
		// this.pn = "InvalidAccountException";
		// }
	}

	public void successor(Object o) throws Exception {
		if (o instanceof Account) {
			System.out.println(pn);
		}else {
			System.out.println("InvalidAccountException");
		}
	}
}
