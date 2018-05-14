class FindMaxValueInTree {
    static int findMax(TreeNode  tree) {
        if (tree == null) {
            throw new NullPointerException();
        }
        if(tree.left != null && tree.right!=null){
            return Math.max(tree.value, Math.max(findMax(tree.left), findMax(tree.right)));
        }
        if(tree.left != null){
            return Math.max(tree.value, findMax(tree.left));
        }
        if(tree.right != null){
            return Math.max(tree.value, findMax(tree.right));
        }
        return tree.value;
    }
}
