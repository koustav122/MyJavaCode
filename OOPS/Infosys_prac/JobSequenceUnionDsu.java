class job {
    String id;
    int deadline;
    int profit;
    
    job(String id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequenceUnionDsu {
    public static void printJobSceduling(job[] arr, int n) {
        // Sort jobs in decreasing order of profit
        java.util.Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        // Find maximum deadline
        int maxDeadline = 0;
        for (job j : arr) {
            if (j.deadline > maxDeadline) {
                maxDeadline = j.deadline;
            }
        }

        // Initialize DSU for deadlines
        DisjointSetUnion dsu = new DisjointSetUnion(maxDeadline);

        int totalProfit = 0;
        java.util.List<String> jobSequence = new java.util.ArrayList<>();

        for (job j : arr) {
            int availableSlot = dsu.find(j.deadline);
            if (availableSlot > 0) {
                dsu.union(availableSlot - 1, availableSlot);
                totalProfit += j.profit;
                jobSequence.add(j.id);
            }
        }

        System.out.println("Job Sequence: " + String.join(" -> ", jobSequence));
        System.out.println("Total Profit: " + totalProfit);



        
    }
                                                                                                                                                                                                                                                                    
    
}
