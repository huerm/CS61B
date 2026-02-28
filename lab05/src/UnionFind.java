public class UnionFind {
    // TODO: Instance variables
    final int N;
    int []parent;
    int []size;

    /* Creates a UnionFind data structure holding N items. Initially, all
       items are in disjoint sets. */
    public UnionFind(int N) {
        this.N=N;
        this.parent=new int [N];
        this.size=new int[N];
        for(int i=0;i<N;i++){
            parent[i]=-1;
            size[i]=1;
        }
    }

    /* Returns the size of the set V belongs to. */
    public int sizeOf(int v) {
        int p=find(v);
        return size[p];
    }

    /* Returns the parent of V. If V is the root of a tree, returns the
       negative size of the tree for which V is the root. */
    public int parent(int v) {
        if(parent[v]==-1){
            return(-size[v]);
        }else{
            return parent[v];
        }
    }

    /* Returns true if nodes/vertices V1 and V2 are connected. */
    public boolean connected(int v1, int v2) {
        return find(v1)==find(v2);
    }

    /* Returns the root of the set V belongs to. Path-compression is employed
       allowing for fast search-time. If invalid items are passed into this
       function, throw an IllegalArgumentException. */
    public int find(int v) {
        if (v > N || v < 0){
            throw new IllegalArgumentException("Index out of bounds: " + v);
        }

        if(parent[v] <0) return v;
        return parent[v]=find(parent[v]);//递归实现Path-compression
    }

    /* Connects two items V1 and V2 together by connecting their respective
       sets. V1 and V2 can be any element, and a union-by-size heuristic is
       used. If the sizes of the sets are equal, tie break by connecting V1's
       root to V2's root. Union-ing an item with itself or items that are
       already connected should not change the structure. */
    public void union(int v1, int v2) {
        int r1=find(v1);
        int r2=find(v2);
        if(size[r1]>size[r2]){
            parent[r2]=r1;
            size[r1]+=size[r2];
        }else {
            parent[r1]=r2;
            size[r2]+=size[r1];
        }
    }

}
