class Preorder
{
public:
    vector<int> preorderTraversal(TreeNode *root)
    {
        vector<int> ans;
        traverse(root, ans);
        return ans;
    }

    void traverse(TreeNode *node, vector<int> &ans)
    {
        if (node == NULL)
            return;
        ans.push_back(node->val);
        traverse(node->left, ans);
        traverse(node->right, ans);
    }
};