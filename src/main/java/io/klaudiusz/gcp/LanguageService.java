package io.klaudiusz.gcp;

import autovalue.shaded.org.jetbrains.annotations.NotNull;
import com.google.cloud.language.v1beta2.Document;
import com.google.cloud.language.v1beta2.LanguageServiceClient;
import com.google.cloud.language.v1beta2.Sentiment;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class LanguageService {
    private LanguageServiceClient languageServiceClient;

    @PostConstruct
    private void init() throws IOException {
        languageServiceClient = LanguageServiceClient.create();
    }

    Sentiment process(@NotNull String message) {
        var doc = Document.newBuilder()
                .setContent(message)
                .setType(Document.Type.PLAIN_TEXT).build();

        return languageServiceClient.analyzeSentiment(doc).getDocumentSentiment();
    }
}
