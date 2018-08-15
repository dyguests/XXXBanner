package com.yj.banner.xxxbanner.bean;

import com.yj.xxxbanner.bean.MultiBannerBean;

import java.util.List;

/**
 * desc:
 * time: 2018/8/15
 *
 * @author yinYin
 */
public class MultiTourismResponse extends MultiBannerBean {

    /**
     * id : 90
     * image_url : ["http://sky.klicen.com/media/help/content_photo/41ed59e8-b7b.jpg","http://sky.klicen.com/media/help/content_photo/173f0ef8-a6f.jpg","http://sky.klicen.com/media/help/content_photo/de1f76aa-947.jpg","http://sky.klicen.com/media/help/content_photo/efee3f95-7c2.jpg"]
     * description : 兴义万峰林，天下山峰何其多，唯有此处峰成林
     * tag : ["美食","美景"]
     * time : 2018-04-06 20:00:00
     * place : 兴义万峰林
     * user_name : 天边シ深海
     * brand : 雪佛兰
     * serial : 科沃兹
     * user_photo : http://c.klicen.com/media/random_headphoto/0569.jpg
     * title : 多彩黔行，探寻山林秘境——凯励程贵州自驾游
     * skip_url : http://c.klicen.com/web_items/selfDriving/dist/index.html#/sd-detail?id=54
     */

    private int id;
    private String description;
    private String time;
    private String place;
    private String user_name;
    private String brand;
    private String serial;
    private String user_photo;
    private String title;
    private String skip_url;
    private List<String> image_url;
    private List<String> tag;
    private int type;

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public int getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getUser_photo() {
        return user_photo;
    }

    public void setUser_photo(String user_photo) {
        this.user_photo = user_photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSkip_url() {
        return skip_url;
    }

    public void setSkip_url(String skip_url) {
        this.skip_url = skip_url;
    }

    public List<String> getImage_url() {
        return image_url;
    }

    public void setImage_url(List<String> image_url) {
        this.image_url = image_url;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

}
