package Gf;

import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import Pf.AbstractC1146d;
import id.AbstractC3557B;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class Y extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6375Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Z f6376Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(Z z10, int i10) {
        super(0);
        this.f6375Y = i10;
        this.f6376Z = z10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Cf.e eVar;
        Collection collection;
        int i10 = this.f6375Y;
        Z z10 = this.f6376Z;
        switch (i10) {
            case 0:
                return A0.d(z10.g());
            default:
                Mf.N g10 = z10.g();
                boolean z11 = g10 instanceof AbstractC1146d;
                AbstractC0644s abstractC0644s = z10.f6378Y;
                if (z11 && AbstractC3557B.K(A0.g(abstractC0644s.s()), g10) && abstractC0644s.s().e() == 2) {
                    AbstractC1003l mo20k = abstractC0644s.s().mo20k();
                    AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", mo20k);
                    Class k10 = A0.k((AbstractC0997f) mo20k);
                    if (k10 == null) {
                        throw new Lc.l("Cannot determine receiver Java type of inherited declaration: " + g10, 3);
                    }
                    return k10;
                }
                Hf.g g11 = abstractC0644s.g();
                boolean z12 = g11 instanceof Hf.D;
                int i11 = z10.f6379Z;
                if (z12) {
                    Cf.e[] eVarArr = ((Hf.D) g11).f7693e;
                    if (i11 >= 0 && i11 < eVarArr.length) {
                        eVar = eVarArr[i11];
                    } else if (eVarArr.length == 0) {
                        eVar = new Cf.e(i11, i11, 1);
                    } else {
                        int length = ((Cf.g) kf.q.s3(eVarArr)).f3107Z + 1 + (i11 - eVarArr.length);
                        eVar = new Cf.e(length, length, 1);
                    }
                    List a5 = g11.a();
                    AbstractC3557B.c0("<this>", a5);
                    AbstractC3557B.c0("indices", eVar);
                    if (eVar.isEmpty()) {
                        collection = kf.v.f37483Y;
                    } else {
                        collection = kf.t.K2(a5.subList(eVar.f3106Y, eVar.f3107Z + 1));
                    }
                    Type[] typeArr = (Type[]) collection.toArray(new Type[0]);
                    return Z.f(z10, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
                } else if (g11 instanceof Hf.C) {
                    Class[] clsArr = (Class[]) ((Collection) ((Hf.C) g11).f7687d.get(i11)).toArray(new Class[0]);
                    return Z.f(z10, (Type[]) Arrays.copyOf(clsArr, clsArr.length));
                } else {
                    return (Type) g11.a().get(i11);
                }
        }
    }
}
