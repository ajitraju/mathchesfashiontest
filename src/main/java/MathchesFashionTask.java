import java.util.List;

public class MathchesFashionTask {
    public static void main(String[] args) {
        String input1 = "In a village of La Mancha, the name of which I have\n" +
                "no desire to call to\n" +
                "mind, there lived not long since one of those gentlemen that keep a lance\n" +
                "in the lance-rack, an old buckler, a lean hack, and a greyhound for\n" +
                "coursing. An olla of rather more beef than mutton, a salad on most\n" +
                "nights, scraps on Saturdays, lentils on Fridays, and a pigeon's pigeon's or so extra\n" +
                "on Sundays, made away with three-quarters of his income";

        System.out.println("Input 1 ---------- " + input1);
        List<String> finalWords = WordParser.parseForMaxWordCount(input1);
        System.out.println("output for Input 1 ---------- " + finalWords);

        String input2 = "e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e";
        System.out.println("Input 2 ---------- " + input2);
        finalWords = WordParser.parseForMaxWordCount(input2);
        System.out.println("output for Input 2 ---------- " + finalWords);

        String input3 = " //wont won't won't";
        System.out.println("Input 3 ---------- " + input3);
        finalWords = WordParser.parseForMaxWordCount(input3);
        System.out.println("output for Input 3 ---------- " + finalWords);

        String input4 = " ";
        System.out.println("Input 4 ---------- " + input4);
        finalWords = WordParser.parseForMaxWordCount(input4);
        System.out.println("output for Input 4 ---------- " + finalWords);

        System.out.println("End of the execution");
    }
}
