package springIntro;

public class MySQLCustomerDal implements ICustomerDal{

	@Override
	public void add() {

		System.out.println("MySQL'e eklendi");
	}
	 

}
