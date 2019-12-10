#include<bits/stdc++.h>
using namespace std;

struct Node  { 
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

bool isBalanced(Node *node, int *height) {
	int leftH = 0, rightH = 0;
	int flagL = 0, flagR = 0;

	if(node == NULL) {
		*height = 0;
		return true;
	}

	flagL = isBalanced(node->left, &leftH);
	flagR = isBalanced(node->right, &rightH);

	*height = (leftH > rightH ? leftH : rightH) + 1;

	if(abs(leftH - rightH) >= 2)
		return false;

	else
		return flagL && flagR;
}

int main() { 

	int height = 0;

	Node* root = insert(1); 
    root->left = insert(2); 
    root->right = insert(3); 
    root->left->left = insert(4); 
    root->left->right = insert(5); 
    root->right->left = insert(6); 
    root->left->left->left = insert(7); 

    cout << isBalanced(root, &height) << endl;

	return 0; 
} 