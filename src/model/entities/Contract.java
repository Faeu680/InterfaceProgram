package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
		
	private Integer number;
	private Date date;
	private Double value;
	
	private List<Installment> installments = new ArrayList<>(); 

	
	public Contract() {
	}

	public Contract(Integer number, Date date, Double value) {
		this.number = number;
		this.date = date;
		this.value = value;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	public List<Installment> getInstallments() {
		return installments;
	}
	
	public void addInstallment(Installment installment) {
		installments.add(installment);
	}

	public void removeInstallment(Installment installment) {
		installments.remove(installment);
	}
}
