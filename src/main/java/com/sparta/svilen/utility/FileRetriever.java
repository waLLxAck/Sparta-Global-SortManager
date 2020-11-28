package com.sparta.svilen.utility;

import java.io.File;

public class FileRetriever {

    public static String getFileString() {
        StringBuilder fileNameString = new StringBuilder();
        String[] fileList = getFileList();

        for (String fileName : fileList) {
            addFileName(fileNameString, fileName);
        }

        return fileNameString.toString();
    }

    private static void addFileName(StringBuilder fileNameString, String fileName) {
        fileNameString
                .append("\n")
                .append(fileName, 0 , fileName.length() - 5);
    }

    private static String[] getFileList() {
        File file = new File("src/main/java/com/sparta/svilen/sorting_algorithms");
        return file.list();
    }
}
