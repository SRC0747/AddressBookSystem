package com.addressbooksystem;
import java.util.Hashtable;
import java.util.Scanner;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
public class AddressBookSystem {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book System System.");
        personDetail();
        contactNewPerson();
        editContactDetail();
        multiplePersonDetail();
        multiDetailAddressBook();
    }
    public static void personDetail()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        System.out.println("Enter the name of the address:");
        System.out.println("Enter the name of the City:");
        System.out.println("Enter the name of the State:");
        System.out.println("Enter the name of the Contact Number:");
        System.out.println("Enter the name of the email id:");
        String name = sc.nextLine();
        System.out.println("Name of the person is:"+name);
        String address = sc.nextLine();
        System.out.println("Address of the person is:"+address);
        String city = sc.nextLine();
        System.out.println("City of the person is:"+city);
        String state = sc.nextLine();
        System.out.println("State of the person is:"+state);
        int ph_no=sc.nextInt();
        System.out.println("Phone number is:"+ph_no);
        String email_id = sc.nextLine();
        System.out.println("Email id is:"+email_id);
    }

    public static void contactNewPerson()
    {
        Scanner sc=new Scanner(System.in);
        Console c=System.console();
        System.out.println("Enter your name: ");
        String n=c.readLine();
        System.out.println("Welcome "+n);
        System.out.println("Enter your address: ");
        String address=c.readLine();
        System.out.println("Your address is: "+address);
        System.out.println("Enter your state: ");
        String state=c.readLine();
        System.out.println("Your State is: "+state);
        System.out.println("Enter your city: ");
        String city=c.readLine();
        System.out.println("Your city is: "+city);
        int ph_no=sc.nextInt();
        System.out.println("Contact no: is:"+ph_no);
        System.out.println("Enter your email:");
        String email=c.readLine();
        System.out.println("Your email is: "+email);
    }

    public static void editContactDetail()
    {
        System.out.println("After Editing the Existed Contact The list of details are given below:");
        contactNewPerson();
    }

    public static void clearConsole()
    {
        try
        {
            final String name_person = System.getProperty("name_person.name");
            if (name_person.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
        }
        catch (final Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void multiplePersonDetail()
    {
        List<String> langs = new ArrayList<>();

        langs.add("Samppriti");
        langs.add("Santragachi Station");
        langs.add("kolkata");
        langs.add("West Bengal");
        langs.add("96748523145");
        langs.add("sampritirc@hmail.com");

        for (String lang : langs) {

            System.out.printf("%s ", lang);
        }

        System.out.println();
    }

    public static void multiDetailAddressBook()
    {
        // creating a My HashTable Dictionary
        Hashtable<String, String> my_dict = new Hashtable<String, String>();

        // Using a few dictionary Class methods
        // using put method
        my_dict.put("01", "Rakesh Jaiswal");
        my_dict.put("02", "Amhastreet");
        my_dict.put("03", "Kolkata");
        my_dict.put("04", "West Bengal");
        my_dict.put("05", "7859632145");
        my_dict.put("06", "srcrj0747@gmail.com");


        // using get() method
        System.out.println("\nValue at key = 01 : " + my_dict.get("01"));
        System.out.println("Value at key = 02 : " + my_dict.get("02"));
        System.out.println("Value at key = 03 : " + my_dict.get("03"));
        System.out.println("Value at key = 04 : " + my_dict.get("04"));
        System.out.println("Value at key = 05 : " + my_dict.get("05"));
        System.out.println("Value at key = 06 : " + my_dict.get("06"));


        System.out.println("\nSize of my_dict : " + my_dict.size());
    }
}
