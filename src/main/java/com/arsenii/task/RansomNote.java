package com.arsenii.task;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder letters = new StringBuilder(magazine);
        for(int i = 0; i< ransomNote.length(); i++){
            String letter = ransomNote.substring(i, i + 1);
            int index = letters.indexOf(letter);
            if(index != -1){
                letters.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return true;
    }
}
