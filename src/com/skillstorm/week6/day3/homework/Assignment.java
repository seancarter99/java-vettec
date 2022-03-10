package com.skillstorm.week6.day3.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Assignment {

	public static HashMap<String, Integer> countWordsInFile(String filePath) {
		HashMap<String, Integer> wordCount = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line = reader.readLine();
			while (line != null) {
				String[] words = line.replaceAll("[^\\w\\s]", "").split(" ");
				for (int i = 0; i < words.length; i++) {
					String word = words[i].toLowerCase();
					if (word.length() != 0) {
						wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
					}
				}
				line = reader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return wordCount;
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> longFileWordCount = countWordsInFile("C://Users//Sean Carter//Desktop//longFile.txt");
		System.out.println(longFileWordCount);
		
		HashMap<String, Integer> sampleFileWordCount = countWordsInFile("C://Users//Sean Carter//Desktop//sampleText.txt");
		System.out.println(sampleFileWordCount);
		
		HashMap<String, Integer> beeMovieWordCount = countWordsInFile("C://Users//Sean Carter//Desktop//beeMovie.txt");
		System.out.println(beeMovieWordCount);
		
		String maxWord = null;
		int maxCount = 0;
		for (String word : beeMovieWordCount.keySet()) {
			int wordCount = beeMovieWordCount.get(word);
			if (maxCount < wordCount) {
				maxWord = word;
				maxCount = wordCount;
			}
			
		}
		
		System.out.println("The max word is: " + maxWord);
		System.out.println("The number of times it appeared is: " + beeMovieWordCount.get(maxWord));
	}

}
