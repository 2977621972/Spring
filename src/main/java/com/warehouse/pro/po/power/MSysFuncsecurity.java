package com.warehouse.pro.po.power;

public class MSysFuncsecurity {
    private Integer fid;

    private Integer misUserid;

    private String functionId;

    private Integer lock;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getMisUserid() {
        return misUserid;
    }

    public void setMisUserid(Integer misUserid) {
        this.misUserid = misUserid;
    }

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId == null ? null : functionId.trim();
    }

    public Integer getLock() {
        return lock;
    }

    public void setLock(Integer lock) {
        this.lock = lock;
    }
}