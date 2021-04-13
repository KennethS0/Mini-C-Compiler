package Scanner.DataStructure;

import java.util.ArrayList;
import java.util.HashMap;

public class Structure {

    private HashMap<HashNode, ArrayList<Node>> symbolsTable;

    // Constructor
    public Structure(){
        symbolsTable = new HashMap<HashNode, ArrayList<Node>>();
    }


    // Methods

    public void addData(HashNode pData, Integer pLine) {

        if (symbolsTable.containsKey(pData)) {
            ArrayList<Node> appearances = symbolsTable.get(pData);

            // Checks the last element in the list to see if the lines are the same
            Node lastAppearance = appearances.get(appearances.size() - 1);

            if (lastAppearance.getLine() == pLine) {

                lastAppearance.incrementQuantity();

            } else {

                // Adds a new node to the list
                Node appearance = new Node(pLine);
                appearances.add(appearance);
            }


        } else {
            // Creates a new list of appearances
            ArrayList<Node> appearances = new ArrayList<Node>();

            Node appearance = new Node(pLine);
            appearances.add(appearance);

            symbolsTable.put(pData, appearances);
        }
    }


    /*
    SETTERS & GETTERS
     */

    public HashMap<HashNode, ArrayList<Node>> getSymbolsTable() {
        return symbolsTable;
    }
}
