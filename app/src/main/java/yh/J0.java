package yh;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class J0 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final Type[] f50951Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Y f50952h0;

    public J0(Type[] typeArr, Y y10) {
        super(0);
        this.f50951Z = typeArr;
        this.f50952h0 = y10;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return EnumC6628o.a(this.f50951Z[i10], this.f50952h0.h(i10));
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50951Z.length;
    }
}
