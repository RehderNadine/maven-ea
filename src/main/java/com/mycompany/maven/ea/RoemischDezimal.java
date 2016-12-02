/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven.ea;

/**
 *
 * @author Nadine
 */
public class RoemischDezimal {

	private int dezimal = 0;
	private String roemisch = null;
	
	public RoemischDezimal(String roemisch, int dezimal) {
		this.dezimal = dezimal;
		this.roemisch = roemisch;
	}
	
	public int getDezimal() {
		return dezimal;
	}
	
	public String getRoemisch() {
		return roemisch;
	}
	
}
