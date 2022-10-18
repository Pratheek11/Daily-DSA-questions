class BalancedBt
{
public:
    bool isBalanced(TreeNode *root)
    {
        return height(root) != -1;
    }

    int height(TreeNode *node)
    {
        if (node == NULL)
            return 0;
        int left = height(node->left);
        if (left == -1)
            return -1;
        int right = height(node->right);
        if (right == -1)
            return -1;
        if (abs(left - right) > 1)
            return -1;
        return max(left, right) + 1;
    }
};