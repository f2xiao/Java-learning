package Set;

public class DisjointSetsTest {
    public static void main(String[] args) {
        UnionFind ufs = new UnionFind (7);
        ufs.union(1,2);
        System.out.println(ufs.connected(1,2));
        ufs.union(2,3);
        ufs.union(4,5);
        ufs.union(1,5);
        ufs.union(6,4);
    }
}
