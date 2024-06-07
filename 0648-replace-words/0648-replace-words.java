class Solution {
    public String checkWord(String word, List<String> dictionary){
        //boolean flag=false;
        String minWord = word;
        int minLen = word.length();
        for(int i=0;i<dictionary.size();i++){
            String currWord = dictionary.get(i);
            if (word.startsWith(currWord)){
                int currLen = currWord.length();
                if(currLen<minLen){
                    minWord = currWord;
                    minLen = currLen;
                }
            }
        }
        return minWord;
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        String word="";
        String ansString = "";
        for(int i=0; i<=sentence.length(); i++){
            if(i==sentence.length()){
                ansString = ansString.concat(checkWord(word,dictionary));
                word="";
            }else if (sentence.charAt(i)==' '){
                ansString = ansString.concat(checkWord(word,dictionary));
                ansString+=' ';
                word="";
            }else{
                word+=sentence.charAt(i);
            }
        }
        return ansString;
    }
}