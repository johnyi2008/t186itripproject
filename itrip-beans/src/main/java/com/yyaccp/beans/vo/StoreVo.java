package com.yyaccp.beans.vo;

import java.util.Date;

public class StoreVo {
    private Integer roomId;
    private Date recordDate;
    private Integer store;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }
}
