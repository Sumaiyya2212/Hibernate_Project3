package com.hibernate.lab;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Teacher {
	@Id
	 private int Teacher_Id;
	 @Column(name="Teacher_name",length=20)
	 private String Teacher_name;
	 
	 @OneToMany
	 private List<Student>students;

}
