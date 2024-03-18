package yh;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class F1 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final Method f50939Z;

    public F1(Method method) {
        super(0);
        this.f50939Z = method;
    }

    @Override // yh.r1, yh.G1
    public final H1 Q() {
        return new q1(this.f50939Z.getExceptionTypes());
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Method method = this.f50939Z;
        return new E1(method, i10, method.getExceptionTypes());
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50939Z.getExceptionTypes().length;
    }
}
