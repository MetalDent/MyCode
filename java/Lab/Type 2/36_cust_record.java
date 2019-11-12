class cust_record{
	
	public static void main(String[] args) {
		
		Bill b = new Bill("AMY", "CA", "987654321012", 9874, 123);
		b.cal();
		b.show();
	}
}

class Detail {

	String name;
	String address;
	String telno;
	double rent;

	public Detail(String name, String address, String telno, double rent) {

		this.name = name;
		this.address = address;
		this.telno = telno;
		this.rent = rent;
	}
	public void show() {

		System.out.print("name: " + name + "\naddress: " + address + "\ntelephone: " + telno + "\nrent: " + rent);
	}
}
class Bill extends Detail {

	double n;
	double amt;
	public Bill(String name, String address, String telno, double rent, double n) {

		super(name, address, telno, rent);
		this.n = n;
		amt = 0.00;
	}
	public void cal() {

		if(n <= 100)	amt = super.rent;
		else if (n > 100 && n <= 200)	amt = super.rent + ((6 * n) / 10);
		else if(n > 200 && n <= 300)	amt = super.rent + ((8 * n) / 10);
		else	amt = super.rent + n;
	}
	public void show() {

		super.show();
		System.out.println("\nAmount due: " + amt);
	}
}