package Rh;

import Qh.AbstractC1239q;
import java.util.List;
import java.util.Map;
import th.AbstractC5806n;
import yh.C6633q0;
import yh.G1;
import yh.t1;

/* renamed from: Rh.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1298e0 extends yh.M0 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15832Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f15833h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Map f15834i0;

    public C1298e0(String str, Map map, p1 p1Var) {
        this.f15832Z = p1Var;
        this.f15833h0 = str;
        this.f15834i0 = map;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return B0.i(this.f15832Z, (List) this.f15834i0.get(this.f15833h0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yh.G1, Qh.q] */
    @Override // yh.l1.a
    public final G1 getLowerBounds() {
        return new AbstractC1239q(1);
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        return new t1(C6633q0.i1(Object.class));
    }
}
