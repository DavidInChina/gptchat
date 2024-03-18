package Df;

import Gf.s0;
import id.AbstractC3557B;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class E implements TypeVariable, Type {

    /* renamed from: Y  reason: collision with root package name */
    public final x f3631Y;

    public E(x xVar) {
        AbstractC3557B.c0("typeParameter", xVar);
        this.f3631Y = xVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof TypeVariable) && AbstractC3557B.K(getName(), ((TypeVariable) obj).getName())) {
            getGenericDeclaration();
            throw null;
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        s0 s0Var = (s0) this.f3631Y;
        s0Var.getClass();
        v vVar = s0.f6470i0[0];
        Object mo122invoke = s0Var.f6472Z.mo122invoke();
        AbstractC3557B.b0("getValue(...)", mo122invoke);
        List<w> list = (List) mo122invoke;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (w wVar : list) {
            arrayList.add(H.v(wVar, true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new Lc.l(R.a.r("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f3631Y), 1);
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return ((s0) this.f3631Y).a();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }
}
