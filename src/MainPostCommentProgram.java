import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainPostCommentProgram {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("How that's awesome!");

            Post post1 = new Post(
                    sdf.parse("21/06/20218 13:05:04"),
                    "Traveling to New Zealand",
                    "I'm going to visit ths wonderful country!",
                    12);

        post1.addComments(c1);
        post1.addComments(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

            Post post2 = new Post(
                    sdf.parse("28/07/2018 23:14:19"),
                    "Good night guys",
                    "See you tomorrow",
                    5);

        post2.addComments(c3);
        post2.addComments(c4);

        System.out.println(post1);
        System.out.println(post2);
    }
}
