package ng;

import Bg.A;
import Bg.D;
import Bg.m0;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Mf.C;
import Mf.C1014x;
import Mf.P;
import Mf.Q;
import Mf.f0;
import Mf.i0;
import Pf.M;
import id.AbstractC3557B;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;
import rg.AbstractC5493d;

/* renamed from: ng.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4842i {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f40348a = 0;

    static {
        C4290b.j(new C4291c("kotlin.jvm.JvmInline"));
    }

    public static final boolean a(AbstractC1013w abstractC1013w) {
        AbstractC0997f abstractC0997f;
        f0 j02;
        AbstractC3557B.c0("<this>", abstractC1013w);
        if (abstractC1013w instanceof Q) {
            P w02 = ((M) ((Q) abstractC1013w)).w0();
            AbstractC3557B.b0("getCorrespondingProperty(...)", w02);
            if (w02.Z() == null) {
                AbstractC1003l mo20k = w02.mo20k();
                if (mo20k instanceof AbstractC0997f) {
                    abstractC0997f = (AbstractC0997f) mo20k;
                } else {
                    abstractC0997f = null;
                }
                if (abstractC0997f != null && (j02 = abstractC0997f.j0()) != null) {
                    C4294f name = w02.getName();
                    AbstractC3557B.b0("getName(...)", name);
                    if (j02.a(name)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean b(AbstractC1003l abstractC1003l) {
        AbstractC3557B.c0("<this>", abstractC1003l);
        if ((abstractC1003l instanceof AbstractC0997f) && (((AbstractC0997f) abstractC1003l).j0() instanceof C1014x)) {
            return true;
        }
        return false;
    }

    public static final boolean c(AbstractC1003l abstractC1003l) {
        AbstractC3557B.c0("<this>", abstractC1003l);
        if ((abstractC1003l instanceof AbstractC0997f) && (((AbstractC0997f) abstractC1003l).j0() instanceof C)) {
            return true;
        }
        return false;
    }

    public static final boolean d(i0 i0Var) {
        AbstractC0997f abstractC0997f;
        C1014x c1014x;
        if (i0Var.Z() == null) {
            AbstractC1003l mo20k = i0Var.mo20k();
            C4294f c4294f = null;
            if (mo20k instanceof AbstractC0997f) {
                abstractC0997f = (AbstractC0997f) mo20k;
            } else {
                abstractC0997f = null;
            }
            if (abstractC0997f != null) {
                int i10 = AbstractC5493d.f44985a;
                f0 j02 = abstractC0997f.j0();
                if (j02 instanceof C1014x) {
                    c1014x = (C1014x) j02;
                } else {
                    c1014x = null;
                }
                if (c1014x != null) {
                    c4294f = c1014x.f12124a;
                }
            }
            if (AbstractC3557B.K(c4294f, i0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(AbstractC1003l abstractC1003l) {
        AbstractC3557B.c0("<this>", abstractC1003l);
        if (!b(abstractC1003l) && !c(abstractC1003l)) {
            return false;
        }
        return true;
    }

    public static final boolean f(A a5) {
        AbstractC1000i k10 = a5.y0().k();
        if (k10 != null) {
            return e(k10);
        }
        return false;
    }

    public static final boolean g(A a5) {
        AbstractC3557B.c0("<this>", a5);
        AbstractC1000i k10 = a5.y0().k();
        if (k10 == null || !c(k10) || m0.f(a5)) {
            return false;
        }
        return true;
    }

    public static final D h(A a5) {
        AbstractC0997f abstractC0997f;
        C1014x c1014x;
        AbstractC3557B.c0("<this>", a5);
        AbstractC1000i k10 = a5.y0().k();
        if (k10 instanceof AbstractC0997f) {
            abstractC0997f = (AbstractC0997f) k10;
        } else {
            abstractC0997f = null;
        }
        if (abstractC0997f == null) {
            return null;
        }
        int i10 = AbstractC5493d.f44985a;
        f0 j02 = abstractC0997f.j0();
        if (j02 instanceof C1014x) {
            c1014x = (C1014x) j02;
        } else {
            c1014x = null;
        }
        if (c1014x == null) {
            return null;
        }
        return (D) c1014x.f12125b;
    }
}
