package com.fanhl.retrofitdemo.rest.model;

import com.google.gson.Gson;

import java.util.List;

/**
 * 存放状态,书籍列表
 * <p>
 * Created by fanhl on 15/12/1.
 */
public class FolderResponse {

    /**
     * success : true
     * message :
     * folders : [{"token":"aekwbcar","title":"Preferential Treatment Train","objectcount":"245","main":true,"rating":"4.23","date":"11/28/2015"},{"token":"j9j65wht","title":"Santaful Summer","objectcount":"268","main":true,"rating":"4.34","date":"11/28/2015"},{"token":"66w3fajj","title":"Schoolgirl Knights","objectcount":"238","main":true,"rating":"4.53","date":"11/28/2015"},{"token":"at8d7quu","title":"Lamia Wife","objectcount":"67","main":true,"rating":"4.21","date":"11/27/2015"},{"token":"jzdw2phz","title":"My first was my Father - #3 Lewd, Big-Breasted Older Daughter","objectcount":"139","main":true,"rating":"4.45","date":"11/27/2015"}]
     * complete : false
     */

    public boolean             success;
    public String              message;
    public boolean             complete;
    /**
     * token : aekwbcar
     * title : Preferential Treatment Train
     * objectcount : 245
     * main : true
     * rating : 4.23
     * date : 11/28/2015
     */

    public List<FoldersEntity> folders;

    public static class FoldersEntity {
        public String  token;
        public String  title;
        public String  objectcount;
        public boolean main;
        public String  rating;
        public String  date;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
