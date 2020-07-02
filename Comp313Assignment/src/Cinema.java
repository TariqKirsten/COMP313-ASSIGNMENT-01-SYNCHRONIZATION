import java.util.ArrayList;

public class Cinema extends Thread {

	private static ArrayList<Thread> patronsCompleted = new ArrayList<Thread>();
	
	public void run()
	{
		
	
		try {
			
			//Will simulate the movie playing by making thread sleep for 10s
			System.out.println("THE MOVIE HAS STARTED");
			Thread.sleep(10000);
			System.out.println("THE MOVIE HAS ENDED");
			for(Thread t : patronsCompleted)
			{
				System.out.println(t.getName()+" is leaving the cinema");
				t.join();
			}
			System.exit(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addToCompletedList(Thread t)
	{
		patronsCompleted.add(t);
	}
	
}
