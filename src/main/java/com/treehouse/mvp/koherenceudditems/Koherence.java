/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.treehouse.mvp.koherenceudditems;

/**
 *
 * @author hanus
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
