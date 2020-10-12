package entity;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LoThuoc {
	private String id;
	private Thuoc thuoc;
	private Date ngaySanXuat;
	private int soLuong;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Thuoc getThuoc() {
		return thuoc;
	}
	public void setThuoc(Thuoc thuoc) {
		this.thuoc = thuoc;
	}
	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public LoThuoc(String id, Thuoc thuoc, Date ngaySanXuat, int soLuong) {
		super();
		this.id = id;
		this.thuoc = thuoc;
		this.ngaySanXuat = ngaySanXuat;
		this.soLuong = soLuong;
	}
	public LoThuoc() {
		super();
	}
	public LoThuoc(String id) {
		super();
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		LoThuoc other = (LoThuoc) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LoThuoc [id=" + id + ", thuoc=" + thuoc + ", ngaySanXuat=" + ngaySanXuat + ", soLuong=" + soLuong + "]";
	}

	public java.util.Date addDays(java.util.Date date, int days) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		return (java.util.Date) cal.getTime();
	}

	public Date tinhNgayHetHan() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		int hanSuDung = thuoc.getHanSuDung() * 30;
		try {
			java.util.Date date = sdf.parse(this.getNgaySanXuat().toString());
			java.util.Date newDate = addDays(date, hanSuDung);
			Date ngayHetHan = new Date(newDate.getTime());
			return ngayHetHan;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public double tinhTongTienLoThuoc() {
		return this.getThuoc().getGia() * this.getSoLuong();
	}

}
