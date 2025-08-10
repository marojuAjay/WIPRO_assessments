package Assignments_training;

import java.util.Comparator;
import java.util.PriorityQueue;

class Patient {
    int severity;
    long timestamp;
    String name;

    Patient(int severity, String name, long timestamp) {
        this.severity = severity;
        this.name = name;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "severity=" + severity +
                ", name='" + name + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}

public class EmergencyPatientTracker {

    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>(
                Comparator.comparingInt((Patient p) -> p.severity)
                          .thenComparingLong(p -> p.timestamp)
        );

        long now = System.currentTimeMillis();

        // Add patients
        addPatient(queue, new Patient(3, "Alice", now));
        addPatient(queue, new Patient(1, "Bob", now + 1000));
        addPatient(queue, new Patient(2, "Charlie", now + 2000));
        addPatient(queue, new Patient(1, "David", now + 3000));
        addPatient(queue, new Patient(4, "Eve", now + 4000));
        addPatient(queue, new Patient(2, "Frank", now + 5000)); // This one should be skipped (max 5)

        // Serve patients
        System.out.println("\nTreating patients:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    private static void addPatient(PriorityQueue<Patient> queue, Patient p) {
        if (queue.size() >= 5) {
            System.out.println("Queue full! Skipping: " + p.name);
            return;
        }
        queue.offer(p);
        System.out.println("Added: " + p.name);
    }
}

