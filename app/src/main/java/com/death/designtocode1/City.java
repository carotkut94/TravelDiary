package com.death.designtocode1;

/**
 * Created by deathcode on 07/01/18.
 */

public class City {
    String name;
    int image_res_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage_res_id() {
        return image_res_id;
    }

    public void setImage_res_id(int image_res_id) {
        this.image_res_id = image_res_id;
    }

    public City(String name, int image_res_id) {
        this.name = name;
        this.image_res_id = image_res_id;
    }
}
