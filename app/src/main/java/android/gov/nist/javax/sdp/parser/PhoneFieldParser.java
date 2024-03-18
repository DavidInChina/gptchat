package android.gov.nist.javax.sdp.parser;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.PhoneField;
import android.gov.nist.javax.sdp.fields.SDPField;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PhoneFieldParser extends SDPParser {
    public PhoneFieldParser(String str) {
        this.lexer = new Lexer("charLexer", str);
    }

    public String getDisplayName(String str) {
        String str2 = null;
        try {
            int indexOf = str.indexOf(Separators.LPAREN);
            int indexOf2 = str.indexOf(Separators.RPAREN);
            if (indexOf != -1) {
                str2 = str.substring(indexOf + 1, indexOf2);
            } else {
                int indexOf3 = str.indexOf(Separators.LESS_THAN);
                if (indexOf3 != -1) {
                    str2 = str.substring(0, indexOf3);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return str2;
    }

    public String getPhoneNumber(String str) {
        try {
            int indexOf = str.indexOf(Separators.LPAREN);
            if (indexOf != -1) {
                return str.substring(0, indexOf).trim();
            }
            int indexOf2 = str.indexOf(Separators.LESS_THAN);
            int indexOf3 = str.indexOf(Separators.GREATER_THAN);
            if (indexOf2 != -1) {
                return str.substring(indexOf2 + 1, indexOf3);
            }
            return str.trim();
        } catch (Exception unused) {
            throw new ParseException(this.lexer.getBuffer(), this.lexer.getPtr());
        }
    }

    @Override // android.gov.nist.javax.sdp.parser.SDPParser
    public SDPField parse() {
        return phoneField();
    }

    public PhoneField phoneField() {
        try {
            this.lexer.match(112);
            this.lexer.SPorHT();
            this.lexer.match(61);
            this.lexer.SPorHT();
            PhoneField phoneField = new PhoneField();
            String rest = this.lexer.getRest();
            phoneField.setName(getDisplayName(rest.trim()));
            phoneField.setPhoneNumber(getPhoneNumber(rest));
            return phoneField;
        } catch (Exception unused) {
            throw new ParseException(this.lexer.getBuffer(), this.lexer.getPtr());
        }
    }
}
