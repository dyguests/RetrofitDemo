package com.fanhl.retrofitdemo.rest.model;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by fanhl on 15/12/1.
 */
public class GengerConfirmInfo {
    /**
     * success : true
     * message :
     * question : {"id":"646","text":"What's your Gender?","totalvotes":5887,"hasvoted":false,"answers":[{"id":"4287","text":"Male ofc","votes":"3043"},{"id":"4288","text":"Female, ya we're here.","votes":"367"},{"id":"4289","text":"I'm Male but identify as Female.","votes":"163"},{"id":"4290","text":"I'm Female but identify as Male. (Who wouldn't want a penis)","votes":"97"},{"id":"4291","text":"I'm not even Human O_O","votes":"742"},{"id":"4292","text":"Silly, you actually think there are Females here? >_>","votes":"1475"}],"maxvotes":"3043"}
     */

    public boolean        success;
    public String         message;
    /**
     * id : 646
     * text : What's your Gender?
     * totalvotes : 5887
     * hasvoted : false
     * answers : [{"id":"4287","text":"Male ofc","votes":"3043"},{"id":"4288","text":"Female, ya we're here.","votes":"367"},{"id":"4289","text":"I'm Male but identify as Female.","votes":"163"},{"id":"4290","text":"I'm Female but identify as Male. (Who wouldn't want a penis)","votes":"97"},{"id":"4291","text":"I'm not even Human O_O","votes":"742"},{"id":"4292","text":"Silly, you actually think there are Females here? >_>","votes":"1475"}]
     * maxvotes : 3043
     */

    public QuestionEntity question;

    public static class QuestionEntity {
        public String              id;
        public String              text;
        public int                 totalvotes;
        public boolean             hasvoted;
        public String              maxvotes;
        /**
         * id : 4287
         * text : Male ofc
         * votes : 3043
         */

        public List<AnswersEntity> answers;

        public static class AnswersEntity {
            public String id;
            public String text;
            public String votes;
        }
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
