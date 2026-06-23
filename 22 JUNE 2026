class Solution {
    List<Integer> preorderTraverse(TreeNode root,List<Integer> list) {

        if(root==null)
            return list;
        list.add(root.val);
        preorderTraverse(root.left,list);
        preorderTraverse(root.right,list);
        return list;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        list = preorderTraverse(root,list);
        return list;
    }
-----------------------------------------------------------------------------------------------
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();

        if (root == null)
            return result;

        queue.offer(root);

        while (!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();

            for( int i =0;i< size;i++){
                TreeNode node = queue.poll();

                temp.add(node.val);

                if( node.left != null){
                    queue.offer(node.left);
                }

                if( node.right != null){
                    queue.offer(node.right);
                }
            }
            result.add(temp);
        }

        return result;
    }
}
-----------------------------------------------------------------------------------------------------------
