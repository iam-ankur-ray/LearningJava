package org.ray.DataTypes;

public class CharacterType {

    char alphabets = 'a';

    public void printAlphabets() {
        for (int i = 0; i < 26; i++) {
            System.out.println(alphabets);
            alphabets++;
        }
    }

}
