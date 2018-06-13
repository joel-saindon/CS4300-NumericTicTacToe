import java.util.ArrayList;

public class Node {
	private int depth;
	private int minMax;
	private State nodeState;
	private ArrayList<Node> adjacentNodes = new ArrayList<Node>();
	private State state = new State();
	
	public Node() {
			
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getMinMax() {
		return minMax;
	}

	public void setMinMax(int minMax) {
		this.minMax = minMax;
	}

	public State getNodeState() {
		return nodeState;
	}

	public void setNodeState(State nodeState) {
		this.nodeState = nodeState;
	}

	public ArrayList<Node> getAdjacentNodes() {
		return adjacentNodes;
	}

	public void setAdjacentNodes(ArrayList<Node> adjacentNodes) {
		this.adjacentNodes = adjacentNodes;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
