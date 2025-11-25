import java.util.*;
public class RPGgame {
    static class Monster {
        int power;
        int bonus;
        Monster(int power, int bonus) {
            this.power = power;
            this.bonus = bonus;
        }
   
}
    public static int maxMonstersDefeated(int[] power, int[] bonus, int exp) {
        int n = power.length;
        Monster[] monsters = new Monster[n];
        for (int i = 0; i < n; i++) {
            monsters[i] = new Monster(power[i], bonus[i]);
        }
        Arrays.sort(monsters, (a,b)-> Integer.compare(a.power, b.power));
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(exp > monsters[i].power) {
                count++;
                exp += monsters[i].bonus;
            }else {
                break;
            }
    }
        return count;
    }
    public static void main(String[] args) {
        int[] power = {78,130,150};
        int[] bonus = {50,30,20};
        int exp = 100;
        int result = maxMonstersDefeated(power, bonus, exp);
        System.out.println("Maximum monsters defeated: " + result);

    }
}
