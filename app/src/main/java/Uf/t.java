package Uf;

import Mf.AbstractC0994c;
import Mf.AbstractC1003l;
import Mf.AbstractC1006o;
import Mf.C1008q;
import java.util.HashMap;
import jh.H1;
import ng.AbstractC4838e;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final C1008q f17834a;

    /* renamed from: b  reason: collision with root package name */
    public static final C1008q f17835b;

    /* renamed from: c  reason: collision with root package name */
    public static final C1008q f17836c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f17837d;

    static {
        C1008q c1008q = new C1008q(Qf.a.f14709c, 9);
        f17834a = c1008q;
        C1008q c1008q2 = new C1008q(Qf.c.f14711c, 10);
        f17835b = c1008q2;
        C1008q c1008q3 = new C1008q(Qf.b.f14710c, 11);
        f17836c = c1008q3;
        HashMap hashMap = new HashMap();
        f17837d = hashMap;
        hashMap.put(c1008q.f12097a, c1008q);
        hashMap.put(c1008q2.f12097a, c1008q2);
        hashMap.put(c1008q3.f12097a, c1008q3);
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 5 && i10 != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 5 && i10 != 6) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 != 5 && i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5 && i10 != 6) {
                    objArr[2] = "isVisibleForProtectedAndPackage";
                }
            } else {
                objArr[2] = "toDescriptorVisibility";
            }
        } else {
            objArr[2] = "areInSamePackage";
        }
        String format = String.format(str, objArr);
        if (i10 == 5 || i10 == 6) {
            throw new IllegalStateException(format);
        }
    }

    public static boolean b(H1 h12, AbstractC1006o abstractC1006o, AbstractC1003l abstractC1003l) {
        AbstractC1006o abstractC1006o2;
        if (abstractC1003l != null) {
            int i10 = AbstractC4838e.f40339a;
            if (abstractC1006o instanceof AbstractC0994c) {
                abstractC1006o2 = AbstractC4838e.t((AbstractC0994c) abstractC1006o);
            } else {
                abstractC1006o2 = abstractC1006o;
            }
            if (c(abstractC1006o2, abstractC1003l)) {
                return true;
            }
            return Mf.r.f12103c.a(h12, abstractC1006o, abstractC1003l);
        }
        a(1);
        throw null;
    }

    public static boolean c(AbstractC1003l abstractC1003l, AbstractC1003l abstractC1003l2) {
        if (abstractC1003l != null) {
            if (abstractC1003l2 != null) {
                Mf.G g10 = (Mf.G) AbstractC4838e.i(abstractC1003l, Mf.G.class, false);
                Mf.G g11 = (Mf.G) AbstractC4838e.i(abstractC1003l2, Mf.G.class, false);
                if (g11 == null || g10 == null || !((Pf.I) g10).f14010j0.equals(((Pf.I) g11).f14010j0)) {
                    return false;
                }
                return true;
            }
            a(3);
            throw null;
        }
        a(2);
        throw null;
    }
}
