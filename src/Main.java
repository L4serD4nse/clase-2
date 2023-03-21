public class Main {
    public static void main(String[] args) {
        int numeroinicio= 2;
        int numerofin= 12;
        boolean pares=true;

        while(numeroinicio<= numerofin){
            if(numeroinicio % 2 ==0 && pares) {
                System.out.println(numeroinicio);
            }
            if(numeroinicio % 2== 1 && !pares){
                System.out.println(numeroinicio+1);
            }
            numeroinicio++;
            }
        }
    }
