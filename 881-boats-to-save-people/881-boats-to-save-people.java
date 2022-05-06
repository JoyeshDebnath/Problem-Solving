class Solution {

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int heaviest = people.length-1;
        int lightest = 0;
        int counter = 0;
        while (lightest < heaviest) {
            int total = people[heaviest] + people[lightest];
            if ( total <= limit) {
                heaviest--;
                lightest++;
            counter++;
            } else {
                heaviest--;
            counter++;
            }
            
        }
        return (lightest==heaviest)?counter+1:counter;
    }
}
