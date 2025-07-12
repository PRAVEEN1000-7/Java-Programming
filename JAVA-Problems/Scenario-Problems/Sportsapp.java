/*  Q : an array consists of 5 players score. find the player number & score who got maximum score.
    T : O(n)
    S : O(n)    */

public class Sportsapp {
    
    public static void main(String[] args) {
        
        int score[] = {90,70,97,89,87};
        int max =score[0];
        int index=0;
        for(int i=0;i<score.length;i++){
            if(score[i]>max){
                max=score[i];
                index = i;
            }
        }
        System.out.println("Player No. : "+(index+1));
        System.out.println("Player score : "+max);

    }
}
