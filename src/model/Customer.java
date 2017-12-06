package model;

/**
 * <p>Description</p>
 * <p>Copyright: Copyright (c) 2007 Sample King</p>
 * @author Even
 * @version v0.0
 */
import java.util.ArrayList;
import java.util.List;

public class Customer{

	private int id;
	private String name;
	private String description;
	private String chsName;
	private String supplierCode;
	private String contactType;
	private String responsibleUser;
	private String customerOrderUrgencyLevel;
	private String sales;
	private Boolean thirdParty = Boolean.FALSE;
	private String country;

	private List<Contact> contacts = new ArrayList<Contact>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getChsName() {
		return chsName;
	}

	public void setChsName(String chsName) {
		this.chsName = chsName;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getResponsibleUser() {
		return responsibleUser;
	}

	public void setResponsibleUser(String responsibleUser) {
		this.responsibleUser = responsibleUser;
	}

	public String getCustomerOrderUrgencyLevel() {
		return customerOrderUrgencyLevel;
	}

	public void setCustomerOrderUrgencyLevel(String customerOrderUrgencyLevel) {
		this.customerOrderUrgencyLevel = customerOrderUrgencyLevel;
	}

	public String getSales() {
		return sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}

	public Boolean getThirdParty() {
		return thirdParty;
	}

	public void setThirdParty(Boolean thirdParty) {
		this.thirdParty = thirdParty;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
}