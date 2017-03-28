import java.util.Date;

public abstract class Rental {
	protected Date rentDate;
	protected Date dueDate;
	protected double rentalFee;
	
	public  boolean isOverDue() {
		Date now = new Date();
		return dueDate.before(now);
	};
	
	public  double getTotalFee(){
		 return isOverDue() ? getTaxes()*rentalFee : rentalFee;
	};
	
	public abstract double getTaxes();

}
