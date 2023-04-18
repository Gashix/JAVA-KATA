public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            System.out.println("Parmetrs");
            if(i==2)continue;
        }
        for (int i=0; i<3;){
            System.out.println("Body");
            if(i==2)continue;
            i++;
        }
    }

}