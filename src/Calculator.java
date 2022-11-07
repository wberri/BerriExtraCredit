import java.text.DecimalFormat;
public class Calculator {

    DecimalFormat df = new DecimalFormat(".000");

    private String userInput;

    public Calculator(String userInput){
        this.userInput = userInput;
    }

    public String operator(){
        return (userInput.substring(userInput.indexOf(" ")+1, userInput.indexOf(" ")+2));
    }

    public double first(){
        return (Double.parseDouble(userInput.substring(0,userInput.indexOf(" "))));
    }

    public double second(){
        return Double.parseDouble(userInput.substring(userInput.indexOf(" ")+3));
    }

    public double evaluate(){
        double evaluate;
        String operator = operator();
        if (operator.equals("+")){
            evaluate = add();
        } else if(operator.equals("-")){
            evaluate = subtract();
        } else if (operator.equals("/")){
            evaluate = divide();
        } else if (operator.equals("*")){
            evaluate = multiply();
        } else if (operator.equals("%")){
            evaluate = mod();
        } else {
            evaluate = exponent();
        }
        return evaluate;
    }

    public void printFinalDoubleOrInt(){
        if (evaluate()%1==0){
            System.out.println((int)evaluate());
        } else{
            double evaluate = evaluate();
            System.out.println((Math.round(evaluate*100000.0))/100000.0);
        }
    }

    public double multiply(){
        return first()*second();
    }

    public double divide(){
        return first()/second();
    }

    public double add(){
        return first()+second();
    }

    public double subtract(){
        return first()-second();
    }

    public double mod(){
        return first()%second();
    }

    public double exponent(){
        return Math.pow(first(), second());
    }
}
