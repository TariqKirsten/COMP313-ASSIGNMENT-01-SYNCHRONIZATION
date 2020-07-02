
public class Usher{

	UsherHandler usherHandler;
	
	public Usher(UsherHandler usherHandler)
	{
		this.usherHandler = usherHandler;
	}
	
	public void approach()
	{
		System.out.println(Thread.currentThread().getName()+" has approached to be seated");
		usherHandler.seatPatron();
		System.out.println(Thread.currentThread().getName()+" has been seated");
	}
}
