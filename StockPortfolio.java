class StockPortfolio {
    // TODO: Add necessary fields for stock details
    private String symbol;
    private int quantity;
    private double buyingPrice;
    private double currentPrice;
    private double highestPrice;

    // TODO: Initialize stock details
    public StockPortfolio(String symbol, int quantity, double buyingPrice) {
        this.currentPrice = buyingPrice;
        this.buyingPrice = buyingPrice;
        this.symbol = symbol;
        this.quantity = quantity;
        this.highestPrice = buyingPrice;
    }

    // TODO: Update current market price
    public void updatePrice(double newPrice) {
        
        if (newPrice <= 0){
            System.out.println("Entered amount is invalid");
            return;
        }
        this.currentPrice = newPrice;

        if(newPrice > this.highestPrice){
            this.highestPrice = newPrice;
        }
 
    }

    // TODO: Calculate total profit or loss
    public double calculateProfit() {
        double pl;
        pl = ((this.currentPrice - this.buyingPrice) * this.quantity);
       /*  if(pl > 0){
            System.out.println("Profit : " + pl); //not required
        }

        if(pl <= 0){
            System.out.println("Loss : " + pl);
        }*/
        return pl;
    }

    // TODO: Calculate current total value of holdings
    public double getCurrentValue() {
        return currentPrice * quantity;
    }
}
