package com.example.mainproject.entity;

public class Listview {
	private int seq;
	private int mNum;
	private String mName;
	private String Picture;
	
	public int getmNum() {
		return mNum;
	}
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getPicture() {
		return Picture;
	}
	public void setPicture(String picture) {
		Picture = picture;
	}
	@Override
	public String toString() {
		return "listview [seq=" + seq + ", mName=" + mName + ", Picture=" + Picture + "]";
	}
	
}
