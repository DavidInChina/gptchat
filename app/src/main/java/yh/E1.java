package yh;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import yh.l1;

/* loaded from: classes2.dex */
public final class E1 extends AbstractC6598c0 {

    /* renamed from: Z  reason: collision with root package name */
    public final Method f50932Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f50933h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Class[] f50934i0;

    /* renamed from: j0  reason: collision with root package name */
    public transient /* synthetic */ l1.a f50935j0;

    public E1(Method method, int i10, Class[] clsArr) {
        this.f50932Z = method;
        this.f50933h0 = i10;
        this.f50934i0 = clsArr;
    }

    @Override // yh.AbstractC6621k0
    public final l1.a i1() {
        l1.a aVar;
        if (this.f50935j0 != null) {
            aVar = null;
        } else {
            Type[] genericExceptionTypes = this.f50932Z.getGenericExceptionTypes();
            if (this.f50934i0.length == genericExceptionTypes.length) {
                aVar = EnumC6628o.a(genericExceptionTypes[this.f50933h0], j1());
            } else {
                aVar = p0();
            }
        }
        if (aVar == null) {
            return this.f50935j0;
        }
        this.f50935j0 = aVar;
        return aVar;
    }

    @Override // yh.AbstractC6598c0
    public final Y j1() {
        return new C6649z(this.f50932Z, this.f50933h0);
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return C6641v.l1(this.f50934i0[this.f50933h0]);
    }
}
