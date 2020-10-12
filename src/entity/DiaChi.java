package entity;

public class DiaChi {
	private String xaPhuong, quanHuyen, tinhThanhPho, chiTiet;

	public String getXaPhuong() {
		return xaPhuong;
	}

	public void setXaPhuong(String xaPhuong) {
		this.xaPhuong = xaPhuong;
	}

	public String getQuanHuyen() {
		return quanHuyen;
	}

	public void setQuanHuyen(String quanHuyen) {
		this.quanHuyen = quanHuyen;
	}

	public String getTinhThanhPho() {
		return tinhThanhPho;
	}

	public void setTinhThanhPho(String tinhThanhPho) {
		this.tinhThanhPho = tinhThanhPho;
	}

	public String getChiTiet() {
		return chiTiet;
	}

	public void setChiTiet(String chiTiet) {
		this.chiTiet = chiTiet;
	}

	public DiaChi(String xaPhuong, String quanHuyen, String tinhThanhPho, String chiTiet) {
		super();
		this.xaPhuong = xaPhuong;
		this.quanHuyen = quanHuyen;
		this.tinhThanhPho = tinhThanhPho;
		this.chiTiet = chiTiet;
	}

	public DiaChi() {
		super();
	}

	@Override
	public String toString() {
		return "DiaChi [xaPhuong=" + xaPhuong + ", quanHuyen=" + quanHuyen + ", tinhThanhPho=" + tinhThanhPho
				+ ", chiTiet=" + chiTiet + "]";
	}

}
