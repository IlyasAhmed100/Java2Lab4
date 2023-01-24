public class BasicCard extends Card {

    protected String customerName;
    protected double loyalty = 0;
    
    BasicCard(String name, String no, String cardID, String customerName) {
        super(name, no, cardID);
        setCustomerName(customerName);

    }

    
    /** A mutator method that sets the customerName variable to
     * the local customerName
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    
    /** A mutator method that sets the loyalty variable to
     * the local loyalty
     * @param loyalty
     */
    public void setLoyalty(double loyalty) {
        this.loyalty = loyalty;
    }

    
    /** An accessor method that retrieves the customerName
     * @return String
     */
    public String getCustomerName() {
        return customerName;
    }

    
    /** An accessor method that retrieves the loyalty
     * @return double
     */
    public double getLoyalty() {
        return loyalty;
    }

    
    /** The calculayePoints method takes in the purchaseAmunt and depending on loyalty, 
     * it will assign the relevant amount of points
     * @param purchaseAmount
     */
    @Override
    public void calculatePoints(double purchaseAmount) {
        this.loyalty += purchaseAmount;
        if (loyalty < 500) {
            this.points += purchaseAmount * 0.015;
        } else {
            this.points += purchaseAmount * 0.02;
        }
        
    }


    
    /** A toString method to nicely format the name of the customer and their loyalty
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "{" +
            " customerName='" + getCustomerName() + "'" +
            ", loyalty='" + getLoyalty() + "'" +
            "}";
    }

}
