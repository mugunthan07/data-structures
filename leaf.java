import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class leaf{
    Node root;

    public void constructLevelOrder(String[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        root = new Node(Integer.parseInt(nums[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < nums.length) {
            Node curr = queue.poll();

            if (!nums[i].equals("null")) {
                curr.left = new Node(Integer.parseInt(nums[i]));
                queue.offer(curr.left);
            }
            i++;

            if (!nums[i].equals("null")) {
                curr.right = new Node(Integer.parseInt(nums[i]));
                queue.offer(curr.right);
            }
            i++;
        }
    }

    public int countLeafNodes() {
        return countLeafNodes(root);
    }

    private int countLeafNodes(Node node) {
        if (node == null) {
            return 0;
        } else if (node.left == null && node.right == null) {
            return 1;
        } else {
            return countLeafNodes(node.left) + countLeafNodes(node.right);
        }
    }

    public static void main(String[] args) {
        String[] nums = {"4", "8", "10", "7", "5", "1", "3"};
        leaf tree = new leaf();
        tree.constructLevelOrder(nums);
        System.out.println(tree.countLeafNodes()); // output: 3
    }
}

