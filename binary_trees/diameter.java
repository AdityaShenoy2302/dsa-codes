// number of nodes in the longest path between 2 leaves

public class diameter {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int heightT(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = heightT(root.left);
        int rh = heightT(root.right);
        return Math.max(lh, rh) + 1;

    }

    // O(n^2)
    public static int diameterT(Node root) {
        if (root == null) {
            return 0;
        }

        int ld = diameterT(root.left);
        int lh = heightT(root.left);
        int rd = diameterT(root.right);
        int rh = heightT(root.right);

        return Math.max(lh + rh + 1, Math.max(ld, rd));
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    // O(n)
    public static Info diameterOptimized(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameterOptimized(root.left);
        Info rightInfo = diameterOptimized(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameterT(root));
        System.out.println(diameterOptimized(root).diam);
    }
}
