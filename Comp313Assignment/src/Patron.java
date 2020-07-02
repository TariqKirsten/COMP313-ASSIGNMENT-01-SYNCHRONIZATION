import java.util.Random;

public class Patron extends Thread{

	TicketSalesCashier ticketSalesCashier;
	Toilet toilet;
	SnackBarCashier snackBarCashier; 
	Usher usher;
	public Patron(TicketSalesCashier tcs,Toilet t,SnackBarCashier sbc,Usher u,String name)
	{
		this.ticketSalesCashier = tcs;
		this.setName(name);
		this.toilet =t;
		this.snackBarCashier = sbc;
		this.usher = u;
	}
	
	public void run()
	{
		ticketSalesCashier.approach();
		
		int choice = choiceGenerator();
		if(choice==1)
		{
			System.out.println(Thread.currentThread().getName()+" has chosen to go to the Toilet");
			toilet.approach();
			
		}
		else {
			System.out.println(Thread.currentThread().getName()+" has chosen to go to the Snack Bar");
			snackBarCashier.approach();
		}
		
		usher.approach();
		
		
		if(goToToiletProbabilityGenerator()<=0.05f)
		{
			System.out.println(Thread.currentThread().getName()+" is leaving the movie to go to the toilet");
			toilet.approach();
		}
		
		
		
			Cinema.addToCompletedList(Thread.currentThread());
			//System.out.println(Thread.currentThread().getName()+" is leaving the cinema");
		
	}
	
	private int choiceGenerator()
	{
		Random r = new Random();
		if(r.nextBoolean())
		{
			return 1;
		}
		else return 2;
	}
	
	private float goToToiletProbabilityGenerator()
	{
		Random r = new Random();
		float probability = r.nextFloat();
		return probability;
	}
}
