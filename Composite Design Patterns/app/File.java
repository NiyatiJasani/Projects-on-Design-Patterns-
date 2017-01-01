package com.techlabs.composite.app;

public class File implements IDriveComposite {
	private String name;
	private String extension;

	@Override
	public void display() {
		System.out.println("     "            + extension);
		System.out.println("      "   + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public File(String name, String extension) {
		this.extension = extension;
		this.name = name;

	}

}
