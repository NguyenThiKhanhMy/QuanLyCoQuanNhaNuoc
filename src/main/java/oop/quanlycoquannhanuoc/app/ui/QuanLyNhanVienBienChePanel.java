/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package oop.quanlycoquannhanuoc.app.ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oop.quanlycoquannhanuoc.app.controller.QuanLyNhanVienBienChe;
import oop.quanlycoquannhanuoc.app.model.NhanVienBienChe;



public class QuanLyNhanVienBienChePanel extends javax.swing.JPanel {

    private QuanLyNhanVienBienChe NVBienCheTable = new QuanLyNhanVienBienChe();
    private DefaultTableModel tblBienCheModel = new DefaultTableModel();
    private DefaultTableModel tblTimKiem = new DefaultTableModel();

    
    
    public QuanLyNhanVienBienChePanel() {
        initComponents();
        tableNVBienChe();
        tableTimKiem();
         }
    
    // Khoi tao bang nhan vien bien che
    private void tableNVBienChe() {
        String [] columns = new String []{"STT","Họ và Tên","MSNV","Ngày Sinh","TG Bắt Đầu","Hệ Số Lương", "Lương Cơ Bản","Phụ Cấp","Tổng Lương"};
        tblBienCheModel.setColumnIdentifiers(columns);
        tableBienChe.setModel(tblBienCheModel);
       
    }
    
