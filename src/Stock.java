import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * This class contains stock data and a main method
 * Create stock transactions for 'X' stock for various clients...
 * 
 * 
 */

public class Stock {
	private String symbol; // Trading symbol of stock
	private static double sharePrice; // Current share price
	
	static int count = 0;
	
	public Stock(String symbol, double price) {		// Constructor	// parameters - Stock symbol, Stock share price			
		this.symbol = symbol;
		sharePrice = price;									
	}
	public Stock() {							// empty constructor
		count++;
		System.out.println("New client request count# " + count);
	}
	public Stock(Stock obj2) {					// copy constructor
		this.symbol = obj2.symbol;
		sharePrice = obj2.sharePrice;
	}
	public String getSymbol() {                	// getSymbol method
		return symbol;
	}
	public double getSharePrice() {				// getSharePrice method
		return sharePrice;
	}
	public String toString() {					// Create string to describe stock
		String str = "Trading symbol: " + symbol + "\nShare price: " + sharePrice;
		return str;
	}
	public Stock copy(){						// copy method to make copy of Stock object
		// Create new Stock object and initialize with data from first object
		Stock copyObject = new Stock(symbol, sharePrice);
		//return reference to new object
		return copyObject;
	}
	public static void main(String args[]) {
		int sharesToBuy; 					// number of shares to buy
		Stock xCompany = new Stock("X", 9.62);	// create Stock object for company stock
		System.out.println(xCompany);			// trading symbol is X, price is $9.62 per share
		Scanner scan = new Scanner(System.in);
		// Format numbers into decimal form for dollars
		DecimalFormat dollar = new DecimalFormat("#,###.00");
		StockBuy[] theBuyers = new StockBuy[3];
		for(int i=0; i < 3; i++) {
			System.out.println("X Company's stock is currently $" + dollar.format(xCompany.getSharePrice())+ " per share."); // display current share prices
			// get num of shares to buy
			System.out.println("How many shares do you want to buy?");
			sharesToBuy = scan.nextInt();
			theBuyers[i] = new StockBuy(xCompany, sharesToBuy);
			// display cost
			System.out.println("Cost of the stock: $" + dollar.format(theBuyers[i].getCost()));
			
		}
		
	}
	
	
	
}
