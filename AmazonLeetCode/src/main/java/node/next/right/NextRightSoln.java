package node.next.right;
//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
public class NextRightSoln {

    public Node connect(Node root) {

        if (root != null)
            recNode(root, null, true);
        return root;
    }

    public void recNode(Node currentNode, Node parentNode, boolean isLeft) {
        if (parentNode != null && isLeft)
            currentNode.next = parentNode.right;
        else if (!isLeft && parentNode.next != null) {
            currentNode.next = parentNode.next.left;
        }
        if (currentNode.left != null) {
            recNode(currentNode.left, currentNode, true);
            recNode(currentNode.right, currentNode, false);
        }
    }


    // given in question
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
