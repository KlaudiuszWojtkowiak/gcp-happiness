package io.klaudiusz.gcp;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@SuppressWarnings("java:S106")
@Slf4j
@RequiredArgsConstructor
public class HappinessDetector {

    private final Translator translator;
    private final LanguageService languageApi;

    @PostConstruct
    void init() {

        try {
            System.out.println("GCP happiness detector written by Klaudiusz Wojtkowiak");
            System.out.println("======================================================");
            System.out.println("What do you think? ");

            var input = new Scanner(System.in);
            String line;

            while (input.hasNextLine()) {
                line = input.nextLine();
                if (line.equalsIgnoreCase("quit")) {
                    System.out.println("Thanks. Bye! ");
                    break;
                }
                var sentiment = languageApi.process(line);
                System.out.printf("Your happiness level is: %s, intensity: %s %n",
                        translator.readHappiness(sentiment.getScore()),
                        translator.readIntensify(sentiment.getMagnitude()));
            }
            input.close();

        } catch (Exception ex) {
            log.error("Ooops! Something went wrong... ", ex);
        }
    }

}
