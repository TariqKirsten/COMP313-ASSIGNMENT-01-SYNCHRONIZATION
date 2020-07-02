import java.util.concurrent.Semaphore;

public class UsherHandler {

	Semaphore sem;
	public UsherHandler()
	{
		sem = new Semaphore(2);
	}
	
	public void seatPatron()
	{
		try {
			sem.acquire();
			System.out.println(Thread.currentThread().getName()+" ticket has been collected and is being seated by Usher "+(sem.availablePermits()+1));
			sem.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	}
}
