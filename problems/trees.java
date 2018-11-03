/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        return checkRecursive(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean checkRecursive(Node root, int min, int max){
        if(null==root) return true;
        if(root.data <= min || root.data>=max){
            return false;
        }
        return checkRecursive(root.left, min, root.data) && checkRecursive(root.right, root.data, max);
    }
