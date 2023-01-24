public class AnonCard extends Card{

    AnonCard(String name, String no, String cardID) {
       super(name, no, cardID);

    }

    
    /** This method does not return anything, 
     * it calculates the points aquired from the AnonCard
     * @param purchaseAmount
     */
    @Override
    public void calculatePoints(double purchaseAmount) {
        this.points += purchaseAmount * 0.01; 
    }
}
