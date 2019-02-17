package com.gmail.nossr50.core.mcmmo;

public interface Nameable extends Named {
    /**
     * Change the name for this entity
     *
     * @param newName the new name of this entity
     */
    void setName(String newName);

    /**
     * Returns the original name for this entity before any renaming
     *
     * @return the original name of this entity
     */
    String getOriginalName();

    /**
     * This is the name used for chat messages and other things
     * @return the display name of this entity
     */
    String getDisplayName();
}