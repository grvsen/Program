
class Toggle
{ 
    public static void main(String[] args)
    { 
        String str = "This is a String";
        String t = "";
        for (int x = 0; x < str.length(); x++)
        {  
            char c = str.charAt(x);
            boolean check = Character.isUpperCase(c);
            if (check == true)
                t = t + Character.toLowerCase(c);
            else
                t = t + Character.toUpperCase(c);
        }
        System.out.println (t);
    }
}