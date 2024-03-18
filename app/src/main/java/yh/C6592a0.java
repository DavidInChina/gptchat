package yh;

import java.lang.reflect.Method;
import yh.l1;

/* renamed from: yh.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6592a0 extends AbstractC6598c0 {

    /* renamed from: Z  reason: collision with root package name */
    public final Method f50986Z;

    /* renamed from: h0  reason: collision with root package name */
    public transient /* synthetic */ AbstractC6643w f50987h0;

    public C6592a0(Method method) {
        this.f50986Z = method;
    }

    @Override // yh.AbstractC6621k0
    public final l1.a i1() {
        AbstractC6643w abstractC6643w;
        if (this.f50987h0 != null) {
            abstractC6643w = null;
        } else {
            abstractC6643w = EnumC6628o.a(this.f50986Z.getGenericReturnType(), j1());
        }
        if (abstractC6643w == null) {
            return this.f50987h0;
        }
        this.f50987h0 = abstractC6643w;
        return abstractC6643w;
    }

    @Override // yh.AbstractC6598c0
    public final Y j1() {
        return new E(this.f50986Z);
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return C6641v.l1(this.f50986Z.getReturnType());
    }
}
