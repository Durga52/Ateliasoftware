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

public class BinarySearchTree {
  static Node root;

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

  static Node minNode(Node root) {
    if (root.left != null)
      return minNode(root.left);
    return root;
  }

  static Node deleteNode(Node node, int value) {
    if (node == null) {
      return null;
    }

    if (value < node.data) {
      node.left = deleteNode(node.left, value);
    } else if (value > node.data) {
      node.right = deleteNode(node.right, value);
    } else {
      if (node.left == null && node.right == null) {
        node = null;
      } else if (node.left == null) {
        node = node.right;
      } else if (node.right == null) {
        node = node.left;
      } else {
        Node temp = minNode(node.right);
        node.data = temp.data;
        node.right = deleteNode(node.right, temp.data);
      }
    }
    return node;
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
    System.out.println("2:Deletion");
    System.out.println("3:Inorder traversal");
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
        inOrderTraversal(root);
        System.out.println();
        break;
      case 2:
        System.out.print("Enter value to delete: ");
        int n = scanner.nextInt();
        Node deletedNode = deleteNode(root, n);
        if (deletedNode != null)
          System.out.println(n + " deleted successfully");
        else
          System.out.println(n + " donot exist in the tree");
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
