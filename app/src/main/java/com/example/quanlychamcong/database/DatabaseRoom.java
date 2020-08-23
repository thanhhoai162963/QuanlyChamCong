package com.example.quanlychamcong.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.quanlychamcong.database.Dao.RequestDataNhanVien;
import com.example.quanlychamcong.database.Dao.RequestDataPhongBan;
import com.example.quanlychamcong.database.Dao.RequestDataVIeclam;
import com.example.quanlychamcong.database.Entity.NhanVienEntity;
import com.example.quanlychamcong.database.Entity.PhongBanEntity;
import com.example.quanlychamcong.database.Entity.VieclamEntity;

@Database(entities = {NhanVienEntity.class, PhongBanEntity.class, VieclamEntity.class},version = 1)
public abstract class DatabaseRoom extends RoomDatabase {
    public static DatabaseRoom databaseRoom = null;
    public abstract RequestDataNhanVien requestDataNhanVien();
    public abstract RequestDataPhongBan requestDataPhongBan();
    public abstract RequestDataVIeclam requestDataVIeclam();

    public synchronized static DatabaseRoom getInstance(Context context ){
        if (databaseRoom == null){
            databaseRoom = Room.databaseBuilder(context,DatabaseRoom.class,"QuanlyChamcong")
                    .build();
        }
        return databaseRoom;
    }
}
