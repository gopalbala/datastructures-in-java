package com.gb.datastructures.practice.strings;

import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> words = new HashSet<>();
        words.addAll(wordList);
        Deque<Element> wordQ = new ArrayDeque<>();
        wordQ.add(new Element(beginWord, 1));
        while (!wordQ.isEmpty()) {
            Element element = wordQ.removeFirst();
            if (element.word.equalsIgnoreCase(endWord))
                return element.iter;
            //transform the string to new string
            char[] chars = element.word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                for (char j = 'a'; j <= 'z'; j++) {
                    char temp = chars[i];
                    if (chars[i] != j)
                        chars[i] = j;
                    String transformed = new String(chars);
                    if (words.contains(transformed)) {
                        wordQ.add(new Element(transformed, element.iter + 1));
                        //done to ensure the same word is not checked twice
                        words.remove(transformed);
                    }
                    chars[i] = temp;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        WordLadder wordLadder = new WordLadder();
        List<String> words = new ArrayList<>();
        words.add("hot");
        words.add("dot");
        words.add("dog");
        words.add("lot");
        words.add("log");
        words.add("cog");
        int result = wordLadder.ladderLength("hit", "cog", words);
        System.out.println(result);
    }
}

class Element {
    String word;
    int iter;

    public Element(String word, int iter) {
        this.word = word;
        this.iter = iter;
    }
}
