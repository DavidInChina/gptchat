package Hg;

import Bg.o0;
import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Mf.h0;
import Pf.AbstractC1158p;
import Pf.c0;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;
import kg.C4294f;
import ng.AbstractC4842i;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final x f7797Y = new kotlin.jvm.internal.o(1);

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z10;
        AbstractC0997f abstractC0997f;
        Bg.D n10;
        o0 z12;
        Bg.A returnType;
        AbstractC1013w abstractC1013w = (AbstractC1013w) obj;
        AbstractC3557B.c0("$this$$receiver", abstractC1013w);
        List list = z.f7799g;
        AbstractC1003l mo20k = abstractC1013w.mo20k();
        AbstractC3557B.b0("getContainingDeclaration(...)", mo20k);
        if (mo20k instanceof AbstractC0997f) {
            C4294f c4294f = Jf.l.f9117e;
            if (Jf.l.b((AbstractC0997f) mo20k, Jf.p.f9165a)) {
                z10 = true;
                if (!z10) {
                    return null;
                }
                Collection m10 = abstractC1013w.m();
                AbstractC3557B.b0("getOverriddenDescriptors(...)", m10);
                Collection<AbstractC1013w> collection = m10;
                if (!collection.isEmpty()) {
                    for (AbstractC1013w abstractC1013w2 : collection) {
                        AbstractC1003l mo20k2 = abstractC1013w2.mo20k();
                        AbstractC3557B.b0("getContainingDeclaration(...)", mo20k2);
                        if (mo20k2 instanceof AbstractC0997f) {
                            C4294f c4294f2 = Jf.l.f9117e;
                            if (Jf.l.b((AbstractC0997f) mo20k2, Jf.p.f9165a)) {
                                return null;
                            }
                        }
                    }
                }
                AbstractC1003l mo20k3 = abstractC1013w.mo20k();
                if (mo20k3 instanceof AbstractC0997f) {
                    abstractC0997f = (AbstractC0997f) mo20k3;
                } else {
                    abstractC0997f = null;
                }
                if (abstractC0997f != null) {
                    if (!AbstractC4842i.e(abstractC0997f)) {
                        abstractC0997f = null;
                    }
                    if (abstractC0997f != null && (n10 = abstractC0997f.n()) != null && (z12 = Bi.c.z1(n10)) != null && (returnType = abstractC1013w.getReturnType()) != null && AbstractC3557B.K(((AbstractC1158p) abstractC1013w).getName(), A.f7737d)) {
                        C4294f c4294f3 = Jf.l.f9117e;
                        if ((Jf.l.B(returnType, Jf.p.f9175h) || Jf.l.E(returnType)) && abstractC1013w.S().size() == 1) {
                            Bg.A type = ((c0) ((h0) abstractC1013w.S().get(0))).getType();
                            AbstractC3557B.b0("getType(...)", type);
                            if (AbstractC3557B.K(Bi.c.z1(type), z12) && abstractC1013w.d0().isEmpty() && abstractC1013w.Z() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder("must override ''equals()'' in Any");
                AbstractC1003l mo20k4 = abstractC1013w.mo20k();
                AbstractC3557B.b0("getContainingDeclaration(...)", mo20k4);
                if (AbstractC4842i.e(mo20k4)) {
                    mg.m mVar = mg.m.f39297d;
                    AbstractC1003l mo20k5 = abstractC1013w.mo20k();
                    AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", mo20k5);
                    Bg.D n11 = ((AbstractC0997f) mo20k5).n();
                    AbstractC3557B.b0("getDefaultType(...)", n11);
                    sb2.append(" or define ''equals(other: " + mVar.Y(Bi.c.z1(n11)) + "): Boolean''");
                }
                String sb3 = sb2.toString();
                AbstractC3557B.b0("toString(...)", sb3);
                return sb3;
            }
        }
        z10 = false;
        if (!z10) {
        }
    }
}
