package com.practicedemo;

public class LetterCount {

	public static void main(String[] args) {

		String q = "My@name@is@Shujon@My";
		String[] w = q.split("@");
		int xx = 0;

		for (String bb : w) {
			if (w.equals("My")) {
				xx++;
				System.out.println(xx+"="+ bb);
			}

		}

	}

}
