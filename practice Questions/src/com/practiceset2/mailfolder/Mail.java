package com.practiceset2.mailfolder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mail {
	private Long id;
	private String from;
	private String to;
	private String subject;
	private String content;
	private Date receivedDate;
	private Double size;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	public Mail() {
		super();
	}

	public Mail(Long id, String from, String to, String subject, String content, Date receivedDate, Double size) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.content = content;
		this.receivedDate = receivedDate;
		this.size = size;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return String.format("%-10s%-15s%-15s%-15s%-20s%-15s%-10s", id, from, to, subject, content, sdf.format(receivedDate),
				String.format("%,1f", size));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((receivedDate == null) ? 0 : receivedDate.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mail other = (Mail) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (receivedDate == null) {
			if (other.receivedDate != null)
				return false;
		} else if (!receivedDate.equals(other.receivedDate))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}

	public static Mail createMail(String details) {
		Mail mail = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		String[] mailD = details.split(",");

		try {
			mail = new Mail(Long.parseLong(mailD[0]), mailD[1], mailD[2], mailD[3], mailD[4], sdf.parse(mailD[5]),
					Double.parseDouble(mailD[6]));
		} catch (NumberFormatException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mail;
	}

}
