package com.barclays.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
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
