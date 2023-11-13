package com.nhnacademy.groupstudy.chapter9.jiwon;

class TreeNode {
    String item;
    TreeNode left;
    TreeNode right;

    public TreeNode(String str) {
        item = str;
    }
}

class QueueNode {
    TreeNode treeNode;
    QueueNode next;

    public QueueNode(TreeNode treeNode) {
        this.treeNode = treeNode;
        this.next = null;
    }
}

class TreeQueue {
    private QueueNode head;
    private QueueNode tail;

    public TreeQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(TreeNode treeNode) {
        QueueNode newTail = new QueueNode(treeNode);
        if (isEmpty()) {
            head = tail = newTail;
        } else {
            tail.next = newTail;
            tail = newTail;
        }
    }

    public TreeNode dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Can't dequeue from an empty queue.");
        }
        TreeNode dequeuedNode = head.treeNode;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return dequeuedNode;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

public class TreePrintNonRecursive {

    private static TreeNode root;

    private static void treeInsert(String newItem) {
        if (root == null) {
            root = new TreeNode(newItem);
            return;
        }
        TreeNode runner = root;
        while (true) {
            int comparison = newItem.compareTo(runner.item);
            if (comparison < 0) {
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

    private static void levelOrderPrint(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeQueue queue = new TreeQueue();
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.dequeue();
            System.out.println(node.item);

            if (node.left != null) {
                queue.enqueue(node.left);
            }
            if (node.right != null) {
                queue.enqueue(node.right);
            }
        }
    }

    public static void main(String[] args) {
        treeInsert("g");
        treeInsert("a");
        treeInsert("b");
        treeInsert("c");
        treeInsert("d");
        treeInsert("e");
        treeInsert("f");
        treeInsert("i");
        treeInsert("h");

        System.out.println("Level Order Traversal:");
        levelOrderPrint(root);
    }
}
