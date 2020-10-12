package entity;

public class ChiTietHoaDon {
	private String id;
	private int soLuong;
	private Thuoc thuoc;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public Thuoc getThuoc() {
		return thuoc;
	}
	public void setThuoc(Thuoc thuoc) {
		this.thuoc = thuoc;
	}
	public ChiTietHoaDon(String id, int soLuong, Thuoc thuoc) {
		super();
		this.id = id;
		this.soLuong = soLuong;
		this.thuoc = thuoc;
	}
	public ChiTietHoaDon() {
		super();
	}
	public ChiTietHoaDon(String id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "ChiTietHoaDon [id=" + id + ", soLuong=" + soLuong + ", thuoc=" + thuoc + "]";
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
		ChiTietHoaDon other = (ChiTietHoaDon) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	public double tinhGiaBan() {
		return thuoc.getGia()*1.5;
	}
	
	public double tinhTongTienChuaThue() {
		return this.getSoLuong() * this.tinhGiaBan();
	}
	
	public double tinhThueChiTietHoaDon() {
		return this.getThuoc().getThue() * this.tinhTongTienChuaThue();
	}
	
	public double tinhTongTienBaoGomThue() {
		return this.tinhTongTienChuaThue() + this.tinhThueChiTietHoaDon();
	}


}
