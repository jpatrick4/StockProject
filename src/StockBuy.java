
public class StockBuy extends Stock{
	private Stock stock;  // stock bought
	private int shares;   // num of shares owned
	
	public StockBuy(Stock stockObject, int numShares) {	// constructor // parameters - stock to buy, num of shares	
		super();						 // call parent constructor ,
		stock = new Stock(stockObject);  // call copy constructor
		shares = numShares;
	}
	public Stock getStock() {	// get copy of Stock object for the stock bought
		return new Stock(stock);
	}
	public int getShares(){		// get num of shares bought
		return shares;
	}
	public double getCost() {
		return shares * stock.getSharePrice(); // get cost of stock purchase
	}
	
}
