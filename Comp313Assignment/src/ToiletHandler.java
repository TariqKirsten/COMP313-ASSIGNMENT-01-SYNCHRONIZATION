import java.util.concurrent.Semaphore;

public class ToiletHandler {

	Semaphore sem;
	
	public ToiletHandler()
	{
		sem = new Semaphore(1);
	}
	
	public void useToilet()
	{
		try {
			sem.acquire();
			System.out.println(Thread.currentThread().getName()+" is using the toilet");
			//Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			sem.release();
		}
	}
}
