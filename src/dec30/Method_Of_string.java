package dec30;

public class Method_Of_string
{
    public static void main(String[] args)
    {
      String str="Month is the Feb";
        System.out.println(str);
        // find the length of the string
        System.out.println("length of string is:"+str.length());
        //Return character at index
        System.out.println("index no at 3 rd:"+str.charAt(3));
        //Return the substring from the i th index no in string upto end
        System.out.println("substring of sentence from h:"+str.substring(5));
        //Return subsring from i to j-1 index
        System.out.println("substring :"+str.substring(2,10));
        // concat string
         String s1= "hi", s2=" how are you";
       // System.out.println("concat of string:"+s1.concat(s2));
        System.out.println("concat of string:"+s1+s2);
        //Return the index of first occupied string
        System.out.println("index of the is :"+str.indexOf("the"));
        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of t = " +
                str.indexOf('t',1));
        // convert to upper case
        System.out.println("change to upper case:"+str.toLowerCase());
        // trim the word
         String word=" letter is good ";
        System.out.println("trimming the word:"+word.trim());
        // Replacing characters
          String rep="feek for feekers";
        System.out.println(rep);
        String rep2=rep.replace('f','g');
        System.out.println("replace word after f to g:"+rep2);
        // equaltiy of string
          String S1="Hello", S2="hello" , S3="Hello";
        System.out.println("s1  not equal to s2:"+S1.equals(s2));
        System.out.println("s1 equal to s3:"+S1.equals(S3));
        // equal ignore case
    System.out.println("s1 equal to s2:"+S1.equalsIgnoreCase(S2));
    }

}
