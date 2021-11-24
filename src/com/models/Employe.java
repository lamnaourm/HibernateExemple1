package com.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employe{

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="EMP_NAME")
	private String nom;
	
	@Column(name="EMP_ADDRESS")
	private String adress;
	
	@Column(name="EMP_MOBILE_NOS")
	private String tel;
	
	public Employe() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdress() {
		return adress;
	}
	public void setAddress(String ad) {
		this.adress = ad;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	} 
	

	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", adress=" + adress + ", tel=" + tel + "]";
	}
}
