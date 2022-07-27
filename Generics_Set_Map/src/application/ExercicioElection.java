package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioElection {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votes = new LinkedHashMap<>();
        
        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null){

                String[] fields = line.split(",");
                String name = fields[0];
                int voteCount = Integer.parseInt(fields[1]);

                if(votes.containsKey(name)){
                    int votesSoFar = votes.get(name);
                    votes.put(name, voteCount + votesSoFar);
                }
                else{
                    votes.put(name, voteCount);
                }

                line = br.readLine();
            }

            for(String key : votes.keySet()){
                System.out.println(key + ": " + votes.get(key));
            }

        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    } 
}
