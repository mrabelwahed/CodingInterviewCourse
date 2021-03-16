package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateTree {
    public static void main(String[] args) {
        // Bad way to take create tree
//        TreeNode root = new TreeNode(10);
//        TreeNode n1 = new TreeNode(100);
//        TreeNode n2 = new TreeNode(200);
//       root.children.add(n1);
//       root.children.add(n2);
        // recursive way to create tree
        // TreeNode root = takeInput();
        //Take input in iterative way
        TreeNode root = takeInputIteratively();
        printTreeLevelOrder(root);
        //printTreeRecursively(root);
    }

    static void printTreeRecursively(TreeNode root) {
        //edge case : tree is empty
        if (root == null) return;
        //print root value
        System.out.print(root.data + ": ");
        //print children values
        for (TreeNode child : root.children) {
            System.out.print(child.data + ",");
        }
        System.out.println("");
        for (TreeNode child : root.children) {
            printTreeRecursively(child);
        }
    }

    // take input for tree recursively
    static TreeNode takeInputRecursively() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Node Data");
        int rootData = sc.nextInt();
        TreeNode root = new TreeNode(rootData);
        System.out.println("Enter Num of children for node : " + rootData);
        int childrenNum = sc.nextInt();
        for (int i = 0; i < childrenNum; i++) {
            TreeNode child = takeInputRecursively();
            root.children.add(child);
        }
        return root;
    }


    static TreeNode takeInputIteratively() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root Data");
        int rootData = sc.nextInt();
        //create
        TreeNode root = new TreeNode(rootData);
        //push
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        // no connect becuase root node hash no parent
        while (!q.isEmpty()) {
            //get front and remove the head node
            TreeNode front = q.peek();
            q.poll();
            System.out.println("enter children no: for " + front.data);
            int childNo = sc.nextInt();
            for (int i = 1; i <= childNo; i++) {
                System.out.println("enter child " + i + ": for " + front.data);
                int childData = sc.nextInt();
                //create node
                TreeNode child = new TreeNode(childData);
                //push Node
                q.add(child);
                front.children.add(child);
            }
        }
        return root;
    }

   static void printTreeLevelOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList();
        q.add(root);

        while (!q.isEmpty()){
            TreeNode front = q.peek();
            q.poll();
            System.out.print(front.data +": ");
            for (int i = 0; i <front.children.size() ; i++) {
                System.out.print(front.children.get(i).data+", ");
            }
            System.out.println("");

            for (int i = 0; i <front.children.size() ; i++)
                q.add(front.children.get(i));
        }
    }


}

class TreeNode {
    int data;
    ArrayList<TreeNode> children = new ArrayList();

    public TreeNode(int data) {
        this.data = data;
    }
}
