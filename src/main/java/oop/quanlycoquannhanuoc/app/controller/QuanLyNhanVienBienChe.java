/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.quanlycoquannhanuoc.app.controller;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import oop.quanlycoquannhanuoc.app.model.NhanVienBienChe;

/**
 *
 * @author ADMIN
 */
public class QuanLyNhanVienBienChe extends QuanLyNhanVien {
    
    private ArrayList<NhanVienBienChe> list = new ArrayList<>();
    
    //them nhan vien vao danh sach
    public void add(NhanVienBienChe emp){
        list.add(emp);
    }   
    
    //xoa nhan vien bang ma
    public void deleteByCode(String code){
        for (NhanVienBienChe nhanVienBienChe : list) {
            if(nhanVienBienChe.getMaSoNV().equals(code)){
                list.remove(nhanVienBienChe);
                break;
            }
        }
    }
    
    //Cap nhat thong tin nhan vien
    public void update(NhanVienBienChe nhanVienBienChe){
        NhanVienBienChe existedNhanVien = findByCode(nhanVienBienChe.getMaSoNV());
        
        if(existedNhanVien != null){
            existedNhanVien.setTenNhanVien(nhanVienBienChe.getTenNhanVien());  
            existedNhanVien.setMaSoNV(nhanVienBienChe.getMaSoNV());
            existedNhanVien.setNgaySinh(nhanVienBienChe.getNgaySinh());
            existedNhanVien.setThoiGianBatDauLamViec(nhanVienBienChe.getThoiGianBatDauLamViec());
            existedNhanVien.setLuongCoBan(nhanVienBienChe.getLuongCoBan());
            existedNhanVien.setHeSoLuong(nhanVienBienChe.getHeSoLuong());
            existedNhanVien.setTroCap(nhanVienBienChe.getTroCap());
        }
    }
      
    //tim kiem nhan vien bang ma
    public NhanVienBienChe findByCode(String code){
        for (NhanVienBienChe nhanVienHopDong : list) {
            if(nhanVienHopDong.getMaSoNV().equals(code)){
                return nhanVienHopDong;
            }
        }
        return null;
    }
    
    //chuyen du lieu bang vao GUI
    public void renderToTable(DefaultTableModel tblModel){
        int count =0;
        tblModel.setRowCount(0);
        for (NhanVienBienChe nhanVienBienChe : list) {
            count++;
            Object [] row = new Object[]{count,
                nhanVienBienChe.getTenNhanVien(),nhanVienBienChe.getMaSoNV(),nhanVienBienChe.getNgaySinh(),
                nhanVienBienChe.getThoiGianBatDauLamViec(), nhanVienBienChe.getLuongCoBan(), nhanVienBienChe.getHeSoLuong(),nhanVienBienChe.getTroCap(),
                nhanVienBienChe.tinhLuong()
            };
            tblModel.addRow(row);
        }
        tblModel.fireTableDataChanged();
    }
      
    //tim kiem nhan vien
    public ArrayList<NhanVienBienChe> find(String name,String code,String day,String thoigian){
           ArrayList<NhanVienBienChe> list1 = new ArrayList<>();

        for(int i=0 ; i<list.size();i++){
            if(list.get(i).getTenNhanVien().equals(name)) if(list.get(i).getMaSoNV().equals(code)) 
                    if(list.get(i).getNgaySinh().equals(day)) if( list.get(i).getThoiGianBatDauLamViec().equals(thoigian)){
                list1.add(list.get(i));
            }
        }
        return list1;
    }
    
    public ArrayList<NhanVienBienChe> findLuong(int luong){
        ArrayList<NhanVienBienChe> list1 = new ArrayList<>();
        
        for(int i=0 ; i<list.size();i++){
            if(list.get(i).tinhLuong()>luong) 
                list1.add(list.get(i));
        }
        return list1;
    }
}
