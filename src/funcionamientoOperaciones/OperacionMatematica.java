package funcionamientoOperaciones;


public abstract class OperacionMatematica {


     //Atributos
     private double num1;
     private double num2;

     public double getNum1() {
          return num1;
     }

     public double getNum2() {
          return num2;
     }

     public OperacionMatematica (double num1, double num2){
          this.num1=num1;
          this.num2=num2;
     }

     public abstract  double calcular();
     public void mostrar(){
          System.out.println("Resultado" + calcular()                 );
     }

      }
