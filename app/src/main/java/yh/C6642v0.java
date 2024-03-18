package yh;

import java.lang.reflect.Type;

/* renamed from: yh.v0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6642v0 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final Type[] f51094Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Y f51095h0;

    public C6642v0(Type[] typeArr, Y y10) {
        super(0);
        this.f51094Z = typeArr;
        this.f51095h0 = y10;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return EnumC6628o.a(this.f51094Z[i10], this.f51095h0.g(i10));
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51094Z.length;
    }
}
