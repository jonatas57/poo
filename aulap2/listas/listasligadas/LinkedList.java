package listasligadas;

public class LinkedList {
  private class LinkedNode {
    int data;
    LinkedNode next;
  }
  private LinkedNode first = null;
  public void insertNodeEnd(int item) {
    LinkedNode newNode = new LinkedNode();
    newNode.data = item;
    newNode.next = null;

    if (this.first == null) {
      this.first = newNode;
    }
    else {
      LinkedNode atual = first;
      while (atual.next != null) {
        atual = atual.next;
      }
      atual.next = newNode;
    }
  }
  public void removeNode(int item) {
    LinkedNode atual = this.first, prev = null;
    if (atual != null) {
      while (atual.data != item) {
        prev = atual;
        atual = atual.next;
      }
      if (prev == null) {
        this.first = atual.next;
      }
      else {
        prev.next = atual.next;
      }
    }
  }
  public void printList() {
    LinkedNode atual = this.first;
    while (atual != null) {
      System.out.print(atual.data + " ");
      atual = atual.next;
    }
    System.out.println();
  }
}
