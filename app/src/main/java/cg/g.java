package Cg;

import Bg.A;
import Bg.AbstractC0227u;
import Bg.C0213f;
import Bg.C0232z;
import Bg.D;
import Bg.Y;
import Bg.d0;
import Bg.o0;
import Bg.p0;
import H.H;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import og.C5007c;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public abstract class g {
    /* JADX WARN: Multi-variable type inference failed */
    public static D b(D d10) {
        A type;
        Y y02 = d10.y0();
        o0 o0Var = null;
        if (y02 instanceof C5007c) {
            C5007c c5007c = (C5007c) y02;
            d0 d0Var = c5007c.f41342a;
            if (d0Var.b() != p0.f2147i0) {
                d0Var = null;
            }
            if (d0Var != null && (type = d0Var.getType()) != null) {
                o0Var = type.B0();
            }
            o0 o0Var2 = o0Var;
            if (c5007c.f41343b == null) {
                Collection<A> l10 = c5007c.l();
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(l10, 10));
                for (A a5 : l10) {
                    arrayList.add(a5.B0());
                }
                d0 d0Var2 = c5007c.f41342a;
                AbstractC3557B.c0("projection", d0Var2);
                c5007c.f41343b = new l(d0Var2, new H(4, arrayList), null, null, 8);
            }
            Eg.b bVar = Eg.b.f4732Y;
            l lVar = c5007c.f41343b;
            AbstractC3557B.Z(lVar);
            return new k(bVar, lVar, o0Var2, d10.x0(), d10.z0(), 32);
        } else if ((y02 instanceof C0232z) && d10.z0()) {
            C0232z c0232z = (C0232z) y02;
            LinkedHashSet<A> linkedHashSet = c0232z.f2167b;
            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(linkedHashSet, 10));
            boolean z10 = false;
            for (A a10 : linkedHashSet) {
                arrayList2.add(Bi.c.j1(a10));
                z10 = true;
            }
            if (z10) {
                A a11 = c0232z.f2166a;
                if (a11 != null) {
                    o0Var = Bi.c.j1(a11);
                }
                arrayList2.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
                linkedHashSet2.hashCode();
                C0232z c0232z2 = new C0232z(linkedHashSet2);
                c0232z2.f2166a = o0Var;
                o0Var = c0232z2;
            }
            if (o0Var != null) {
                c0232z = o0Var;
            }
            return c0232z.b();
        } else {
            return d10;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Cg.f, kotlin.jvm.internal.j] */
    public final o0 a(Eg.f fVar) {
        o0 o0Var;
        A a5;
        AbstractC3557B.c0("type", fVar);
        if (fVar instanceof A) {
            o0 B02 = ((A) fVar).B0();
            if (B02 instanceof D) {
                o0Var = b((D) B02);
            } else if (B02 instanceof AbstractC0227u) {
                AbstractC0227u abstractC0227u = (AbstractC0227u) B02;
                D d10 = abstractC0227u.f2158Z;
                D b10 = b(d10);
                D d11 = abstractC0227u.f2159h0;
                D b11 = b(d11);
                if (b10 == d10 && b11 == d11) {
                    o0Var = B02;
                } else {
                    o0Var = C0213f.f(b10, b11);
                }
            } else {
                throw new RuntimeException();
            }
            ?? jVar = new kotlin.jvm.internal.j(1, this);
            A u02 = L4.a.u0(B02);
            if (u02 != null) {
                a5 = (A) jVar.invoke(u02);
            } else {
                a5 = null;
            }
            return L4.a.Z0(o0Var, a5);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
