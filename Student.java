package com.hibernate.lab;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Student_info")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int stud_Id;
	 @Column(name="Student_name",length=20)
	 private String Stud_name;
	 @Column(name="Student_mob",length=10)
     private double Stud_mob;
	 
	 @ManyToOne
	 private Teacher teacher;
	 
}
