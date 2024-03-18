package yh;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import th.AbstractC5806n;
import yh.l1;

/* renamed from: yh.m0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6625m0 extends AbstractC6629o0 {

    /* renamed from: Z  reason: collision with root package name */
    public final GenericArrayType f51048Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Y f51049h0;

    public C6625m0(GenericArrayType genericArrayType, Y y10) {
        this.f51048Z = genericArrayType;
        this.f51049h0 = y10;
    }

    @Override // yh.AbstractC6643w, yh.AbstractC6632q
    public final boolean H(Type type) {
        if (this.f51048Z != type && !super.H(type)) {
            return false;
        }
        return true;
    }

    @Override // yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final l1.a mo119g() {
        return EnumC6628o.a(this.f51048Z.getGenericComponentType(), this.f51049h0.b());
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return this.f51049h0.f();
    }
}
