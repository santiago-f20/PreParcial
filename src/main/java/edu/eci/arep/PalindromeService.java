package edu.eci.arep;

import static spark.Spark.*;

public class PalindromeService {
    public static void main(String[] args) {
        System.out.println("Starting Palindrome Service");
        port(getPort());
        get("/home", (req, res) -> {
            res.type("application/json");
            return "{\n"
                    + "\"operation\": \"palindromo\", \n"
                    + "\"input\": \"12344321\", \n"
                    + "\"output\": \"Si es palíndromo\"\n"
                    + "}";

        });

    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; // returns default port if heroku-port isn't set (i.e. on localhost)
    }

}
