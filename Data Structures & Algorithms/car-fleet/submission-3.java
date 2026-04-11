class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int length = position.length;

        double[][] pair = new double[length][2];

        for (int i=0;i<length;i++){
            pair[i][0] = position[i];
            pair[i][1] = (double)(target - position[i])/speed[i];
        }
        Arrays.sort(pair, (a,b)-> Double.compare(b[0],a[0]));
        Stack<Double> fleet = new Stack<>();
        
        for(int i = 0;i<length;i++){
            double steps = pair[i][1];
            System.out.println(steps);

            if(fleet.isEmpty() || steps > fleet.peek()){
                fleet.push(steps);
            }

        }

        return fleet.size();

    }
}
