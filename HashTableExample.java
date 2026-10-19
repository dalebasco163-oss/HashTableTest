/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhush;

/**
 *
 * @author Student
 */
import java.util.HashMap;

public class HashTableExample{
public static void main (String [] args){
HashMap<String, Integer > hashTable = new HashMap<>();

hashTable.put("Apple", 10);
hashTable.put("Banana", 20);
hashTable.put("Grape", 30);

System.out.println("Apple: " + hashTable.get("Apple"));
System.out.println("Banana: " + hashTable.get("Banana"));

if(hashTable.containsKey("Cherry")){
System.out.println("Cherry: " + hashTable.get("Cherry"));

}else{
System.out.println("Cherry not found!");
}

hashTable.remove("Grape");

System.out.println("Hash Table Contains: " + hashTable);
}
}