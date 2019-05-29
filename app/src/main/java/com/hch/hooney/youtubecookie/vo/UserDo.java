package com.hch.hooney.youtubecookie.vo;

import android.content.Context;
import android.content.SharedPreferences;

public class UserDo {
    private String uid;
    private String email;
    private String nickname;
    private String avaimg;

    public UserDo() {
        this.uid = "None";
        this.email = "None";
        this.nickname = "None";
        this.avaimg = "None";
    }

    public UserDo(String uid, String email, String nickname, String avaimg) {
        this.uid = uid;
        this.email = email;
        this.nickname = nickname;
        this.avaimg = avaimg;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvaimg() {
        return avaimg;
    }

    public void setAvaimg(String avaimg) {
        this.avaimg = avaimg;
    }

    public void savePref(Context context){
        SharedPreferences pref = context.getSharedPreferences("pref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("y_cookie_user_uid", this.uid);
        editor.putString("y_cookie_user_nickname", this.nickname);
        editor.putString("y_cookie_user_avaimg", this.avaimg);
        editor.putString("y_cookie_user_email", this.email);
        editor.commit();
    }

    public void loadPref(Context context){
        SharedPreferences pref = context.getSharedPreferences("pref", Context.MODE_PRIVATE);
        this.uid = pref.getString("y_cookie_user_uid", "None");
        this.nickname = pref.getString("y_cookie_user_nickname", "None");
        this.avaimg = pref.getString("y_cookie_user_avaimg", "None");
        this.email = pref.getString("y_cookie_user_email", "None");
    }
}
