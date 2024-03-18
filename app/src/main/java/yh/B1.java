package yh;

import java.lang.reflect.Constructor;

/* loaded from: classes2.dex */
public final class B1 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final Constructor f50918Z;

    public B1(Constructor constructor) {
        super(0);
        this.f50918Z = constructor;
    }

    @Override // yh.r1, yh.G1
    public final H1 Q() {
        return new q1(this.f50918Z.getExceptionTypes());
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Constructor constructor = this.f50918Z;
        return new A1(constructor, i10, constructor.getExceptionTypes());
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50918Z.getExceptionTypes().length;
    }
}
