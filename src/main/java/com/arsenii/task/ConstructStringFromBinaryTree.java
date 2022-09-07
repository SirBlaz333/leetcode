package com.arsenii.task;

public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode root) {
        StringBuilder stringBuilder = new StringBuilder();
        tree2str(root, stringBuilder);
        return stringBuilder.toString();
    }

    public void tree2str(TreeNode node, StringBuilder stringBuilder) {
        stringBuilder.append(node.val);
        if (node.left != null) {
            stringBuilder.append("(");
            tree2str(node.left, stringBuilder);
            stringBuilder.append(")");
        }
        if (node.left == null && node.right != null) {
            stringBuilder.append("()");
        }
        if (node.right != null) {
            stringBuilder.append("(");
            tree2str(node.right, stringBuilder);
            stringBuilder.append(")");
        }
    }
}
