package com.example.marcelomaia.api.model;

public enum PermissionLevel {
	
	MANAGE("MANAGE",1),
	VIEW("VIEW",2),
	NONE("NONE",3);

	public String name="";
    public int value;

    private PermissionLevel(String name,int value) {
        this.name=name;
        this.value=value;
    }

}
