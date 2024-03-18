package yh;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import th.AbstractC5806n;

/* loaded from: classes.dex */
public final class K0 extends M0 {

    /* renamed from: Z  reason: collision with root package name */
    public final WildcardType f50953Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Y f50954h0;

    public K0(WildcardType wildcardType, Y y10) {
        this.f50953Z = wildcardType;
        this.f50954h0 = y10;
    }

    @Override // yh.M0, yh.AbstractC6643w, yh.AbstractC6632q
    public final boolean H(Type type) {
        if (this.f50953Z != type && !super.H(type)) {
            return false;
        }
        return true;
    }

    @Override // yh.M0, yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ AbstractC6632q mo119g() {
        mo119g();
        throw null;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return this.f50954h0.f();
    }

    @Override // yh.l1.a
    public final G1 getLowerBounds() {
        return new I0(this.f50953Z.getLowerBounds(), this.f50954h0);
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        return new J0(this.f50953Z.getUpperBounds(), this.f50954h0);
    }
}
