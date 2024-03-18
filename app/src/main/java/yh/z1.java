package yh;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class z1 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final List f51115Z;

    public z1(List list) {
        super(0);
        this.f51115Z = list;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return EnumC6628o.a((Type) this.f51115Z.get(i10), X.f50977Y);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51115Z.size();
    }

    public z1(Type... typeArr) {
        this(Arrays.asList(typeArr));
    }
}
