
public class BookRental extends Rental {

	@SuppressWarnings("unused")
	private String author;
	@Override
	public double getTaxes() {
		return 1.2;
	}
		

}
