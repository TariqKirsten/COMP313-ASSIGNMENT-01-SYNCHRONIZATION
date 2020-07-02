public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfTickets = 72;
		TicketSalesCashierHandler res = new TicketSalesCashierHandler();
		TicketSalesCashier ticketSalesCashier = new TicketSalesCashier(res,numOfTickets);
		
		ToiletHandler toiletHandler = new ToiletHandler();
		Toilet toilet = new Toilet(toiletHandler);
		
		SnackBarCashierHandler snackBarCashierHandler = new SnackBarCashierHandler();
		SnackBarCashier snackBarCashier = new SnackBarCashier(snackBarCashierHandler);
		
		UsherHandler usherHandler = new UsherHandler();
		Usher usher = new Usher(usherHandler);
		
		Cinema c = new Cinema();
		c.start();
		
		Patron[] patrons = new Patron[100];
		for(int i = 0;i<patrons.length;i++) //Entering the building 
		{
			patrons[i] = new Patron(ticketSalesCashier,toilet,snackBarCashier,usher,"Patron "+i);
			patrons[i].start();
		}
		
	}

}
