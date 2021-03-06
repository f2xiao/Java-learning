package Set;

public class UnionFind {

    // TODO - Add instance variables?
    private int[] arr;

    /* Creates a UnionFind data structure holding n vertices. Initially, all
       vertices are in disjoint sets. */
    public UnionFind(int n) {
        // TODO
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = -1;
        }
    }

    /* Throws an exception if v1 is not a valid index. */
    private void validate(int vertex) {
        // TODO
        if(vertex >= arr.length || vertex < 0){
            throw new IllegalArgumentException("v1 must be in range of [0,"+ arr.length + ")");
        }
    }

    /* Returns the size of the set v1 belongs to. */
    public int sizeOf(int v1) {
        // TODO
        return -arr[find(v1)];
    }

    /* Returns the parent of v1. If v1 is the root of a tree, returns the
       negative size of the tree for which v1 is the root. */
    public int parent(int v1) {
        // TODO
        try{
            validate(v1);
        } catch(Exception e){
            System.out.println("Tried to run: " + e);
        }
        return arr[v1];
    }

    /* Returns true if nodes v1 and v2 are connected. */
    public boolean connected(int v1, int v2) {
        // TODO
        return find(v1) == find(v2);
    }

    /* Connects two elements v1 and v2 together. v1 and v2 can be any valid
       elements, and a union-by-size heuristic is used. If the sizes of the sets
       are equal, tie break by connecting v1's root to v2's root. Unioning a
       vertex with itself or vertices that are already connected should not
       change the sets but may alter the internal structure of the data. */
    public void union(int v1, int v2) {
        // TODO
        int r1 = find(v1);
        int r2 = find(v2);
        int s1 = sizeOf(v1);
        int s2 = sizeOf(v2);
        if(s1<=s2){
            arr[r1] = r2;
            arr[r2] -= s1;
        }else{
            arr[r2] = r1;
            arr[r1] -= s2;
        }
    }

    /* Returns the root of the set V belongs to. Path-compression is employed
       allowing for fast search-time. */
    public int find(int vertex) {
        // TODO
        while(parent(vertex) >= 0){
            vertex = parent(vertex);
        }
        return vertex;
    }

}
