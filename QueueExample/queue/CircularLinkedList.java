package queue;
class CircularLinkedList {
    private Node end;

    CircularLinkedList() {
        end = null;
    }


    void addToEnd(int data) {
        if(end == null) {
            end = new Node(data, null);
            end.link = end;
        }
        else {
            Node newNode = new Node(data, end.link);
            end.link = newNode;
            end = newNode;
        }
    }

    Integer removeFromFront() {
        Integer result = null;
        if(end != null){
            Node top = end.link;
            result = top.data;
            if(top == end) {
                end = null;
            }
            else {
                end.link = top.link;
            }
        }   
        return result;
    }

    Integer lookAtFront() {
        Integer result = null;
        if(end != null) {
            result = end.link.data; // top.data
        }
        return result;
    }

    public String toString() {
        String result = "";
        if(end != null) {
            Node curr = end.link; // curr = top;
            result += curr.data + " ";
            while(curr != end) {
                curr = curr.link;
                result += curr.data + " ";
            }
        }
        return result;
    }

    private class Node {
        public Integer data;
        public Node link;

        public Node(Integer data, Node link) {
            this.data = data;
            this.link = link;
        }
    }
}
