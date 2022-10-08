public class TipCalculator {

    // instance variables
     int numPeople;
     int tipPercentage;
     double totalBillBeforeTip;

    // constructor
    public TipCalculator(int numPeople, int tipPercentage){
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    // methods
    public double gettotalBillBeforeTip(){
        return totalBillBeforeTip;
    }

    public int gettipPercentage(){
        return tipPercentage;
    }

    public void addMeal(double cost){
         double bill = totalBillBeforeTip + cost;
    }

    public double tipAmount(){
        return (totalBillBeforeTip * tipPercentage) / 100;
    }

    public double totalBill(){
        return tipAmount() + totalBillBeforeTip;
    }

    public double perPersonCostBeforeTip(){
        return totalBillBeforeTip / numPeople;
    }

    public double perPersonTipAmount(){
        return tipAmount() / numPeople;
    }

    public double perPersonTotalCost(){
        return totalBill() / numPeople;
    }

}
