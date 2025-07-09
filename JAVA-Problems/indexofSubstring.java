class indexofSubstring {
    static int subStringIndex(String str){
        int index = str.indexOf("to");
        return index;
    }
    public static void main(String[] args) {

        String str = "Hello to all";
            
        System.out.println(subStringIndex(str));
    }
}