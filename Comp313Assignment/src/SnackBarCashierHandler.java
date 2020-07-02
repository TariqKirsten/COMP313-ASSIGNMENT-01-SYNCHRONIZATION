import java.util.concurrent.Semaphore;

public class SnackBarCashierHandler {

	Semaphore sem;
	
	public SnackBarCashierHandler()
	{
		sem = new Semaphore(2);
	}
	
	public void serve()
	{
		try {
			sem.acquire();
			System.out.println(Thread.currentThread().getName()+" is being served by Snack Bar Cashier "+(sem.availablePermits()+1));
			//Thread.sleep(1000); //Had to make this long enough so that both permits got used and patrons started to go to the second cashier as well
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			sem.release();
		}
		
	}
	
	
}
