package Scanner.DataStructure;

import Scanner.Constants.Types;
import Scanner.DataStructure.Nodes.HashNode;
import Scanner.DataStructure.Nodes.Node;

import java.util.*;

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
                // Increments the appearances by 1
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

            // Adds the new symbol with the list of appearances to the table
            symbolsTable.put(pData, appearances);
        }
    }


    public void addData(String pText, Types pType, Integer pLine) {
        HashNode token = new HashNode(pText, pType);
        this.addData(token, pLine + 1);
    }


    @Override
    public String toString() {
        String result = "";

        ArrayList<String> tokens = new ArrayList<>();
        Iterator it = symbolsTable.entrySet().iterator();

        // Goes through every element of the map
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();

            // Appends line to the result
            tokens.add(pair.getKey().toString() + pair.getValue().toString() + "\n");

            it.remove(); // avoids a ConcurrentModificationException
        }

        tokens.sort((s1, s2) -> s1.length() - s2.length());

        for(String elem :tokens){
            result += elem;
        }

        return result;
    }

    public boolean isEmpty() {
        return symbolsTable.isEmpty();
    }

    /*
    SETTERS & GETTERS
     */

    public HashMap<HashNode, ArrayList<Node>> getSymbolsTable() {
        return symbolsTable;
    }
}
