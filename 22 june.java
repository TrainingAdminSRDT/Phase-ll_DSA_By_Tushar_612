class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if (root == null) return ans;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            ans.add(node.val);

            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }

        return ans;
    }
}

-----------------------------------------------------------------------------------------------
2. Binary Tree Inorder Traversal(LeetCode 94)...

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Inorder(root, result);

        return result;
    }

    public void Inorder(TreeNode root, List<Integer> result) {

        if(root == null) {
            return;
        }

        Inorder(root.left, result);
        result.add(root.val);
        Inorder(root.right, result);
    }
}

------------------------------------------------------------------------------------------

3. Binary Tree Postorder Traversal(LeetCode 145)...

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);

        return result;
    }

    public void postorder(TreeNode root, List<Integer> result) {

        if(root == null) {
            return;
        }

        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
    }
}
