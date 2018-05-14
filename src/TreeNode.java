class TreeNode {
    TreeNode  left;
    TreeNode  right;
    int value;

    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
    TreeNode(int value, int left, int right) {
        this.value = value;
        this.left = new TreeNode(left);
        this.right = new TreeNode(right);
    }
    
    TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

}
