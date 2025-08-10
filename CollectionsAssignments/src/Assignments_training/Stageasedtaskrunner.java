package Assignments_training;

import java.util.concurrent.LinkedBlockingQueue;

class Task {
    int id;
    String name;

    Task(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}

public class Stageasedtaskrunner {

    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Task> stage1 = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<Task> stage2 = new LinkedBlockingQueue<>();

        // Add tasks to Stage 1
        for (int i = 1; i <= 6; i++) {
            stage1.put(new Task(i, "Task" + i));
        }

        // Stage 1 processing → only even IDs go to Stage 2
        while (!stage1.isEmpty()) {
            Task t = stage1.take();
            System.out.println("Processing Stage 1: " + t);
            if (t.id % 2 == 0) {
                stage2.put(t);
            }
        }

        // Stage 2 processing
        while (!stage2.isEmpty()) {
            Task t = stage2.take();
            System.out.println("Processing Stage 2: " + t);
        }
    }
}
