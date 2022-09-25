public class deckofCardsDriver {
    public static void main(String[] args)
    {
        // Mandatory code copy
        boolean[] myDeck = new boolean[52];
        final int cardsPerRow = 8;
        int cardsThisRow = 0;
        int myCard;
        Deck.initDeck(myDeck);
        System.out.println("\nHere is a shuffled deck ...\n");
        while (!Deck.emptyDeck(myDeck))
        {
            myCard = Deck.dealCard(myDeck);
            ++cardsThisRow;
            if (cardsThisRow <= cardsPerRow)
            {
                Deck.printCard(myCard);
                System.out.print(" ");
            }
            else
            {
                System.out.println("");
                cardsThisRow = 1;
                Deck.printCard(myCard);
                System.out.print(" ");
            }
        }
        System.out .println('\n');
    }// End Main
}