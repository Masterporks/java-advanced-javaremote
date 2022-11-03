package org.sda;

import org.sda.generics.*;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    // @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // GENERIC TYPE
        Fruit fruit = new Fruit();
        fruit.setName("Apple");
        fruit.setColor("Green");
        fruit.setPrice(BigDecimal.valueOf(1.99)); // converting a double to BigDecimal
        GenericFood<Fruit> genericFoodWithFruit = new GenericFood<>(fruit);
        System.out.println(genericFoodWithFruit.getItem());

        String str = "Eminem is awesome";
        GenericFood<String> genericFoodWithString = new GenericFood<>(str);
        System.out.println(genericFoodWithString.getItem());

        genericFoodWithString.setItem("I am a good person");
        System.out.println(genericFoodWithString.getItem());
        //GENERIC TYPE EXTENDS

        Vegetable vegetable = new Vegetable();
        GenericExtendFood<Vegetable> vegetableGenericExtendFood = new GenericExtendFood<>(vegetable);
        System.out.println(vegetableGenericExtendFood.getRating());

        // GENERIC TYPE INTERFACE
        Snack snack1 = new Snack(5);
        Snack snack2 = new Snack(2);
        System.out.println("Snack 1 is better than Snack 2: " + snack1.isBetter(snack2));

        List<String> animalList = new ArrayList<>();
        animalList.add("Lion"); // 0
        animalList.add("Tiger"); // 1
        animalList.add("Cow"); // 2
        animalList.add("Cat");
        animalList.add("Bear");
        animalList.add("Panda");
        System.out.println(animalList.get(1)); // prints Tiger

        animalList.remove(1); // tiger will be deleted
        animalList.remove("Cow");


        for (String animal: animalList){
            System.out.println(animal);
        }
        Iterator<String> stringIterator = animalList.listIterator();

        while(stringIterator.hasNext()){
            System.out.println(stringIterator.next() + " , ");
        }
        // List of items to be removed
        List<String> removeAnimalList = new ArrayList<>();
        removeAnimalList.add("Cat");
        removeAnimalList.add("Panda");

        animalList.removeAll(removeAnimalList);
        // Final Removed list
        for (String animal: animalList){
            System.out.println(animal);
        }

        //SET
        Set<String> countrySet = new HashSet<>(); // --non sorted, randomly stored
        countrySet.add("Eesti");
        countrySet.add("Saksamaa");
        countrySet.add("Poola");
        countrySet.add("Rootsi");
        // countrySet.add("Eesti"); --> duplicates not allowed


        for(String country: countrySet){
            System.out.println(country);
        }
        System.out.println("Before" + countrySet);
        TreeSet<String> countryTreeSet = new TreeSet<>(countrySet);  //  Sorted , alphabetically stored
        System.out.println("After sorting" + countryTreeSet);

        //MAPS
        Map<String,String> fullName = new HashMap<>();  // not sorted as sorted
                    //Key  vs   Value
        fullName.put("Valdur","Ratas");
        fullName.put("Elmar", "Vinkel");
        fullName.put("Anton", "Burger");
        System.out.println(fullName);

        System.out.println(fullName.get("Anton"));
        System.out.println(fullName.remove("Elmar"));
        System.out.println(fullName);

        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Venno Lootsik",44);
        ageMap.put("Viljar Kummivilin", 20);
        ageMap.put("Siim Prill", 89);

        Map<String, List<String>> friendsMaps = new HashMap<>();

        List<String> JoosepFriendList = List.of("Martin","Priit", "Taavi");
        List<String> MihkelFriendList = List.of("Martin","Priit", "Taavi");
        List<String> PilleFriendList = List.of("Martin","Priit", "Taavi");
        friendsMaps.put("Joosep",JoosepFriendList);
        friendsMaps.put("Mihkel",MihkelFriendList);
        friendsMaps.put("Pille",PilleFriendList);

        Map<String,Map<String,String>> detailsMap = new HashMap<>();
        Map<String,String> joosepdetails = new HashMap<>();
        joosepdetails.put("Age", "33");
        joosepdetails.put("ID", "356674774475");
        joosepdetails.put("Phone: ", "+3729484747373");
        joosepdetails.put("Birthplace", "Estonia");
        detailsMap.put("Joosep", joosepdetails);




        // I/O
        File absoluteFile = new File("C:\\Users\\Kasutaja\\IdeaProjects\\java-advanced\\src\\main\\resources\\myText.txt");
        File relativeFile = new File("myText.txt");

        try {
            FileReader fileReader = new FileReader(absoluteFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileLine; // Store the line of text from the file
            while((fileLine = bufferedReader.readLine()) != null){
                System.out.println(fileLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // File writing
        try {
            FileWriter fileWriter = new FileWriter(absoluteFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String fileLine =  "\\n I can Write an error less Java code:D ";
            bufferedWriter.write(fileLine);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}