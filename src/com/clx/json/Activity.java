package com.clx.json;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ur15975@outlook.com on 2017/6/13.
 */
public class Activity {

    @SerializedName("first_five")
    private List<FirstFiveBean> firstFiveBeanList;

    @SerializedName("second_five")
    private List<SecondFiveBean> secondFiveBeanList;

    public List<FirstFiveBean> getFirst_five() {
        return firstFiveBeanList;
    }

    public void setFirst_five(List<FirstFiveBean> first_five) {
        this.firstFiveBeanList = first_five;
    }

    public List<SecondFiveBean> getSecond_five() {
        return secondFiveBeanList;
    }

    public void setSecond_five(List<SecondFiveBean> second_five) {
        this.secondFiveBeanList = second_five;
    }

    public static class FirstFiveBean {
        /**
         * name : Alex Doe
         * avatar : avatar5.png
         * action : changed his profile photo. <a>Take a look</a>
         * time : an hour ago
         * icon : fa fa-check btn-success
         */

        private String name;
        private String avatar;
        private String action;
        private String time;
        private String icon;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public static class SecondFiveBean {
        private String name;
        private String icon;
        private String action;
        private String time;
        private String avatar;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }
}
