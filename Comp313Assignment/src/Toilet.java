
public class Toilet{

	ToiletHandler toiletHandler;
	public Toilet(ToiletHandler toiletHander)
	{
		this.toiletHandler = toiletHander;
	}
	
	public void approach()
	{
		System.out.println(Thread.currentThread().getName()+" is waiting to use the toilet");
		toiletHandler.useToilet();
		System.out.println(Thread.currentThread().getName()+" has completed using the toilet");

		
	}
}
