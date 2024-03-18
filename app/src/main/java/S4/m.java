package S4;

/* loaded from: classes2.dex */
public abstract class m extends f implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final int f16174Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f16175Z;

    /* renamed from: h0  reason: collision with root package name */
    public n f16176h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f16177i0;

    public m(int i10, int i11) {
        if (i10 > 0 && ((i10 - 1) & i10) == 0) {
            if (i11 >= -1) {
                this.f16174Y = i10;
                this.f16175Z = i11;
                this.f16176h0 = null;
                this.f16177i0 = -1;
                return;
            }
            throw new IllegalArgumentException("writeSize < -1");
        }
        throw new IllegalArgumentException("invalid alignment");
    }

    @Override // S4.f
    public final int c() {
        int i10 = this.f16175Z;
        if (i10 >= 0) {
            return i10;
        }
        throw new UnsupportedOperationException("writeSize is unknown");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        if (this == mVar) {
            return 0;
        }
        g b10 = b();
        g b11 = mVar.b();
        if (b10 != b11) {
            return b10.compareTo(b11);
        }
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // S4.f
    public final void d(b bVar, U4.c cVar) {
        cVar.a(this.f16174Y);
        try {
            if (this.f16175Z >= 0) {
                int e10 = e();
                if (cVar.f17497b == e10) {
                    h(bVar, cVar);
                    return;
                }
                throw new N4.a("expected cursor " + e10 + "; actual value: " + cVar.f17497b, null);
            }
            throw new UnsupportedOperationException("writeSize is unknown");
        } catch (RuntimeException e11) {
            throw N4.a.a("...while writing " + this, e11);
        }
    }

    public final int e() {
        int i10 = this.f16177i0;
        if (i10 >= 0) {
            n nVar = this.f16176h0;
            if (i10 >= 0) {
                int i11 = nVar.f16181d;
                if (i11 >= 0) {
                    return i11 + i10;
                }
                throw new RuntimeException("fileOffset not yet set");
            }
            nVar.getClass();
            throw new IllegalArgumentException("relative < 0");
        }
        throw new RuntimeException("offset not yet known");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (b() != ((m) obj).b()) {
            return false;
        }
        throw new UnsupportedOperationException("unsupported");
    }

    public final int f(n nVar, int i10) {
        if (nVar != null) {
            if (i10 >= 0) {
                if (this.f16176h0 == null) {
                    int i11 = this.f16174Y - 1;
                    int i12 = (i10 + i11) & (~i11);
                    this.f16176h0 = nVar;
                    this.f16177i0 = i12;
                    g(nVar, i12);
                    return i12;
                }
                throw new RuntimeException("already written");
            }
            throw new IllegalArgumentException("offset < 0");
        }
        throw new NullPointerException("addedTo == null");
    }

    public abstract void h(b bVar, U4.c cVar);

    public void g(n nVar, int i10) {
    }
}
