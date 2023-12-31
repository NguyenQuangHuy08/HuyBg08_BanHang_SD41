package com.example.sd_41.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "HoaDon")
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id_HoaDon")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "Id_KhachHang")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "Id_User")
    private User user;

    @Column(name = "maHoaDon")
    private String maHoaDon;

    @Column(name = "thanhTien")
    private BigDecimal thanhTien;

    @Column(name = "ghiChu")
    private String ghiChu;

    @Column(name = "ngayTao")
    private String ngayTao;

    @Column(name = "ngayThanhToan")
    private String ngayThanhToan;

    @Column(name = "ngaySua")
    private String ngaySua;

    @Column(name = "trangThai")
    private int trangThai;

}
