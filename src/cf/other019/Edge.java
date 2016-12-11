package cf.other019;


import java.util.Random;

public class Edge {
    public Node start = new Node();
    public Node end = new Node();
    public double weight = new Random().nextDouble();

    public Edge(Node start, Node end) {
        this.start = start;
        this.end = end;
    }
}

