
public class SnackBarCashier{

	SnackBarCashierHandler snackBarCashierHandler;
	public SnackBarCashier(SnackBarCashierHandler handler)
	{
		this.snackBarCashierHandler = handler;
	}
	
	public void approach()
	{
		System.out.println(Thread.currentThread().getName()+" has approached to get served");
		snackBarCashierHandler.serve();
		System.out.println(Thread.currentThread().getName()+" has been  served");
	}
}
