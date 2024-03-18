package android.gov.nist.javax.sdp.parser;

import android.gov.nist.javax.sdp.fields.SDPField;
import android.gov.nist.javax.sdp.fields.TimeField;
import android.gov.nist.javax.sdp.fields.TypedTime;

/* loaded from: classes2.dex */
public class TimeFieldParser extends SDPParser {
    public TimeFieldParser(String str) {
        this.lexer = new Lexer("charLexer", str);
    }

    private long getTime() {
        try {
            String number = this.lexer.number();
            if (number.length() > 18) {
                number = number.substring(number.length() - 18);
            }
            return Long.parseLong(number);
        } catch (NumberFormatException unused) {
            throw this.lexer.createParseException();
        }
    }

    public TypedTime getTypedTime(String str) {
        TypedTime typedTime = new TypedTime();
        if (str.endsWith("d")) {
            typedTime.setUnit("d");
            typedTime.setTime(Integer.parseInt(str.replace('d', ' ').trim()));
        } else if (str.endsWith("h")) {
            typedTime.setUnit("h");
            typedTime.setTime(Integer.parseInt(str.replace('h', ' ').trim()));
        } else if (str.endsWith("m")) {
            typedTime.setUnit("m");
            typedTime.setTime(Integer.parseInt(str.replace('m', ' ').trim()));
        } else {
            typedTime.setUnit("s");
            if (str.endsWith("s")) {
                typedTime.setTime(Integer.parseInt(str.replace('s', ' ').trim()));
            } else {
                typedTime.setTime(Integer.parseInt(str.trim()));
            }
        }
        return typedTime;
    }

    @Override // android.gov.nist.javax.sdp.parser.SDPParser
    public SDPField parse() {
        return timeField();
    }

    public TimeField timeField() {
        try {
            this.lexer.match(116);
            this.lexer.SPorHT();
            this.lexer.match(61);
            this.lexer.SPorHT();
            TimeField timeField = new TimeField();
            timeField.setStartTime(getTime());
            this.lexer.SPorHT();
            timeField.setStopTime(getTime());
            return timeField;
        } catch (Exception unused) {
            throw this.lexer.createParseException();
        }
    }
}
