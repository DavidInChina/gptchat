package Rh;

import java.util.List;
import java.util.Map;
import th.AbstractC5806n;
import yh.AbstractC6638t0;
import yh.l1;

/* loaded from: classes2.dex */
public final class V extends AbstractC6638t0 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15739Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f15740h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Map f15741i0;

    /* renamed from: j0  reason: collision with root package name */
    public final yh.l1 f15742j0;

    public V(String str, Map map, yh.l1 l1Var, p1 p1Var) {
        this.f15739Z = p1Var;
        this.f15740h0 = str;
        this.f15741i0 = map;
        this.f15742j0 = l1Var;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return B0.i(this.f15739Z, (List) this.f15741i0.get(this.f15740h0));
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        return null;
    }

    @Override // yh.AbstractC6632q
    public final yh.l1 l0() {
        return this.f15742j0;
    }

    @Override // yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final l1.a mo119g() {
        return null;
    }
}
