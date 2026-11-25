package funcionamientoOperaciones;

public class Division extends OperacionMatematica{

    public Division(double num1,double num2){
        super(num1,num2);
    }

    @Override

    public double calcular() throws ArithmeticException{
        if(getNum2()==0){
            throw new ArithmeticException("No se puede dividir entre cero");
        }
            return getNum1() / getNum2();

    }
}
