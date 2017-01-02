package com.facade.pattern.test;

import com.facade.pattern.ShapeMaker;

public class FcadePatterTest {

	public static void main(String[] args) {
		ShapeMaker shapeMaker= new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
		

	}

}
