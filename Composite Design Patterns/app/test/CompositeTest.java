package com.techlabs.composite.app.test;

import com.techlabs.composite.app.File;
import com.techlabs.composite.app.Folder;
import com.techlabs.composite.app.IDriveComposite;

public class CompositeTest {

	public static void main(String[] args) {
		IDriveComposite movies = new Folder("Movie");

		movies.display();
		Folder hindiMovie = new Folder("abcd");
		hindiMovie.display();
		hindiMovie.add(new File("ADHM","MP4"));
		hindiMovie.display();
		System.out.println(" This Folder is empty.........");
	}
}
