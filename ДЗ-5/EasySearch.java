package WarAndPeace;

public class EasySearch implements ISearchEngine{

    @Override
    public int search(String arrayText, String word) {

        String lowerCaseTextString = arrayText.toLowerCase();
        String lowerCaseWord = word.toLowerCase();

        int index = 0;
        int symbols = 0;
        while(index != -1){
            index = lowerCaseTextString.indexOf(lowerCaseWord, index);
            if (index != -1) {

                index++;
                symbols++;
            }
        }
        return symbols;
    }
}
