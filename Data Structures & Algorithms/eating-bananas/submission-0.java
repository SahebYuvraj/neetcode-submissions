class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // new approach we are checking between [1 , max(piles)]
        // so take a number and do n checks hence n logn

        int min_speed = 1;
        int max_speed = 0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max_speed){max_speed = piles[i];}
        }
        System.out.println(max_speed);
        // now we check between the limit
        while(min_speed<max_speed){
            int speed = (min_speed+max_speed)/2;
            int count = 0;
            for(int j=0;j<piles.length;j++){
                count += Math.ceil((piles[j]+speed-1)/speed);
            }
            System.out.println(count);

            if(count > h){min_speed = speed + 1;}
            if(count <= h){max_speed = speed;}
            
        }
        return max_speed;
    }
}
