package android.gov.nist.core;

import java.text.ParseException;

/* loaded from: classes.dex */
public abstract class ParserCore {
    public static final boolean debug = Debug.parserDebug;
    static int nesting_level;
    protected LexerCore lexer;

    public void dbg_enter(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < nesting_level; i10++) {
            sb2.append(Separators.GREATER_THAN);
        }
        if (debug) {
            System.out.println(((Object) sb2) + str + "\nlexer buffer = \n" + this.lexer.getRest());
        }
        nesting_level++;
    }

    public void dbg_leave(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < nesting_level; i10++) {
            sb2.append(Separators.LESS_THAN);
        }
        if (debug) {
            System.out.println(((Object) sb2) + str + "\nlexer buffer = \n" + this.lexer.getRest());
        }
        nesting_level--;
    }

    public NameValue nameValue(char c10) {
        boolean z10;
        boolean z11 = debug;
        if (z11) {
            dbg_enter("nameValue");
        }
        try {
            this.lexer.match(4095);
            Token nextToken = this.lexer.getNextToken();
            this.lexer.SPorHT();
            try {
                String str = "";
                boolean z12 = true;
                if (this.lexer.lookAhead(0) == c10) {
                    this.lexer.consume(1);
                    this.lexer.SPorHT();
                    char lookAhead = this.lexer.lookAhead(0);
                    if (lookAhead == '\"') {
                        str = this.lexer.quotedString();
                        z10 = true;
                        z12 = false;
                    } else {
                        if (lookAhead == '[') {
                            this.lexer.match(LexerCore.IPV6);
                            String str2 = this.lexer.getNextToken().tokenValue;
                            if (str2 != null) {
                                str = str2;
                                z12 = false;
                            }
                        } else {
                            this.lexer.match(4095);
                            String str3 = this.lexer.getNextToken().tokenValue;
                            if (str3 != null) {
                                str = str3;
                                z10 = false;
                                z12 = false;
                            }
                        }
                        z10 = false;
                    }
                    NameValue nameValue = new NameValue(nextToken.tokenValue, str, z12);
                    if (z10) {
                        nameValue.setQuotedValue();
                    }
                    if (z11) {
                        dbg_leave("nameValue");
                    }
                    return nameValue;
                }
                NameValue nameValue2 = new NameValue(nextToken.tokenValue, str, true);
                if (z11) {
                    dbg_leave("nameValue");
                }
                return nameValue2;
            } catch (ParseException unused) {
                NameValue nameValue3 = new NameValue(nextToken.tokenValue, null, false);
                if (debug) {
                    dbg_leave("nameValue");
                }
                return nameValue3;
            }
        } catch (Throwable th2) {
            if (debug) {
                dbg_leave("nameValue");
            }
            throw th2;
        }
    }

    public void peekLine(String str) {
        if (debug) {
            StringBuilder r10 = a.r(str, Separators.SP);
            r10.append(this.lexer.peekLine());
            Debug.println(r10.toString());
        }
    }

    public NameValue nameValue() {
        return nameValue('=');
    }
}
