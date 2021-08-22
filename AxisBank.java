package week3.day1.assignments;

public class AxisBank extends BankInfo {
	
@Override
public void deposit() {
	// TODO Auto-generated method stub
	System.out.println("Over-ridded Deposit account in Axis Bank");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AxisBank axisbankObj = new AxisBank();
axisbankObj.deposit();
axisbankObj.fixed();
axisbankObj.saving();
	}

}
