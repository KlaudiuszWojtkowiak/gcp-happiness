package io.klaudiusz.gcp;

import java.util.HashMap;
import java.util.Map;

public class HappinessMap {

    private final Map<Integer, String> map;


    public HappinessMap() {
        map = new HashMap<>();
        map.put(1, "Misery");
        map.put(2, "Hopelessness");
        map.put(3, "Despair");
        map.put(4, "Discontent");
        map.put(5, "Displeasure");
        map.put(6, "Unhappiness");
        map.put(7, "Disappointment");
        map.put(8, "Frustration");
        map.put(9, "Meh");
        map.put(10, "Contentment");
        map.put(11, "Satisfaction");
        map.put(12, "Joy");
        map.put(13, "Delight");
        map.put(14, "Elation");
        map.put(15, "Excitement");
        map.put(16, "Ecstasy");
        map.put(17, "Bliss");
        map.put(18, "Rapture");
        map.put(19, "Nirvana");
        map.put(20, "Pure, unadulterated happiness");
    }

    public String getHappiness(float sentiment) {
        Integer level = (int) ((sentiment + 1) * 10);
        return map.get(level);
    }
}
