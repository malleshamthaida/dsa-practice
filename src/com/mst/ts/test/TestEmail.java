package com.mst.ts.test;

import java.util.HashSet;
import java.util.Set;

public class TestEmail {
    public static void main(String[] args) {
        String email[] = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        System.out.println(numUniqueEmails(email));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<>();
        for (String email : emails) {
            emailSet.add(cleanEMail(email));
        }
        return emailSet.size();
    }


    public static String cleanEMail(String email) {
        String[] nameDomain = email.split("@");
        String localName = nameDomain[0];
        String domain = nameDomain[1];
        localName = localName.split("\\+")[0];
        localName = localName.replaceAll("\\.", "");

        return localName + "@" + domain;


    }
}

