package Gf;

import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.EnumC0998g;
import Pf.C1163v;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import kf.C4270F;
import kg.C4290b;
import kg.C4294f;
import lg.C4464i;
import ng.AbstractC4838e;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6443Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ p0 f6444Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(p0 p0Var, int i10) {
        super(0);
        this.f6443Y = i10;
        this.f6444Z = p0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (id.AbstractC3557B.P1((Mf.AbstractC0997f) r7) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (r2.getAnnotations().G(Uf.C.f17724a) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (r1.getAnnotations().G(Uf.C.f17724a) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo122invoke() {
        String str;
        Class<?> cls;
        int i10 = this.f6443Y;
        p0 p0Var = this.f6444Z;
        switch (i10) {
            case 0:
                H h10 = p0Var.f6448l0;
                h10.getClass();
                String str2 = p0Var.f6449m0;
                AbstractC3557B.c0("name", str2);
                String str3 = p0Var.f6450n0;
                AbstractC3557B.c0("signature", str3);
                Lg.g a5 = H.f6342Y.a(str3);
                if (a5 != null) {
                    String str4 = (String) ((C4270F) a5.a()).get(1);
                    Mf.P l10 = h10.l(Integer.parseInt(str4));
                    if (l10 == null) {
                        StringBuilder s10 = android.gov.nist.core.a.s("Local property #", str4, " not found in ");
                        s10.append(h10.f());
                        throw new Lc.l(s10.toString(), 3);
                    }
                    return l10;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : h10.s(C4294f.e(str2))) {
                    if (AbstractC3557B.K(y0.b((Mf.P) obj).i(), str3)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (arrayList.size() != 1) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            AbstractC1007p visibility = ((Mf.P) next).getVisibility();
                            Object obj2 = linkedHashMap.get(visibility);
                            if (obj2 == null) {
                                obj2 = new ArrayList();
                                linkedHashMap.put(visibility, obj2);
                            }
                            ((List) obj2).add(next);
                        }
                        TreeMap treeMap = new TreeMap(new N.b0(7, F.f6341Y));
                        treeMap.putAll(linkedHashMap);
                        Collection values = treeMap.values();
                        AbstractC3557B.b0("<get-values>(...)", values);
                        List list = (List) kf.t.n2(values);
                        if (list.size() == 1) {
                            return (Mf.P) kf.t.f2(list);
                        }
                        String m22 = kf.t.m2(h10.s(C4294f.e(str2)), Separators.RETURN, null, null, C0627b.f6392o0, 30);
                        StringBuilder t10 = android.gov.nist.core.a.t("Property '", str2, "' (JVM signature: ", str3, ") not resolved in ");
                        t10.append(h10);
                        t10.append(':');
                        if (m22.length() == 0) {
                            str = " no members found";
                        } else {
                            str = Separators.RETURN.concat(m22);
                        }
                        t10.append(str);
                        throw new Lc.l(t10.toString(), 3);
                    }
                    return (Mf.P) kf.t.B2(arrayList);
                }
                StringBuilder t11 = android.gov.nist.core.a.t("Property '", str2, "' (JVM signature: ", str3, ") not resolved in ");
                t11.append(h10);
                throw new Lc.l(t11.toString(), 3);
            default:
                C4290b c4290b = y0.f6500a;
                U3.f b10 = y0.b(p0Var.s());
                if (b10 instanceof C0641o) {
                    C0641o c0641o = (C0641o) b10;
                    C4464i c4464i = jg.i.f36194a;
                    fg.G g10 = c0641o.f6438h;
                    jg.d b11 = jg.i.b(g10, c0641o.f6440j, c0641o.f6441k, true);
                    if (b11 == null) {
                        return null;
                    }
                    Mf.P p10 = c0641o.f6437g;
                    if (p10 != null) {
                        int e10 = p10.e();
                        H h11 = p0Var.f6448l0;
                        if (e10 != 2) {
                            AbstractC1003l mo20k = p10.mo20k();
                            if (mo20k != null) {
                                if (AbstractC4838e.l(mo20k)) {
                                    AbstractC1003l mo20k2 = mo20k.mo20k();
                                    if (AbstractC4838e.n(mo20k2, EnumC0998g.f12084Y) || AbstractC4838e.n(mo20k2, EnumC0998g.f12086h0)) {
                                        LinkedHashSet linkedHashSet = Jf.e.f9104a;
                                        break;
                                    }
                                }
                                if (AbstractC4838e.l(p10.mo20k())) {
                                    C1163v c02 = p10.c0();
                                    if (c02 != null) {
                                        break;
                                    }
                                    break;
                                }
                            } else {
                                Ad.l.a(1);
                                throw null;
                            }
                        }
                        if (!jg.i.d(g10)) {
                            AbstractC1003l mo20k3 = p10.mo20k();
                            if (mo20k3 instanceof AbstractC0997f) {
                                cls = A0.k((AbstractC0997f) mo20k3);
                            } else {
                                cls = h11.f();
                            }
                            if (cls != null) {
                                return null;
                            }
                            try {
                                return cls.getDeclaredField(b11.f36183a);
                            } catch (NoSuchFieldException unused) {
                                return null;
                            }
                        }
                        cls = h11.f().getEnclosingClass();
                        if (cls != null) {
                        }
                    } else {
                        Ad.l.a(0);
                        throw null;
                    }
                } else if (b10 instanceof C0639m) {
                    return ((C0639m) b10).f6429g;
                } else {
                    if ((b10 instanceof C0640n) || (b10 instanceof C0642p)) {
                        return null;
                    }
                    throw new RuntimeException();
                }
                break;
        }
    }
}
