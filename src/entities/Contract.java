package entities;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer number;
	private Date date;
	private Double totalValue;
	
	public List<Installment> installments = new ArrayList<>();
	
	public Contract() {}
	
	public Contract(Integer number, Date date, Double totalValue) {
		super();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public Date getDate() {
		return date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
		
}
