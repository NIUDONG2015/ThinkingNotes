package com.weixin.bean;

import java.io.Serializable;

/**
 * Created by Mr.ZCM on 2016/7/31.
 * QQ:656025633
 * Company:winsion
 * Version:1.0
 * explain:
 */
public class ImBean implements Serializable {
    private int type;
    private byte [] sendId;
    private byte[] content;
    private String nickname;
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public int getType() {
        return type;
    }

    public byte[] getSendId() {
        return sendId;
    }

    public byte[] getContent() {
        return content;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setSendId(byte []  sendId) {
        this.sendId = sendId;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}