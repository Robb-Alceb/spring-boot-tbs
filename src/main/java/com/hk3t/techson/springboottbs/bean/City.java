package com.hk3t.techson.springboottbs.bean;

import org.springframework.stereotype.Component;


public class City {

    private String code;
    private String nameENG;
    private String nameCHN;
    private String nameSIM;
    private String countryCode;
    private int hotSequence;
    private String status;

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }

    public String getNameENG() {
        return nameENG;
    }

    public void setNameENG(String value) {
        this.nameENG = value;
    }

    public String getNameCHN() {
        return nameCHN;
    }

    public void setNameCHN(String value) {
        this.nameCHN = value;
    }

    public String getNameSIM() {
        return nameSIM;
    }

    public void setNameSIM(String value) {
        this.nameSIM = value;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    public int getHotSequence() {
        return hotSequence;
    }

    public void setHotSequence(int value) {
        this.hotSequence = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String value) {
        this.status = value;
    }

	@Override
	public String toString() {
		return "City [code=" + code + ", nameENG=" + nameENG + ", nameCHN=" + nameCHN + ", nameSIM=" + nameSIM + ", countryCode=" + countryCode + ", hotSequence=" + hotSequence + ", status=" + status
				+ "]";
	}

}
