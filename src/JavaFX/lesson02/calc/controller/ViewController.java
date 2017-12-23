package JavaFX.lesson02.calc.controller;

import JavaFX.lesson02.calc.model.CalcCPU;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;





public class ViewController {
    private CalcCPU cpu;

    @FXML private TextField fieldA;
    @FXML private TextField fieldB;
    @FXML private TextField fieldResult;

    @FXML
    private void initialize() {
        cpu = new CalcCPU();

    }
    @FXML
    private void add() {
        cpu.setA(Integer.parseInt(fieldA.getText()));
        cpu.setB(Integer.parseInt(fieldA.getText()));
        cpu.setOperator("+");
        fieldResult.setText(Integer.toString(cpu.calculate()));
    }
    @FXML
    private void sub() {
        cpu.setA(Integer.parseInt(fieldA.getText()));
        cpu.setB(Integer.parseInt(fieldA.getText()));
        cpu.setOperator("-");
        fieldResult.setText(Integer.toString(cpu.calculate()));
    }
    @FXML
    private void mul() {
        cpu.setA(Integer.parseInt(fieldA.getText()));
        cpu.setB(Integer.parseInt(fieldA.getText()));
        cpu.setOperator("/");
        fieldResult.setText(Integer.toString(cpu.calculate()));
    }
    @FXML
    private void div() {
        cpu.setA(Integer.parseInt(fieldA.getText()));
        cpu.setB(Integer.parseInt(fieldA.getText()));
        cpu.setOperator("/");
        fieldResult.setText(Integer.toString(cpu.calculate()));
    }

}
