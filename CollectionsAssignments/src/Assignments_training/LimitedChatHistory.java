package Assignments_training;

import java.util.ArrayDeque;

public class LimitedChatHistory {

    public static void main(String[] args) {
        ArrayDeque<String> chatHistory = new ArrayDeque<>(4);

        String[] messages = {
            "Hello",
            "How are you?",
            "I'm fine",
            "What about you?",
            "Let's meet tomorrow"
        };

        for (String msg : messages) {
            if (chatHistory.size() == 4) {
                chatHistory.removeFirst(); // drop oldest
            }
            chatHistory.addLast(msg);
            System.out.println("Chat now: " + chatHistory);
        }
    }
}






