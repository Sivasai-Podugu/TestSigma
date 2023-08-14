package com.example.custorder.specifications;

import lombok.Data;

@Data
public class SearchCriteria {
    private String key;
    private SearchOperation op;
    private String value;
    private  String table;

    public SearchCriteria(String key, SearchOperation op, String value, String table) {
        this.key = key;
        this.op = op;
        this.value = value;
        this.table = table;
    }

    public SearchCriteria(String key, SearchOperation searchOperation, String value) {
        this.key = key;
        this.op = op;
        this.value = value;

    }
}
