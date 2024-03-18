package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2444e extends AbstractC2446f {

    /* renamed from: h0  reason: collision with root package name */
    public final transient int f26914h0;

    /* renamed from: i0  reason: collision with root package name */
    public final transient int f26915i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2446f f26916j0;

    public C2444e(AbstractC2446f abstractC2446f, int i10, int i11) {
        this.f26916j0 = abstractC2446f;
        this.f26914h0 = i10;
        this.f26915i0 = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2440c
    public final boolean I() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2440c
    public final Object[] M() {
        return this.f26916j0.M();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2446f
    /* renamed from: T */
    public final AbstractC2446f subList(int i10, int i11) {
        A7.b.a2(i10, i11, this.f26915i0);
        int i12 = this.f26914h0;
        return this.f26916j0.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        A7.b.Y1(i10, this.f26915i0);
        return this.f26916j0.get(i10 + this.f26914h0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2440c
    public final int r() {
        return this.f26916j0.s() + this.f26914h0 + this.f26915i0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2440c
    public final int s() {
        return this.f26916j0.s() + this.f26914h0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26915i0;
    }
}
