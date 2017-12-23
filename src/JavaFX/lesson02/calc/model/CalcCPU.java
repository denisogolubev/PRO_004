package JavaFX.lesson02.calc.model;

public class CalcCPU {


    private Integer a;
    private Integer b;
    private String operator;

    public Integer calculate () {
        switch (operator) {
            case "+" : {
                return a + b;
            }
            case "-" : {
                return a - b;
            }
            case "*" : {
                return a * b;
            }
            case "/" : {
                return a / b;
            }
            default:
                throw new RuntimeException();
        }


    }




    public void setA(Integer a) {
        this.a = a;
    }
    public void setB(Integer b) {
        this.b = b;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public String getOperator() {
        return operator;
    }
}
