class HeightOfBt
{
public:
    int maxDepth(TreeNode *root)
    {
        return traverse(root, 0);
    }

    int traverse(TreeNode *node, int count)
    {
        if (node == NULL)
            return count;
        return max(traverse(node->left, count + 1), traverse(node->right, count + 1));
    }
};