package com.fullstack.find_capital.dto;

public class CountryCapitalResponse<U> {

    private boolean error;

    private String msg;

    private U data;

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

    public U getData() {
        return data;
    }

    public void setData(U data) {
        this.data = data;
    }

    

}
