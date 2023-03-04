package com.syntax.review10;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        // Set is a collection of unique Elements
        Set<String> qaJobs = new HashSet<>();   // qajobs here is a hash set
                                                // does not maintain the insertion order

        // adding object/elements to the collection
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("Api Tester");
        qaJobs.add("Database Tester");




        System.out.println(qaJobs);
        qaJobs.remove("Manual Tester");
        System.out.println(qaJobs);

        qaJobs.add("Api Tester");
        qaJobs.add("Api Tester");

        System.out.println("Added duplicates " + qaJobs);

        // creating an Object and passing collection as a parameter to invoke paramaterized constructor
        Set <String>lset = new LinkedHashSet<>(qaJobs);

        System.out.println("LinkedHashset ="+lset); // linkedHashset maintains the insertion order

        Set<String> tSet = new TreeSet<>();

        tSet.addAll(qaJobs);


        System.out.println("TreeSet = "+tSet);







    }
}
