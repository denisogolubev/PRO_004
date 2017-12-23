package JavaFX.lesson02.listView.entity;

public class Node {
    private String nodeName;
    private String nodeSurName;


    public Node(String nodeName, String nodeSurName) {
        this.nodeName = nodeName;
        this.nodeSurName = nodeSurName;
    }

    @Override
    public String toString() {
        return "Node{" +
                "nodeName='" + nodeName + '\'' +
                ", nodeSurName='" + nodeSurName + '\'' +
                '}';
    }
}
