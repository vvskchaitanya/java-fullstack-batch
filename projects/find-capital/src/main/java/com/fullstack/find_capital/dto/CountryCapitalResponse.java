package com.fullstack.find_capital.dto;

import java.util.List;

public class CountryCapitalResponse {

    private boolean error;

    private String msg;

    private List<CountryCapitalObject> data;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<CountryCapitalObject> getData() {
        return data;
    }

    public void setData(List<CountryCapitalObject> data) {
        this.data = data;
    }

    

}
