import java.util.Scanner;

public class TextManipulatorProgram {
    public static void main(String[] args) {
        // Crearea și inițializarea obiectului TextManipulator
        TextManipulator manipulator = new TextManipulator();

        // Prezentarea informațiilor inițiale
        System.out.println("Introdu textul original: ");
        String originalText = readUserInput();
        manipulator.setOriginalText(originalText);

        // Citirea datelor de intrare de la utilizator
        System.out.print("\nIntrodu subsirul specificat: ");
        String subString = readUserInput();
        System.out.print("Introdu cuvântul care trebuie adăugat: ");
        String wordToAdd = readUserInput();

        // Setarea subsirului și cuvântului în obiectul TextManipulator
        manipulator.setSubString(subString);
        manipulator.setWordToAdd(wordToAdd);

        // Procesarea și afișarea rezultatelor
        manipulator.processText();
    }

    private static String readUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
