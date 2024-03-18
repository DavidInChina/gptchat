package yh;

import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class I0 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final Type[] f50945Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Y f50946h0;

    public I0(Type[] typeArr, Y y10) {
        super(0);
        this.f50945Z = typeArr;
        this.f50946h0 = y10;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return EnumC6628o.a(this.f50945Z[i10], this.f50946h0.c(i10));
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50945Z.length;
    }
}
