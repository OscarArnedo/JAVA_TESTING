public class calculadora {

    private double x,y;
    private String simbolo;

    public calculadora(double x, double y, String simbolo){
        this.x=x;
        this.y=y;
        this.simbolo=simbolo;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }


    public double calcular(){
        if(this.simbolo.equals("suma")){
            return suma();
        }else if(this.simbolo.equals("resta")){
            return resta();
        }else if(this.simbolo.equals("multiplicacion")){
            return multiplicacio();
        }else if(this.simbolo.equals("division")){
            return division();
        }

        return 0;
    }

    public double suma(){
        return x + y;
    }

    public double resta(){
        return x - y;
    }

    public double multiplicacio(){
        return x * y;
    }

    public double division(){
        return x / y;
    }

}