package Assignments_training;

import java.util.concurrent.LinkedBlockingQueue;

public class ChatProcessor {

	public static void main(String[] args) {
        LinkedBlockingQueue<String> chatQueue = new LinkedBlockingQueue<>(5);

        // Thread to add messages
        Thread producer = new Thread(() -> {
            int msgNum = 1;
            try {
                while (msgNum <= 10) {
                    chatQueue.put("Message " + msgNum);
                    System.out.println("Added: Message " + msgNum);
                    msgNum++;
                    Thread.sleep(300); // simulate delay
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Thread to read messages
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    String msg = chatQueue.take();
                    System.out.println("Read: " + msg);
                    Thread.sleep(500); // simulate processing
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}




