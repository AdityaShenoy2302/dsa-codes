import java.util.ArrayList;

public class merge2BSTs {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> arr, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = si + (ei - si) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, si, mid - 1);
        root.right = createBST(arr, mid + 1, ei);

        return root;
    }

    public static Node mergeBST(Node root1, Node root2) {
        // sorted arraylist 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        // sorted arraylist 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // merge
        int i = 0, j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                res.add(arr1.get(i));
                i++;
            } else {
                res.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            res.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            res.add(arr2.get(j));
            j++;
        }

        // sorted arraylist -> balanced bst
        return createBST(res, 0, res.size() - 1);
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);
        preOrder(root);
    }

}
