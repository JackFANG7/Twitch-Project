package com.twitch.twitch.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.twitch.twitch.entity.db.Item;

public class FavoriteRequestBody {

    @JsonProperty("favorite")
    private Item favoriteItem;

    public Item getFavoriteItem() {
        return favoriteItem;
    }
}