    //Khoi tao bang tim kiem
    private void tableTimKiem() {
        String [] columns = new String []{"STT","Ho va Ten","MSNV","Ngày Sinh", "TG Bắt Đầu", " Tổng Lương"};
        tblTimKiem.setColumnIdentifiers(columns);
        tableTimKiem.setModel(tblTimKiem);
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtTennhanvien = new javax.swing.JTextField();
        txtMsnv = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        textHeSoLuong = new javax.swing.JTextField();
        textLuongCoBan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textPhuCap = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBienChe = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtThoiGianBatDau = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtTennhanvien1 = new javax.swing.JTextField();
        txtMsnv1 = new javax.swing.JTextField();
        txtNgaySinh1 = new javax.swing.JTextField();
        txtThoiGianBatDau1 = new javax.swing.JTextField();
        txtluong1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTimKiem = new javax.swing.JTable();
        jSeparator6 = new javax.swing.JSeparator();
        btnSearch1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN BIÊN CHẾ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Họ Và Tên:");

        jLabel3.setText("MSNV:");

        jLabel4.setText("Ngày Sinh:");

        jLabel5.setText("Lương Cơ Bản:");

        jLabel6.setText("Hệ Số Lương:");

        jLabel7.setText("Phụ Cấp:");

        tableBienChe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Họ Và Tên", "MSNV", "Ngày Sinh", "Thời Gian Bắt Đầu", "Lương Cơ Bản", "Phụ Cấp", "Hệ Số Lương", "Tổng Lương"
            }
        ));
        tableBienChe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBienCheMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableBienChe);
        if (tableBienChe.getColumnModel().getColumnCount() > 0) {
            tableBienChe.getColumnModel().getColumn(0).setMinWidth(40);
            tableBienChe.getColumnModel().getColumn(0).setMaxWidth(40);
            tableBienChe.getColumnModel().getColumn(1).setMinWidth(200);
            tableBienChe.getColumnModel().getColumn(1).setMaxWidth(200);
            tableBienChe.getColumnModel().getColumn(2).setMinWidth(120);
            tableBienChe.getColumnModel().getColumn(2).setMaxWidth(120);
            tableBienChe.getColumnModel().getColumn(3).setMinWidth(180);
            tableBienChe.getColumnModel().getColumn(3).setMaxWidth(180);
            tableBienChe.getColumnModel().getColumn(7).setMinWidth(100);
            tableBienChe.getColumnModel().getColumn(7).setMaxWidth(100);
        }

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop/quanlycoquannhanuoc/app/icons/Button-Add-icon.png"))); // NOI18N
        btnNew.setText("Thêm Mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop/quanlycoquannhanuoc/app/icons/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop/quanlycoquannhanuoc/app/icons/Gear-icon_1.png"))); // NOI18N
        btnSave.setText("Sửa");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop/quanlycoquannhanuoc/app/icons/Reset-icon.png"))); // NOI18N
        btnReset.setText("Làm Mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel9.setText("Thời gian bắt đầu:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TÌM KIẾM NHÂN VIÊN");

        jLabel10.setText("Họ Và Tên:");

        jLabel11.setText("MSNV:");

        jLabel12.setText("Ngày Sinh:");

        jLabel13.setText("Thời Gian Bắt Đầu:");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop/quanlycoquannhanuoc/app/icons/search-icon.png"))); // NOI18N
        btnSearch.setText("Tìm Kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel15.setText("Tổng Lương Lớn Hơn:");

        tableTimKiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Họ Và Tên", "MSNV", "Ngày Sinh", "Thời Gian Bắt Đầu", "Tổng Lương"
            }
        ));
        jScrollPane3.setViewportView(tableTimKiem);

        btnSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop/quanlycoquannhanuoc/app/icons/search-icon.png"))); // NOI18N
        btnSearch1.setText("Tìm Kiếm");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jSeparator6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtThoiGianBatDau1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNgaySinh1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMsnv1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                    .addComponent(txtTennhanvien1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSearch1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(36, 36, 36)
                                    .addComponent(txtluong1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 198, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTennhanvien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtMsnv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNgaySinh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtThoiGianBatDau1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnSearch)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtluong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSearch1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(348, 348, 348))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator3)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel9))
                                            .addGap(37, 37, 37)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(textHeSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(26, 26, 26)
                                                    .addComponent(jLabel7)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(textPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtThoiGianBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textLuongCoBan)
                                                .addComponent(txtTennhanvien)
                                                .addComponent(txtMsnv, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnNew)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                                .addComponent(jSeparator4)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTennhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMsnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtThoiGianBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textLuongCoBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(textPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textHeSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNew)
                            .addComponent(btnDelete)
                            .addComponent(btnSave)
                            .addComponent(btnReset))
                        .addGap(13, 13, 13)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents


    //Xoa nhan vien
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        //Kiem tra loi nhap thong tin
        StringBuilder sb =new StringBuilder();
        if(txtTennhanvien.getText().equals("") ||txtMsnv.getText().equals("")||txtNgaySinh.getText().equals("")
            || txtThoiGianBatDau.getText().equals("") || textHeSoLuong.getText().equals("") || textLuongCoBan.getText().equals("")
            || textPhuCap.getText().equals("")){
        sb.append("Khong duoc de trong thong tin\n");
        } 
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this,sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Xoa nhan vien trong danh sach
        NVBienCheTable.deleteByCode(txtMsnv.getText());
        NVBienCheTable.renderToTable(tblBienCheModel);
    }//GEN-LAST:event_btnDeleteActionPerformed

    //reset thong tin dang nhap
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtTennhanvien.setText("");
        txtMsnv.setText("");
        txtNgaySinh.setText("");
        txtThoiGianBatDau.setText("");
        textHeSoLuong.setText("");
        textLuongCoBan.setText("");
        textPhuCap.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    //Them moi nhan vien
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        
        //Kiem tra loi nhap thong tin
        StringBuilder sb =new StringBuilder();
        if(txtTennhanvien.getText().equals("") ||txtMsnv.getText().equals("")||txtNgaySinh.getText().equals("")
            || txtThoiGianBatDau.getText().equals("") || textHeSoLuong.getText().equals("") || textLuongCoBan.getText().equals("")
            || textPhuCap.getText().equals("")){
        sb.append("Khong duoc de trong thong tin\n");
        }         
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this,sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Khoi tao nhan vien them moi
        NhanVienBienChe nhanVienBienChe = new NhanVienBienChe(txtTennhanvien.getText(),txtMsnv.getText(),txtNgaySinh.getText(), 
                txtThoiGianBatDau.getText(),Integer.parseInt(textHeSoLuong.getText()),Integer.parseInt(textLuongCoBan.getText())
                ,Integer.parseInt(textPhuCap.getText()));
        
        // them nhan vien vao danh sach
        NVBienCheTable.add(nhanVienBienChe);
        NVBienCheTable.renderToTable(tblBienCheModel);
    }//GEN-LAST:event_btnNewActionPerformed

     //Sua thong tin nhan vien
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       
        //Kiem tra loi nhap thong tin
        StringBuilder sb =new StringBuilder();
        if(txtTennhanvien.getText().equals("") ||txtMsnv.getText().equals("")||txtNgaySinh.getText().equals("")
            || txtThoiGianBatDau.getText().equals("") || textHeSoLuong.getText().equals("") || textLuongCoBan.getText().equals("")
            || textPhuCap.getText().equals("")){
        sb.append("Khong duoc de trong thong tin\n");
        }         
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this,sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Khoi tao nhan vien them moi
        NhanVienBienChe nhanVienBienChe = new NhanVienBienChe(txtTennhanvien.getText(),txtMsnv.getText(),txtNgaySinh.getText(), 
                txtThoiGianBatDau.getText(),Integer.parseInt(textHeSoLuong.getText()),Integer.parseInt(textLuongCoBan.getText())
                ,Integer.parseInt(textPhuCap.getText()));
        
        //them nhan vien vao danh sach
        NVBienCheTable.update(nhanVienBienChe);
        NVBienCheTable.renderToTable(tblBienCheModel);
    }//GEN-LAST:event_btnSaveActionPerformed

    //Nhan thong tin tu bang
    private void tableBienCheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBienCheMouseClicked
        int selectedRow = tableBienChe.getSelectedRow();
        
        if(selectedRow >=0){
            String code = (String) tableBienChe.getValueAt(selectedRow, 2);
            NhanVienBienChe nhanVienBienChe = NVBienCheTable.findByCode(code);
            if(nhanVienBienChe !=null){
                txtTennhanvien.setText(nhanVienBienChe.getTenNhanVien());
                txtMsnv.setText(nhanVienBienChe.getMaSoNV());
                txtNgaySinh.setText(nhanVienBienChe.getNgaySinh());
                txtThoiGianBatDau.setText(nhanVienBienChe.getThoiGianBatDauLamViec());
                textHeSoLuong.setText(String.valueOf(nhanVienBienChe.getHeSoLuong()));
                textLuongCoBan.setText(String.valueOf(nhanVienBienChe.getLuongCoBan()));
                textPhuCap.setText(String.valueOf(nhanVienBienChe.getTroCap()));
            }
        }
    }//GEN-LAST:event_tableBienCheMouseClicked

    //Tim kiem nhan vien
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        ArrayList<NhanVienBienChe> nhanVienBienChe = NVBienCheTable.find(txtTennhanvien1.getText(),txtMsnv1.getText(),txtNgaySinh1.getText(), 
                txtThoiGianBatDau1.getText());
        int count =1;
        tblTimKiem.setRowCount(0);
        for (NhanVienBienChe nhanVienBienChe1 : nhanVienBienChe) {
            count++;
            Object [] row = new Object[]{count,
                nhanVienBienChe1.getTenNhanVien(),nhanVienBienChe1.getMaSoNV(),nhanVienBienChe1.getNgaySinh(),
                nhanVienBienChe1.getThoiGianBatDauLamViec(),nhanVienBienChe1.tinhLuong()
            };
            tblTimKiem.addRow(row);
        }
        tblTimKiem.fireTableDataChanged();
       
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        ArrayList<NhanVienBienChe> nhanVienBienChe = NVBienCheTable.findLuong(Integer.parseInt(txtluong1.getText()));
        int count =0;
        tblTimKiem.setRowCount(0);
        for (NhanVienBienChe nhanVienBienChe1 : nhanVienBienChe) {
            count++;
            Object [] row = new Object[]{count,
                nhanVienBienChe1.getTenNhanVien(),nhanVienBienChe1.getMaSoNV(),nhanVienBienChe1.getNgaySinh(),
                nhanVienBienChe1.getThoiGianBatDauLamViec(),nhanVienBienChe1.tinhLuong()
            };
            tblTimKiem.addRow(row);
        }
        tblTimKiem.fireTableDataChanged();
    }//GEN-LAST:event_btnSearch1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableBienChe;
    private javax.swing.JTable tableTimKiem;
    private javax.swing.JTextField textHeSoLuong;
    private javax.swing.JTextField textLuongCoBan;
    private javax.swing.JTextField textPhuCap;
    private javax.swing.JTextField txtMsnv;
    private javax.swing.JTextField txtMsnv1;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtNgaySinh1;
    private javax.swing.JTextField txtTennhanvien;
    private javax.swing.JTextField txtTennhanvien1;
    private javax.swing.JTextField txtThoiGianBatDau;
    private javax.swing.JTextField txtThoiGianBatDau1;
    private javax.swing.JTextField txtluong1;
    // End of variables declaration//GEN-END:variables
}
