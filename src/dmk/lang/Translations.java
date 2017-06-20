/*
 * The MIT License
 *
 * Copyright 2017 Denis Karev.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package dmk.lang;

import dmk.ui.*;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.lang.NullPointerException;
/**
 *
 * @author Денис
 */
public class Translations {
    //Main.java
    public static String CHOOSE_FILE;
    public static String INPUT;
    public static String OUTPUT;
    public static String CLEAR;
    public static String CREDITS;
    public static String EXIT;
    public static String SETTINGS;
    public static String TOOLTIP_INPUT_FIELD;
    public static String TOOLTIP_OUTPUT_FIELD;
    public static String BORDER_INPUT_TEXT;
    public static String BORDER_OUTPUT_TEXT;
    public static String BORDER_MENU_TEXT;
    //Settings.java
    public static String BORDER_LANGUAGE_TEXT;
    public static String SAVE;
    
    static String transLine; 
    public static String[] linesAsArray = new String[17];
    
    static int x;
    
    public static void setTranslations() {
        try (BufferedReader reader = new BufferedReader(new FileReader(Lang.langFile))) {
            List<String> lines; //здесь и далее просто пихаем строки в список
            lines = new ArrayList<>();
            while (!"#end#".equals(transLine = reader.readLine())) {
                lines.add(transLine);
                x++;
            }
            linesAsArray = lines.toArray(new String[lines.size()]);
            
            CHOOSE_FILE = linesAsArray[3];
            INPUT = linesAsArray[4];
            OUTPUT = linesAsArray[5];
            CLEAR = linesAsArray[6];
            CREDITS = linesAsArray[7];
            EXIT = linesAsArray[8];
            SETTINGS = linesAsArray[9];
            TOOLTIP_INPUT_FIELD = linesAsArray[10];
            TOOLTIP_OUTPUT_FIELD = linesAsArray[11];
            BORDER_INPUT_TEXT = linesAsArray[12];
            BORDER_OUTPUT_TEXT = linesAsArray[13];
            BORDER_MENU_TEXT = linesAsArray[14]; 
            BORDER_LANGUAGE_TEXT = linesAsArray[15];
            SAVE = linesAsArray[16];
            
        } catch (IOException ex2) {
            System.out.println(ex2.getMessage());
        }
    }
}