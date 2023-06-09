/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.quanlycoquannhanuoc.app.model;

/**
 *
 * @author ADMIN
 */
public class NhanVienHopDong extends NhanVien{
    private int tienCongTheoNgay,soNgayLamViec;
    
    public NhanVienHopDong(){}
    
    public NhanVienHopDong(String tenNhanVien, String maSoNV, String ngaySinh, String thoiGianBatDauLamViec, int tienCongTheoNgay, int soNgayLamViec){
        this.tenNhanVien = tenNhanVien;
        this.maSoNV = maSoNV;
        this.ngaySinh = ngaySinh;
        this.thoiGianBatDauLamViec = thoiGianBatDauLamViec;
        this.tienCongTheoNgay = tienCongTheoNgay;
        this.soNgayLamViec = soNgayLamViec;
    }
    
    public int getTienCongTheoNgay(){
        return tienCongTheoNgay;
    }
    
    public void setTienCongTheoNgay(int tienCongTheoNgay){
        this.tienCongTheoNgay = tienCongTheoNgay;
    }
    
    public int getSoNgayLamViec(){
        return soNgayLamViec;
    }
    
    public void setSoNgayLamViec(int soNgayLamViec){
        this.soNgayLamViec = soNgayLamViec;
    }
    
    @Override
    public int tinhLuong(){
        return tienCongTheoNgay*soNgayLamViec;
    }
    
}

