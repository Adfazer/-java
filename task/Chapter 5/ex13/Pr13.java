/*
 * Реализуйте и испытайте фильтр протокольных записей, содержащий такие не-
 * приличные слова, как секс, наркотики и C++.
 */

import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Pr13 {
    public static void main(String[] args) {
        Logger.getGlobal().setFilter(new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
                String[] strings = {"наркотики", "секс", "C++"};
                for (int i = 0; i < strings.length; i++) {
                    if (record.getMessage().contains(strings[i])) {
                        record.setMessage(record.getMessage().replaceAll(Pattern.quote(strings[i]), ""));
                    }
                }
                return true;
            }
        });
        Logger.getGlobal().info("наркотики бывают разные для одни это - секс, для других - C++");
    }
}
