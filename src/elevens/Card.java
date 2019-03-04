package elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		//String suit
		//int face
        //public static final String SUIT[] = {"SPADES", "DIAMONDS", "CLUBS", "HEARTS"};
        //public static final int FACE[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
  	
        public String suit;
        public int face;
        
        //constructors
        public Card(String SUIT, int FACE){
            suit = SUIT;
            face = FACE;
        }

	// modifiers
		//set methods
        public void setSuit(String SUIT){
            suit = SUIT;
        }
        
        public void setFace(int FACE){
            face = FACE;
        }

  	//accessors
		//get methods
        public String getSuit(){
            return(suit);
        }
        
        public int getFace(){
            return(face);
        }

  	//toString
        public String toString(){
            String out = FACES[face] + " of " + suit;
            return(out);
        }

 }