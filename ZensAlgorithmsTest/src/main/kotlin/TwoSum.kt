import javax.swing.tree.TreeNode

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */


/*
class TwoSum {
    fun isBalanced(root: TreeNode?): Boolean {
        return getHight(root) != -1
    }

    fun getHight(root: TreeNode?): Int {
        if (root == null){
            return 0
        }
        var leftHight = getHight(root.left)
        var rightHight = getHight(root.right)

        if(leftHight == -1 || rightHight == -1){
            return -1
        }
        if(Math.abs(leftHight - rightHight) > 1){
            return -1
        }
        return Math.max(leftHight, rightHight) + 1
    }
}
 */