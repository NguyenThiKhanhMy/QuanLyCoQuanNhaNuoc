/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.quanlycoquannhanuoc.app.controller;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import oop.quanlycoquannhanuoc.app.model.NhanVienHopDong;

/**
 *
 * @author ADMIN
 */
public class QuanLyNhanVienHopDong extends QuanLyNhanVien {
    
    private ArrayList<NhanVienHopDong> list = new ArrayList<>();
    
    //them nhan vien vao danh sach
    public void add(NhanVienHopDong nhanVien){
        list.add(nhanVien);
    }
    
    //xoa nhan vien bang ma
    public void deleteByCode(String code){
        for (NhanVienHopDong nhanVienHopDong : list) {
            if(nhanVienHopDong.getMaSoNV().equals(code)){
                list.remove(nhanVienHopDong);
                break;
            }
        }
    }
    
    //Cap nhat thong tin nhan vien
    public void update(NhanVienHopDong nhanVienHopDong){
        NhanVienHopDong existedNhanVien = findByCode(nhanVienHopDong.getMaSoNV());
        
        if(existedNhanVien != null){
            existedNhanVien.setTenNhanVien(nhanVienHopDong.getTenNhanVien());
            existedNhanVien.setNgaySinh(nhanVienHopDong.getNgaySinh());
            existedNhanVien.setThoiGianBatDauLamViec(nhanVienHopDong.getThoiGianBatDauLamViec());
            existedNhanVien.setSoNgayLamViec(nhanVienHopDong.getSoNgayLamViec());
            existedNhanVien.setTienCongTheoNgay(nhanVienHopDong.getTienCongTheoNgay());
            existedNhanVien.setMaSoNV(nhanVienHopDong.getMaSoNV());
       
        }
    }
    
    //tim kiem nhan vien bang ma
    public NhanVienHopDong findByCode(String code){
        for (NhanVienHopDong nhanVienHopDong : list) {
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
        
        for (NhanVienHopDong nhanVienHopDong : list) {
            count++;
            Object [] row = new Object[]{count,
                nhanVienHopDong.getTenNhanVien(),nhanVienHopDong.getMaSoNV(),nhanVienHopDong.getNgaySinh(),
                nhanVienHopDong.getThoiGianBatDauLamViec(), nhanVienHopDong.getSoNgayLamViec(), nhanVienHopDong.getTienCongTheoNgay(),
                nhanVienHopDong.tinhLuong()
            };
            tblModel.addRow(row);
        }
        tblModel.fireTableDataChanged();
    }
    
   
    //tim kiem nhan vien
    public ArrayList<NhanVienHopDong> find(String name,String code,String day, String thoigian){
        ArrayList<NhanVienHopDong> list1 = new ArrayList<>();

        for(int i=0 ; i<list.size();i++){
        if(list.get(i).getTenNhanVien().equals(name)) if(list.get(i).getMaSoNV().equals(code)) 
            if(list.get(i).getNgaySinh().equals(day)) if( list.get(i).getThoiGianBatDauLamViec().equals(thoigian)){
            list1.add(list.get(i));
            }
        }
        return list1;
 
    }
    public ArrayList<NhanVienHopDong> findLuong(int luong){
        ArrayList<NhanVienHopDong> list1 = new ArrayList<>();
        
        for(int i=0 ; i<list.size();i++){
            if(list.get(i).tinhLuong()>luong) 
                list1.add(list.get(i));
        }
        return list1;
    }
    
}
