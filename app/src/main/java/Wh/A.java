package Wh;

import ji.AbstractC4136k;

/* loaded from: classes2.dex */
public final class A extends B {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f21112b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f21113c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ byte[] f21114d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f21115e;

    public A(int i10, int i11, u uVar, byte[] bArr) {
        this.f21112b = uVar;
        this.f21113c = i10;
        this.f21114d = bArr;
        this.f21115e = i11;
    }

    @Override // Wh.B
    public final long a() {
        return this.f21113c;
    }

    @Override // Wh.B
    public final u b() {
        return this.f21112b;
    }

    @Override // Wh.B
    public final void c(AbstractC4136k abstractC4136k) {
        abstractC4136k.i0(this.f21114d, this.f21115e, this.f21113c);
    }
}
