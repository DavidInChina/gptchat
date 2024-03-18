package wh;

import java.util.List;
import yh.k1;
import yh.l1;

/* renamed from: wh.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6255t extends AbstractC6251p {

    /* renamed from: Z  reason: collision with root package name */
    public final l1.a f48571Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f48572h0;

    /* renamed from: i0  reason: collision with root package name */
    public final k1 f48573i0;

    public C6255t(l1.a aVar, AbstractC6256u abstractC6256u, k1 k1Var) {
        super(0);
        this.f48571Z = aVar;
        this.f48572h0 = abstractC6256u;
        this.f48573i0 = k1Var;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        k1 k1Var = this.f48573i0;
        return new C6248m(this.f48571Z, (AbstractC6250o) this.f48572h0.get(i10), k1Var);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f48572h0.size();
    }
}
