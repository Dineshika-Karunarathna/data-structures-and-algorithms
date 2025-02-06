package strings;

import java.util.HashMap;

class SuffixTreeNode {
    HashMap<Character, SuffixTreeNode> children = new HashMap<>();
    boolean isEndOfWord = false;
}

public class SuffixTree {
    private SuffixTreeNode root;

    public SuffixTree() {
        root = new SuffixTreeNode();
    }

    // Insert all suffixes of the string
    public void insertSuffix(String text) {
        for (int i = 0; i < text.length(); i++) {
            insert(text.substring(i));
        }
    }

    private void insert(String suffix) {
        SuffixTreeNode node = root;
        for (char ch : suffix.toCharArray()) {
            node.children.putIfAbsent(ch, new SuffixTreeNode());
            node = node.children.get(ch);
        }
        node.isEndOfWord = true;
    }

    // Search for a substring
    public boolean search(String pattern) {
        SuffixTreeNode node = root;
        for (char ch : pattern.toCharArray()) {
            if (!node.children.containsKey(ch)) {
                return false;
            }
            node = node.children.get(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        SuffixTree tree = new SuffixTree();
        tree.insertSuffix("banana$");
        System.out.println(tree.root);
        System.out.println(tree.search("nan"));  // true
        System.out.println(tree.search("apple")); // false
    }
}
