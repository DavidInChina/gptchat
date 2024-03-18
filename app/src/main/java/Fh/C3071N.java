package fh;

import id.AbstractC3557B;

/* renamed from: fh.N  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3071N extends AbstractC3074a {

    /* renamed from: e  reason: collision with root package name */
    public final String f30844e;

    public C3071N(String str) {
        AbstractC3557B.c0("source", str);
        this.f30844e = str;
    }

    @Override // fh.AbstractC3074a
    public final boolean B() {
        int z10 = z();
        String str = this.f30844e;
        if (z10 == str.length() || z10 == -1 || str.charAt(z10) != ',') {
            return false;
        }
        this.f30855a++;
        return true;
    }

    @Override // fh.AbstractC3074a
    public final boolean c() {
        int i10 = this.f30855a;
        boolean z10 = false;
        if (i10 == -1) {
            return false;
        }
        while (true) {
            String str = this.f30844e;
            if (i10 < str.length()) {
                char charAt = str.charAt(i10);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f30855a = i10;
                    if (charAt == '}' || charAt == ']' || charAt == ':' || charAt == ',') {
                        z10 = true;
                    }
                    return !z10;
                }
                i10++;
            } else {
                this.f30855a = i10;
                return false;
            }
        }
    }

    @Override // fh.AbstractC3074a
    public final String e() {
        h('\"');
        int i10 = this.f30855a;
        String str = this.f30844e;
        int k22 = Lg.n.k2(str, '\"', i10, false, 4);
        if (k22 != -1) {
            for (int i11 = i10; i11 < k22; i11++) {
                if (str.charAt(i11) == '\\') {
                    return k(this.f30855a, i11, str);
                }
            }
            this.f30855a = k22 + 1;
            String substring = str.substring(i10, k22);
            AbstractC3557B.b0("substring(...)", substring);
            return substring;
        }
        l();
        s((byte) 1, false);
        throw null;
    }

    @Override // fh.AbstractC3074a
    public final byte f() {
        byte R10;
        do {
            int i10 = this.f30855a;
            if (i10 != -1) {
                String str = this.f30844e;
                if (i10 < str.length()) {
                    int i11 = this.f30855a;
                    this.f30855a = i11 + 1;
                    R10 = Ad.l.R(str.charAt(i11));
                } else {
                    return (byte) 10;
                }
            } else {
                return (byte) 10;
            }
        } while (R10 == 3);
        return R10;
    }

    @Override // fh.AbstractC3074a
    public final void h(char c10) {
        if (this.f30855a == -1) {
            D(c10);
            throw null;
        }
        while (true) {
            int i10 = this.f30855a;
            String str = this.f30844e;
            if (i10 < str.length()) {
                int i11 = this.f30855a;
                this.f30855a = i11 + 1;
                char charAt = str.charAt(i11);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    if (charAt == c10) {
                        return;
                    }
                    D(c10);
                    throw null;
                }
            } else {
                this.f30855a = -1;
                D(c10);
                throw null;
            }
        }
    }

    @Override // fh.AbstractC3074a
    public final CharSequence u() {
        return this.f30844e;
    }

    @Override // fh.AbstractC3074a
    public final String v(String str, boolean z10) {
        AbstractC3557B.c0("keyToMatch", str);
        int i10 = this.f30855a;
        try {
            if (f() != 6) {
                return null;
            }
            if (!AbstractC3557B.K(x(z10), str)) {
                return null;
            }
            this.f30857c = null;
            if (f() != 5) {
                return null;
            }
            return x(z10);
        } finally {
            this.f30855a = i10;
            this.f30857c = null;
        }
    }

    @Override // fh.AbstractC3074a
    public final int y(int i10) {
        if (i10 >= this.f30844e.length()) {
            return -1;
        }
        return i10;
    }

    @Override // fh.AbstractC3074a
    public final int z() {
        char charAt;
        int i10 = this.f30855a;
        if (i10 == -1) {
            return i10;
        }
        while (true) {
            String str = this.f30844e;
            if (i10 >= str.length() || !((charAt = str.charAt(i10)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i10++;
        }
        this.f30855a = i10;
        return i10;
    }
}
