package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addr_id;
	private String addr_first;
	private String addr_second;
	private String city;
	private String pincode;
	private String dist;
	private String state;
}
