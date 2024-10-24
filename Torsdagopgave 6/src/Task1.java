package Codeflow_TASK1;

public class Flows {

    public String methodA (){
        return "J";
    }

    public String methodB (){
        return "A";
    }

    public String methodC (){
        return "V";
    }

    public String methodD (){
        return "A";
    }
    public String methodE (){
        return " E";
    }

    public String methodF (){
        return "R";
    }

    public String methodG (){
        return " S";
    }

    public String methodH (){
        return "J";
    }
    public String methodI (){
        return "O";
    }

    public String methodJ (){
        return "V";
    }

    public String methodK (){
        return "T";
    }
    public String lettersConnected (){
        return methodA() + methodB() + methodC() + methodD() + methodE()
                + methodF() + methodG() + methodH() + methodI() + methodJ() + methodK();
    }


}
package Codeflow_TASK1;

public class Main {
    public static void main(String[] args) {
        Flows flow = new Flows();
        System.out.println(flow.lettersConnected());



    }




}