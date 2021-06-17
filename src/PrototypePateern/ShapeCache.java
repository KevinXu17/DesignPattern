package PrototypePateern;

import java.util.HashMap;

public class ShapeCache {
    private HashMap<String, Shape> shapeMap = new HashMap<>();

    public Shape getShape(String id) {
        Shape cacheShape = shapeMap.get(id);
        return (Shape) cacheShape.clone();
    }

    public void loadCache() {
        // load data to cache
        Rectangle r = new Rectangle();
        r.setId("1");
        shapeMap.put(r.getId(), r);
    }

    // for checking copy
    public HashMap<String, Shape> getShapeMap() {return shapeMap;}
}
