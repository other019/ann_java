package cf.other019;

import java.util.ArrayList;
import java.util.List;

public class Network {
    public List<Node> input_layer = new ArrayList<>();
    public List<Node> discrete_layer = new ArrayList<>();
    public List<Node> output_layer = new ArrayList<>();
    public List<Edge> edges = new ArrayList<>();

    public Network(int input_layer, int discrete_layer, int output_layer) {
        for (int i = 0; i < input_layer; i++) {
            this.input_layer.add(new Node());
        }
        for (int i = 0; i < discrete_layer; i++) {
            this.discrete_layer.add(new Node());
        }
        for (int i = 0; i < output_layer; i++) {
            this.output_layer.add(new Node());
        }
        for (int i = 0; i < input_layer; i++) {
            for (int j = 0; j < discrete_layer; j++) {
                this.edges.add(new Edge(this.input_layer.get(i), this.discrete_layer.get(j)));
            }
        }
    }
}
