package yh;

import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class D0 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final Type[] f50926Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Y f50927h0;

    public D0(Type[] typeArr, Y y10) {
        super(0);
        this.f50926Z = typeArr;
        this.f50927h0 = y10;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return EnumC6628o.a(this.f50926Z[i10], this.f50927h0.i(i10));
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50926Z.length;
    }
}
