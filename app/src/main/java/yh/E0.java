package yh;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import sh.AbstractC5641m;
import th.AbstractC5806n;
import wh.AbstractC6240e;

/* loaded from: classes2.dex */
public final class E0 extends H0 {

    /* renamed from: Z  reason: collision with root package name */
    public final TypeVariable f50930Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Y f50931h0;

    public E0(TypeVariable typeVariable, Y y10) {
        this.f50930Z = typeVariable;
        this.f50931h0 = y10;
    }

    @Override // yh.l1.a
    public final String A0() {
        return this.f50930Z.getName();
    }

    @Override // yh.l1.a
    public final AbstractC5641m B() {
        GenericDeclaration genericDeclaration = this.f50930Z.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return C6641v.l1((Class) genericDeclaration);
        }
        if (genericDeclaration instanceof Method) {
            return new AbstractC6240e((Method) genericDeclaration);
        }
        if (genericDeclaration instanceof Constructor) {
            return new AbstractC6240e((Constructor) genericDeclaration);
        }
        throw new IllegalStateException("Unknown declaration: " + genericDeclaration);
    }

    @Override // yh.H0, yh.AbstractC6643w, yh.AbstractC6632q
    public final boolean H(Type type) {
        if (this.f50930Z != type && !super.H(type)) {
            return false;
        }
        return true;
    }

    @Override // yh.H0, yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ AbstractC6632q mo119g() {
        mo119g();
        throw null;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return this.f50931h0.f();
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        return new D0(this.f50930Z.getBounds(), this.f50931h0);
    }
}
