package Rh;

import java.util.List;
import sh.AbstractC5641m;
import th.AbstractC5806n;
import yh.G1;

/* renamed from: Rh.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1294c0 extends yh.H0 {

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC5641m f15802Z;

    /* renamed from: h0  reason: collision with root package name */
    public final p1 f15803h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f15804i0;

    /* renamed from: j0  reason: collision with root package name */
    public final List f15805j0;

    public C1294c0(AbstractC5641m abstractC5641m, p1 p1Var, String str, List list) {
        this.f15802Z = abstractC5641m;
        this.f15803h0 = p1Var;
        this.f15804i0 = str;
        this.f15805j0 = list;
    }

    @Override // yh.l1.a
    public final String A0() {
        return this.f15804i0;
    }

    @Override // yh.l1.a
    public final AbstractC5641m B() {
        return this.f15802Z;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return B0.i(this.f15803h0, this.f15805j0);
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        throw new IllegalStateException("Cannot resolve bounds of unresolved type variable " + this + " by " + this.f15802Z);
    }
}
