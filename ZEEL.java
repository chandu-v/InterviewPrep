/**
 * id, name
 * 1, ram
 * 2, shyam
 * 3, ram
 * 4, ram
 * 5, laxman
 * 
 * output
 * 1, ram
 * 2, shyam
 * 5, laxman
 * 
 * DELETE * FROM EMPLOYEE E WHERE E.ID IN (SELECT E1 FROM EMPLOYEE E1 LIMIT (SELECT COUNT(*) FROM EMPLOYEE E2 WHERE E2.NAME = 'ram' GROUP BY NAME))
 * 
 * DELETE * FROM EMPLOYEE E1 JOIN EMPLOYEE E2 ON  E1.NAME = E2.NAME WHERE E1.ID < E2.ID AND E1.NAME = E2.NAME;
 * 
 * 
 * HashMap & HashSet <T>
 * <Key, Value> 
 * 
 * 0
 * [LinkedList, ]
 * 
 * 
 * 
 * 
 * [9,10,20,100,200]
 * 
 * max = 20;
 * smax = 10;
 *for(int i = 1 ; i< arr.length ; i++) 
 * if(ele > max) {
 *  smax = max;
 *  max = ele;
 * }
 * return (smax);
 * 
 * O(n)
 * 
 * class ds {
 * 
 *  List<T> values;
 *  int max; 
 *  int smax;
 * }
 * 
 * 
 * class Node {
 *      int data;
 *      Node left;
 *      Node right;
 * }
 * 
 * class MaxHeap {
 *      Node root;
 *      
 * 
 *      void insert(Node child) {
 *          if(child.data > root.data) {
 *                  // replace my root with the child to be insert & push down the root element to below 
 *                  
 *          } else {
 *          
 *              //Insert child node to the left Node.
 *              // I'll go to the right most node 
 *          }
 *      }
 * }
 * 
 * 
 */