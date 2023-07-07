public class UF {
    private int[] arr;
    int n;

    public UF(int n) {
        this.n = n;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
    }

    public void quickUnion(int a, int b) {
        if (depth(a) > depth(b)) {
            arr[root(b)] = root(a);
        } else {
            arr[root(a)] = root(b);
        }
    }

    public int depth(int a) {
        int d = 1;
        while (a != arr[a]) {
            d++;
            a = arr[a];
        }
        return d;
    }

    public int root(int a) {
        while (arr[a] != a) {
            arr[a] = arr[arr[a]];
            a = arr[a];
        }
        return a;
    }

    public boolean isConnected(int a, int b) {
        return root(a) == root(b);
    }

    // too slow. would take n*m time for m operations on dataset size n (quadratic)
    public void union(int a, int b) {
        int to = arr[a];
        int from = arr[b];
        if (to != from) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == from) {
                    arr[i] = to;
                }
            }
        }
    }

    //
    public boolean slowIsConnected(int a, int b) {
        return arr[a] == arr[b];
    }
}
