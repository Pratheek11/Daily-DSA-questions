class Solution
{
public:
    int maxPathSum(TreeNode *root)
    {
        int sum = INT_MIN;
        travers(root, sum);
        return sum;
    }
    int travers(TreeNode *node, int &sum)
    {
        if (node == NULL)
            return 0;
        int left = max(0, travers(node->left, sum));
        int right = max(0, travers(node->right, sum));
        sum = max(sum, left + right + node->val);
        return node->val + max(left, right);
    }
};