package com.techlabs.composite.app;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IDriveComposite {
	private String name;
	private List<IDriveComposite> composite = new ArrayList<IDriveComposite>();

	@Override
	public void display() {
		for (IDriveComposite comp : composite) {
			comp.display();

		}
		System.out.println(" "   +     name);
		System.out.println("    ");

	}

	public void add(IDriveComposite comp) {
		composite.add(comp);
	}

	public Folder(String name) {
		this.name = name;

	}

}
