package org.sda;

import org.sda.generics.*;
import org.sda.homework.Person;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {
    // @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

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
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // File writing
        try {
            FileWriter fileWriter = new FileWriter(absoluteFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String fileLine =  "\\n I can Write an error less Java code:D ";
            bufferedWriter.write(fileLine);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Homework (Person comparable)
        Person person1 = new Person(163);
        Person person2 = new Person(178);
        System.out.println("Person 1 is taller than person 2: " + person1.isTaller(person2));
        System.out.println(person1.compareTo(person2));



        //SERIALIZATION

        String fileName = "file.ser";

        try{
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream outputStream = new ObjectOutputStream(file);

            outputStream.writeObject(fruit);
            outputStream.close();
            file.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // DESERIALIZATION

        Fruit deserializedFruit = null;

        try{
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            deserializedFruit = (Fruit) in.readObject();

            in.close();
            file.close();

            System.out.println(deserializedFruit.toString());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        // NEW I/O
        Path absolutePath = Paths.get("C:\\Users\\Kasutaja\\IdeaProjects\\java-advanced\\src\\main\\resources\\myText.txt");
        Path relativePath = Paths.get("myText.txt");

        try{

            // File reading
            List<String> fileLines = Files.readAllLines(absolutePath, StandardCharsets.UTF_8);


            // just to print a file which was read above
            for(String fileLine : fileLines){
                System.out.println(fileLine);
            }

            // File writing
            List<String> fileLinesToWrite = List.of("I Love Java", " Estonia is my country");
            Files.write(absolutePath, fileLinesToWrite, StandardOpenOption.APPEND);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //HOMEWORK
        Path filePath = Paths.get("C:\\Users\\Kasutaja\\IdeaProjects\\java-advanced\\src\\main\\resources\\loremIpsum.txt");
        Path samePath = Paths.get("loremIpsum.txt");

        List<String> loremIpsumLines = Files.readAllLines(absolutePath, StandardCharsets.UTF_8);
        int i;

        //for(i = 0,i < loremIpsumLines.toArray().length, i++)




    }
}