public class Solution {

    static class Node {
        int prod;
        int[] cnt;

        Node(int k) {
            cnt = new int[k];
        }
    }

    private int k;
    private Node[] tree;
    private int n;

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        this.k = k;
        this.n = nums.length;

        tree = new Node[4 * n];

        build(1, 0, n - 1, nums);

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int index = queries[i][0];
            int value = queries[i][1];
            int start = queries[i][2];
            int x = queries[i][3];

            // Persistent update
            update(1, 0, n - 1, index, value);

            // Query suffix [start, n - 1]
            Node res = query(1, 0, n - 1, start, n - 1);

            ans[i] = res.cnt[x];
        }

        return ans;
    }

    private void build(int node, int l, int r, int[] nums) {

        if (l == r) {
            tree[node] = createNode(nums[l]);
            return;
        }

        int mid = l + (r - l) / 2;

        build(node * 2, l, mid, nums);
        build(node * 2 + 1, mid + 1, r, nums);

        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }

    private void update(int node, int l, int r, int index, int value) {

        if (l == r) {
            tree[node] = createNode(value);
            return;
        }

        int mid = l + (r - l) / 2;

        if (index <= mid) {
            update(node * 2, l, mid, index, value);
        } else {
            update(node * 2 + 1, mid + 1, r, index, value);
        }

        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }

    private Node query(int node, int l, int r, int ql, int qr) {

        if (ql <= l && r <= qr) {
            return tree[node];
        }

        int mid = l + (r - l) / 2;

        if (qr <= mid) {
            return query(node * 2, l, mid, ql, qr);
        }

        if (ql > mid) {
            return query(node * 2 + 1, mid + 1, r, ql, qr);
        }

        Node left = query(node * 2, l, mid, ql, qr);
        Node right = query(node * 2 + 1, mid + 1, r, ql, qr);

        return merge(left, right);
    }

    private Node createNode(int value) {

        Node node = new Node(k);

        int rem = value % k;

        node.prod = rem;

        // The only non-empty prefix of a one-element segment
        // is the element itself.
        node.cnt[rem] = 1;

        return node;
    }

    private Node merge(Node left, Node right) {

        Node result = new Node(k);

        // Product of the complete merged segment
        result.prod = (int) ((long) left.prod * right.prod % k);

        // Prefixes completely inside the left segment
        for (int r = 0; r < k; r++) {
            result.cnt[r] = left.cnt[r];
        }

        /*
         * Prefixes that:
         *
         * 1. contain the entire left segment
         * 2. then contain a prefix of the right segment
         */
        for (int r = 0; r < k; r++) {

            if (right.cnt[r] == 0) {
                continue;
            }

            int newRem = (int) ((long) left.prod * r % k);

            result.cnt[newRem] += right.cnt[r];
        }

        return result;
    }
}