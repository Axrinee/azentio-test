class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class TreeDiameter {

    static class Diameter {
        int value = 0;
    }

    public static int findHeight(TreeNode node, Diameter d) {
        if (node == null)
            return 0;

        int leftHeight = findHeight(node.left, d);
        int rightHeight = findHeight(node.right, d);

        d.value = Math.max(d.value, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diameterOfTree(TreeNode root) {
        Diameter d = new Diameter();
        findHeight(root, d);
        return d.value;
    }

    public static void main(String[] args) {
    

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int diameter = diameterOfTree(root);
        System.out.println("Diameter of the tree: " + diameter);
    }
}
