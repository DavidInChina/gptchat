package fh;

import id.AbstractC3557B;

/* renamed from: fh.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3067J extends AbstractC3074a {

    /* renamed from: e  reason: collision with root package name */
    public final C3089p f30824e;

    /* renamed from: f  reason: collision with root package name */
    public int f30825f = 128;

    /* renamed from: g  reason: collision with root package name */
    public final C3078e f30826g;

    public C3067J(C3089p c3089p, char[] cArr) {
        this.f30824e = c3089p;
        this.f30826g = new C3078e(cArr);
        E(0);
    }

    @Override // fh.AbstractC3074a
    public final String A(int i10, int i11) {
        C3078e c3078e = this.f30826g;
        return Lg.n.Y1(c3078e.f30869Y, i10, Math.min(i11, c3078e.f30870Z));
    }

    @Override // fh.AbstractC3074a
    public final boolean B() {
        int z10 = z();
        C3078e c3078e = this.f30826g;
        if (z10 >= c3078e.f30870Z || z10 == -1 || c3078e.f30869Y[z10] != ',') {
            return false;
        }
        this.f30855a++;
        return true;
    }

    public final void E(int i10) {
        C3078e c3078e = this.f30826g;
        char[] cArr = c3078e.f30869Y;
        if (i10 != 0) {
            int i11 = this.f30855a;
            kf.q.Y2(cArr, cArr, 0, i11, i11 + i10);
        }
        int i12 = c3078e.f30870Z;
        while (true) {
            if (i10 == i12) {
                break;
            }
            C3089p c3089p = this.f30824e;
            c3089p.getClass();
            AbstractC3557B.c0("buffer", cArr);
            int a5 = c3089p.f30889a.a(cArr, i10, i12 - i10);
            if (a5 == -1) {
                c3078e.f30870Z = Math.min(c3078e.f30869Y.length, i10);
                this.f30825f = -1;
                break;
            }
            i10 += a5;
        }
        this.f30855a = 0;
    }

    @Override // fh.AbstractC3074a
    public final void b(int i10, int i11) {
        this.f30858d.append(this.f30826g.f30869Y, i10, i11 - i10);
    }

    @Override // fh.AbstractC3074a
    public final boolean c() {
        o();
        int i10 = this.f30855a;
        while (true) {
            int y10 = y(i10);
            boolean z10 = false;
            if (y10 != -1) {
                char c10 = this.f30826g.f30869Y[y10];
                if (c10 != ' ' && c10 != '\n' && c10 != '\r' && c10 != '\t') {
                    this.f30855a = y10;
                    if (c10 == '}' || c10 == ']' || c10 == ':' || c10 == ',') {
                        z10 = true;
                    }
                    return !z10;
                }
                i10 = y10 + 1;
            } else {
                this.f30855a = y10;
                return false;
            }
        }
    }

    @Override // fh.AbstractC3074a
    public final String e() {
        char[] cArr;
        h('\"');
        int i10 = this.f30855a;
        C3078e c3078e = this.f30826g;
        int i11 = c3078e.f30870Z;
        int i12 = i10;
        while (true) {
            cArr = c3078e.f30869Y;
            if (i12 < i11) {
                if (cArr[i12] == '\"') {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 == -1) {
            int y10 = y(i10);
            if (y10 != -1) {
                return k(this.f30855a, y10, c3078e);
            }
            s((byte) 1, true);
            throw null;
        }
        for (int i13 = i10; i13 < i12; i13++) {
            if (cArr[i13] == '\\') {
                return k(this.f30855a, i13, c3078e);
            }
        }
        this.f30855a = i12 + 1;
        return Lg.n.Y1(cArr, i10, Math.min(i12, c3078e.f30870Z));
    }

    @Override // fh.AbstractC3074a
    public final byte f() {
        o();
        int i10 = this.f30855a;
        while (true) {
            int y10 = y(i10);
            if (y10 != -1) {
                int i11 = y10 + 1;
                byte R10 = Ad.l.R(this.f30826g.f30869Y[y10]);
                if (R10 != 3) {
                    this.f30855a = i11;
                    return R10;
                }
                i10 = i11;
            } else {
                this.f30855a = y10;
                return (byte) 10;
            }
        }
    }

    @Override // fh.AbstractC3074a
    public final void o() {
        int i10 = this.f30826g.f30870Z - this.f30855a;
        if (i10 > this.f30825f) {
            return;
        }
        E(i10);
    }

    @Override // fh.AbstractC3074a
    public final CharSequence u() {
        return this.f30826g;
    }

    @Override // fh.AbstractC3074a
    public final String v(String str, boolean z10) {
        AbstractC3557B.c0("keyToMatch", str);
        return null;
    }

    @Override // fh.AbstractC3074a
    public final int y(int i10) {
        C3078e c3078e = this.f30826g;
        if (i10 < c3078e.f30870Z) {
            return i10;
        }
        this.f30855a = i10;
        o();
        if (this.f30855a == 0 && c3078e.length() != 0) {
            return 0;
        }
        return -1;
    }
}
