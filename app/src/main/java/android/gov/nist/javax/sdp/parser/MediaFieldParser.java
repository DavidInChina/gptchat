package android.gov.nist.javax.sdp.parser;

import android.gov.nist.core.Debug;
import android.gov.nist.core.Separators;
import android.gov.nist.core.Token;
import android.gov.nist.javax.sdp.fields.MediaField;
import android.gov.nist.javax.sdp.fields.SDPField;
import java.text.ParseException;
import java.util.Vector;

/* loaded from: classes.dex */
public class MediaFieldParser extends SDPParser {
    public MediaFieldParser(String str) {
        this.lexer = new Lexer("charLexer", str);
    }

    public MediaField mediaField() {
        char lookAhead;
        if (Debug.parserDebug) {
            dbg_enter("mediaField");
        }
        try {
            try {
                MediaField mediaField = new MediaField();
                this.lexer.match(109);
                this.lexer.SPorHT();
                this.lexer.match(61);
                this.lexer.SPorHT();
                this.lexer.match(4095);
                mediaField.setMedia(this.lexer.getNextToken().getTokenValue());
                this.lexer.SPorHT();
                this.lexer.match(4095);
                mediaField.setPort(Integer.parseInt(this.lexer.getNextToken().getTokenValue()));
                this.lexer.SPorHT();
                if (this.lexer.hasMoreChars() && this.lexer.lookAhead(1) == '\n') {
                    return mediaField;
                }
                if (this.lexer.lookAhead(0) == '/') {
                    this.lexer.consume(1);
                    this.lexer.match(4095);
                    mediaField.setNports(Integer.parseInt(this.lexer.getNextToken().getTokenValue()));
                    this.lexer.SPorHT();
                }
                this.lexer.match(4095);
                String tokenValue = this.lexer.getNextToken().getTokenValue();
                while (this.lexer.lookAhead(0) == '/') {
                    this.lexer.consume(1);
                    this.lexer.match(4095);
                    Token nextToken = this.lexer.getNextToken();
                    tokenValue = tokenValue + Separators.SLASH + nextToken.getTokenValue();
                }
                mediaField.setProto(tokenValue);
                this.lexer.SPorHT();
                Vector vector = new Vector();
                while (this.lexer.hasMoreChars() && (lookAhead = this.lexer.lookAhead(0)) != '\n' && lookAhead != '\r') {
                    this.lexer.SPorHT();
                    this.lexer.match(4095);
                    Token nextToken2 = this.lexer.getNextToken();
                    this.lexer.SPorHT();
                    String trim = nextToken2.getTokenValue().trim();
                    if (!trim.equals("")) {
                        vector.add(trim);
                    }
                }
                mediaField.setFormats(vector);
                return mediaField;
            } catch (Exception e10) {
                e10.printStackTrace();
                throw new ParseException(this.lexer.getBuffer(), this.lexer.getPtr());
            }
        } finally {
            dbg_leave("mediaField");
        }
    }

    @Override // android.gov.nist.javax.sdp.parser.SDPParser
    public SDPField parse() {
        return mediaField();
    }
}
