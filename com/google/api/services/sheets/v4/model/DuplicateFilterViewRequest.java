package com.google.api.services.sheets.v4.model;

import com.google.api.client.json.*;
import com.google.api.client.util.*;

public final class DuplicateFilterViewRequest extends GenericJson
{
    @Key
    private Integer filterId;
    
    public DuplicateFilterViewRequest() {
        super();
    }
    
    public Integer getFilterId() {
        return this.filterId;
    }
    
    public DuplicateFilterViewRequest setFilterId(final Integer filterId) {
        this.filterId = filterId;
        return this;
    }
    
    @Override
    public DuplicateFilterViewRequest set(final String a1, final Object a2) {
        return (DuplicateFilterViewRequest)super.set(a1, a2);
    }
    
    @Override
    public DuplicateFilterViewRequest clone() {
        return (DuplicateFilterViewRequest)super.clone();
    }
    
    @Override
    public /* bridge */ GenericJson set(final String s, final Object o) {
        return this.set(s, o);
    }
    
    @Override
    public /* bridge */ GenericJson clone() {
        return this.clone();
    }
    
    @Override
    public /* bridge */ GenericData clone() {
        return this.clone();
    }
    
    @Override
    public /* bridge */ GenericData set(final String s, final Object o) {
        return this.set(s, o);
    }
    
    public /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.clone();
    }
}
