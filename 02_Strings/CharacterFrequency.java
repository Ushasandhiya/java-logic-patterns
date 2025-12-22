import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        // Convert to lowercase to avoid case issues
        str = str.toLowerCase();

        // Convert string to char array
        char[] arr = str.toCharArray();

        // Visited array to avoid recounting
        boolean[] visited = new boolean[arr.length];

        // Loop through each character
        for (int i = 0; i < arr.length; i++) {

            // Skip if already counted
            if (visited[i]) {
                continue;
            }

            int count = 1;

            // Count frequency
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            // Print result
            System.out.println(arr[i] + " -> " + count);
        }
    }
}