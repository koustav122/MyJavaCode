package Infosys_prac;
public class DisjointSetUnion {
    int[] parent;

    public DisjointSetUnion(int n) {
        parent = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }
    }

    public int find(int i) {
        if (parent[i] != i) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    public void union(int a, int b) {
        int parentA = find(a);
        int parentB = find(b);
        if (parentA != parentB) {
            parent[parentB] = parentA;
        }
    }

    public static void main(String[] args) {
        DisjointSetUnion dsu = new DisjointSetUnion(5);
        dsu.union(1, 2);
        dsu.union(3, 4);
        dsu.union(2, 3);

        System.out.println("Parent of 4: " + dsu.find(4));
        System.out.println("Parent of 1: " + dsu.find(1));
    }
}
