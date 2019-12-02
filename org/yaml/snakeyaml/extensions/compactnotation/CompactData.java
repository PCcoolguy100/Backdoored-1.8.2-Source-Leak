package org.yaml.snakeyaml.extensions.compactnotation;

import java.util.*;

public class CompactData
{
    private String prefix;
    private List<String> arguments;
    private Map<String, String> properties;
    
    public CompactData(final String a1) {
        super();
        this.arguments = new ArrayList<String>();
        this.properties = new HashMap<String, String>();
        this.prefix = a1;
    }
    
    public String getPrefix() {
        return this.prefix;
    }
    
    public Map<String, String> getProperties() {
        return this.properties;
    }
    
    public List<String> getArguments() {
        return this.arguments;
    }
    
    @Override
    public String toString() {
        return "CompactData: " + this.prefix + " " + this.properties;
    }
}
