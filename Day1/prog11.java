public class prog11{
    public static void main(String[] args) {
        int youngerBrotherAgeNow = 24;
        int ageDifference = 28 - youngerBrotherAgeNow;
        
        // Calculate older brother's age when he is 56
        int olderBrotherAgeAt56 = 56 + ageDifference;
        System.out.println("The older brother's age when he is 56: " + olderBrotherAgeAt56);
        
        // Calculate age difference between older and younger brother
        if (ageDifference > 3) {
            int youngerBrotherAgeAt5 = youngerBrotherAgeNow - ageDifference;
            System.out.println("The age of the younger brother when the older brother was 5: " + youngerBrotherAgeAt5);
        }
    }
}
