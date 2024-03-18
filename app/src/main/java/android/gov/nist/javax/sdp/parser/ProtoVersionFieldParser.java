package android.gov.nist.javax.sdp.parser;

import android.gov.nist.javax.sdp.fields.ProtoVersionField;
import android.gov.nist.javax.sdp.fields.SDPField;

/* loaded from: classes.dex */
public class ProtoVersionFieldParser extends SDPParser {
    public ProtoVersionFieldParser(String str) {
        this.lexer = new Lexer("charLexer", str);
    }

    @Override // android.gov.nist.javax.sdp.parser.SDPParser
    public SDPField parse() {
        return protoVersionField();
    }

    public ProtoVersionField protoVersionField() {
        try {
            this.lexer.match(118);
            this.lexer.SPorHT();
            this.lexer.match(61);
            this.lexer.SPorHT();
            ProtoVersionField protoVersionField = new ProtoVersionField();
            this.lexer.match(4095);
            protoVersionField.setProtoVersion(Integer.parseInt(this.lexer.getNextToken().getTokenValue()));
            this.lexer.SPorHT();
            return protoVersionField;
        } catch (Exception unused) {
            throw this.lexer.createParseException();
        }
    }
}
