/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Directory.java
 * Author: Duc Ta
 * Author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

/*
 *
 */
public final class Directory {

    //
    // Static Data Fields
    //

    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public Directory() {

    }
    public String getPath() {
        if (Language.getCurrentLanguage().getLanguage() == Language.getDefaultAlienSound()){
            return Language.getDefaultAlienSound();
        }
        return Config.getDefaultLogDirectoryPath();
    }

    //
    // Static Methods
    //

    //
    // Instance Methods
    //

    //
    // Language
    //

}
