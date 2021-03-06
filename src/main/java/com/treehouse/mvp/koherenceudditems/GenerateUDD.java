package com.treehouse.mvp.koherenceudditems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author terner
 */
public class GenerateUDD {
    private Random rnd;
    private List<UDDItem> uddList;
    private int level;
    private int numberOfItems;

    public GenerateUDD(int numberOfItems) {
        this.numberOfItems = numberOfItems;
        uddList = new ArrayList<>();
        rnd = new Random();
        
    }

    public List<UDDItem> getUddList() {
        
        
        
        return uddList;
    }
    
    private String genUid() {
        String uid = "X" + rnd.nextInt(500);
        return uid;
    }
    
    private String genParentUid() {
        String parentUid = "P" + rnd.nextInt(500) + 1000;
        return parentUid;
    }
    
    private boolean genHasChildren() {
        
        return true;
    }

}
