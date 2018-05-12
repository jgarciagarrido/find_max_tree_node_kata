/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class FindMaxValueInTree {
    static int findMax(TreeNode  tree) {
        if (tree == null) {
            throw new NullPointerException();
        }
        return tree.value;
    }
}
