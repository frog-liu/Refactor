package com.frog.common;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * @author liuhuan
 */
@Getter
public enum CountryEnum {

    CN("CN", "中国"),
    DE("DE", "德国"),
    US("US", "美国"),
    JP("JP", "日本"),
    GB("GB", "英国"),
    VN("VN", "越南"),
    NULL("NULL", "空");

    /** 数据库存储用 */
    @EnumValue
    private String code;
    private String desc;

    CountryEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static CountryEnum getInstance(String code) {
        for (CountryEnum country: values()) {
            if (country.getCode().equals(code)) {
                return country;
            }
        }
        return NULL;
    }

    public static boolean isCN(String code) {
        return CN.code.equals(code);
    }
}
