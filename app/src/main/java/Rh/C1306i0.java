package Rh;

import java.util.Map;
import sh.AbstractC5641m;
import yh.r1;

/* renamed from: Rh.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1306i0 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15884Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC5641m f15885h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f15886i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Map f15887j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC1337y0 f15888k0;

    public C1306i0(String str, Map map, AbstractC5641m abstractC5641m, AbstractC1337y0 abstractC1337y0, p1 p1Var) {
        super(0);
        this.f15884Z = p1Var;
        this.f15885h0 = abstractC5641m;
        this.f15886i0 = str;
        this.f15887j0 = map;
        this.f15888k0 = abstractC1337y0;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (i10 == 0) {
            String n10 = android.gov.nist.core.a.n(new StringBuilder(), this.f15886i0, '*');
            return this.f15888k0.a(this.f15884Z, this.f15885h0, n10, this.f15887j0);
        }
        throw new IndexOutOfBoundsException(android.gov.nist.core.a.e("index = ", i10));
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 1;
    }
}
