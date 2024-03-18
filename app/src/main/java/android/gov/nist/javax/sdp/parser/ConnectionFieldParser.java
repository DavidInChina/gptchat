package android.gov.nist.javax.sdp.parser;

import android.gov.nist.core.Host;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.ConnectionAddress;
import android.gov.nist.javax.sdp.fields.ConnectionField;
import android.gov.nist.javax.sdp.fields.SDPField;
import java.text.ParseException;

/* loaded from: classes.dex */
public class ConnectionFieldParser extends SDPParser {
    public ConnectionFieldParser(String str) {
        this.lexer = new Lexer("charLexer", str);
    }

    public ConnectionAddress connectionAddress(String str) {
        ConnectionAddress connectionAddress = new ConnectionAddress();
        int indexOf = str.indexOf(Separators.SLASH);
        if (indexOf != -1) {
            connectionAddress.setAddress(new Host(str.substring(0, indexOf)));
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(Separators.SLASH, i10);
            if (indexOf2 != -1) {
                connectionAddress.setTtl(Integer.parseInt(str.substring(i10, indexOf2).trim()));
                connectionAddress.setPort(Integer.parseInt(str.substring(indexOf2 + 1).trim()));
            } else {
                connectionAddress.setTtl(Integer.parseInt(str.substring(i10).trim()));
            }
        } else {
            connectionAddress.setAddress(new Host(str));
        }
        return connectionAddress;
    }

    public ConnectionField connectionField() {
        try {
            this.lexer.match(99);
            this.lexer.SPorHT();
            this.lexer.match(61);
            this.lexer.SPorHT();
            ConnectionField connectionField = new ConnectionField();
            this.lexer.match(4095);
            this.lexer.SPorHT();
            connectionField.setNettype(this.lexer.getNextToken().getTokenValue());
            this.lexer.match(4095);
            this.lexer.SPorHT();
            connectionField.setAddressType(this.lexer.getNextToken().getTokenValue());
            this.lexer.SPorHT();
            connectionField.setAddress(connectionAddress(this.lexer.getRest().trim()));
            return connectionField;
        } catch (Exception unused) {
            throw new ParseException(this.lexer.getBuffer(), this.lexer.getPtr());
        }
    }

    @Override // android.gov.nist.javax.sdp.parser.SDPParser
    public SDPField parse() {
        return connectionField();
    }
}
