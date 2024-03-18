package Af;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class e extends d implements Serializable {

    /* renamed from: h0  reason: collision with root package name */
    public int f842h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f843i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f844j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f845k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f846l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f847m0;

    @Override // Af.d
    public final int a(int i10) {
        return ((-i10) >> 31) & (d() >>> (32 - i10));
    }

    @Override // Af.d
    public final int d() {
        int i10 = this.f842h0;
        int i11 = i10 ^ (i10 >>> 2);
        this.f842h0 = this.f843i0;
        this.f843i0 = this.f844j0;
        this.f844j0 = this.f845k0;
        int i12 = this.f846l0;
        this.f845k0 = i12;
        int i13 = ((i11 ^ (i11 << 1)) ^ i12) ^ (i12 << 4);
        this.f846l0 = i13;
        int i14 = this.f847m0 + 362437;
        this.f847m0 = i14;
        return i13 + i14;
    }
}
