import java.util.ArrayList;

public class Meth {
    private static String substringify(String input){
        String ret = new String();
        int last = input.lastIndexOf(" ");

        ret = input.substring(last,input.length());
        return ret;
    }

    private static int compare(String w1, String w2) { //precondition that the two are the same length
        int ret = 0;
        for(int i=0;i<w1.length();i++){
            if(w1.charAt(i) == w2.charAt(i)){
                ret--;
            }
        }
        return ret;
    }

    public static String[] autocomplete(String input){
        String activeWord = substringify(input);
        ArrayList<String> wordList = FileReader.toStringArrayList("1000-common-words.txt");
        int[] choices = {0,0,0};
        String[] ret = new String[3];
        int comp;

        for(int i=0;i<wordList.size();i++){
            if(!(activeWord.length() > wordList.get(i).length())) { //cycles through the entire wordlist to update ranking of word choices and confidence factor
                comp = compare(activeWord, wordList.get(i).substring(0,activeWord.length()));
                for(int j=0;j<choices.length;j++){
                    if(comp<choices[2]){
                        if(comp<choices[1]){
                            if(comp<choices[0]){
                                choices[0]=comp;
                                ret[0] = wordList.get(i);
                                wordList.remove(i);
                            }
                            else {
                                choices[1]=comp;
                                ret[1]=wordList.get(i);
                                wordList.remove(i);
                            }
                        }
                        else {
                            choices[2]=comp;
                            ret[2]=wordList.get(i);
                            wordList.remove(i);
                        }
                    }
                }
            }
        }

        return ret;
    }

    public static String[] spellcheck(String input){ //either shortest word that shares the most letters or just use compareTo()
        String[] ret = new String[3];
        String activeWord = substringify(input);
        String[] wordList = FileReader.toStringArray("1000-common-words.txt");
        int[] leaderboard = {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};

        for(int i=0;i<wordList.length;i++){
            if(activeWord.compareTo(wordList[i])<leaderboard[2]){
                if(activeWord.compareTo(wordList[i])<leaderboard[1]){
                    if(activeWord.compareTo(wordList[i])<leaderboard[0]){
                        leaderboard[0]=activeWord.compareTo(wordList[i]);
                        ret[0]=wordList[i];
                    }
                    else {
                        leaderboard[1]=activeWord.compareTo(wordList[i]);
                        ret[1]=wordList[i];
                    }
                }
                else {
                    leaderboard[2]=activeWord.compareTo(wordList[i]);
                    ret[2]=wordList[i];
                }
            }
        }

        return ret;
    }
}
