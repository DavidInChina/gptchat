package yh;

import java.lang.reflect.Type;
import yh.l1;

/* loaded from: classes2.dex */
public final class C1 extends AbstractC6613h0 {

    /* renamed from: Z  reason: collision with root package name */
    public final Class f50922Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f50923h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Class[] f50924i0;

    /* renamed from: j0  reason: collision with root package name */
    public transient /* synthetic */ l1.a f50925j0;

    public C1(Class cls, int i10, Class[] clsArr) {
        this.f50922Z = cls;
        this.f50923h0 = i10;
        this.f50924i0 = clsArr;
    }

    @Override // yh.AbstractC6621k0
    public final l1.a i1() {
        l1.a aVar;
        if (this.f50925j0 != null) {
            aVar = null;
        } else {
            Type[] genericInterfaces = this.f50922Z.getGenericInterfaces();
            if (this.f50924i0.length == genericInterfaces.length) {
                aVar = EnumC6628o.a(genericInterfaces[this.f50923h0], j1());
            } else {
                aVar = p0();
            }
        }
        if (aVar == null) {
            return this.f50925j0;
        }
        this.f50925j0 = aVar;
        return aVar;
    }

    @Override // yh.AbstractC6613h0
    public final Y j1() {
        return new C(this.f50922Z, this.f50923h0);
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return C6641v.l1(this.f50924i0[this.f50923h0]);
    }
}
