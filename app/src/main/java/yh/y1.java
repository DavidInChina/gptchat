package yh;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class y1 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final List f51112Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(TypeVariable... typeVariableArr) {
        super(0);
        List asList = Arrays.asList(typeVariableArr);
        this.f51112Z = asList;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        TypeVariable typeVariable = (TypeVariable) this.f51112Z.get(i10);
        return EnumC6628o.a(typeVariable, new G(typeVariable));
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51112Z.size();
    }
}
