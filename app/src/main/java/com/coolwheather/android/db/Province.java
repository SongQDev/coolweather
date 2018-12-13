package com.coolwheather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * 省会
 */
public class Province extends LitePalSupport {
    /**
     * ID
     */
    private int id;
    /**
     * 省会名称
     */
    private String provinceName;
    /**
     * 省会代码
     */
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
