package com.nhnacademy.groupstudy.chapter9.jiwon;

import java.util.Random;

public class RandomBinarySortTree {

    static class TreeNode {
        double item;
        TreeNode left;
        TreeNode right;

        TreeNode(double value) {
            item = value;
        }
    }

    private static TreeNode root;

    private static void treeInsert(double newItem) {
        if (root == null) {
            root = new TreeNode(newItem);
            return;
        }
        TreeNode runner = root;
        while (true) {
            if (newItem < runner.item) {
                if (runner.left == null) {
                    runner.left = new TreeNode(newItem);
                    return;
                } else {
                    runner = runner.left;
                }
            } else {
                if (runner.right == null) {
                    runner.right = new TreeNode(newItem);
                    return;
                } else {
                    runner = runner.right;
                }
            }
        }
    }

    private static int countLeaves(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeaves(node.left) + countLeaves(node.right);
    }

    private static int sumDepths(TreeNode node, int depth) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return depth;
        }
        return sumDepths(node.left, depth + 1) + sumDepths(node.right, depth + 1);
    }

    private static int maxDepth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        return Math.max(maxDepth(node.left, depth + 1), maxDepth(node.right, depth + 1));
    }

    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random binary sort tree with 1023 nodes
        for (int i = 0; i < 1023; i++) {
            double newItem = random.nextDouble();
            treeInsert(newItem);
        }


        int leafCount = countLeaves(root);
        int totalDepth = sumDepths(root, 0);
        int maximumDepth = maxDepth(root, 0);

        double averageDepth = (double) totalDepth / leafCount;
        System.out.println(leafCount);
        System.out.println("Average Depth of Leaves: " + averageDepth);
        System.out.println("Maximum Depth of Leaves: " + maximumDepth);
    }
}
