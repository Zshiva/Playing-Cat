public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temp){
        if(!summer && (temp>=25 && temp <=35 )){
            System.out.println("The cat is playing");
            return true;
        }else if(summer && (temp>=25 && temp <=45 )){
            System.out.println("the cat is playing");
            return true;
        }else{
            System.out.println("The cat is not playing");
            return false;
        }
    }
    public static void main(String[] args) {
        isCatPlaying(true, 10);
        isCatPlaying(false, 35);
        isCatPlaying(true, 45);
    }
}