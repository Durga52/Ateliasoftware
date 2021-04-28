import java.util.Scanner;

class Node {
  int data;
  Node left;
  Node right;

  Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

public class LeavesOfBST {
  static Node root;

  static void printLeafNodes(Node root) {

    if (root == null)
      return;

    if (root.left == null && root.right == null) {
      System.out.print(root.data + " ");
    }

    if (root.left != null) {
      printLeafNodes(root.left);
    }

    if (root.right != null) {
      printLeafNodes(root.right);
    }
  }

  static void insertNode(int data) {
    Node newNode = new Node(data);

    if (root == null) {
      root = newNode;
    } else {
      Node current = root;
      Node parent = null;

      while (true) {
        parent = current;

        if (data < current.data) {
          current = current.left;
          if (current == null) {
            parent.left = newNode;
            return;
          }
        } else {
          current = current.right;
          if (current == null) {
            parent.right = newNode;
            return;
          }
        }
      }
    }
  }

  static void inOrderTraversal(Node node) {
    if (root == null) {
      System.out.println("Tree is empty");
    } else {
      if (node.left != null)
        inOrderTraversal(node.left);
      System.out.print(node.data + " ");
      if (node.right != null)
        inOrderTraversal(node.right);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;
    System.out.println("Menu");
    System.out.println("1:Insertion");
    System.out.println("2:Inorder traversal");
    System.out.println("3:Print leaf nodes");
    System.out.println("4:Exit");
    while (true) {
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();
      switch (choice) {
      case 4:
        System.out.println("Exiting...");
        scanner.close();
        return;
      case 3:
        printLeafNodes(root);
        System.out.println();
        break;
      case 2:
        inOrderTraversal(root);
        System.out.println();
        break;
      case 1:
        System.out.print("Enter value to insert: ");
        int val = scanner.nextInt();
        insertNode(val);
        break;
      default:
        System.out.println("You entered wrong choice");
      }
    }
  }

}
