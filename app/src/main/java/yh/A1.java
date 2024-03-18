package yh;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import yh.l1;

/* loaded from: classes2.dex */
public final class A1 extends AbstractC6598c0 {

    /* renamed from: Z  reason: collision with root package name */
    public final Constructor f50911Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f50912h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Class[] f50913i0;

    /* renamed from: j0  reason: collision with root package name */
    public transient /* synthetic */ l1.a f50914j0;

    public A1(Constructor constructor, int i10, Class[] clsArr) {
        this.f50911Z = constructor;
        this.f50912h0 = i10;
        this.f50913i0 = clsArr;
    }

    @Override // yh.AbstractC6621k0
    public final l1.a i1() {
        l1.a aVar;
        if (this.f50914j0 != null) {
            aVar = null;
        } else {
            Type[] genericExceptionTypes = this.f50911Z.getGenericExceptionTypes();
            if (this.f50913i0.length == genericExceptionTypes.length) {
                aVar = EnumC6628o.a(genericExceptionTypes[this.f50912h0], j1());
            } else {
                aVar = p0();
            }
        }
        if (aVar == null) {
            return this.f50914j0;
        }
        this.f50914j0 = aVar;
        return aVar;
    }

    @Override // yh.AbstractC6598c0
    public final Y j1() {
        return new C6649z(this.f50911Z, this.f50912h0);
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return C6641v.l1(this.f50913i0[this.f50912h0]);
    }
}
