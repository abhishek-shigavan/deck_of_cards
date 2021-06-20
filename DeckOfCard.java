import java.util.HashSet;
import java.util.Set;
/**
 * DeckOfCard -- Program to distribute card between
 * 		 4 players & prints cards of all players
 * 
 * @author Abhishek Shigavan
 *
 */
public class DeckOfCard {
	
    public static void main(String[] args) {
    	//array of card type
        String[] suits = {"Diamond", "Heart", "Spades", "Club"};
        //array of card rank
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack" , "Queen", "King", "Ace"};

        //defining combine array of card type & rank
        String[][] cardCombo = new String[4][13];
        Set<String> cards = new HashSet<String>();
        
        //creating array with card type & rank pair
        for (int i=0; i<4; i++) {
            for (int j=0; j<13; j++) {
                cardCombo[i][j] = suits[i]+rank[j];
            }
        }
        
        //creating array to store players card
        String[][] player = new String[4][9];
        
        int i = 0, j = 0, k = 0, m = 0, o = 0; 
        int n = 1;
        
        while (n <= 36) {
        	
        	int randomSuit = (int) Math.floor(Math.random()*10)%4;

            int randomRank = (int) Math.floor(Math.random()*100)%13;
            
            //ensuring card not getting repeated 
            if(cards.add(cardCombo[randomSuit][randomRank])) {
                if (n%4 == 0) {
                    i = 0;
                    player[i][j] = cardCombo[randomSuit][randomRank];
                    j++;
                    n++;
                } 
                else if(n%4 == 1 ) {
                    i = 1;
                    player[i][k] = cardCombo[randomSuit][randomRank];
                    k++;
                    n++;
                } 
                else if(n%4 == 2 ) {
                    i = 2;
                    player[i][m] = cardCombo[randomSuit][randomRank];
                    m++;
                    n++;
                } 
                else if(n%4 == 3 ) {
                    i = 3;
                    player[i][o] = cardCombo[randomSuit][randomRank];
                    o++;
                    n++;
                }
            }
        }

        //printing player array
        for (i = 0; i<4; i++) {
            System.out.print("Player " + (i+1) + " : ");
            for (j=0; j<9; j++) {
                System.out.print(player[i][j] + " | ");
            }
            System.out.println();
            System.out.println();
        }
    }
}

