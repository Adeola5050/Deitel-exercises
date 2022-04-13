package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StringUtils {
private  String string;

public StringUtils(String string){
    this.string=string;
    }
    public int _lastIndexOf(char character){
    int returnIndex=-1;
    for(int i= 0; i < string.length();i++){
        if(string.charAt(i)==character){
            returnIndex=i;
        }
    }
    return returnIndex;
    }

    public int _lastOfIndex(boolean shouldIgnoreCase, char character){

    int _index = -1;
    if(shouldIgnoreCase){
        string = string.toLowerCase();
        character = Character.toLowerCase(character);
        for (int i = 0; i < string.length() ; i++) {
            if (string.charAt(i) == character){
                _index=i;

            }

        }
    }
    else{
        _lastIndexOf(character);
    }
    return _index;
    }
    public int _indexOf(char character){
    int _index = -1;
        for (int i = 0; i < string.length() ; i++) {
            if(string.charAt(i)== character){
                return i;
            }

        }
        return  _index;
    }
    public int _countOf(char character){
    int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == character){
                count++;
            }

        }
        return count;
    }

    public String[] _split(String delimiter){
    if(delimiter.equals("")){
        String[] splitString = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
            splitString[i] = String.valueOf(string.charAt(i));
        }
        return splitString;

    }

    int length = delimiter.length();
    int lastIndex =0;
        List<String> splitString = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if(i+1 - length >= 0){
                String subStringOne = string.substring(lastIndex, i+1);
                if(subStringOne.equals(delimiter)){
                    String subString = string.substring(lastIndex, i+1-length);
                    if(!subString.equals("")){
                        splitString.add(subString);
                    }
                    lastIndex = i+1;
                }
            }

        }
        splitString.add(string.substring(lastIndex));
        String[] splitStringArray = new String[splitString.size()];
        for (int i = 0; i < splitStringArray.length ; i++) {
            splitStringArray[i] = splitString.get(i);

        }
        return  splitStringArray;
    }

}


