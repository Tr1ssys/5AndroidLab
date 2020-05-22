package com.example.AndroidStudiolab5;

import java.util.LinkedList;

public class LikedInfo {
    private static LikedInfo instance;
    private LinkedList<String> urls;
    private LikedInfo() {
        urls = new LinkedList<>();
    }
    public static LikedInfo createInstance() {
        if(instance == null) {
            instance = new LikedInfo();
        }
        return instance;
    }
    public void addUrl(String url) {
        if(urls.size() == 10) {
            urls.pop();
        }
        urls.add(url);
    }
    public void deleteUrl(String url) {
        urls.remove(url);
    }
    public LinkedList<String> getUrls() {
        return urls;
    }
}
