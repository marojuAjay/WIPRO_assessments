package Assignments_training;

import java.util.*;

public class recentappmemory {

    public static void main(String[] args) {
        LinkedList<String> apps = new LinkedList<>();

      
        List<String> openedApps = Arrays.asList("Chrome", "Spotify", "VSCode", "Chrome", "Slack");

        for (String app : openedApps) {
            apps.remove(app);       // remove if already present
            apps.addFirst(app);     // move to top
        }

        System.out.println("Recent Apps: " + apps);
    }
}

