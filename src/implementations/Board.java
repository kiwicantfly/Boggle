package implementations;
import java.util.Set;

import implementations.Trie;

import java.util.HashSet;
import java.util.Collections;

public class Board {

    public static final Set<String> alphabet = Set.of(
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    );

    private int size;
    private int height;
    private int width;
    private int score;
    private String board;

    public Board(int height, int width, String board) {

        assert height * width > 0: "The height and the width must be positive intergers.";

        assert board.length() == height * width: "The number of letters must be the same as the size of the board.";
        this.height = height;
        this.width = width;
        size = height * width;

        this.board = "";
        for (int i=0; i<board.length(); i++) {
            String letter = word.substring(i, i+1);
            // Le char doit être l'une des 26 lettres de l'alphabet;
            assert alphabet.contains(letter): "The board must contain capital letters only.";
            this.board += letter;
        }

        this.score = this.score();
    }

    // Liste d'adajence d'un graphe du roi
    private int[][] findNeighbours(){
        int[][] neighbours = new int[size][];
        for (int row=0; row<height; row++){
            for (int col=0; col<width; col++){

                int k = row * width + col;

                // Coin

                // Côté

                // Intérieur

            }
        }
    }

    static void rec(int[][] neighbours, Trie trie, Set<String> result, int cur, boolean[] visited, String word) {
        if (trie.startsWith(word)) {
            if (trie.isWord(word)) {
                Collections.add(result, word);
            }
            visited[cur] = true;
            for (int c : neighbours[cur]) {
                if (!visited[c]) {
                    word += Character.toString(board.charAt(letter));
                    rec(neighbours, trie, result, c, visited, word);
                }
            }
            visited[cur] = false;
        }
    }

    // Trouve tous les mots dans la grille
    public Set<String> solve(Trie trie) {

        for (int letter=0; letter<size; letter++) {
            // Valuer d'initialisation est false
            boolean[] visited = new boolean[size];
            int[][] neighbours = findNeighbours();
            Set<String> result = new HashSet<String>();
            rec(neighbours, trie, result, letter, visited, Character.toString(board.charAt(letter)));
        }

        for (String word : result) {
            System.out.println(word);
        }

        return result;

    }

    // Renvoie le nombre de mots
    public int score(Trie trie) {
        return 0;
        //return board.solve(Trie trie).size();
    }

    // Génère une grille de taille souhaitée avec un nombre de mots prédéfini
    public Board generate(int size, int score) {
        return null;
    }

    // Affiche la grille
    public void display() {
        for (int i=0; i<size; i++) {
            System.out.print(board.charAt(i));
            if ((i+1)%size == 0) {
                System.out.println(' ');
            }
        }
    }
}