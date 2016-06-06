class Account {
	private float sum;

	public Account(float sum) {
		super();
		this.sum = sum;
	}

	public Account() {
		this(0);
	}

	public float getSum() {
		return sum;
	}

	public void setSum(float sum) throws NegativeMoneyException {
		if (sum < 0) {
			throw new NegativeMoneyException("Sum cannot be negative!");
		}
		this.sum = sum;
	}
}

public class Main {

	public static void main(String[] args) throws Exception {
		Account ivan = new Account(100);
		try {
			ivan.setSum(-10);
			System.out.println("Sum: " + ivan.getSum());

		} catch (NegativeMoneyException exception) {
			System.out.println("Sum cannot be negative");
			System.out.println();
		}

		PersonalAccount georgi = new PersonalAccount(200, "Georgi", "789456");
		georgi.successor(georgi);
		System.out.println();
	
		 CoorporativeAccount hristo = new CoorporativeAccount(300, "Hristo","b789456");
		 hristo.successor(hristo);

	}
}
