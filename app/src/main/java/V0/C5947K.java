package v0;

import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import r0.AbstractC5350n;
import y.AbstractC6463a;

/* renamed from: v0.K  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5947K extends AbstractC5945I {

    /* renamed from: Y  reason: collision with root package name */
    public final String f46878Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f46879Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f46880h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC5350n f46881i0;

    /* renamed from: j0  reason: collision with root package name */
    public final float f46882j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC5350n f46883k0;

    /* renamed from: l0  reason: collision with root package name */
    public final float f46884l0;

    /* renamed from: m0  reason: collision with root package name */
    public final float f46885m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f46886n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f46887o0;

    /* renamed from: p0  reason: collision with root package name */
    public final float f46888p0;

    /* renamed from: q0  reason: collision with root package name */
    public final float f46889q0;

    /* renamed from: r0  reason: collision with root package name */
    public final float f46890r0;

    /* renamed from: s0  reason: collision with root package name */
    public final float f46891s0;

    public C5947K(String str, List list, int i10, AbstractC5350n abstractC5350n, float f6, AbstractC5350n abstractC5350n2, float f10, float f11, int i11, int i12, float f12, float f13, float f14, float f15) {
        this.f46878Y = str;
        this.f46879Z = list;
        this.f46880h0 = i10;
        this.f46881i0 = abstractC5350n;
        this.f46882j0 = f6;
        this.f46883k0 = abstractC5350n2;
        this.f46884l0 = f10;
        this.f46885m0 = f11;
        this.f46886n0 = i11;
        this.f46887o0 = i12;
        this.f46888p0 = f12;
        this.f46889q0 = f13;
        this.f46890r0 = f14;
        this.f46891s0 = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5947K.class == obj.getClass()) {
            C5947K c5947k = (C5947K) obj;
            if (AbstractC3557B.K(this.f46878Y, c5947k.f46878Y) && AbstractC3557B.K(this.f46881i0, c5947k.f46881i0) && this.f46882j0 == c5947k.f46882j0 && AbstractC3557B.K(this.f46883k0, c5947k.f46883k0) && this.f46884l0 == c5947k.f46884l0 && this.f46885m0 == c5947k.f46885m0 && r0.G.f(this.f46886n0, c5947k.f46886n0) && r0.G.g(this.f46887o0, c5947k.f46887o0) && this.f46888p0 == c5947k.f46888p0 && this.f46889q0 == c5947k.f46889q0 && this.f46890r0 == c5947k.f46890r0 && this.f46891s0 == c5947k.f46891s0 && this.f46880h0 == c5947k.f46880h0 && AbstractC3557B.K(this.f46879Z, c5947k.f46879Z)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int s10 = AbstractC4194d.s(this.f46879Z, this.f46878Y.hashCode() * 31, 31);
        int i11 = 0;
        AbstractC5350n abstractC5350n = this.f46881i0;
        if (abstractC5350n != null) {
            i10 = abstractC5350n.hashCode();
        } else {
            i10 = 0;
        }
        int e10 = AbstractC6463a.e(this.f46882j0, (s10 + i10) * 31, 31);
        AbstractC5350n abstractC5350n2 = this.f46883k0;
        if (abstractC5350n2 != null) {
            i11 = abstractC5350n2.hashCode();
        }
        return AbstractC6463a.e(this.f46891s0, AbstractC6463a.e(this.f46890r0, AbstractC6463a.e(this.f46889q0, AbstractC6463a.e(this.f46888p0, (((AbstractC6463a.e(this.f46885m0, AbstractC6463a.e(this.f46884l0, (e10 + i11) * 31, 31), 31) + this.f46886n0) * 31) + this.f46887o0) * 31, 31), 31), 31), 31) + this.f46880h0;
    }
}
