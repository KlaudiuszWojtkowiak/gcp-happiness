package io.klaudiusz.gcp;

import com.google.cloud.language.v1beta2.Entity;
import com.google.cloud.language.v1beta2.Sentiment;

import java.util.List;

public record Sentence(Sentiment sentiment, float magnitude, List<Entity> entities) {
}
