package com.company.buildingstrings;


import com.company.buildingstrings.entities.Comment;
import com.company.buildingstrings.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
//        DATE FORMAT EXAMPLE
//        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        Date y2 = sdf2.parse("25/06/2018 15:42:07");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

//        Traveling to New Zealand
//        12 Likes - 21/06/2018 13:05:44
//        I'm going to visit this wonderful country!
//        Comments:
//        Have a nice trip
//        Wow that's awesome!

        Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
        post1.addComment(new Comment("Have a nice trip"));
        post1.addComment(new Comment("Wow that's awesome!"));

//        Good night guys
//        5 Likes - 28/07/2018 23:14:19
//        See you tomorrow
//        Comments:
//        Good night
//        May the Force be with you

        Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
        post2.addComment(new Comment("Good night"));
        post2.addComment(new Comment("May the Force be with you"));

        System.out.println(post1);
        System.out.println(post2);
    }
}
