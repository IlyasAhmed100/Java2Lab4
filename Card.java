
/**
 * @author muneebimtiazahmad, modified TiKA
 * A class that implements shop that has cards
 *
 */

public abstract class Card {
	
	protected String companyName;
	protected String phoneNo;
	protected String cardID;
	protected int points;  
	
	
	/**
	 * Create a new Card issued by the Shop.
	 * @param name The name of the shops.
	 * @param no The helpline of the shop.
	 * @param cardID The ID of the card.
	 */

	public Card(String name, String no, String cardID) {
		
		// You need to implement this constructor
		setName(name);
		setHelpline(no);
		setCardID(cardID);
		
	}
	
	/**
	 * @return the name
	 */
	public String getCompanyName() {
		return companyName;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.companyName = name;
	}



	/**
	 * @return the helpline
	 */
	public String getPhoneNo() {
		return phoneNo;
	}


	/**
	 * @param no the helpline to set
	 */
	public void setHelpline(String no) {
		this.phoneNo = no;
	}


	/**
	 * @return the cardID
	 */
	public String getCardID() {
		return cardID;
	}


	/**
	 * @param cardID the cardID to set
	 */
	public void setCardID(String cardID) {
		this.cardID = cardID;
	}


	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}


	/**
	 * @param points the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}
	
	/**
     * calculates the point for each card against a purchase
     *  but we really don't know what
     * to do here because card category is not defined.
	 * @return 
     */
	public abstract void calculatePoints(double purchaseAmount);
	

	/** A toString method to nicely format the name of the company, 
	 * phone number, the card ID and points
     * @return String
     */
	@Override
	public String toString() {
		return "{" +
			" companyName='" + getCompanyName() + "'" +
			", phoneNo='" + getPhoneNo() + "'" +
			", cardID='" + getCardID() + "'" +
			", points='" + getPoints() + "'" +
			"}";
	}

	

}
