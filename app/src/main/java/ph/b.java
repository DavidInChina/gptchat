package Ph;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: Y  reason: collision with root package name */
    public final StringBuilder f14258Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f14259Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f14260h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f14261i0;

    public b(StringBuilder sb2) {
        super(589824);
        this.f14261i0 = 1;
        this.f14258Y = sb2;
    }

    @Override // Ph.a
    public final a a() {
        this.f14258Y.append('[');
        return this;
    }

    @Override // Ph.a
    public final void b(char c10) {
        this.f14258Y.append(c10);
    }

    @Override // Ph.a
    public final void e(String str) {
        StringBuilder sb2 = this.f14258Y;
        sb2.append('L');
        sb2.append(str);
        this.f14261i0 <<= 1;
    }

    @Override // Ph.a
    public final void f() {
        int i10 = this.f14261i0 & 1;
        StringBuilder sb2 = this.f14258Y;
        if (i10 == 1) {
            sb2.append('>');
        }
        this.f14261i0 >>>= 1;
        sb2.append(';');
    }

    @Override // Ph.a
    public final a g() {
        this.f14258Y.append('^');
        return this;
    }

    @Override // Ph.a
    public final void h(String str) {
        boolean z10 = this.f14259Z;
        StringBuilder sb2 = this.f14258Y;
        if (!z10) {
            this.f14259Z = true;
            sb2.append('<');
        }
        sb2.append(str);
        sb2.append(':');
    }

    @Override // Ph.a
    public final void i(String str) {
        int i10 = this.f14261i0 & 1;
        StringBuilder sb2 = this.f14258Y;
        if (i10 == 1) {
            sb2.append('>');
        }
        this.f14261i0 >>>= 1;
        sb2.append('.');
        sb2.append(str);
        this.f14261i0 <<= 1;
    }

    @Override // Ph.a
    public final a k() {
        this.f14258Y.append(':');
        return this;
    }

    @Override // Ph.a
    public final a l() {
        r();
        if (!this.f14260h0) {
            this.f14260h0 = true;
            this.f14258Y.append('(');
        }
        return this;
    }

    @Override // Ph.a
    public final a m() {
        r();
        boolean z10 = this.f14260h0;
        StringBuilder sb2 = this.f14258Y;
        if (!z10) {
            sb2.append('(');
        }
        sb2.append(')');
        return this;
    }

    @Override // Ph.a
    public final a n() {
        r();
        return this;
    }

    @Override // Ph.a
    public final a o(char c10) {
        int i10 = this.f14261i0;
        int i11 = i10 & 1;
        StringBuilder sb2 = this.f14258Y;
        if (i11 == 0) {
            this.f14261i0 = i10 | 1;
            sb2.append('<');
        }
        if (c10 != '=') {
            sb2.append(c10);
        }
        if ((this.f14261i0 & Integer.MIN_VALUE) == 0) {
            return this;
        }
        return new b(sb2);
    }

    @Override // Ph.a
    public final void p() {
        int i10 = this.f14261i0;
        int i11 = i10 & 1;
        StringBuilder sb2 = this.f14258Y;
        if (i11 == 0) {
            this.f14261i0 = i10 | 1;
            sb2.append('<');
        }
        sb2.append('*');
    }

    @Override // Ph.a
    public final void q(String str) {
        StringBuilder sb2 = this.f14258Y;
        sb2.append('T');
        sb2.append(str);
        sb2.append(';');
    }

    public final void r() {
        if (this.f14259Z) {
            this.f14259Z = false;
            this.f14258Y.append('>');
        }
    }

    public final String toString() {
        return this.f14258Y.toString();
    }

    public b() {
        this(new StringBuilder());
    }

    @Override // Ph.a
    public final a c() {
        return this;
    }

    @Override // Ph.a
    public final a j() {
        return this;
    }
}
