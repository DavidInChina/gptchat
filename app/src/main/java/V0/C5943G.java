package v0;

import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC4194d;
import xf.AbstractC6438a;
import y.AbstractC6463a;

/* renamed from: v0.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5943G extends AbstractC5945I implements Iterable, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final String f46860Y;

    /* renamed from: Z  reason: collision with root package name */
    public final float f46861Z;

    /* renamed from: h0  reason: collision with root package name */
    public final float f46862h0;

    /* renamed from: i0  reason: collision with root package name */
    public final float f46863i0;

    /* renamed from: j0  reason: collision with root package name */
    public final float f46864j0;

    /* renamed from: k0  reason: collision with root package name */
    public final float f46865k0;

    /* renamed from: l0  reason: collision with root package name */
    public final float f46866l0;

    /* renamed from: m0  reason: collision with root package name */
    public final float f46867m0;

    /* renamed from: n0  reason: collision with root package name */
    public final List f46868n0;

    /* renamed from: o0  reason: collision with root package name */
    public final List f46869o0;

    public C5943G(String str, float f6, float f10, float f11, float f12, float f13, float f14, float f15, List list, List list2) {
        this.f46860Y = str;
        this.f46861Z = f6;
        this.f46862h0 = f10;
        this.f46863i0 = f11;
        this.f46864j0 = f12;
        this.f46865k0 = f13;
        this.f46866l0 = f14;
        this.f46867m0 = f15;
        this.f46868n0 = list;
        this.f46869o0 = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C5943G)) {
            C5943G c5943g = (C5943G) obj;
            if (AbstractC3557B.K(this.f46860Y, c5943g.f46860Y) && this.f46861Z == c5943g.f46861Z && this.f46862h0 == c5943g.f46862h0 && this.f46863i0 == c5943g.f46863i0 && this.f46864j0 == c5943g.f46864j0 && this.f46865k0 == c5943g.f46865k0 && this.f46866l0 == c5943g.f46866l0 && this.f46867m0 == c5943g.f46867m0 && AbstractC3557B.K(this.f46868n0, c5943g.f46868n0) && AbstractC3557B.K(this.f46869o0, c5943g.f46869o0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46869o0.hashCode() + AbstractC4194d.s(this.f46868n0, AbstractC6463a.e(this.f46867m0, AbstractC6463a.e(this.f46866l0, AbstractC6463a.e(this.f46865k0, AbstractC6463a.e(this.f46864j0, AbstractC6463a.e(this.f46863i0, AbstractC6463a.e(this.f46862h0, AbstractC6463a.e(this.f46861Z, this.f46860Y.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5942F(this);
    }
}
