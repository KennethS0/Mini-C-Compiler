package Main;

import Scanner.DataStructure.HashNode;
import Scanner.DataStructure.Structure;
import Scanner.Constants.Types;

public class Main {
    public static void main(String[] args) {
        Structure test = new Structure();

        HashNode a = new HashNode("if");
        HashNode b = new HashNode("if");
        HashNode c = new HashNode("if");
        HashNode d = new HashNode("13");
        a.setType(Types.RESERVED_WORDS);
        b.setType(Types.RESERVED_WORDS);
        c.setType(Types.RESERVED_WORDS);



        test.addData(a, 1);
        test.addData(b, 1);
        test.addData(c, 1);

        System.out.println(test.toString());

    }
}
