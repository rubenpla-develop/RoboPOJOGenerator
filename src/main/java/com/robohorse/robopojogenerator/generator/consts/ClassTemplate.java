package com.robohorse.robopojogenerator.generator.consts;

/**
 * Created by vadim on 05.10.16.
 */
public interface ClassTemplate {
    String NEW_LINE = "\n";
    String TAB = "\t";

    String CLASS_BODY = "public class %1$s" +
            "{" + NEW_LINE +
            "%2$s" + NEW_LINE +
            "}";

    String CLASS_BODY_ABSTRACT = "public abstract class %1$s" +
            "{" + NEW_LINE +
            "%2$s" + NEW_LINE +
            "}";

    String CLASS_BODY_KOTLIN_DTO = "data class %1$s" +
                                   "(" + NEW_LINE +
                                   "%2$s" + NEW_LINE +
                                   ")";

    String CLASS_BODY_ANNOTATED = "%1$s" + NEW_LINE +
            "%2$s";

    String CLASS_ROOT_IMPORTS = "package %1$s;" + NEW_LINE + NEW_LINE +
            "%2$s" + NEW_LINE
            + "%3$s";

    String CLASS_ROOT = "package %1$s;" + NEW_LINE + NEW_LINE +
            "%2$s" + NEW_LINE;

    String FIELD = TAB + "private %1$s %2$s;" + NEW_LINE;

    String FIELD_AUTO_VALUE = TAB + "public abstract %1$s %2$s();" + NEW_LINE;

    String FIELD_KOTLIN_DTO = TAB + "val %1$s: %2$s?" + "," + NEW_LINE;

    String FIELD_ANNOTATED = TAB + "%1$s" + NEW_LINE + "%2$s";

    String TYPE_ADAPTER = TAB + "public static TypeAdapter<%1$s> typeAdapter(Gson gson) {" + NEW_LINE +
            TAB + TAB + "return new AutoValue_%1$s.GsonTypeAdapter(gson);" + NEW_LINE
            + TAB + "}" + NEW_LINE;

    String SETTER = TAB + "public void set%1$s(%2$s %3$s){" + NEW_LINE +
            TAB + TAB + "this.%3$s = %3$s;" + NEW_LINE
            + TAB + "}" + NEW_LINE;

    String GETTER = TAB + "public %3$s get%1$s(){" + NEW_LINE +
            TAB + TAB + "return %2$s;" + NEW_LINE
            + TAB + "}" + NEW_LINE;

    String GETTER_BOOLEAN = TAB + "public boolean is%1$s(){" + NEW_LINE +
            TAB + TAB + "return %2$s;" + NEW_LINE
            + TAB + "}" + NEW_LINE;
}
