/***************
Aaron Oropeza
9/26/2022
COMPSCI 251-401
 **************/
public class deckofCardsDriver {
    public static void main(String[] args)
    {
        Deck myDeck = new Deck(); // deck changeable change Deck to SmartDeck or vice versa
        final int cardsPerRow = 8;
        int cardsThisRow = 0;
        int myCard;
        myDeck.initDeck();
        System.out.println("\nHere is a shuffled deck ...\n");
        while (!myDeck.emptyDeck())
        {
            myCard = myDeck.dealCard();
            ++cardsThisRow;
            if (cardsThisRow <= cardsPerRow)
            {
                myDeck.cardToString(myCard);
                System.out.print(" ");
            }
            else
            {
                System.out.println("");
                cardsThisRow = 1;
                myDeck.cardToString(myCard);
                System.out.print(" ");
            }
        }
        System.out .println('\n');
    } // End Main
} // End Driver class