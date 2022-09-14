package com;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by bruce.ge on 2017/2/3.
 */
public class Article {

    public String uuuuuuu;

    public static Article convertFrom(User user){
        Article article = new Article();
        article.uuuuuuu = user.uuuuuuu;
        return article;

    }
}

class User{
    public String uuuuuuu;

}
