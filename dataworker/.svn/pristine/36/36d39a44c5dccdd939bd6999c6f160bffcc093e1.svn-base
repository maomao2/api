package com.kwgproperty.server.dataworker.entity;

/**
 * Created by jclang on 2017/9/18.
 */
public class MISERPCST {

    private String is_owner;
    private String price_level;

    public MISERPCST() {
    }

    public String getIs_owner() {
        return is_owner;
    }

    public void setIs_owner(String is_owner) {
        this.is_owner = is_owner;
    }

    public String getPrice_level() {
        return price_level;
    }

    public void setPrice_level(String price_level) {
        this.price_level = price_level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MISERPCST miserpcst = (MISERPCST) o;

        if (is_owner != null ? !is_owner.equals(miserpcst.is_owner) : miserpcst.is_owner != null) return false;
        return price_level != null ? price_level.equals(miserpcst.price_level) : miserpcst.price_level == null;
    }

    @Override
    public int hashCode() {
        int result = is_owner != null ? is_owner.hashCode() : 0;
        result = 31 * result + (price_level != null ? price_level.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MISERPCST{" +
                "is_owner='" + is_owner + '\'' +
                ", price_level='" + price_level + '\'' +
                '}';
    }
}
