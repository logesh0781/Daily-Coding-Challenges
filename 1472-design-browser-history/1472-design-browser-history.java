class BrowserHistory {
    
    public class Node{
        String data;
        Node next, prev;
        public Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
    Node curr;
    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }
    
    public void visit(String url) {
        Node node = new Node(url);
        curr.next = node;
        node.prev = curr;
        curr = node;
    }
    
    public String back(int steps) {
        while (curr.prev != null && steps-->0) {
            curr = curr.prev;
        }
        return curr.data;
    }
    
    public String forward(int steps) {
        while (curr.next != null && steps-->0) {
            curr = curr.next;
        }
        return curr.data;
    }
}