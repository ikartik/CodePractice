package practice.problems.design.patterns;

/**
 * Created by kartik on 05/10/17.
 */
public class DeckOfCards {

    public enum Suit{

        Club (0), Diamond (1), Heart (2), Spade (3);
        private int value;
        private Suit(int v){
            value = v;
        }
        public int getValue(){
            return value;
        }
        private static Suit getSuitFromValue(int value){
//            return Suit(value);
            return Suit.Club;
        }

    }

}
