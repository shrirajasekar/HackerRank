package com.shri.objects;

public class BioStudent extends Student{

	public BioStudent() {
		// TODO Auto-generated constructor stub
	}

	private int zooMark;
	private int BioMark;
	@Override
	public String toString() {
		return "BioStudent [zooMark=" + zooMark + ", BioMark=" + BioMark + "]";
	}
	public int getZooMark(){
		return this.zooMark;
	}
	
	public void setZooMark(int x){
		this.zooMark =  x;
	}
	public int getBioMark(){
		return this.BioMark;
	}
	
	public void setBioMark(int x){
		this.BioMark = x;
	}
	
	
}
