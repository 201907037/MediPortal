package com.example.mainproject.entity;



import jakarta.persistence.Entity;
import lombok.Data;



public class Medicine {
	
	private int mNum;
	
	private String mName;
	
	private int CategoryNum;

	public int getmNum() {
		return mNum;
	}

	public void setmNum(int mNum) {
		this.mNum = mNum;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public int getCategoryNum() {
		return CategoryNum;
	}

	public void setCategoryNum(int categoryNum) {
		CategoryNum = categoryNum;
	}

	@Override
	public String toString() {
		return "TableVO [mNum=" + mNum + ", mName=" + mName + ", CategoryNum=" + CategoryNum + "]";
	}
	
	
	
	
}
