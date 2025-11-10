class Node {
    int data;
    Node left, right;

    Node (int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    void inorder(Node node) {
        if(node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(node.data + " ");
        inorder(node.right);
    }

    Node reverse(Node node) {
        if(node == null) {
            return node;
        }

        Node left = reverse(node.left);
        Node right = reverse(node.right);

        node.left = right;
        node.right = left;

        return node;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node (3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Original tree (inOrder): ");
        tree.inorder(tree.root);
        System.out.println();

        // First reversal
        tree.reverse(tree.root);
        System.out.print("After first reversal (inOrder): ");
        tree.inorder(tree.root);
        System.out.println();

        // Second reversal
        tree.reverse(tree.root);
        System.out.print("After second reversal (inOrder): ");
        tree.inorder(tree.root);
        System.out.println();

    }
}