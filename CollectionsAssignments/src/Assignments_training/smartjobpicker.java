package Assignments_training;

import java.util.Comparator;
import java.util.PriorityQueue;

class Job {
    int urgency; // 1 = most urgent, 5 = least urgent
    String name;

    Job(int urgency, String name) {
        this.urgency = urgency;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Job{" + "urgency=" + urgency + ", name='" + name + '\'' + '}';
    }
}

public class smartjobpicker {

    public static void main(String[] args) {
        PriorityQueue<Job> jobQueue = new PriorityQueue<>(
            Comparator.comparingInt((Job j) -> j.urgency)
                      .thenComparingInt(j -> j.name.length())
        );

        jobQueue.add(new Job(3, "Report"));
        jobQueue.add(new Job(1, "FixBug"));
        jobQueue.add(new Job(2, "Email"));
        jobQueue.add(new Job(1, "Call"));
        jobQueue.add(new Job(2, "Deploy"));

        System.out.println("Processing jobs in order of urgency:");
        while (!jobQueue.isEmpty()) {
            System.out.println(jobQueue.poll());
        }
    }
}







