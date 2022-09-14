/*
 *  Copyright (c) 2017-2019, bruce.ge.
 *    This program is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU General Public License
 *    as published by the Free Software Foundation; version 2 of
 *    the License.
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *    GNU General Public License for more details.
 *    You should have received a copy of the GNU General Public License
 *    along with this program;
 */

package generateAllSetter;

import com.bruce.intellijplugin.generatesetter.CommonConstants;
import com.intellij.codeInsight.intention.IntentionAction;
import org.assertj.core.api.Assertions;

/**
 * @author bruce ge
 */
public class FieldGenerateConverterFromFunctionTest extends BaseTest {
    public void testConverter() {
        String text = "package com;\n" +
                "import java.math.BigDecimal;\n" +
                "import java.util.Date;\n" +
                "\n" +
                "/**\n" +
                " * Created by bruce.ge on 2017/2/3.\n" +
                " */\n" +
                "public class Article {\n" +
                "\n" +
                "    public String uuuuuuu;\n" +
                "\n" +
                "    public static Article conv<caret>ertFrom(User user){\n" +
                "        \n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "class User{\n" +
                "    public String uuuuuuu;\n" +
                "\n" +
                "}\n";
        System.out.println(text);
        myFixture.configureByText("Article.java", text);

        IntentionAction singleIntention = myFixture.findSingleIntention(CommonConstants.GENERATE_CONVERTER_FROM_METHOD);

        Assertions.assertThat(singleIntention).isNotNull();
        myFixture.launchAction(singleIntention);

        myFixture.checkResultByFile("after/FieldGenerateConverterFromFunction.java",true);
    }
}
