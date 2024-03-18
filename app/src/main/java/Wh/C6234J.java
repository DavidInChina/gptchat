package wh;

import java.util.List;
import yh.k1;

/* renamed from: wh.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6234J extends AbstractC6227C {

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6243h f48527Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f48528h0;

    /* renamed from: i0  reason: collision with root package name */
    public final k1 f48529i0;

    public C6234J(AbstractC6243h abstractC6243h, AbstractC6235K abstractC6235K, k1 k1Var) {
        super(0);
        this.f48527Z = abstractC6243h;
        this.f48528h0 = abstractC6235K;
        this.f48529i0 = k1Var;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        k1 k1Var = this.f48529i0;
        return new C6225A(this.f48527Z, (AbstractC6226B) this.f48528h0.get(i10), k1Var);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f48528h0.size();
    }
}
