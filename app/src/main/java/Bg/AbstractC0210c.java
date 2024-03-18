package Bg;

import id.AbstractC3557B;
import java.util.ArrayDeque;

/* renamed from: Bg.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0210c {
    public static boolean a(X x10, Eg.g gVar, AbstractC0210c abstractC0210c) {
        V v10;
        AbstractC3557B.c0("<this>", x10);
        AbstractC3557B.c0("type", gVar);
        Eg.k kVar = x10.f2093c;
        if ((kVar.S(gVar) && !kVar.W(gVar)) || kVar.L(gVar)) {
            return true;
        }
        x10.c();
        ArrayDeque arrayDeque = x10.f2097g;
        AbstractC3557B.Z(arrayDeque);
        Ig.g gVar2 = x10.f2098h;
        AbstractC3557B.Z(gVar2);
        arrayDeque.push(gVar);
        while (!arrayDeque.isEmpty()) {
            if (gVar2.f8604Z <= 1000) {
                Eg.g gVar3 = (Eg.g) arrayDeque.pop();
                AbstractC3557B.Z(gVar3);
                if (gVar2.add(gVar3)) {
                    boolean W6 = kVar.W(gVar3);
                    V v11 = V.f2089a;
                    if (W6) {
                        v10 = v11;
                    } else {
                        v10 = abstractC0210c;
                    }
                    if (!(!AbstractC3557B.K(v10, v11))) {
                        v10 = null;
                    }
                    if (v10 == null) {
                        continue;
                    } else {
                        for (Eg.f fVar : kVar.F(kVar.A(gVar3))) {
                            Eg.g e10 = v10.e(x10, fVar);
                            if ((kVar.S(e10) && !kVar.W(e10)) || kVar.L(e10)) {
                                x10.a();
                                return true;
                            }
                            arrayDeque.add(e10);
                        }
                        continue;
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + gVar + ". Supertypes = " + kf.t.m2(gVar2, null, null, null, null, 63)).toString());
            }
        }
        x10.a();
        return false;
    }

    public static boolean b(X x10, Eg.g gVar, Eg.i iVar) {
        Eg.k kVar = x10.f2093c;
        if (kVar.B(gVar)) {
            return true;
        }
        if (kVar.W(gVar)) {
            return false;
        }
        if (x10.f2092b) {
            kVar.k(gVar);
        }
        return kVar.t(kVar.A(gVar), iVar);
    }

    public static boolean c(Eg.k kVar, Eg.g gVar, Eg.g gVar2) {
        boolean z10;
        boolean z11;
        if (kVar.b0(gVar) == kVar.b0(gVar2) && kVar.W(gVar) == kVar.W(gVar2)) {
            if (kVar.a(gVar) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (kVar.a(gVar2) == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11 && kVar.t(kVar.A(gVar), kVar.A(gVar2))) {
                if (kVar.d0(gVar, gVar2)) {
                    return true;
                }
                int b02 = kVar.b0(gVar);
                for (int i10 = 0; i10 < b02; i10++) {
                    d0 C10 = kVar.C(gVar, i10);
                    d0 C11 = kVar.C(gVar2, i10);
                    if (kVar.l(C10) != kVar.l(C11)) {
                        return false;
                    }
                    if (!kVar.l(C10) && (kVar.r(C10) != kVar.r(C11) || !d(kVar, kVar.y(C10), kVar.y(C11)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean d(Eg.k kVar, Eg.f fVar, Eg.f fVar2) {
        if (fVar == fVar2) {
            return true;
        }
        D Z10 = kVar.Z(fVar);
        D Z11 = kVar.Z(fVar2);
        if (Z10 != null && Z11 != null) {
            return c(kVar, Z10, Z11);
        }
        AbstractC0227u V10 = kVar.V(fVar);
        AbstractC0227u V11 = kVar.V(fVar2);
        if (V10 == null || V11 == null) {
            return false;
        }
        if (c(kVar, kVar.D(V10), kVar.D(V11)) && c(kVar, kVar.p(V10), kVar.p(V11))) {
            return true;
        }
        return false;
    }

    public abstract Eg.g e(X x10, Eg.f fVar);
}
