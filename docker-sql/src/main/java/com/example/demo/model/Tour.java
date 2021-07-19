package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tourdetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tour {
	
		@Id
		private int tourId;
		private String tourName;
		private double amount;
	}

