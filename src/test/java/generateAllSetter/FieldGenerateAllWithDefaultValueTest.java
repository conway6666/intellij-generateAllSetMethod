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
public class FieldGenerateAllWithDefaultValueTest extends BaseTest {
    public void testGenerateAllSetterDefaultValue() {
        myFixture.configureByText("Article.java", "import java.math.BigDecimal;\n" +
                "import java.util.Date;\n" +
                "\n" +
                "/**\n" +
                " * Created by bruce.ge on 2017/2/3.\n" +
                " */\n" +
                "public class Article {\n" +
                "\n" +
                "    public String uuuuuuu;\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        Article arti<caret>cle = new Article();\n" +
                "    }\n" +
                "\n" +
                "}\n");

        IntentionAction singleIntention = myFixture.findSingleIntention(CommonConstants.GENERATE_SETTER_METHOD);

        Assertions.assertThat(singleIntention).isNotNull();
        myFixture.launchAction(singleIntention);

        myFixture.checkResultByFile("after/FieldGenerateAllSetterWithDefault.java",true);
    }


}
