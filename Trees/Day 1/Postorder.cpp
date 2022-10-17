class Postorder
{
public:
    vector<int> postorderTraversal(TreeNode *root)
    {
        vector<int> ans;
        traverse(root, ans);
        return ans;
    }

    void traverse(TreeNode *node, vector<int> &ans)
    {
        if (node == NULL)
            return;
        traverse(node->left, ans);
        traverse(node->right, ans);
        ans.push_back(node->val);
    }
};