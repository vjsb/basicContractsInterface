package entities;

import java.sql.Date;

public class Contract {

	private Integer number;
	private Date date;
	private Double totalValue;
	
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
	
	
	
	
}
