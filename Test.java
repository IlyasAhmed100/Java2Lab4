import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        
        ArrayList<Card> cards = new ArrayList<Card>();

        cards.add(new AnonCard("Lloyds", "02079460512", "3218"));
        cards.add(new BasicCard("Santander","02083758294", "2156", "David"));
        cards.add(new PremiumCard("Goldman Sachs", "02085741648", "3290", "Henry"));
        cards.add(new AnonCard("Halifax", "02085647382", "8976"));

        multiPurchase(cards, 2300);

        System.out.println("Company Name\t\tCard ID\t\tPoints");

        for (int i = 0; i < cards.size(); i++) {
            System.out.println(String.format("%s\t\t%s\t\t%d", cards.get(i).getCompanyName(), cards.get(i).getCardID(), cards.get(i).getPoints()));       
        }
        System.out.println(categorise(cards));  
        
    }

    
    /** multiPurchase iterates through the list and calculates the points for each person
     * depending on what card they have
     * @param nameOfList
     * @param purchaseAmount
     */
    public static void multiPurchase(ArrayList<Card> nameOfList, double purchaseAmount) {
        for (int i = 0; i < nameOfList.size(); i++) {
            nameOfList.get(i).calculatePoints(purchaseAmount);
        }
    }

    
    /** The categorise function takes in the list and categories customers into groups 
     * with losw, medium or high points
     * @param nameOfList
     * @return String
     */
    public static String categorise(ArrayList<Card> nameOfList) {
        int lowPoints = 0;
        int mediumPoints = 0;
        int largePoints = 0;

        for (int i = 0; i < nameOfList.size(); i++) {
            if (nameOfList.get(i).getPoints() < 500) {
                lowPoints ++;
            } else if ((nameOfList.get(i).getPoints() >= 500) && (nameOfList.get(i).getPoints() < 2000)) {
                mediumPoints ++;
            } else {
                largePoints ++;
            }
        }

        return String.format("Low:%d Medium:%d High:%d ", lowPoints, mediumPoints, largePoints);

        
    }

    

    
}
