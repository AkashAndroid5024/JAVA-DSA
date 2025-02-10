import java.io.*;
import java.util.*;

// Interface declarations
interface OnlineAccount {
    int basePrice = 120; // Assuming a base price for all accounts
    int regularMoviePrice = 45; // Price for regular movies
    int exclusiveMoviePrice = 80; // Price for exclusive movies
}

class Account implements OnlineAccount, Comparable<Account> {
    int noOfRegularMovies, noOfExclusiveMovies;
    String ownerName;

    // 1) Parameterized constructor to initialize attributes
    public Account(String ownerName, int noOfRegularMovies, int noOfExclusiveMovies) {
        this.ownerName = ownerName;
        this.noOfRegularMovies = noOfRegularMovies;
        this.noOfExclusiveMovies = noOfExclusiveMovies;
    }

    // 2) This method calculates and returns the monthly cost for the account
    public int monthlyCost() {
        return basePrice + (noOfRegularMovies * regularMoviePrice) + (noOfExclusiveMovies * exclusiveMoviePrice);
    }

    // 3) Override the compareTo method to compare accounts based on their monthly cost
    @Override
    public int compareTo(Account other) {
        return Integer.compare(this.monthlyCost(), other.monthlyCost());
    }

    // 4) toString() method to return the formatted account details
    @Override
    public String toString() {
        return "Owner is " + ownerName + " and monthly cost is " + monthlyCost() + " USD.";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // Number of accounts

        // List to store all the accounts
        List<Account> accounts = new ArrayList<>();

        // Reading account details and creating Account objects
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String ownerName = input[0];
            int noOfRegularMovies = Integer.parseInt(input[1]);
            int noOfExclusiveMovies = Integer.parseInt(input[2]);

            accounts.add(new Account(ownerName, noOfRegularMovies, noOfExclusiveMovies));
        }

        // Finding the account with the highest monthly cost
        Account mostValuableAccount = Collections.max(accounts);

        // Printing the most valuable account details
        System.out.println("Most valuable account details:");
        System.out.println(mostValuableAccount);
    }
}
