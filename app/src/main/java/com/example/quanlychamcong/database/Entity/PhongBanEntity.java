package com.example.quanlychamcong.database.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity (tableName = "PhongBan")
public class PhongBanEntity {
    @PrimaryKey(autoGenerate = true)
    long idphongban;
    @ColumnInfo(name = "TenPhong")
    String tenPhong;

    public PhongBanEntity(long idphongban, String tenPhong) {
        this.idphongban = idphongban;
        this.tenPhong = tenPhong;
    }

    @Ignore
    public PhongBanEntity() {
    }
}
