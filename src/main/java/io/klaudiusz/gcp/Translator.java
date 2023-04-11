package io.klaudiusz.gcp;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Translator {

    private Map<Integer, String> map;

    @PostConstruct
    private void init() {
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

    String readHappiness(float sentiment) {
        Integer level = (int) ((sentiment + 1) * 10);
        return map.get(level);
    }

    String readIntensify(float magnitude) {
        int level = (int) (magnitude * 10);
        if (level < 4) return "Low";
        if (level < 7) return "Medium";
        if (level < 10) return "High";
        return "Very High";
    }
}
