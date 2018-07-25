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
public class UDDItem {
    int level;
    String uid;
    String parentUid;
    boolean hasChildren;
    int ggew;
    int egew;

    public UDDItem(int level, String uid, String parentUid, boolean hasChildren, int ggew, int egew) {
        this.level = level;
        this.uid = uid;
        this.parentUid = parentUid;
        this.hasChildren = hasChildren;
        this.ggew = ggew;
        this.egew = egew;
    }
    
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getParentUid() {
        return parentUid;
    }

    public void setParentUid(String parentUid) {
        this.parentUid = parentUid;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public int getGgew() {
        return ggew;
    }

    public void setGgew(int ggew) {
        this.ggew = ggew;
    }

    public int getEgew() {
        return egew;
    }

    public void setEgew(int egew) {
        this.egew = egew;
    }
    
}
