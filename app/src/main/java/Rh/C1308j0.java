package Rh;

import java.util.List;
import java.util.Map;
import sh.AbstractC5641m;
import yh.r1;

/* renamed from: Rh.j0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1308j0 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15912Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC5641m f15913h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f15914i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Map f15915j0;

    /* renamed from: k0  reason: collision with root package name */
    public final List f15916k0;

    public C1308j0(p1 p1Var, AbstractC5641m abstractC5641m, String str, Map map, List list) {
        super(0);
        this.f15912Z = p1Var;
        this.f15913h0 = abstractC5641m;
        this.f15914i0 = str;
        this.f15915j0 = map;
        this.f15916k0 = list;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return ((AbstractC1337y0) this.f15916k0.get(i10)).a(this.f15912Z, this.f15913h0, this.f15914i0 + i10 + ';', this.f15915j0);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15916k0.size();
    }
}
