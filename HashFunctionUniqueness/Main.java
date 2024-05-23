public class Main {
    /**
     * Given the following parameters:
     *
     * 1. A high and low boundary, each a 4-digit integer.
     * 2. A certain number of items, each with a unique ID that falls within the range defined by the high and low boundaries.
     * 3. N buckets (array indices).
     * 4. A hashing function h(k) where k is a 4-digit number ABCD and h(k) = AB + CD, with AB and CD being the two-digit segments formed from the 4-digit number k.
     *
     * How many unique buckets can we hash to using this hashing function?
     */

     public static void main(String[] args) {
        final int LOW_BOUNDARY = 1000;
        final int HI_BOUNDARY = 9999;
        final int N_BUCKETS = 200;

        // use an array of size N to count frequencies we "hit" the spot
        // find num non-zero hashed buckets

        int[] counts = new int[N_BUCKETS];
        for(int k = LOW_BOUNDARY; k <= HI_BOUNDARY; k++){
            int hashIndex = hashFunc(k);
            counts[hashIndex]++;
        }
        int spaces = numHashedSpaces(counts);
        System.out.println("# of keys tested: " + (HI_BOUNDARY - LOW_BOUNDARY + 1));
        System.out.println("Uniquely Hashed #s: " + spaces);
        System.out.println("Unused Indices: " + (N_BUCKETS - spaces));
        System.out.println("Indices and Frequencies");
        printTable(counts);

     }

     public static int hashFunc(int k) {
        // can change this hash function as much as you want 
        // and look for other cool patterns!
        int bottomTwo = k % 100;
        int topTwo = k / 100;
        return bottomTwo + topTwo;
     }

     public static int numHashedSpaces(int[] freqs) {
        int count = 0;
        for(int i : freqs) {
            if( i > 0) {
                count++;
            }
        }
        return count;
     }

     public static void printTable(int [] freqs) {
        System.out.printf("%7s %7s%n", "Index", "Freq");
        System.out.printf("------- -------%n");
        for(int i = 0; i < freqs.length; i++) {
            System.out.printf("%7d %7d%n", i, freqs[i]);
        }
     }
}