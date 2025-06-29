public class temp1{
    public static void main (String[] args){
        String text = "Java is simple Java is robust and Java is secure";
        String wordToFind ="Java";
        int totalCount = 0;

        String[] words = text.split(" ");

        for(String word : words){
            int countInword = 0;
                int index = word.indexOf(wordToFind);

                while (index !=-1){
                    countInword++;
                    index = word.indexOf(wordToFind, index + wordToFind.length());
                }
                if (countInword>0){
                    System.out.println(" "+word+ " contains " +wordToFind+ " " +countInword+ "time(s)"); 
                    totalCount += countInword;
                }
            }
        
        System.out.println("Total occurances of " + wordToFind + "in all words" + totalCount);
    }

}