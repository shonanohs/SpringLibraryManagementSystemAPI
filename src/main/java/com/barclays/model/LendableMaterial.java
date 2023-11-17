package com.barclays.model;

import jakarta.persistence.MappedSuperclass;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@MappedSuperclass
public abstract class LendableMaterial {
    private String title;

    public LendableMaterial(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
