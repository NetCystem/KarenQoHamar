package com.example.macbookair.demo;

/**
 * Created by macbookair on 12/17/17.
 */

public class Contacts {

    private static int[] images = {R.drawable.martin, R.drawable.yervand, R.drawable.bob, R.drawable.bucky, R.drawable.steve, R.drawable.joney_ive};
    private static String names[] = {"Martin", "Yervand", "Bob", "Bucky", "Steve", "Joney"};
    private static String[] phone_numbers = {"098179899", "094880619", "041179899", "077727088", "098524242", "077587088"};
    private static String[] e_mails = {"mart9899@mail.ru", "yervandalexanyan@gmail.com", "bobhamster@gmail.com", "buckyroberts@gmail.com", "jobs@icloud.com", "joneyive@icloud.com"};

    public static int[] getImages() {
        return images;
    }

    public static String[] getNames() {
        return names;
    }

    public static String[] getPhone_numbers() {
        return phone_numbers;
    }

    public static String[] getE_mails() {
        return e_mails;
    }

}
