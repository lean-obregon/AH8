//class Node<T> {
//  T val;
//  Node<T> next;
//
//  public Node(T val) {
//    this.val = val;
//    this.next = null;
//  }
//}

import java.util.ArrayList;

class ECSource {
  public static <T> T getNodeValue(Node<T> head, int index) {
    ArrayList<String> list = new ArrayList<>();

    while (head != null) {
      list.add((String)head.val);
      if (list.size() > index) {
        return (T) list.get(index);
      }
      head = head.next;
    }
    return null;
  }
  
  public static void main(String[] args) {
    Node<String> node1 = new Node<>("banana");
    Node<String> node2 = new Node<>("mango");
    Node<String> node3 = new Node<>("kiwi");

    node1.next = node2;
    node2.next = node3;

    // banana -> mango -> kiwi

    System.out.println(ECSource.getNodeValue(node1, 1));
  }
}