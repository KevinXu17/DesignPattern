package PrototypePateern;

import java.util.List;

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;
    public List[] lists = new List[1];
    abstract void draw();

    public String getType() {return type;}
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public void addList(List<String> strs) {
        lists[0] = strs;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
