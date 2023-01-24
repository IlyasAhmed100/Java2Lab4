public class PremiumCard extends Card {
    
    protected String customerName;
    protected double loyalty = 0;
    protected static final double SIGN_UP_FEE = 21.99;
    
    PremiumCard(String name, String no, String cardID, String customerName) {
        super(name, no, cardID);
        setCustomerName(customerName);
    }

    
    /** The calculayePoints method takes in the purchaseAmunt and depending on loyalty
     * and purchaseAmount it will assign the relevant amount of points
     * @param purchaseAmount
     */
    @Override
    public void calculatePoints(double purchaseAmount) {
        this.loyalty += purchaseAmount;
        if ((purchaseAmount < 40) && (loyalty > 1000)) {
            this.points += purchaseAmount * 0.03;
        } else {
            this.points += purchaseAmount * 0.04;
        }
        
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

    
    /** An accessor method that retrieves the sign up fee
     * @return double
     */
    public double getSignUpFee() {
        return SIGN_UP_FEE;
    }



    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " customerName='" + getCustomerName() + "'" +
            ", loyalty='" + getLoyalty() + "'" +
            "}";
    }
    

}

 
