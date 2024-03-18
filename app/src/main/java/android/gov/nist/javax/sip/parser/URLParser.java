package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.HostNameParser;
import android.gov.nist.core.LexerCore;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StringTokenizer;
import android.gov.nist.core.Token;
import android.gov.nist.javax.sip.address.GenericURI;
import android.gov.nist.javax.sip.address.SipUri;
import android.gov.nist.javax.sip.address.TelURLImpl;
import android.gov.nist.javax.sip.address.TelephoneNumber;
import java.io.PrintStream;
import java.text.ParseException;

/* loaded from: classes.dex */
public class URLParser extends Parser {
    public URLParser(String str) {
        this.lexer = new Lexer("sip_urlLexer", str);
    }

    private String base_phone_number() {
        StringBuilder sb2 = new StringBuilder();
        if (ParserCore.debug) {
            dbg_enter("base_phone_number");
        }
        int i10 = 0;
        while (true) {
            try {
                if (!this.lexer.hasMoreChars()) {
                    break;
                }
                char lookAhead = this.lexer.lookAhead(0);
                if (!StringTokenizer.isDigit(lookAhead) && lookAhead != '-' && lookAhead != '.' && lookAhead != '(' && lookAhead != ')') {
                    if (i10 <= 0) {
                        throw createParseException("unexpected " + lookAhead);
                    }
                }
                this.lexer.consume(1);
                sb2.append(lookAhead);
                i10++;
            } catch (Throwable th2) {
                if (ParserCore.debug) {
                    dbg_leave("base_phone_number");
                }
                throw th2;
            }
        }
        String sb3 = sb2.toString();
        if (ParserCore.debug) {
            dbg_leave("base_phone_number");
        }
        return sb3;
    }

