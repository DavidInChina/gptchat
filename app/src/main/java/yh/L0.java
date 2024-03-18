package yh;

import java.util.List;
import th.AbstractC5806n;
import th.AbstractC5808p;

/* loaded from: classes.dex */
public final class L0 extends M0 {

    /* renamed from: Z  reason: collision with root package name */
    public final List f50955Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f50956h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC5808p f50957i0;

    public L0(G1 g1, G1 g12, AbstractC5808p abstractC5808p) {
        this.f50955Z = g1;
        this.f50956h0 = g12;
        this.f50957i0 = abstractC5808p;
    }

    @Override // yh.M0, yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ AbstractC6632q mo119g() {
        mo119g();
        throw null;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return this.f50957i0.getDeclaredAnnotations();
    }

    @Override // yh.l1.a
    public final G1 getLowerBounds() {
        return new t1(this.f50956h0);
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        return new t1(this.f50955Z);
    }
}
