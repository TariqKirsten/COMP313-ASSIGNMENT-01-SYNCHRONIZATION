import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class TicketSalesCashierHandler {

	private Semaphore sem;
	public TicketSalesCashierHandler()
	{
		sem = new Semaphore(1);
		//patronsAccepted = new ArrayList<Thread>();
	}
	
	public void book()
	{
		try {
			sem.acquire();
			System.out.println("Booking Ticket for "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			sem.release();
		}
	}
	
}

