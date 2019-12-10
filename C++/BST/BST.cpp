#include<bits/stdc++.h>
using namespace std;

struct Node { 
	int data; 
	struct Node *left, *right; 
}; 

struct Node *newNode(int item) { 
	struct Node *temp = (struct Node *)malloc(sizeof(struct Node)); 
	temp->data = item; 
	temp->left = temp->right = NULL; 
	return temp; 
} 

void inorder(struct Node *root) { 
	if (root != NULL) 
	{ 
		inorder(root->left); 
		cout << root->data << endl; 
		inorder(root->right); 
	} 
} 

struct Node* insert(struct Node* node, int data) { 
	if (node == NULL) 
		return newNode(data); 

	if (data < node->data) 
		node->left = insert(node->left, data); 
	else if (data > node->data) 
		node->right = insert(node->right, data); 

	return node; 
} 

int main() { 

	struct Node *root = NULL; 
	root = insert(root, 20); 
	insert(root, 10); 
	insert(root, 5); 
	insert(root, 4); 
	insert(root, 70); 
	insert(root, 6); 
	insert(root, 30); 

	inorder(root); 

	return 0; 
} 