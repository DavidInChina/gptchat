package android.gov.nist.core;

import java.io.PrintStream;
import java.text.ParseException;

/* loaded from: classes2.dex */
public class HostNameParser extends ParserCore {
    private static boolean stripAddressScopeZones = Boolean.getBoolean("android.gov.nist.core.STRIP_ADDR_SCOPES");
    private static final char[] VALID_DOMAIN_LABEL_CHAR = {'\ufffd', '-', '.', '_'};

    public HostNameParser(String str) {
        this.lexer = new LexerCore("charLexer", str);
    }

    private boolean isIPv6Address(String str) {
        int indexOf = str.indexOf(Separators.COMMA);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        int indexOf2 = str.indexOf(63);
        int indexOf3 = str.indexOf(59);
        if (indexOf2 == -1 || (indexOf3 != -1 && indexOf2 > indexOf3)) {
            indexOf2 = indexOf3;
        }
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        String substring = str.substring(0, indexOf2);
        int indexOf4 = substring.indexOf(58);
        if (indexOf4 == -1 || substring.indexOf(58, indexOf4 + 1) == -1) {
            return false;
        }
        return true;
    }

    public static void main(String[] strArr) {
        String[] strArr2 = {"foo.bar.com:1234", "proxima.chaplin.bt.co.uk", "129.6.55.181:2345", ":1234", "foo.bar.com:         1234", "foo.bar.com     :      1234   ", "MIK_S:1234"};
        for (int i10 = 0; i10 < 7; i10++) {
            try {
                HostPort hostPort = new HostNameParser(strArr2[i10]).hostPort(true);
                PrintStream printStream = System.out;
                printStream.println("[" + hostPort.encode() + "]");
            } catch (ParseException e10) {
                PrintStream printStream2 = System.out;
                printStream2.println("exception text = " + e10.getMessage());
            }
        }
    }

    public void consumeDomainLabel() {
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("domainLabel");
        }
        try {
            this.lexer.consumeValidChars(VALID_DOMAIN_LABEL_CHAR);
            if (z10) {
                dbg_leave("domainLabel");
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("domainLabel");
            }
            throw th2;
        }
    }

    public Host host() {
        String str;
        boolean z10 = ParserCore.debug;
        if (z10) {
            dbg_enter("host");
        }
        try {
            if (this.lexer.lookAhead(0) == '[') {
                str = ipv6Reference();
            } else if (isIPv6Address(this.lexer.getRest())) {
                int ptr = this.lexer.getPtr();
                this.lexer.consumeValidChars(new char[]{'\ufffd', ':'});
                str = "[" + this.lexer.getBuffer().substring(ptr, this.lexer.getPtr()) + "]";
            } else {
                int ptr2 = this.lexer.getPtr();
                consumeDomainLabel();
                str = this.lexer.getBuffer().substring(ptr2, this.lexer.getPtr());
            }
            if (str.length() != 0) {
                Host host = new Host(str);
                if (z10) {
                    dbg_leave("host");
                }
                return host;
            }
            throw new ParseException(this.lexer.getBuffer() + ": Missing host name", this.lexer.getPtr());
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("host");
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:5:0x0009, B:7:0x0017, B:10:0x0020, B:12:0x0028, B:35:0x005c, B:37:0x0064, B:38:0x0069, B:39:0x0077, B:40:0x0099, B:41:0x009a, B:46:0x00a2, B:47:0x00cd), top: B:57:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HostPort hostPort(boolean z10) {
        char lookAhead;
        boolean z11 = ParserCore.debug;
        if (z11) {
            dbg_enter("hostPort");
        }
        try {
            Host host = host();
            HostPort hostPort = new HostPort();
            hostPort.setHost(host);
            if (z10) {
                this.lexer.SPorHT();
            }
            if (this.lexer.hasMoreChars() && (lookAhead = this.lexer.lookAhead(0)) != '\t' && lookAhead != '\n' && lookAhead != '\r' && lookAhead != ' ') {
                if (lookAhead != '%') {
                    if (lookAhead != ',' && lookAhead != '/') {
                        if (lookAhead != ':') {
                            if (lookAhead != ';' && lookAhead != '>' && lookAhead != '?') {
                                if (z10) {
                                    throw new ParseException(this.lexer.getBuffer() + " Illegal character in hostname:" + this.lexer.lookAhead(0), this.lexer.getPtr());
                                }
                            }
                        } else {
                            this.lexer.consume(1);
                            if (z10) {
                                this.lexer.SPorHT();
                            }
                            try {
                                hostPort.setPort(Integer.parseInt(this.lexer.number()));
                            } catch (NumberFormatException unused) {
                                throw new ParseException(this.lexer.getBuffer() + " :Error parsing port ", this.lexer.getPtr());
                            }
                        }
                    }
                } else {
                    if (stripAddressScopeZones) {
                    }
                    if (z10) {
                    }
                }
            }
            if (z11) {
                dbg_leave("hostPort");
            }
            return hostPort;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("hostPort");
            }
            throw th2;
        }
    }

    public String ipv6Reference() {
        int indexOf;
        StringBuilder sb2 = new StringBuilder();
        if (ParserCore.debug) {
            dbg_enter("ipv6Reference");
        }
        try {
            if (!stripAddressScopeZones) {
                while (true) {
                    if (!this.lexer.hasMoreChars()) {
                        break;
                    }
                    char lookAhead = this.lexer.lookAhead(0);
                    if (!StringTokenizer.isHexDigit(lookAhead) && lookAhead != '.' && lookAhead != ':' && lookAhead != '[') {
                        if (lookAhead == ']') {
                            this.lexer.consume(1);
                            sb2.append(lookAhead);
                            String sb3 = sb2.toString();
                            if (ParserCore.debug) {
                                dbg_leave("ipv6Reference");
                            }
                            return sb3;
                        }
                    }
                    this.lexer.consume(1);
                    sb2.append(lookAhead);
                }
            } else {
                while (true) {
                    if (!this.lexer.hasMoreChars()) {
                        break;
                    }
                    char lookAhead2 = this.lexer.lookAhead(0);
                    if (!StringTokenizer.isHexDigit(lookAhead2) && lookAhead2 != '.' && lookAhead2 != ':' && lookAhead2 != '[') {
                        if (lookAhead2 == ']') {
                            this.lexer.consume(1);
                            sb2.append(lookAhead2);
                            return sb2.toString();
                        } else if (lookAhead2 == '%') {
                            this.lexer.consume(1);
                            String rest = this.lexer.getRest();
                            if (rest != null && rest.length() != 0 && (indexOf = rest.indexOf(93)) != -1) {
                                this.lexer.consume(indexOf + 1);
                                sb2.append("]");
                                String sb4 = sb2.toString();
                                if (ParserCore.debug) {
                                    dbg_leave("ipv6Reference");
                                }
                                return sb4;
                            }
                        }
                    }
                    this.lexer.consume(1);
                    sb2.append(lookAhead2);
                }
            }
            throw new ParseException(this.lexer.getBuffer() + ": Illegal Host name ", this.lexer.getPtr());
        } finally {
            if (ParserCore.debug) {
                dbg_leave("ipv6Reference");
            }
        }
    }

    public HostNameParser(LexerCore lexerCore) {
        this.lexer = lexerCore;
        lexerCore.selectLexer("charLexer");
    }
}
