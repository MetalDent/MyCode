#include<stdio.h>
#include<malloc.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};

int insert(int data)
{
    struct node *node;
    node= malloc(sizeof(struct node));
    node->data=data;
    node->left=NULL;
    node->right=NULL;

    return(node);
}

void post(struct node *node)
{
    if(node==NULL)
        return;

    post(node->left);

    post(node->right);

    printf(" %d",node->data);
}

void pre(struct node *node)
{
    if(node==NULL)
        return;

    printf(" %d",node->data);

    pre(node->left);

    pre(node->right);
}

void in(struct node *node)
{
    if(node==NULL)
        return;

    in(node->left);

    printf(" %d",node->data);

    in(node->right);
}

int main()
{
    struct node* root=insert(1);
    root->left=insert(2);
    root->right=insert(3);
    root->left->left=insert(4);
    root->left->right=insert(5);

    printf("\nPre-order traversal is ");
    pre(root);

    printf("\nIn-order traversal is ");
    in(root);

    printf("\nPost-order traversal is ");
    post(root);
}
