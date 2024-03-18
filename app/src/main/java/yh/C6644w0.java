package yh;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import th.AbstractC5806n;
import yh.l1;

/* renamed from: yh.w0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6644w0 extends C0 {

    /* renamed from: Z  reason: collision with root package name */
    public final ParameterizedType f51099Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Y f51100h0;

    public C6644w0(ParameterizedType parameterizedType, Y y10) {
        this.f51099Z = parameterizedType;
        this.f51100h0 = y10;
    }

    @Override // yh.C0, yh.AbstractC6643w, yh.AbstractC6632q
    public final boolean H(Type type) {
        if (this.f51099Z != type && !super.H(type)) {
            return false;
        }
        return true;
    }

    @Override // yh.C0, yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ AbstractC6632q mo119g() {
        mo119g();
        throw null;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return this.f51100h0.f();
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        Type ownerType = this.f51099Z.getOwnerType();
        if (ownerType == null) {
            return null;
        }
        return EnumC6628o.a(ownerType, this.f51100h0.d());
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return C6641v.l1((Class) this.f51099Z.getRawType());
    }

    @Override // yh.l1.a
    public final G1 y0() {
        return new C6642v0(this.f51099Z.getActualTypeArguments(), this.f51100h0);
    }
}
