import java.text.SimpleDateFormat;
import java.util.Date;

public class Rental {
  private Date startDate;
  private Date endDate;
  private Customer renter;
  private Listing listing;

  public Rental(Customer customer, Listing listing)
  {
   renter = customer;
   this.listing = listing;
  }

  public void doReturn()
  {
    Date currentDate = new Date();
    this.endDate = currentDate;
    listing.setAvailability(true);
  }

  public Date getEndDate()
  {
    return endDate;
  }

  public Game getGame()
  {
    return listing.getGame();
  }

  public Listing getListing()
  {
   return listing;
  }

}