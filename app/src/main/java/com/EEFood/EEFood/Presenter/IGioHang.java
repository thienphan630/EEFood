package com.EEFood.EEFood.Presenter;

public interface IGioHang {
    void OnSucess();

    void OnFail();

    void getDataSanPham(String id, String id_sp,String tensp, Long giatien, String hinhanh, String loaisp, Long soluong, String nhasanxuat, Long type, String baohanh);
}
