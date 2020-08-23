package com.example.quanlychamcong.database.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity (tableName = "NhanVien",
        foreignKeys = @ForeignKey(entity = PhongBanEntity.class,
                                    parentColumns = "idphongban",
                                    childColumns = "idphongbannhanvien",
                                    onDelete = ForeignKey.CASCADE))
public class NhanVienEntity {
    @PrimaryKey(autoGenerate = true)
    long MSNV;
    @ColumnInfo(name = "Hoten")
    String name;
    @ColumnInfo(name = "idphongbanNhanvien")
    String idphongbannhanvien;

    @Ignore
    public NhanVienEntity() {
    }

    public NhanVienEntity(long MSNV, String name, String idphongbannhanvien) {
        this.MSNV = MSNV;
        this.name = name;
        this.idphongbannhanvien = idphongbannhanvien;
    }
}
