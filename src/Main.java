import calc.calculator;
import editor.edit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double result = calculator.add(5,5);
        System.out.println(edit.editor(result));
        result =calculator.div(5,5);
        System.out.println(edit.editor(result));
        result=calculator.sub(5,5);
        System.out.println(edit.editor(result));
        result=calculator.mul(5,5);
        System.out.println(edit.editor(result));

    }
}