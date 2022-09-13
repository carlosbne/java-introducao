
public class LacosNumericos {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int number = 10;

        for(int i = 1; i <= number; i++){
            for(int j = 1; j < number ; j++){
                System.out.printf("| %d * %d = %d |\n", j, i, j * i);
            }
        }
    }
}
