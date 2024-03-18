package ji;

import id.AbstractC3557B;

/* renamed from: ji.F  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4117F {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f36674a;

    /* renamed from: b  reason: collision with root package name */
    public int f36675b;

    /* renamed from: c  reason: collision with root package name */
    public int f36676c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f36677d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f36678e;

    /* renamed from: f  reason: collision with root package name */
    public C4117F f36679f;

    /* renamed from: g  reason: collision with root package name */
    public C4117F f36680g;

    public C4117F(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        AbstractC3557B.c0("data", bArr);
        this.f36674a = bArr;
        this.f36675b = i10;
        this.f36676c = i11;
        this.f36677d = z10;
        this.f36678e = z11;
    }

    public final C4117F a() {
        C4117F c4117f = this.f36679f;
        if (c4117f == this) {
            c4117f = null;
        }
        C4117F c4117f2 = this.f36680g;
        AbstractC3557B.Z(c4117f2);
        c4117f2.f36679f = this.f36679f;
        C4117F c4117f3 = this.f36679f;
        AbstractC3557B.Z(c4117f3);
        c4117f3.f36680g = this.f36680g;
        this.f36679f = null;
        this.f36680g = null;
        return c4117f;
    }

    public final void b(C4117F c4117f) {
        c4117f.f36680g = this;
        c4117f.f36679f = this.f36679f;
        C4117F c4117f2 = this.f36679f;
        AbstractC3557B.Z(c4117f2);
        c4117f2.f36680g = c4117f;
        this.f36679f = c4117f;
    }

    public final C4117F c() {
        this.f36677d = true;
        return new C4117F(this.f36674a, this.f36675b, this.f36676c, true, false);
    }

    public final void d(C4117F c4117f, int i10) {
        if (c4117f.f36678e) {
            int i11 = c4117f.f36676c;
            int i12 = i11 + i10;
            byte[] bArr = c4117f.f36674a;
            if (i12 > 8192) {
                if (!c4117f.f36677d) {
                    int i13 = c4117f.f36675b;
                    if (i12 - i13 <= 8192) {
                        kf.q.X2(bArr, 0, bArr, i13, i11);
                        c4117f.f36676c -= c4117f.f36675b;
                        c4117f.f36675b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i14 = c4117f.f36676c;
            int i15 = this.f36675b;
            kf.q.X2(this.f36674a, i14, bArr, i15, i15 + i10);
            c4117f.f36676c += i10;
            this.f36675b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public C4117F() {
        this.f36674a = new byte[8192];
        this.f36678e = true;
        this.f36677d = false;
    }
}
