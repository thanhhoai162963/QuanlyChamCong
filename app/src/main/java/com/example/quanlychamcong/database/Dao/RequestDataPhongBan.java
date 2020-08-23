package com.example.quanlychamcong.database.Dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

import com.example.quanlychamcong.database.Entity.PhongBanEntity;
import com.example.quanlychamcong.database.Entity.VieclamEntity;

import io.reactivex.Completable;
import io.reactivex.Maybe;

public interface RequestDataPhongBan {
    @Insert
    Maybe<Long> insertIdPhongban (PhongBanEntity phongBanEntity);
    @Insert
    Maybe<String> insertTenPhongban (PhongBanEntity phongBanEntity);
    @Delete
    Completable deletePhongban(PhongBanEntity phongBanEntity);
    @Update
    Completable updatePhongban (PhongBanEntity phongBanEntity);
}
