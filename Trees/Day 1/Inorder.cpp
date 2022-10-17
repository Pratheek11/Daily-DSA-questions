class Inorder
{
public:
    vector<int> inorderTraversal(TreeNode *root)
    {
        vector<int> ans;
        travers(root, ans);
        return ans;
    }

    void travers(TreeNode *node, vector<int> &ans)
    {
        if (node == NULL)
            return;
        travers(node->left, ans);
        ans.push_back(node->val);
        travers(node->right, ans);
    }
};