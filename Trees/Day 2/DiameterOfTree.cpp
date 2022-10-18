class Solution
{
public:
    int diameterOfBinaryTree(TreeNode *root)
    {
        // return longest(root->left, 0) + longest(root->right,0);
        int he = 0;
        height(root, he);
        return he;
    }
    int longest(TreeNode *node, int count)
    {
        if (node == NULL)
            return count;
        return max(longest(node->left, count + 1), longest(node->right, count + 1));
    }
    int height(TreeNode *node, int &he)
    {
        if (node == NULL)
            return 0;
        int lf = height(node->left, he);
        int rg = height(node->right, he);
        he = max(he, lf + rg);
        return 1 + max(lf, rg);
    }
};