/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.quanlycoquannhanuoc.app.model;

/**
 *
 * @author ADMIN
 */
public class NhanVienBienChe extends NhanVien{
    private int luongCoBan,heSoLuong,troCap;
    
    public NhanVienBienChe(){}
    
    public NhanVienBienChe(String tenNhanVien, String maSoNV, String ngaySinh, String thoiGianBatDauLamViec,int luongCoBan,int heSoLuong,int troCap){
        this.tenNhanVien = tenNhanVien;
        this.maSoNV = maSoNV;
        this.ngaySinh = ngaySinh;
        this.thoiGianBatDauLamViec = thoiGianBatDauLamViec;
        this.luong = luong;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.troCap = troCap;
    }
    
    public int getLuongCoBan(){
        return luongCoBan;
    }
    
    public void setLuongCoBan(int luongCoBan){
        this.luongCoBan = luongCoBan;
    }
    
    public int getHeSoLuong(){
        return heSoLuong;
    }
    
    public void setHeSoLuong(int heSoLuong){
        this.heSoLuong = heSoLuong;
    }
    
    public int getTroCap(){
        return troCap;
    }
    
    public void setTroCap(int troCap){
        this.troCap = troCap;
    }
    
    @Override
    public int tinhLuong(){
        return luongCoBan*heSoLuong + troCap;
    }
    
}

