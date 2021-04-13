package Scanner.DataStructure;

public class HashNode {
    private String identifier;
    private Types type;

    // Constructor
    public HashNode(String pIdentifier) {
        this.identifier = pIdentifier;
    }


    // Methods

    @Override
    public int hashCode() {
        return this.identifier.hashCode();
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
        HashNode other = (HashNode) obj;
        return this.identifier.equals(other.getIdentifier());
    }


    /*
     SETTERS & GETTERS
     */
    public String getIdentifier() {
        return identifier;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types pType) {
        this.type = pType;
    }
}
