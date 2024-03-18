package ui;

import D1.C0373t;
import S4.o;
import java.util.BitSet;
import p3.H;
import ti.l;
import wi.y;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final y7.b f46822a;

    /* renamed from: b  reason: collision with root package name */
    public static final y7.b f46823b;

    /* renamed from: c  reason: collision with root package name */
    public static final y7.b f46824c;

    /* renamed from: d  reason: collision with root package name */
    public static final y7.b f46825d;

    static {
        o e10 = y7.b.e();
        e10.o('0', '9');
        e10.o('A', 'F');
        e10.o('a', 'f');
        f46822a = e10.f();
        o e11 = y7.b.e();
        e11.o('0', '9');
        f46823b = e11.f();
        o e12 = y7.b.e();
        e12.o('A', 'Z');
        e12.o('a', 'z');
        y7.b f6 = e12.f();
        f46824c = f6;
        o p10 = f6.p();
        p10.o('0', '9');
        f46825d = p10.f();
    }

    public static i b(C0373t c0373t, H h10) {
        return new i(new y(vi.b.a(h10.e(c0373t, h10.n()).e())), h10.n());
    }

    @Override // ui.h
    public final i a(l lVar) {
        H h10 = lVar.f46293e;
        C0373t n10 = h10.n();
        h10.j();
        char m10 = h10.m();
        if (m10 == '#') {
            h10.j();
            if (!h10.k('x') && !h10.k('X')) {
                int g10 = h10.g(f46823b);
                if (1 <= g10 && g10 <= 7 && h10.k(';')) {
                    return b(n10, h10);
                }
                return null;
            }
            int g11 = h10.g(f46822a);
            if (1 <= g11 && g11 <= 6 && h10.k(';')) {
                return b(n10, h10);
            }
            return null;
        } else if (((BitSet) f46824c.f50831Z).get(m10)) {
            h10.g(f46825d);
            if (h10.k(';')) {
                return b(n10, h10);
            }
            return null;
        } else {
            return null;
        }
    }
}
