package ui;

import D1.C0373t;
import S4.o;
import java.util.BitSet;
import p3.H;
import ti.l;
import wi.s;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final y7.b f46826a;

    /* renamed from: b  reason: collision with root package name */
    public static final y7.b f46827b;

    /* renamed from: c  reason: collision with root package name */
    public static final y7.b f46828c;

    /* renamed from: d  reason: collision with root package name */
    public static final y7.b f46829d;

    /* renamed from: e  reason: collision with root package name */
    public static final y7.b f46830e;

    /* renamed from: f  reason: collision with root package name */
    public static final y7.b f46831f;

    static {
        o e10 = y7.b.e();
        e10.o('A', 'Z');
        e10.o('a', 'z');
        y7.b f6 = e10.f();
        f46826a = f6;
        f46827b = f6;
        o p10 = f6.p();
        p10.o('0', '9');
        p10.g('-');
        f46828c = p10.f();
        o p11 = f6.p();
        p11.g('_');
        p11.g(':');
        y7.b f10 = p11.f();
        f46829d = f10;
        o p12 = f10.p();
        p12.o('0', '9');
        p12.g('.');
        p12.g('-');
        f46830e = p12.f();
        o e11 = y7.b.e();
        e11.g(' ');
        e11.g('\t');
        e11.g('\n');
        e11.g((char) 11);
        e11.g('\f');
        e11.g('\r');
        e11.g('\"');
        e11.g('\'');
        e11.g('=');
        e11.g('<');
        e11.g('>');
        e11.g('`');
        f46831f = e11.f();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [wi.s, wi.l] */
    public static i b(C0373t c0373t, H h10) {
        String e10 = h10.e(c0373t, h10.n()).e();
        ?? sVar = new s();
        sVar.f48599g = e10;
        return new i(sVar, h10.n());
    }

    @Override // ui.h
    public final i a(l lVar) {
        boolean z10;
        H h10 = lVar.f46293e;
        C0373t n10 = h10.n();
        h10.j();
        char m10 = h10.m();
        y7.b bVar = f46827b;
        boolean z11 = ((BitSet) bVar.f50831Z).get(m10);
        y7.b bVar2 = f46828c;
        if (z11) {
            h10.j();
            h10.g(bVar2);
            if (h10.p() >= 1) {
                while (h10.g(f46829d) >= 1) {
                    h10.g(f46830e);
                    int i10 = 0;
                    if (h10.p() >= 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (h10.k('=')) {
                        h10.p();
                        char m11 = h10.m();
                        if (m11 == '\'') {
                            h10.j();
                            if (h10.b('\'') >= 0) {
                                h10.j();
                            } else {
                                return null;
                            }
                        } else if (m11 == '\"') {
                            h10.j();
                            if (h10.b('\"') >= 0) {
                                h10.j();
                            } else {
                                return null;
                            }
                        } else {
                            while (true) {
                                char m12 = h10.m();
                                if (m12 != 0) {
                                    if (((BitSet) f46831f.f50831Z).get(m12)) {
                                        if (i10 <= 0) {
                                            return null;
                                        }
                                    } else {
                                        i10++;
                                        h10.j();
                                    }
                                } else {
                                    return null;
                                }
                            }
                        }
                        if (h10.p() < 1) {
                            break;
                        }
                    } else if (!z10) {
                        break;
                    }
                }
            }
            h10.k('/');
            if (h10.k('>')) {
                return b(n10, h10);
            }
            return null;
        } else if (m10 == '/') {
            h10.j();
            if (h10.g(bVar) >= 1) {
                h10.g(bVar2);
                h10.p();
                if (h10.k('>')) {
                    return b(n10, h10);
                }
                return null;
            }
            return null;
        } else if (m10 == '?') {
            h10.j();
            while (h10.b('?') > 0) {
                h10.j();
                if (h10.k('>')) {
                    return b(n10, h10);
                }
            }
            return null;
        } else if (m10 == '!') {
            h10.j();
            char m13 = h10.m();
            if (m13 == '-') {
                h10.j();
                if (h10.k('-') && !h10.k('>') && !h10.l("->")) {
                    while (h10.b('-') >= 0) {
                        if (h10.l("--")) {
                            if (h10.k('>')) {
                                return b(n10, h10);
                            }
                            return null;
                        }
                        h10.j();
                    }
                    return null;
                }
                return null;
            } else if (m13 == '[') {
                h10.j();
                if (h10.l("CDATA[")) {
                    while (h10.b(']') >= 0) {
                        if (h10.l("]]>")) {
                            return b(n10, h10);
                        }
                        h10.j();
                    }
                    return null;
                }
                return null;
            } else {
                y7.b bVar3 = f46826a;
                if (((BitSet) bVar3.f50831Z).get(m13)) {
                    h10.g(bVar3);
                    if (h10.p() > 0 && h10.b('>') >= 0) {
                        h10.j();
                        return b(n10, h10);
                    }
                    return null;
                }
                return null;
            }
        } else {
            return null;
        }
    }
}
