package com.example.azurespring.azurespringdemo;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

@Container(containerName = "items")
public class Item {
    
    @Id
    private String id;
    private String name;
    @PartitionKey
    private String category;
    private String description;
    private boolean isComplete;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isComplete() {
        return isComplete;
    }
    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
    public Item(String id, String name, String category, String description, boolean isComplete) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.isComplete = isComplete;
    }

    public Item(){}


}
