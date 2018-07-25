package com.treehouse.mvp.koherenceudditems;

/**
 *
 * @author terner
 */
public class Koherence {
    public static void main(String[] args) {
        GenerateUDD gudd = new GenerateUDD(20);
        for (UDDItem uddItem : gudd.getUddList()) {
            System.out.printf("uid: %s, parentuid: %s, hasChildren: ",
                    uddItem.uid,
                    uddItem.hasChildren);
        }
    }
}
