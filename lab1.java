import java.util.Scanner;

class TextManipulator {
    private String originalText;
    private String subString;
    private String wordToAdd;

    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public void setSubString(String subString) {
        this.subString = subString;
    }

    public void setWordToAdd(String wordToAdd) {
        this.wordToAdd = wordToAdd;
    }

    public void processText() {
        // Utilizarea metodelor claselor String pentru modificarea șirurilor
        String modifiedText = modifyTextWithStringClass(originalText);
        System.out.println("\nTextul modificat cu String: ");
        System.out.println(modifiedText);
    }

    private String modifyTextWithStringClass(String text) {
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.toLowerCase().endsWith(subString.toLowerCase())) {
                result.append(word, 0, word.length() - subString.length())
                        .append(wordToAdd).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}
