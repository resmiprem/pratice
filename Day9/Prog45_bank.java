package Day9;

public class Prog45_bank {

	public static void main(String[] args) {
	bank b=new bank("resmi",1234,"salary_account",50000);	
b.depositmet(20000);
b.display();
	}

}
class bank
{String depositor_name;int acc_no;String type_of_acc;int balance;
	bank(String depositor_name,int acc_no,String type_of_acc,int balance)
	{
		this.depositor_name=depositor_name;
		this.acc_no=acc_no;
		this.type_of_acc=type_of_acc;
		this.balance=balance;
	}
	public void depositmet(int amt)
	{
		System.out.println("the balace amount is "+balance);
		balance+=amt;
		//System.out.println("After deposition the balance is "+balance);
	}
	public void display()
	{
		System.out.println("Nmae:"+	depositor_name);
		System.out.println("balance after deposition:"+balance);
	}
}