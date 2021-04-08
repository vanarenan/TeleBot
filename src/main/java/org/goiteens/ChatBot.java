package org.goiteens;

import java.util.*;

public class ChatBot {
    private static Map<String, Integer> professions;
    private static Map<String, Integer> dreams;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String botAnswer = process(message, "User123");
        System.out.println(botAnswer);
    }
    
    public static String process(String message, String user) {
        if (isHelloMessage(message) == true) {
            String botName = "ChatBot";
            String userName = user;
            List<String> greetingList = new ArrayList<>(Arrays.asList("" +
                    "Здарова", "Алоха", "Хаюхай", "Хелоу", "Приффки", "боМжур, ёпта")
            );
            Random random = new Random();
            int index = random.nextInt(greetingList.size());
            String greeting = greetingList.get(index);
            return greeting + ", " + userName + ", я " + botName + " ";
        }


        return null;
    }

    public static int find(String message, Map<String, Integer> data) {
        message = message.toLowerCase();

        for(String word: data.keySet()) {
            String lowerCasedWord = word.toLowerCase();

            if (message.contains(lowerCasedWord)) {
                return data.get(word);
            }
        }

        return -1;
    }
    
    public static int calculateMonthCount(int dreamCost, int professionSalary) {
        int monthCount = dreamCost / professionSalary;
        monthCount = validateMonthCount(monthCount);
        return monthCount;
    }

    public static int validateMonthCount(int monthCount) {
        if (monthCount == 0) {
            return 1;
        }

        return monthCount;
    }
    
    private static boolean isHelloMessage(String message) {
        message = message.toLowerCase();
        List<String> helloMessage = new ArrayList<>(Arrays.asList(
                "hello", "привет", "здарова", "здравствуй", "hi"
        ));
        return helloMessage.contains(message);
    }
}
