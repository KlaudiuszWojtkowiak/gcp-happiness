# gcp-happiness

A small application to detect happiness level based on providing sentences

## Detecting happiness by Google Cloud Natural Language API

https://developers.google.com/api-client-library/dotnet/apis/language/v1

## How to run the project

- Get the key json from Google.
- Save it in a json file ( ex: credentials.json).
- Create environment variable GOOGLE_APPLICATION_CREDENTIALS as below
- Run GcpHappinessApplication

```bash
export GOOGLE_APPLICATION_CREDENTIALS=/path/credentials.json
```

## Technology

- Google Cloud Platform, Natural Language API
- Java 17
- Spring Boot Cloud
- Gradle

## Author

Klaudiusz Wojtkowiak
klaudiusz.wojtkowiak@gmail.com

## Example usage:

```bash
What do you think? 
It's Saturday.
Your happiness level is: Meh, intensity: Low 
It's Saturday. I think I can rest.
Your happiness level is: Satisfaction, intensity: Medium 
It's Saturday and it's raining.
Your happiness level is: Frustration, intensity: Low 
My son is great!
Your happiness level is: Nirvana, intensity: High 
I'm sick.
Your happiness level is: Misery, intensity: High 
I cannot finish my program. Can you help me?
Your happiness level is: Displeasure, intensity: Very High 
I see a girl.
Your happiness level is: Contentment, intensity: Low 
I met a girl.
Your happiness level is: Satisfaction, intensity: Low 
I met an ugly girl.
Your happiness level is: Despair, intensity: High 
I met a beautifull girl.
Your happiness level is: Nirvana, intensity: High 
I met a beautifull girl. I want to marry her and have childrens with her! :) :)
Your happiness level is: Nirvana, intensity: Very High 
I love my wife and my son!
Your happiness level is: Nirvana, intensity: High 
My friend told me he need to divorce.
Your happiness level is: Disappointment, intensity: Low 
I'm going to work
Your happiness level is: Contentment, intensity: Low 
I'm going to work and I'm late
Your happiness level is: Displeasure, intensity: Medium 
I'm going to work and I hate it
Your happiness level is: Misery, intensity: High 
I want to divorce. Should I?
Your happiness level is: Meh, intensity: Low 
I want to divorce.
Your happiness level is: Disappointment, intensity: Low 
I need to divorce.
Your happiness level is: Displeasure, intensity: Medium 
I'm happy and I don't like that.
Your happiness level is: Disappointment, intensity: Low 
I don't like that I'm happy.
Your happiness level is: Unhappiness, intensity: Medium 
The entire world is burning and I like that.
Your happiness level is: Rapture, intensity: High 
The entire world is happy and I don't like that.
Your happiness level is: Displeasure, intensity: Medium 
My life is beautifull!!
Your happiness level is: Nirvana, intensity: High 
This code is amazing! :)
Your happiness level is: Nirvana, intensity: High 
Ok time to go now...
Your happiness level is: Satisfaction, intensity: Low 
quit
Thanks. Bye! 

```

