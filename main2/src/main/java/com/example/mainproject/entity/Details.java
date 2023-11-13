package com.example.mainproject.entity;

public class Details {
	private int mNum2;
	private String Efficacy;
	private String Formulation;
	private String Appearance;
	private String Administration;
	private String MediInfo1;
	private String MediInfo2;
	private String MediInfo3;
	private String mediInfo4;
	private String Picture;
	private String How;
	public int getmNum2() {
		return mNum2;
	}
	public void setmNum2(int mNum2) {
		this.mNum2 = mNum2;
	}
	public String getEfficacy() {
		return Efficacy;
	}
	public void setEfficacy(String efficacy) {
		Efficacy = efficacy;
	}
	public String getFormulation() {
		return Formulation;
	}
	public void setFormulation(String formulation) {
		Formulation = formulation;
	}
	public String getAppearance() {
		return Appearance;
	}
	public void setAppearance(String appearance) {
		Appearance = appearance;
	}
	public String getAdministration() {
		return Administration;
	}
	public void setAdministration(String administration) {
		Administration = administration;
	}
	public String getMediInfo1() {
		return MediInfo1;
	}
	public void setMediInfo1(String mediInfo1) {
		MediInfo1 = mediInfo1;
	}
	public String getMediInfo2() {
		return MediInfo2;
	}
	public void setMediInfo2(String mediInfo2) {
		MediInfo2 = mediInfo2;
	}
	public String getMediInfo3() {
		return MediInfo3;
	}
	public void setMediInfo3(String mediInfo3) {
		MediInfo3 = mediInfo3;
	}
	public String getMediInfo4() {
		return mediInfo4;
	}
	public void setMediInfo4(String mediInfo4) {
		this.mediInfo4 = mediInfo4;
	}
	public String getPicture() {
		return Picture;
	}
	public void setPicture(String picture) {
		Picture = picture;
	}
	
	public String getHow() {
		return How;
	}
	public void setHow(String how) {
		How = how;
	}
	@Override
	public String toString() {
		return "Details [mNum2=" + mNum2 + ", Efficacy=" + Efficacy + ", Formulation=" + Formulation + ", Appearance="
				+ Appearance + ", Administration=" + Administration + ", MediInfo1=" + MediInfo1 + ", MediInfo2="
				+ MediInfo2 + ", MediInfo3=" + MediInfo3 + ", mediInfo4=" + mediInfo4 + ", Picture=" + Picture
				+ ", How=" + How + "]";
	}
	
	
}
