public class Customer extends User {

 public Customer(String username, String password)
 {
  super(username, password);
 }

 private Payment makePayment(float amount)
 {
  Payment payment = new Payment(amount, this);
  return payment;
 }

  public Rental rentGame(Listing listing)
  {
   Rental rental = new Rental(this, listing);
   return rental;
  }

  public void returnGame(Rental rental)
  {
   rental.doReturn();
  }

  public Listing listGame(Game game, float amount)
  {
   Listing listing = new Listing(this, game, amount);
   return listing;
  }

  public String getUsername()
  {
   return username;
  }

  public String getPassword()
  {
   return password;
  }
    
}