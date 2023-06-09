/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.quanlycoquannhanuoc.app.model;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class NhanVien implements Serializable{
    String tenNhanVien,maSoNV,ngaySinh,thoiGianBatDauLamViec;
    int luong;

    public NhanVien() {
        
    }

    public NhanVien(String tenNhanVien, String maSoNV, String ngaySinh, String thoiGianBatDauLamViec, int luong) {
        this.tenNhanVien = tenNhanVien;
        this.maSoNV = maSoNV;
        this.ngaySinh = ngaySinh;
        this.thoiGianBatDauLamViec = thoiGianBatDauLamViec;
        this.luong = luong;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getMaSoNV() {
        return maSoNV;
    }

    public void setMaSoNV(String maSoNV) {
        this.maSoNV = maSoNV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getThoiGianBatDauLamViec() {
        return thoiGianBatDauLamViec;
    }

    public void setThoiGianBatDauLamViec(String thoiGianBatDauLamViec) {
        this.thoiGianBatDauLamViec = thoiGianBatDauLamViec;
    }

    public int tinhLuong() {
        return luong;
    }
}