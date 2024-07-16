//#include <stdio.h>
//
//#define MAX_SIZE 100  // Maximum array size
//
//int main()
//{
//    int arr[MAX_SIZE];
//    int size, i, toSearch, found;
//
//    /* Input size of array */
//    printf("Enter size of array: ");
//    scanf("%d", &size);
//
//    /* Input elements of array */
//    printf("Enter elements in array: ");
//    for(i=0; i<size; i++)
//    {
//        scanf("%d", &arr[i]);
//    }
//
//    printf("\nEnter element to search: ");
//    scanf("%d", &toSearch);
//
//    /* Assume that element does not exists in array */
//    found = 0; 
//    
//    for(i=0; i<size; i++)
//    {
//        /* 
//         * If element is found in array then raise found flag
//         * and terminate from loop.
//         */
//        if(arr[i] == toSearch)
//        {
//            found = 1;
//            break;
//        }
//    }
//
//    /*
//     * If element is not found in array
//     */
//    if(found == 1)
//    {
//        printf("\n%d is found at position %d", toSearch, i + 1);
//    }
//    else
//    {
//        printf("\n%d is not found in the array", toSearch);
//    }
//
//    return 0;
//}

#include<stdio.h>  
#include<stdlib.h>  
void create(int);
void inorder()  
void search();  
struct node  
{  
    int data;  
    struct node *next;  
};  
struct node *head;  
void main ()  
{  
    int choice,item,loc;  
    do   
    {  
        printf("\n1.Create\n2.Search\n3.Exit\n4.Enter your choice?");  
        scanf("%d",&choice);  
        switch(choice)  
        {  
            case 1:  
            printf("\nEnter the item\n");  
            scanf("%d",&item);  
            create(item);  
            break;   
            case 2:  
            search();  
            case 3:  
            exit(0);  
            break;    
            default:  
            printf("\nPlease enter valid choice\n");  
        }  
                  
    }while(choice != 3);  
}  
    void create(int item)  
    {  
        struct node *ptr = (struct node *)malloc(sizeof(struct node *));  
        if(ptr == NULL)  
        {  
            printf("\nOVERFLOW\n");  
        }  
        else  
        {  
            ptr->data = item;  
            ptr->next = head;  
            head = ptr;  
            printf("\nNode inserted\n");  
        }  
          
    }  
void search()  
{  
    struct node *ptr;  
    int item,i=0,flag;  
    ptr = head;   
    if(ptr == NULL)  
    {  
        printf("\nEmpty List\n");  
    }  
    else  
    {   
        printf("\nEnter item which you want to search?\n");   
        scanf("%d",&item);  
        while (ptr!=NULL)  
        {  
            if(ptr->data == item)  
            {  
                printf("item found at location %d ",i+1);  
                flag=0;  
            }   
            else  
            {  
                flag=1;  
            }  
            i++;  
            ptr = ptr -> next;  
        }  
        if(flag==1)  
        {  
            printf("Item not found\n");  
        }  
    }     
          
}
