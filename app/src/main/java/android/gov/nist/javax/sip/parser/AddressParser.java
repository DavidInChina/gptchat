package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.address.GenericURI;

/* loaded from: classes2.dex */
public class AddressParser extends Parser {
    public AddressParser(Lexer lexer) {
        this.lexer = lexer;
        lexer.selectLexer("charLexer");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddressImpl address(boolean z10) {
        AddressImpl addressImpl;
        char lookAhead;
        if (ParserCore.debug) {
            dbg_enter("address");
        }
        int i10 = 0;
        while (this.lexer.hasMoreChars() && (lookAhead = this.lexer.lookAhead(i10)) != '<' && lookAhead != '\"' && lookAhead != ':' && lookAhead != '/') {
            try {
                if (lookAhead != 0) {
                    i10++;
                } else {
                    throw createParseException("unexpected EOL");
                }
            } catch (Throwable th2) {
                if (ParserCore.debug) {
                    dbg_leave("address");
                }
                throw th2;
            }
        }
        char lookAhead2 = this.lexer.lookAhead(i10);
        if (lookAhead2 != '<' && lookAhead2 != '\"') {
            if (lookAhead2 != ':' && lookAhead2 != '/') {
                throw createParseException("Bad address spec");
            }
            addressImpl = new AddressImpl();
            GenericURI uriReference = new URLParser((Lexer) this.lexer).uriReference(z10);
            addressImpl.setAddressType(2);
            addressImpl.setURI(uriReference);
            if (ParserCore.debug) {
                dbg_leave("address");
            }
            return addressImpl;
        }
        addressImpl = nameAddr();
        if (ParserCore.debug) {
        }
        return addressImpl;
    }

    public AddressImpl nameAddr() {
        String str;
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("nameAddr");
        }
        try {
            if (this.lexer.lookAhead(0) == '<') {
                this.lexer.consume(1);
                this.lexer.selectLexer("sip_urlLexer");
                this.lexer.SPorHT();
                GenericURI uriReference = new URLParser((Lexer) this.lexer).uriReference(true);
                AddressImpl addressImpl = new AddressImpl();
                addressImpl.setAddressType(1);
                addressImpl.setURI(uriReference);
                this.lexer.SPorHT();
                this.lexer.match(62);
                if (z10) {
                    dbg_leave("nameAddr");
                }
                return addressImpl;
            }
            AddressImpl addressImpl2 = new AddressImpl();
            addressImpl2.setAddressType(1);
            if (this.lexer.lookAhead(0) == '\"') {
                str = this.lexer.quotedString();
                this.lexer.SPorHT();
            } else {
                str = this.lexer.getNextToken('<');
            }
            addressImpl2.setDisplayName(str.trim());
            this.lexer.match(60);
            this.lexer.SPorHT();
            GenericURI uriReference2 = new URLParser((Lexer) this.lexer).uriReference(true);
            new AddressImpl();
            addressImpl2.setAddressType(1);
            addressImpl2.setURI(uriReference2);
            this.lexer.SPorHT();
            this.lexer.match(62);
            if (z10) {
                dbg_leave("nameAddr");
            }
            return addressImpl2;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("nameAddr");
            }
            throw th2;
        }
    }

    public AddressParser(String str) {
        this.lexer = new Lexer("charLexer", str);
    }
}
