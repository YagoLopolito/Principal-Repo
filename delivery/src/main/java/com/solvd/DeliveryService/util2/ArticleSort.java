package com.solvd.DeliveryService.util2;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArticleSort {
    public static void main(String[] args) throws IOException {

        File article = new File("src/main/resources/TxtHomework.txt");

        FileUtils.write(new File("src/main/resources/SortedArticle.txt"), sorterArticle(article), "UTF-8");
    }

    public static String sorterArticle(File file) throws IOException {

        Map<String, Integer> sortedWords = new HashMap<>();
        String text = FileUtils.readFileToString(file, "UTF-8").toLowerCase();
        Arrays.stream(StringUtils.split(text, ".,+- \n")).forEach((word) -> {
            if (sortedWords.containsKey(word)) sortedWords.replace(word, sortedWords.get(word) + 1);
            else sortedWords.put(word, 1);

        });
        return sortedWords.toString();
    }
}