package S2;

import L2.r;

/* loaded from: classes2.dex */
public final class d implements r {

    /* renamed from: a  reason: collision with root package name */
    public final r f16102a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16103b;

    public d(r rVar, long j6) {
        boolean z10;
        this.f16102a = rVar;
        if (rVar.o() >= j6) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        this.f16103b = j6;
    }

    @Override // L2.r
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f16102a.b(bArr, i10, i11, z10);
    }

    @Override // L2.r
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f16102a.c(bArr, i10, i11, z10);
    }

    @Override // L2.r
    public final long d() {
        return this.f16102a.d() - this.f16103b;
    }

    @Override // L2.r
    public final void e(int i10) {
        this.f16102a.e(i10);
    }

    @Override // L2.r
    public final int f(int i10) {
        return this.f16102a.f(i10);
    }

    @Override // L2.r
    public final long h() {
        return this.f16102a.h() - this.f16103b;
    }

    @Override // L2.r
    public final int i(byte[] bArr, int i10, int i11) {
        return this.f16102a.i(bArr, i10, i11);
    }

    @Override // L2.r
    public final void k() {
        this.f16102a.k();
    }

    @Override // L2.r
    public final void l(int i10) {
        this.f16102a.l(i10);
    }

    @Override // L2.r
    public final boolean m(int i10, boolean z10) {
        return this.f16102a.m(i10, z10);
    }

    @Override // L2.r
    public final void n(byte[] bArr, int i10, int i11) {
        this.f16102a.n(bArr, i10, i11);
    }

    @Override // L2.r
    public final long o() {
        return this.f16102a.o() - this.f16103b;
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f16102a.read(bArr, i10, i11);
    }

    @Override // L2.r
    public final void readFully(byte[] bArr, int i10, int i11) {
        this.f16102a.readFully(bArr, i10, i11);
    }
}
