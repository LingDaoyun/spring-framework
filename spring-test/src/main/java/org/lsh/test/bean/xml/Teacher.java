package org.lsh.test.bean.xml;

import java.io.Serializable;

public class Teacher implements Serializable {

	private static final long serialVersionUID = 9201156483030481729L;
	private Student student;


	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				'}';
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
}
