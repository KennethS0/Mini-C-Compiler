package Main;

import Scanner.DataStructure.HashNode;
import Scanner.DataStructure.Structure;
import Scanner.DataStructure.Types;

public class Main {
    public static void main(String[] args) {
        Structure test = new Structure();

        HashNode a = new HashNode("if");
        HashNode b = new HashNode("if");
        HashNode c = new HashNode("if");
        HashNode d = new HashNode("13");
        a.setType(Types.IDENTIFIERS);
        b.setType(Types.IDENTIFIERS);
        c.setType(Types.IDENTIFIERS);
        d.setType(Types.LITERALS);

        test.addData(a, 1);
        test.addData(b, 1);
        test.addData(c, 1);
        test.addData(d, 2);

        System.out.println(test.toString());

    }
}
