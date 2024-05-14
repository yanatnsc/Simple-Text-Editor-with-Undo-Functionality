//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TextEditor te = new TextEditor();
        te.addCharacter('H'); //H
        te.addCharacter('x'); //Hx
        te.undo(); //H
        te.addCharacter('!'); //H!
        te.deleteCharacter(); //H
        te.undo(); //H!
        te.undo(); //H
        te.undo(); //""
        te.undo(); //"No action to undo"
        te.deleteCharacter(); //"String is empty"
        te.addCharacter('H'); //H
        te.addCharacter('i'); //Hi
    }
}