    private final TelephoneNumber global_phone_number(boolean z10) {
        boolean z11 = ParserCore.debug;
        if (z11) {
            dbg_enter("global_phone_number");
        }
        try {
            TelephoneNumber telephoneNumber = new TelephoneNumber();
            telephoneNumber.setGlobal(true);
            this.lexer.match(43);
            telephoneNumber.setPhoneNumber(base_phone_number());
            if (this.lexer.hasMoreChars() && this.lexer.lookAhead(0) == ';' && z10) {
                this.lexer.consume(1);
                telephoneNumber.setParameters(tel_parameters());
            }
            if (z11) {
                dbg_leave("global_phone_number");
            }
            return telephoneNumber;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("global_phone_number");
            }
            throw th2;
        }
    }

    public static boolean isMark(char c10) {
        if (c10 == '!' || c10 == '_' || c10 == '~' || c10 == '-' || c10 == '.') {
            return true;
        }
        switch (c10) {
            case '\'':
            case '(':
            case ')':
            case '*':
                return true;
            default:
                return false;
        }
    }

    public static boolean isReserved(char c10) {
        return c10 == '$' || c10 == '&' || c10 == '/' || c10 == '=' || c10 == '+' || c10 == ',' || c10 == ':' || c10 == ';' || c10 == '?' || c10 == '@';
    }

    public static boolean isReservedNoSlash(char c10) {
        return c10 == '$' || c10 == '&' || c10 == '+' || c10 == ',' || c10 == ':' || c10 == ';' || c10 == '?' || c10 == '@';
    }

    public static boolean isUnreserved(char c10) {
        if (!StringTokenizer.isAlphaDigit(c10) && !isMark(c10)) {
            return false;
        }
        return true;
    }

    public static boolean isUserUnreserved(char c10) {
        return c10 == '#' || c10 == '$' || c10 == '&' || c10 == '/' || c10 == ';' || c10 == '=' || c10 == '?' || c10 == '+' || c10 == ',';
    }

    private String local_number() {
        StringBuilder sb2 = new StringBuilder();
        if (ParserCore.debug) {
            dbg_enter("local_number");
        }
        int i10 = 0;
        while (true) {
            try {
                if (!this.lexer.hasMoreChars()) {
                    break;
                }
                char lookAhead = this.lexer.lookAhead(0);
                if (lookAhead != '*' && lookAhead != '#' && lookAhead != '-' && lookAhead != '.' && lookAhead != '(' && lookAhead != ')' && !StringTokenizer.isHexDigit(lookAhead)) {
                    if (i10 <= 0) {
                        throw createParseException("unexepcted " + lookAhead);
                    }
                }
                this.lexer.consume(1);
                sb2.append(lookAhead);
                i10++;
            } catch (Throwable th2) {
                if (ParserCore.debug) {
                    dbg_leave("local_number");
                }
                throw th2;
            }
        }
        String sb3 = sb2.toString();
        if (ParserCore.debug) {
            dbg_leave("local_number");
        }
        return sb3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        dbg_leave("local_phone_number");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private TelephoneNumber local_phone_number(boolean z10) {
        boolean z11 = ParserCore.debug;
        if (z11) {
            dbg_enter("local_phone_number");
        }
        TelephoneNumber telephoneNumber = new TelephoneNumber();
        telephoneNumber.setGlobal(false);
        try {
            telephoneNumber.setPhoneNumber(local_number());
            if (this.lexer.hasMoreChars() && this.lexer.peekNextToken().getTokenType() == 59 && z10) {
                this.lexer.consume(1);
                telephoneNumber.setParameters(tel_parameters());
            }
            return telephoneNumber;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("local_phone_number");
            }
            throw th2;
        }
    }

    public static void main(String[] strArr) {
        String[] strArr2 = {"sip:alice@example.com", "sips:alice@examples.com", "sip:3Zqkv5dajqaaas0tCjCxT0xH2ZEuEMsFl0xoasip%3A%2B3519116786244%40siplab.domain.com@213.0.115.163:7070"};
        for (int i10 = 0; i10 < 3; i10++) {
            GenericURI parse = new URLParser(strArr2[i10]).parse();
            PrintStream printStream = System.out;
            printStream.println("uri type returned ".concat(parse.getClass().getName()));
            printStream.println(strArr2[i10] + " is SipUri? " + parse.isSipURI() + Separators.GREATER_THAN + parse.encode());
        }
    }

    private NameValue phone_context() {
        String str;
        this.lexer.match(61);
        char lookAhead = this.lexer.lookAhead(0);
        if (lookAhead == '+') {
            this.lexer.consume(1);
            str = "+" + base_phone_number();
        } else if (StringTokenizer.isAlphaDigit(lookAhead)) {
            str = this.lexer.match(4095).getTokenValue();
        } else {
            throw new ParseException("Invalid phone-context:" + lookAhead, -1);
        }
        return new NameValue("phone-context", str, false);
    }

    private NameValueList tel_parameters() {
        NameValue nameValue;
        NameValueList nameValueList = new NameValueList();
        while (true) {
            String paramNameOrValue = paramNameOrValue();
            if (paramNameOrValue.equalsIgnoreCase("phone-context")) {
                nameValue = phone_context();
            } else if (this.lexer.lookAhead(0) == '=') {
                this.lexer.consume(1);
                nameValue = new NameValue(paramNameOrValue, paramNameOrValue(), false);
            } else {
                nameValue = new NameValue(paramNameOrValue, "", true);
            }
            nameValueList.set(nameValue);
            if (this.lexer.lookAhead(0) == ';') {
                this.lexer.consume(1);
            } else {
                return nameValueList;
            }
        }
    }

    private NameValue uriParam() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("uriParam");
        }
        try {
            String str = "";
            String paramNameOrValue = paramNameOrValue();
            boolean z11 = false;
            if (this.lexer.lookAhead(0) == '=') {
                this.lexer.consume(1);
                str = paramNameOrValue();
            } else {
                z11 = true;
            }
            if (paramNameOrValue.length() == 0 && (str == null || str.length() == 0)) {
                if (z10) {
                    dbg_leave("uriParam");
                    return null;
                }
                return null;
            }
            NameValue nameValue = new NameValue(paramNameOrValue, str, z11);
            if (z10) {
                dbg_leave("uriParam");
            }
            return nameValue;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("uriParam");
            }
            throw th2;
        }
    }

    public String escaped() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("escaped");
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            char lookAhead = this.lexer.lookAhead(0);
            char lookAhead2 = this.lexer.lookAhead(1);
            char lookAhead3 = this.lexer.lookAhead(2);
            if (lookAhead == '%' && StringTokenizer.isHexDigit(lookAhead2) && StringTokenizer.isHexDigit(lookAhead3)) {
                this.lexer.consume(3);
                sb2.append(lookAhead);
                sb2.append(lookAhead2);
                sb2.append(lookAhead3);
                String sb3 = sb2.toString();
                if (z10) {
                    dbg_leave("escaped");
                }
                return sb3;
            }
            throw createParseException("escaped");
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("escaped");
            }
            throw th2;
        }
    }

    public String hvalue() {
        StringBuilder sb2 = new StringBuilder();
        while (this.lexer.hasMoreChars()) {
            char lookAhead = this.lexer.lookAhead(0);
            if (lookAhead != '!' && lookAhead != '\"' && lookAhead != '$' && lookAhead != ':' && lookAhead != '?' && lookAhead != '[' && lookAhead != ']' && lookAhead != '_' && lookAhead != '~') {
                switch (lookAhead) {
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                        break;
                    default:
                        switch (lookAhead) {
                            case '-':
                            case '.':
                            case '/':
                                break;
                            default:
                                if (StringTokenizer.isAlphaDigit(lookAhead)) {
                                    break;
                                } else if (lookAhead == '%') {
                                    sb2.append(escaped());
                                    continue;
                                    continue;
                                } else {
                                    return sb2.toString();
                                }
                        }
                }
            }
            this.lexer.consume(1);
            sb2.append(lookAhead);
        }
        return sb2.toString();
    }

    public boolean isEscaped() {
        try {
            if (this.lexer.lookAhead(0) != '%' || !StringTokenizer.isHexDigit(this.lexer.lookAhead(1))) {
                return false;
            }
            if (!StringTokenizer.isHexDigit(this.lexer.lookAhead(2))) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public String mark() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("mark");
        }
        try {
            char lookAhead = this.lexer.lookAhead(0);
            if (isMark(lookAhead)) {
                this.lexer.consume(1);
                String str = new String(new char[]{lookAhead});
                if (z10) {
                    dbg_leave("mark");
                }
                return str;
            }
            throw createParseException("mark");
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("mark");
            }
            throw th2;
        }
    }

    public String paramNameOrValue() {
        int ptr = this.lexer.getPtr();
        while (this.lexer.hasMoreChars()) {
            char lookAhead = this.lexer.lookAhead(0);
            if (lookAhead != '$' && lookAhead != '&' && lookAhead != '+' && lookAhead != '/' && lookAhead != ':' && lookAhead != '[' && lookAhead != ']' && !isUnreserved(lookAhead)) {
                if (!isEscaped()) {
                    break;
                }
                this.lexer.consume(3);
            } else {
                this.lexer.consume(1);
            }
        }
        return this.lexer.getBuffer().substring(ptr, this.lexer.getPtr());
    }

    public GenericURI parse() {
        return uriReference(true);
    }

    public final TelephoneNumber parseTelephoneNumber(boolean z10) {
        TelephoneNumber telephoneNumber;
        boolean z11 = ParserCore.debug;
        if (z11) {
            dbg_enter("telephone_subscriber");
        }
        this.lexer.selectLexer("charLexer");
        try {
            char lookAhead = this.lexer.lookAhead(0);
            if (lookAhead == '+') {
                telephoneNumber = global_phone_number(z10);
            } else {
                if (!StringTokenizer.isHexDigit(lookAhead) && lookAhead != '#' && lookAhead != '*' && lookAhead != '-' && lookAhead != '.' && lookAhead != '(' && lookAhead != ')') {
                    throw createParseException("unexpected char " + lookAhead);
                }
                telephoneNumber = local_phone_number(z10);
            }
            if (z11) {
                dbg_leave("telephone_subscriber");
            }
            return telephoneNumber;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("telephone_subscriber");
            }
            throw th2;
        }
    }

    public String password() {
        int ptr = this.lexer.getPtr();
        while (true) {
            char lookAhead = this.lexer.lookAhead(0);
            if (lookAhead != '$' && lookAhead != '&' && lookAhead != '=' && lookAhead != '+' && lookAhead != ',' && !isUnreserved(lookAhead)) {
                if (isEscaped()) {
                    this.lexer.consume(3);
                } else {
                    return this.lexer.getBuffer().substring(ptr, this.lexer.getPtr());
                }
            } else {
                this.lexer.consume(1);
            }
        }
    }

    public String peekScheme() {
        return this.lexer.getString(':');
    }

    public NameValue qheader() {
        String nextToken = this.lexer.getNextToken('=');
        this.lexer.consume(1);
        return new NameValue(nextToken, hvalue(), false);
    }

    public String reserved() {
        char lookAhead = this.lexer.lookAhead(0);
        if (isReserved(lookAhead)) {
            this.lexer.consume(1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(lookAhead);
            return sb2.toString();
        }
        throw createParseException("reserved");
    }

    public SipUri sipURL(boolean z10) {
        String str;
        String str2;
        if (ParserCore.debug) {
            dbg_enter("sipURL");
        }
        SipUri sipUri = new SipUri();
        int tokenType = this.lexer.peekNextToken().getTokenType();
        int i10 = TokenTypes.SIPS;
        if (tokenType == 2136) {
            str = "sips";
        } else {
            i10 = TokenTypes.SIP;
            str = "sip";
        }
        try {
            this.lexer.match(i10);
            this.lexer.match(58);
            sipUri.setScheme(str);
            int markInputPosition = this.lexer.markInputPosition();
            String user = user();
            if (this.lexer.lookAhead() == ':') {
                this.lexer.consume(1);
                str2 = password();
            } else {
                str2 = null;
            }
            if (this.lexer.lookAhead() == '@') {
                this.lexer.consume(1);
                sipUri.setUser(user);
                if (str2 != null) {
                    sipUri.setUserPassword(str2);
                }
            } else {
                this.lexer.rewindInputPosition(markInputPosition);
            }
            sipUri.setHostPort(new HostNameParser(getLexer()).hostPort(false));
            this.lexer.selectLexer("charLexer");
            while (this.lexer.hasMoreChars() && this.lexer.lookAhead(0) == ';' && z10) {
                this.lexer.consume(1);
                NameValue uriParam = uriParam();
                if (uriParam != null) {
                    sipUri.setUriParameter(uriParam);
                }
            }
            if (this.lexer.hasMoreChars() && this.lexer.lookAhead(0) == '?') {
                this.lexer.consume(1);
                while (this.lexer.hasMoreChars()) {
                    sipUri.setQHeader(qheader());
                    if (!this.lexer.hasMoreChars() || this.lexer.lookAhead(0) == '&') {
                        this.lexer.consume(1);
                    }
                }
            }
            return sipUri;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("sipURL");
            }
        }
    }

    public TelURLImpl telURL(boolean z10) {
        this.lexer.match(TokenTypes.TEL);
        this.lexer.match(58);
        TelephoneNumber parseTelephoneNumber = parseTelephoneNumber(z10);
        TelURLImpl telURLImpl = new TelURLImpl();
        telURLImpl.setTelephoneNumber(parseTelephoneNumber);
        return telURLImpl;
    }

    public String unreserved() {
        char lookAhead = this.lexer.lookAhead(0);
        if (isUnreserved(lookAhead)) {
            this.lexer.consume(1);
            return String.valueOf(lookAhead);
        }
        throw createParseException("unreserved");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GenericURI uriReference(boolean z10) {
        GenericURI genericURI;
        boolean z11 = ParserCore.debug;
        if (z11) {
            dbg_enter("uriReference");
        }
        Token[] peekNextToken = this.lexer.peekNextToken(2);
        Token token = peekNextToken[0];
        Token token2 = peekNextToken[1];
        try {
            if (token.getTokenType() != 2051 && token.getTokenType() != 2136) {
                if (token.getTokenType() == 2105) {
                    if (token2.getTokenType() == 58) {
                        genericURI = telURL(z10);
                    } else {
                        throw createParseException("Expecting ':'");
                    }
                } else {
                    try {
                        genericURI = new GenericURI(uricString());
                    } catch (ParseException e10) {
                        throw createParseException(e10.getMessage());
                    }
                }
                if (z11) {
                    dbg_leave("uriReference");
                }
                return genericURI;
            }
            if (token2.getTokenType() == 58) {
                genericURI = sipURL(z10);
                if (z11) {
                }
                return genericURI;
            }
            throw createParseException("Expecting ':'");
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("uriReference");
            }
            throw th2;
        }
    }

    public String uric() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("uric");
        }
        try {
            char lookAhead = this.lexer.lookAhead(0);
            if (isUnreserved(lookAhead)) {
                this.lexer.consume(1);
                String charAsString = LexerCore.charAsString(lookAhead);
                if (z10) {
                    dbg_leave("uric");
                }
                return charAsString;
            } else if (isReserved(lookAhead)) {
                this.lexer.consume(1);
                String charAsString2 = LexerCore.charAsString(lookAhead);
                if (z10) {
                    dbg_leave("uric");
                }
                return charAsString2;
            } else if (isEscaped()) {
                String charAsString3 = this.lexer.charAsString(3);
                this.lexer.consume(3);
                if (z10) {
                    dbg_leave("uric");
                }
                return charAsString3;
            } else {
                if (z10) {
                    dbg_leave("uric");
                }
                return null;
            }
        } catch (Exception unused) {
            if (ParserCore.debug) {
                dbg_leave("uric");
            }
            return null;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("uric");
            }
            throw th2;
        }
    }

    public String uricNoSlash() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("uricNoSlash");
        }
        try {
            char lookAhead = this.lexer.lookAhead(0);
            if (isEscaped()) {
                String charAsString = this.lexer.charAsString(3);
                this.lexer.consume(3);
                if (z10) {
                    dbg_leave("uricNoSlash");
                }
                return charAsString;
            } else if (isUnreserved(lookAhead)) {
                this.lexer.consume(1);
                String charAsString2 = LexerCore.charAsString(lookAhead);
                if (z10) {
                    dbg_leave("uricNoSlash");
                }
                return charAsString2;
            } else if (isReservedNoSlash(lookAhead)) {
                this.lexer.consume(1);
                String charAsString3 = LexerCore.charAsString(lookAhead);
                if (z10) {
                    dbg_leave("uricNoSlash");
                }
                return charAsString3;
            } else {
                if (z10) {
                    dbg_leave("uricNoSlash");
                }
                return null;
            }
        } catch (ParseException unused) {
            if (ParserCore.debug) {
                dbg_leave("uricNoSlash");
            }
            return null;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("uricNoSlash");
            }
            throw th2;
        }
    }

    public String uricString() {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String uric = uric();
            if (uric == null) {
                if (this.lexer.lookAhead(0) == '[') {
                    sb2.append(new HostNameParser(getLexer()).hostPort(false).toString());
                } else {
                    return sb2.toString();
                }
            } else {
                sb2.append(uric);
            }
        }
    }

    public String urlString() {
        char lookAhead;
        StringBuilder sb2 = new StringBuilder();
        this.lexer.selectLexer("charLexer");
        while (this.lexer.hasMoreChars() && (lookAhead = this.lexer.lookAhead(0)) != ' ' && lookAhead != '\t' && lookAhead != '\n' && lookAhead != '>' && lookAhead != '<') {
            this.lexer.consume(0);
            sb2.append(lookAhead);
        }
        return sb2.toString();
    }

    public String user() {
        if (ParserCore.debug) {
            dbg_enter("user");
        }
        try {
            int ptr = this.lexer.getPtr();
            while (this.lexer.hasMoreChars()) {
                char lookAhead = this.lexer.lookAhead(0);
                if (!isUnreserved(lookAhead) && !isUserUnreserved(lookAhead)) {
                    if (!isEscaped()) {
                        break;
                    }
                    this.lexer.consume(3);
                }
                this.lexer.consume(1);
            }
            String substring = this.lexer.getBuffer().substring(ptr, this.lexer.getPtr());
            if (ParserCore.debug) {
                dbg_leave("user");
            }
            return substring;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("user");
            }
            throw th2;
        }
    }

    public URLParser(Lexer lexer) {
        this.lexer = lexer;
        lexer.selectLexer("sip_urlLexer");
    }
}
