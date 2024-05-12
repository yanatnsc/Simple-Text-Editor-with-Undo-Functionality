import java.util.Stack;

public class TextEditor {
    private String string = "";
    private Stack<TextOperation> stack = new Stack<TextOperation>();

    public void addCharacter(char character) {
        string += character;
        stack.push(new TextOperation("Add", character));
        System.out.println("String after adding the new character: " + string);
    }

    public void deleteCharacter() {
        if (!string.isEmpty()) {
            char deletedChar = string.charAt(string.length() - 1);
            string = string.substring(0, string.length() - 1);
            stack.push(new TextOperation("Delete", deletedChar));
            System.out.println("String after deleting the last character: " + string);
        }
        else {
            System.out.println("String is empty");
        }
    }

    public void undo() {
        if (!stack.isEmpty()) {
            TextOperation lastOperation = stack.pop();
            if (lastOperation.type.equals("Add")) {
                string = string.substring(0, string.length() - 1);
            } else if (lastOperation.type.equals("Delete")) {
                string += lastOperation.character;
            }
            System.out.println("Updated string after undoing the last step: " + string);
        }
        else {
            System.out.println("No action to undo");
        }
    }
}
