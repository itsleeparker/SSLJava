//WAP TO IMPLEMENT SINGLY LINKED LIST AND MAKE IT GENERIC ENOUGH FOR ANY DATA TYPE

import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Integer> List  =  new LinkedList<>();

        //Data insertion into the list
        List.Insert(1);
        List.Insert(2);
        List.Insert(3);
        List.Insert(5);

        System.out.println("The data in linked list is as follow : ");
        List.Display();

        //Delete the data from List
        System.out.println("List after deleted list");
        List.Delete();
        List.Display();
    }
}