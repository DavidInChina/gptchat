package p3;

import L2.AbstractC0881b;

/* renamed from: p3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5078a implements L2.q {

    /* renamed from: a  reason: collision with root package name */
    public final C5079b f42437a = new C5079b(null);

    /* renamed from: b  reason: collision with root package name */
    public final s2.u f42438b = new s2.u(2786);

    /* renamed from: c  reason: collision with root package name */
    public boolean f42439c;

    @Override // L2.q
    public final int a(L2.r rVar, I2.i iVar) {
        s2.u uVar = this.f42438b;
        int read = rVar.read(uVar.f45193a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        uVar.F(0);
        uVar.E(read);
        boolean z10 = this.f42439c;
        C5079b c5079b = this.f42437a;
        if (!z10) {
            c5079b.f(4, 0L);
            this.f42439c = true;
        }
        c5079b.b(uVar);
        return 0;
    }

    @Override // L2.q
    public final void d(L2.s sVar) {
        this.f42437a.g(sVar, new H(0, 1));
        sVar.d();
        sVar.b(new L2.u(-9223372036854775807L));
    }

    @Override // L2.q
    public final boolean g(L2.r rVar) {
        int i10;
        s2.u uVar = new s2.u(10);
        int i11 = 0;
        while (true) {
            rVar.n(uVar.f45193a, 0, 10);
            uVar.F(0);
            if (uVar.w() != 4801587) {
                break;
            }
            uVar.G(3);
            int t10 = uVar.t();
            i11 += t10 + 10;
            rVar.e(t10);
        }
        rVar.k();
        rVar.e(i11);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            rVar.n(uVar.f45193a, 0, 6);
            uVar.F(0);
            if (uVar.z() != 2935) {
                rVar.k();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                rVar.e(i13);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = uVar.f45193a;
                if (bArr.length < 6) {
                    i10 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    i10 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    i10 = AbstractC0881b.a((b10 & 192) >> 6, b10 & 63);
                }
                if (i10 == -1) {
                    return false;
                }
                rVar.e(i10 - 6);
            }
        }
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        this.f42439c = false;
        this.f42437a.d();
    }

    @Override // L2.q
    public final L2.q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}
