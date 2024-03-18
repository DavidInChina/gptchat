package yh;

import java.util.List;
import sh.AbstractC5641m;

/* loaded from: classes.dex */
public final class v1 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC5641m f51096Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f51097h0;

    /* renamed from: i0  reason: collision with root package name */
    public final k1 f51098i0;

    public v1(AbstractC5641m abstractC5641m, List list, X0 x02) {
        super(0);
        this.f51096Z = abstractC5641m;
        this.f51097h0 = list;
        this.f51098i0 = x02;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        k1 k1Var = this.f51098i0;
        return new u1(this.f51096Z, (I1) this.f51097h0.get(i10), k1Var);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51097h0.size();
    }
}
