/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package oop.quanlycoquannhanuoc.app.ui;
package oop.quanlycoquannhanuoc.app.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oop.quanlycoquannhanuoc.app.controller.QuanLyNhanVienHopDong;
import oop.quanlycoquannhanuoc.app.model.NhanVienHopDong;


public class QuanLyNhanVienHopDongPanel extends javax.swing.JPanel {
   
    private QuanLyNhanVienHopDong NVHopDongTable = new QuanLyNhanVienHopDong();
    private DefaultTableModel tblHopDongModel = new DefaultTableModel();
    private DefaultTableModel tblTimKiem = new DefaultTableModel();

    public QuanLyNhanVienHopDongPanel() {
        initComponents();
        tableNVHopDong();
        tableTimKiem();
    }
    
    // Khoi tao bang nhan vien hop dong
    private void tableNVHopDong() {
        String [] columns = new String []{"STT","Họ và Tên","MSNV","Ngày Sinh","TG Bắt Đầu", "Số Ngày LV", "Lương/Ngày","Tổng Lương"};
        tblHopDongModel.setColumnIdentifiers(columns);
        tableHopDong.setModel(tblHopDongModel);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHopDong = new javax.swing.JTable();
        txtTennhanvien = new javax.swing.JTextField();
        txtMsnv = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtThoiGianBatDau = new javax.swing.JTextField();
        txtSoNgay = new javax.swing.JTextField();
        txtLuongTheoNgay = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtTennhanvien1 = new javax.swing.JTextField();
        txtMsnv1 = new javax.swing.JTextField();
        txtNgaySinh1 = new javax.swing.JTextField();
        txtThoiGianBatDau1 = new javax.swing.JTextField();
        txtluong1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTimKiem = new javax.swing.JTable();
        btnFind1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN HỢP ĐỒNG");

        jLabel2.setText("Họ Và Tên:");

        jLabel3.setText("MSNV:");

        jLabel4.setText("Ngày Sinh:");

        jLabel5.setText("Thời Gian Bắt Đầu:");

        jLabel6.setText("Tiền Lương/Ngày: ");

        jLabel7.setText("Số Ngày Làm Việc:");

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop/quanlycoquannhanuoc/app/icons/Button-Add-icon.png"))); // NOI18N
        btnNew.setText("Thêm Mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop/quanlycoquannhanuoc/app/icons/Gear-icon_1.png"))); // NOI18N
        btnSave.setText("Sửa");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop/quanlycoquannhanuoc/app/icons/Delete-icon.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop/quanlycoquannhanuoc/app/icons/Reset-icon.png"))); // NOI18N
        btnReset.setText("Làm Mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tableHopDong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Họ Và Tên", "MSNV", "Ngày Sinh", "TG Bắt Đầu", "Số Ngày LV", "Lương/Ngày", "Tổng Lương"
            }
        ));
        tableHopDong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNVHDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableHopDong);
        if (tableHopDong.getColumnModel().getColumnCount() > 0) {
            tableHopDong.getColumnModel().getColumn(0).setMinWidth(40);
            tableHopDong.getColumnModel().getColumn(0).setMaxWidth(40);
            tableHopDong.getColumnModel().getColumn(2).setMinWidth(110);
            tableHopDong.getColumnModel().getColumn(2).setMaxWidth(110);
            tableHopDong.getColumnModel().getColumn(3).setMinWidth(120);
            tableHopDong.getColumnModel().getColumn(3).setMaxWidth(120);
            tableHopDong.getColumnModel().getColumn(4).setMinWidth(150);
            tableHopDong.getColumnModel().getColumn(4).setMaxWidth(150);
            tableHopDong.getColumnModel().getColumn(5).setResizable(false);
            tableHopDong.getColumnModel().getColumn(6).setMinWidth(90);
            tableHopDong.getColumnModel().getColumn(6).setMaxWidth(90);
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TÌM KIẾM NHÂN VIÊN");

        jLabel9.setText("Họ Và Tên:");

        jLabel10.setText("MSNV:");

        jLabel11.setText("Ngày Sinh:");

        jLabel12.setText("Thời Gian Bắt Đầu:");

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop/quanlycoquannhanuoc/app/icons/search-icon.png"))); // NOI18N
        btnFind.setText("Tìm Kiếm");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        jLabel14.setText("Tổng Lương Lớn Hơn:");

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
        jScrollPane2.setViewportView(tableTimKiem);

        btnFind1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop/quanlycoquannhanuoc/app/icons/search-icon.png"))); // NOI18N
        btnFind1.setText("Tìm Kiếm");
        btnFind1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFind1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtThoiGianBatDau1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgaySinh1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMsnv1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTennhanvien1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFind)
                                .addGap(75, 75, 75)))
                        .addGap(0, 124, Short.MAX_VALUE))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnFind1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtluong1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTennhanvien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMsnv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNgaySinh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtThoiGianBatDau1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnFind)
                .addGap(7, 7, 7)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtluong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(btnFind1)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(69, 69, 69)
                                                    .addComponent(jSeparator2))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6))
                                                    .addGap(53, 53, 53)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addComponent(txtLuongTheoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(29, 29, 29)
                                                            .addComponent(jLabel7)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(txtSoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                                        .addComponent(txtTennhanvien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtThoiGianBatDau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtMsnv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(btnNew)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jSeparator3))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTennhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMsnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtThoiGianBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(txtSoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLuongTheoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnNew)
                                .addComponent(btnDelete)
                                .addComponent(btnReset)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //Them moi nhan vien
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        
        //Kiem tra loi nhap thong tin
        StringBuilder sb =new StringBuilder();
        if(txtTennhanvien.getText().equals("") ||txtMsnv.getText().equals("")||txtNgaySinh.getText().equals("")
            || txtThoiGianBatDau.getText().equals("") || txtSoNgay.getText().equals("") || txtLuongTheoNgay.getText().equals("")){
        sb.append("Khong duoc de trong thong tin\n");
        }
 
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this,sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Khoi tao nhan vien them moi
        NhanVienHopDong nhanVienHopDong = new NhanVienHopDong(txtTennhanvien.getText(),txtMsnv.getText(),txtNgaySinh.getText(), 
                txtThoiGianBatDau.getText(),Integer.parseInt(txtLuongTheoNgay.getText()),Integer.parseInt(txtSoNgay.getText()));
        
        // them nhan vien vao danh sach
        NVHopDongTable.add(nhanVienHopDong);
        NVHopDongTable.renderToTable(tblHopDongModel);
    }//GEN-LAST:event_btnNewActionPerformed
    
    //Sua thong tin nhan vien
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        //Kiem tra loi nhap thong tin
        StringBuilder sb =new StringBuilder();
        if(txtTennhanvien.getText().equals("") ||txtMsnv.getText().equals("")||txtNgaySinh.getText().equals("")
            || txtThoiGianBatDau.getText().equals("") || txtSoNgay.getText().equals("") || txtLuongTheoNgay.getText().equals("")){
        sb.append("Khong duoc de trong thong tin\n");
        }
        if(sb.length()>0){
        JOptionPane.showMessageDialog(this,sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        //Khoi tao nhan vien them moi
        NhanVienHopDong nhanVienHopDOng = new NhanVienHopDong(txtTennhanvien.getText(),txtMsnv.getText(),txtNgaySinh.getText(), 
                txtThoiGianBatDau.getText(),Integer.parseInt(txtLuongTheoNgay.getText()),Integer.parseInt(txtSoNgay.getText()));
        
        //them nhan vien vao danh sach
        NVHopDongTable.update(nhanVienHopDOng);
        NVHopDongTable.renderToTable(tblHopDongModel);                                 
    }//GEN-LAST:event_btnSaveActionPerformed
    
    //Xoa nhan vien
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        //Kiem tra loi nhap thong tin
        StringBuilder sb =new StringBuilder();
        if(txtTennhanvien.getText().equals("") ||txtMsnv.getText().equals("")||txtNgaySinh.getText().equals("")
            || txtThoiGianBatDau.getText().equals("") || txtSoNgay.getText().equals("") || txtLuongTheoNgay.getText().equals("")){
        sb.append("Khong duoc de trong thong tin\n");
        }
        if(sb.length()>0){
        JOptionPane.showMessageDialog(this,sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        //Xoa nhan vien trong danh sach
        NVHopDongTable.deleteByCode(txtMsnv.getText());
        NVHopDongTable.renderToTable(tblHopDongModel);

    }//GEN-LAST:event_btnDeleteActionPerformed

    //reset thong tin dang nhap
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtTennhanvien.setText("");
        txtMsnv.setText("");
        txtNgaySinh.setText("");
        txtThoiGianBatDau.setText("");
        txtSoNgay.setText("");
        txtLuongTheoNgay.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    //Nhan thong tin tu bang
    private void tableNVHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNVHDMouseClicked
        int selectedRow = tableHopDong.getSelectedRow();
        
        if(selectedRow >=0){
            String code = (String) tableHopDong.getValueAt(selectedRow, 2);
            NhanVienHopDong nhanVienHopDong = NVHopDongTable.findByCode(code);
            if(nhanVienHopDong !=null){
                txtTennhanvien.setText(nhanVienHopDong.getTenNhanVien());
                txtMsnv.setText(nhanVienHopDong.getMaSoNV());
                txtNgaySinh.setText(nhanVienHopDong.getNgaySinh());
                txtThoiGianBatDau.setText(nhanVienHopDong.getThoiGianBatDauLamViec());
                txtSoNgay.setText(String.valueOf(nhanVienHopDong.getSoNgayLamViec()));
                txtLuongTheoNgay.setText(String.valueOf(nhanVienHopDong.getTienCongTheoNgay()));
            }
        }
    }//GEN-LAST:event_tableNVHDMouseClicked

    //Tim kiem nhan vien
    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
       
        ArrayList<NhanVienHopDong> nhanVienHopDong = NVHopDongTable.find(txtTennhanvien1.getText(),txtMsnv1.getText(),txtNgaySinh1.getText(), 
                txtThoiGianBatDau1.getText());
        int count =0;
        tblTimKiem.setRowCount(0);
        for (NhanVienHopDong nhanVienHopDong1 : nhanVienHopDong) {
            count++;
            Object [] row = new Object[]{count,
                nhanVienHopDong1.getTenNhanVien(),nhanVienHopDong1.getMaSoNV(),nhanVienHopDong1.getNgaySinh(),
                nhanVienHopDong1.getThoiGianBatDauLamViec(),nhanVienHopDong1.tinhLuong()
            };
            tblTimKiem.addRow(row);
            
        }
        tblTimKiem.fireTableDataChanged();
        
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnFind1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFind1ActionPerformed
        ArrayList<NhanVienHopDong> nhanVienHopDong = NVHopDongTable.findLuong(Integer.parseInt(txtluong1.getText()));
        int count =0;
        tblTimKiem.setRowCount(0);
        for (NhanVienHopDong nhanVienHopDong1 : nhanVienHopDong) {
            count++;
            Object [] row = new Object[]{count,
                nhanVienHopDong1.getTenNhanVien(),nhanVienHopDong1.getMaSoNV(),nhanVienHopDong1.getNgaySinh(),
                nhanVienHopDong1.getThoiGianBatDauLamViec(),nhanVienHopDong1.tinhLuong()
            };
            tblTimKiem.addRow(row);
            
        }
        tblTimKiem.fireTableDataChanged();
    }//GEN-LAST:event_btnFind1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFind1;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tableHopDong;
    private javax.swing.JTable tableTimKiem;
    private javax.swing.JTextField txtLuongTheoNgay;
    private javax.swing.JTextField txtMsnv;
    private javax.swing.JTextField txtMsnv1;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtNgaySinh1;
    private javax.swing.JTextField txtSoNgay;
    private javax.swing.JTextField txtTennhanvien;
    private javax.swing.JTextField txtTennhanvien1;
    private javax.swing.JTextField txtThoiGianBatDau;
    private javax.swing.JTextField txtThoiGianBatDau1;
    private javax.swing.JTextField txtluong1;
    // End of variables declaration//GEN-END:variables
}
