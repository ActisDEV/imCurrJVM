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

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

/**
 *
 * @author Денис
 */
public class Lang {
    public static String DEFAULT_MESSAGE = "LANGUAGE FILE FOR IMCURRJVM\r\nMADE BY ACTIS\r\n";
    static File langFile;
    public static String langFileID;
    static boolean fileExists;
    public static boolean FileChecker() {
        String langPath = new File("").getAbsolutePath();
        langFileID = langPath.concat("\\lang.txt");
        langFile = new File(langFileID);
        fileExists = langFile.exists();
        return fileExists;
    }
    
    public static void LangFileCreate() {
        try (FileWriter fileWriter = new FileWriter(langFile)) {
            fileWriter.write(DEFAULT_MESSAGE + "#begin#\r\n" + "Choose file\r\n" + "Input\r\n" + "Output\r\n" + "Clear\r\n" + "Credits\r\n" + "Exit\r\n" + "Settings\r\n" + "Input your text here!\r\n" + "Output text will be here!\r\n" + "Text input\r\n" + "Text output\r\n" + "Menu\r\n" + "Language settings\r\n" + "Save\r\n" + "#end#");
        } catch (IOException ex) {
            
        }
    }
}
