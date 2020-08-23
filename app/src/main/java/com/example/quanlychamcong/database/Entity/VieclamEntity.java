package com.example.quanlychamcong.database.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity (tableName = "ViecLam",foreignKeys = @ForeignKey(entity = NhanVienEntity.class,
        parentColumns = "MSNV",
        childColumns = "MSNVvieclam",
        onDelete = ForeignKey.CASCADE))
public class VieclamEntity {
    @PrimaryKey (autoGenerate = true)
    long id;
    @ColumnInfo (name = "TenNhanvien")
    String name;
    @ColumnInfo (name = "MSNVvieclam")
    long MSNVvieclam;

    @Ignore
    public VieclamEntity() {
    }

    public VieclamEntity(long id, String name, long MSNVvieclam) {
        this.id = id;
        this.name = name;
        this.MSNVvieclam = MSNVvieclam;
    }
}
