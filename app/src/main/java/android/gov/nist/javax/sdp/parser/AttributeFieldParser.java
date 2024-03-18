package android.gov.nist.javax.sdp.parser;

import android.gov.nist.core.NameValue;
import android.gov.nist.javax.sdp.fields.AttributeField;
import android.gov.nist.javax.sdp.fields.SDPField;
import java.text.ParseException;

/* loaded from: classes.dex */
public class AttributeFieldParser extends SDPParser {
    public AttributeFieldParser(String str) {
        this.lexer = new Lexer("charLexer", str);
    }

    public AttributeField attributeField() {
        NameValue nameValue;
        try {
            AttributeField attributeField = new AttributeField();
            this.lexer.match(97);
            this.lexer.SPorHT();
            this.lexer.match(61);
            this.lexer.SPorHT();
            new NameValue();
            int markInputPosition = this.lexer.markInputPosition();
            try {
                String nextToken = this.lexer.getNextToken(':');
                this.lexer.consume(1);
                nameValue = new NameValue(nextToken.trim(), this.lexer.getRest().trim());
            } catch (ParseException unused) {
                this.lexer.rewindInputPosition(markInputPosition);
                String rest = this.lexer.getRest();
                if (rest != null) {
                    nameValue = new NameValue(rest.trim(), null);
                } else {
                    throw new ParseException(this.lexer.getBuffer(), this.lexer.getPtr());
                }
            }
            attributeField.setAttribute(nameValue);
            this.lexer.SPorHT();
            return attributeField;
        } catch (Exception e10) {
            e10.printStackTrace();
            throw new ParseException(e10.getMessage(), 0);
        }
    }

    @Override // android.gov.nist.javax.sdp.parser.SDPParser
    public SDPField parse() {
        return attributeField();
    }
}
