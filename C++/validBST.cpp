#include<bits/stdc++.h>
using namespace std;

struct Node { 
	int data; 
	struct Node *left, *right; 
}; 

Node* insert(int data) {
    struct Node *node;
    node = (struct Node*)malloc(sizeof(struct Node));
    node->data=data;
    node->left=NULL;
    node->right=NULL;

    return(node);
}

bool isBST(Node *node, int min, int max) {
	if(node == NULL)
		return true;
	else if(node-> data < min || node->data > max)
		return false;

	return
		isBST(node->left, min, node->data-1);
		isBST(node->right, node->data+1, max);
}

bool checkBST(Node *node) {
		return isBST(node, INT_MIN, INT_MAX);
}

int main() { 

	struct Node* root=insert(10);
    root->left=insert(2);
    root->right=insert(30);
    root->left->left=insert(1);
    root->left->right=insert(5);

    cout << checkBST(root) << endl;

	return 0; 
} 