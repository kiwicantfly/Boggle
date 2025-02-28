package implementations;
import java.util.HashMap;

public class TrieNode {

    private HashMap<String, TrieNode> children;
    private boolean endOfWord;

    public TrieNode() {
        this.children = new HashMap<String, TrieNode>();
        this.endOfWord = false;
    }

    public HashMap<String, TrieNode> getChildren() {
        return children;
    }

    public boolean isEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(boolean bool) {
        endOfWord = bool;
    }
}