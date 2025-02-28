package implementations;
import implementations.TrieNode;

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void createFromLexique() {

    }

    public void insert(String word) {
        TrieNode currentNode = root;
        for (int i=0; i<word.length(); i++) {
            String letter = word.substring(i, i+1);
            if (currentNode.getChildren().get(letter) == null) {
                currentNode.getChildren().put(letter, new TrieNode());
            }
            currentNode = currentNode.getChildren().get(letter);
        }
        currentNode.setEndOfWord(true);
    }

    public boolean isWord(String word) {
        TrieNode currentNode = root;
        for (int i=0; i<word.length(); i++) {
            String letter = word.substring(i, i+1);
            if (currentNode.getChildren().get(letter) = null) {
                return false;
            }
            currentNode = currentNode.getChildren().get(letter);
        }
        return currentNode.isEndOfWord();
    }

    public boolean startsWith(String word) {
        TrieNode cuurentNode = root;
        for (int i=0; i<word.length(); i++) {
            String letter = word.substring(i, i+1);
            if (currentNode.getChildren().get(letter) = null) {
                return false;
            }
            currentNode = currentNode.getChildren().get(letter);
        }
        return true;
    }
}