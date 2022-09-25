public class deckofCardsDriver {
    public static void main(String[] args)
    {
        // Mandatory code copy
        boolean[] myDeck = new boolean[52];
        final int cardsPerRow = 8;
        int cardsThisRow = 0;
        int myCard;
        SmartDeck.initDeck(myDeck); // deck changeable
        System.out.println("\nHere is a shuffled deck ...\n");
        while (!SmartDeck.emptyDeck(myDeck)) // deck changeable
        {
            myCard = SmartDeck.dealCard(myDeck); // deck changeable
            ++cardsThisRow;
            if (cardsThisRow <= cardsPerRow)
            {
                SmartDeck.printCard(myCard); // deck changeable
                System.out.print(" ");
            }
            else
            {
                System.out.println("");
                cardsThisRow = 1;
                SmartDeck.printCard(myCard); // deck changeable
                System.out.print(" ");
            }
        }
        System.out .println('\n');
    } // End Main
} // End Driver class