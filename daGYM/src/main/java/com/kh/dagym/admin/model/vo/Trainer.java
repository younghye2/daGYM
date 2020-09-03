package com.kh.dagym.admin.model.vo;

import java.sql.Date;

public class Trainer {
	private int trainerNo;
	private String trainerId;
	private String trainerPwd;
	private String trainerName;
	private String trainerPhone;
	private String trainerCareer;
	private int trainerMemberCount;
	private Date trainerEnrollDate;
	private String trianerStatus;
	private int trainerPrice;
	
	public Trainer() {}

	public Trainer(int trainerNo, String trainerId, String trainerPwd, String trainerName,
			String trainerPhone, String trainerCareer, int trainerMemberCount, Date trainerEnrollDate, String trianerStatus,
			int trainerPrice) {
		super();
		this.trainerNo = trainerNo;
		this.trainerId = trainerId;
		this.trainerPwd = trainerPwd;
		this.trainerName = trainerName;
		this.trainerPhone = trainerPhone;
		this.trainerCareer = trainerCareer;
		this.trainerMemberCount = trainerMemberCount;
		this.trainerEnrollDate = trainerEnrollDate;
		this.trianerStatus = trianerStatus;
		this.trainerPrice = trainerPrice;
	}

	public int getTrainerNo() {
		return trainerNo;
	}

	public void setTrainerNo(int trainerNo) {
		this.trainerNo = trainerNo;
	}

	public String getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerPwd() {
		return trainerPwd;
	}

	public void setTrainerPwd(String trainerPwd) {
		this.trainerPwd = trainerPwd;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getTrainerPhone() {
		return trainerPhone;
	}

	public void setTrainerPhone(String trainerPhone) {
		this.trainerPhone = trainerPhone;
	}

	public String getTrainerCareer() {
		return trainerCareer;
	}

	public void setTrainerCareer(String trainerCareer) {
		this.trainerCareer = trainerCareer;
	}

	public int getTrainerMemberCount() {
		return trainerMemberCount;
	}

	public void setTrainerMemberCount(int trainerMemberCount) {
		this.trainerMemberCount = trainerMemberCount;
	}

	public Date getTrainerEnrollDate() {
		return trainerEnrollDate;
	}

	public void setTrainerEnrollDate(Date trainerEnrollDate) {
		this.trainerEnrollDate = trainerEnrollDate;
	}

	public String getTrianerStatus() {
		return trianerStatus;
	}

	public void setTrianerStatus(String trianerStatus) {
		this.trianerStatus = trianerStatus;
	}

	public int getTrainerPrice() {
		return trainerPrice;
	}

	public void setTrainerPrice(int trainerPrice) {
		this.trainerPrice = trainerPrice;
	}

	@Override
	public String toString() {
		return "Trainer [trainerNo=" + trainerNo + ", trainerId=" + trainerId + ", trainerPwd=" + trainerPwd
				+ ", trainerName=" + trainerName + ", trainerPhone=" + trainerPhone
				+ ", trainerCareer=" + trainerCareer + ", trainerMemberCount=" + trainerMemberCount + ", trainerEnrollDate="
				+ trainerEnrollDate + ", trianerStatus=" + trianerStatus + ", trainerPrice=" + trainerPrice + "]";
	}
	
}
