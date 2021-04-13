package Scanner.DataStructure;

public class Node {

    private Integer line;
    private Integer quantity;

    // Constructor
    public Node(Integer pLine) {
        this.line = pLine;
        this.quantity = 1;
    }


    // Methods
    public void incrementQuantity() {
        setQuantity(getQuantity() + 1);
    }

    @Override
    public boolean equals(Object obj) {
        // Verification
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        // Casting
        Node other = (Node) obj;
        return this.line.equals(other.getLine());
    }


    /*
    SETTERS & GETTERS
    */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getLine() {
        return line;
    }
}
