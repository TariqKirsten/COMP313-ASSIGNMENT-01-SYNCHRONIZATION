public class TicketSalesCashier {

	private TicketSalesCashierHandler res;
	private int numOfTicketsAvailable;
	private int numOfTicketsSold;
	public TicketSalesCashier(TicketSalesCashierHandler res,int numOfTicketsAvailable)
	{
		this.res = res;
		this.numOfTicketsAvailable = numOfTicketsAvailable;
		this.numOfTicketsSold = 0;
	}
	
	public void approach()
	{
		if(numOfTicketsSold<numOfTicketsAvailable)
		{
			numOfTicketsSold++;
			System.out.println(Thread.currentThread().getName()+ " has approached to buy a ticket");
			res.book();
			System.out.println("Ticket sold successfully for "+Thread.currentThread().getName());
			

		}
		else
		{
			System.out.println("No tickets available for "+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
				Thread.currentThread().join(); //kill these threads as they dont have access to the cinema so no longer needed
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
