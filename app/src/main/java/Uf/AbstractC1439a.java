package Uf;

import Mf.AbstractC0997f;
import cg.C2416g;
import cg.EnumC2415f;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import jf.C3959i;
import kf.AbstractC4273I;
import kg.C4291c;
import rg.AbstractC5493d;

/* renamed from: Uf.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1439a {

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f17800c;

    /* renamed from: a  reason: collision with root package name */
    public final y f17801a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f17802b = new ConcurrentHashMap();

    static {
        EnumC1440b[] values;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC1440b enumC1440b : EnumC1440b.values()) {
            String str = enumC1440b.f17809Y;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, enumC1440b);
            }
        }
        f17800c = linkedHashMap;
    }

    public AbstractC1439a(y yVar) {
        this.f17801a = yVar;
    }

    public abstract ArrayList a(Object obj, boolean z10);

    /* JADX WARN: Removed duplicated region for block: B:105:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z b(z zVar, Iterable iterable) {
        boolean z10;
        EnumMap enumMap;
        EnumMap enumMap2;
        s sVar;
        C3959i c3959i;
        C2416g g10;
        boolean z11;
        Object c10;
        Object obj;
        s sVar2;
        I i10;
        boolean z12;
        AbstractC3557B.c0("annotations", iterable);
        y yVar = this.f17801a;
        if (yVar.f17850c) {
            return zVar;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            s sVar3 = null;
            if (!yVar.f17850c && (sVar2 = (s) AbstractC1441c.f17815f.get(d(next))) != null) {
                C4291c d10 = d(next);
                if (d10 != null && AbstractC1441c.f17814e.containsKey(d10)) {
                    i10 = (I) yVar.f17849b.invoke(d10);
                } else {
                    i10 = h(next);
                    if (i10 == null) {
                        i10 = yVar.f17848a.f17720a;
                    }
                }
                if (i10 == I.f17765Z) {
                    i10 = null;
                }
                if (i10 != null) {
                    if (i10 == I.f17766h0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    C2416g a5 = C2416g.a(sVar2.f17831a, null, z12, 1);
                    Collection collection = sVar2.f17832b;
                    AbstractC3557B.c0("qualifierApplicabilityTypes", collection);
                    sVar = new s(a5, collection, sVar2.f17833c);
                    if (sVar == null) {
                        sVar3 = sVar;
                    } else {
                        if (!yVar.f17848a.f17723d && (c10 = c(next, AbstractC1441c.f17812c)) != null) {
                            Iterator it2 = e(next).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj = it2.next();
                                    if (i(obj) != null) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            if (obj != null) {
                                ArrayList a10 = a(c10, true);
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                Iterator it3 = a10.iterator();
                                while (it3.hasNext()) {
                                    EnumC1440b enumC1440b = (EnumC1440b) f17800c.get((String) it3.next());
                                    if (enumC1440b != null) {
                                        linkedHashSet.add(enumC1440b);
                                    }
                                }
                                if (linkedHashSet.contains(EnumC1440b.f17806j0)) {
                                    linkedHashSet = AbstractC4273I.u2(AbstractC4273I.s2(kf.q.B3(EnumC1440b.values()), EnumC1440b.f17807k0), linkedHashSet);
                                }
                                c3959i = new C3959i(obj, linkedHashSet);
                                if (c3959i != null) {
                                    Set set = (Set) c3959i.f36156Z;
                                    I h10 = h(next);
                                    Object obj2 = c3959i.f36155Y;
                                    if (h10 == null && (h10 = h(obj2)) == null) {
                                        h10 = yVar.f17848a.f17720a;
                                    }
                                    h10.getClass();
                                    I i11 = I.f17765Z;
                                    if (h10 != i11) {
                                        AbstractC3557B.c0("$this$extractNullability", obj2);
                                        C2416g g11 = g(obj2, false);
                                        if (g11 == null) {
                                            Object i12 = i(obj2);
                                            if (i12 != null) {
                                                I h11 = h(obj2);
                                                if (h11 == null) {
                                                    h11 = yVar.f17848a.f17720a;
                                                }
                                                h11.getClass();
                                                if (h11 != i11 && (g10 = g(i12, false)) != null) {
                                                    if (h11 == I.f17766h0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    g11 = C2416g.a(g10, null, z11, 1);
                                                }
                                            }
                                            g11 = null;
                                        }
                                        if (g11 != null) {
                                            if (h10 == I.f17766h0) {
                                                z10 = true;
                                            }
                                            sVar3 = new s(C2416g.a(g11, null, z10, 1), set);
                                        }
                                    }
                                }
                            }
                        }
                        c3959i = null;
                        if (c3959i != null) {
                        }
                    }
                    if (sVar3 == null) {
                        arrayList.add(sVar3);
                    }
                }
            }
            sVar = null;
            if (sVar == null) {
            }
            if (sVar3 == null) {
            }
        }
        if (arrayList.isEmpty()) {
            return zVar;
        }
        if (zVar != null && (enumMap2 = zVar.f17851a) != null) {
            enumMap = new EnumMap(enumMap2);
        } else {
            enumMap = new EnumMap(EnumC1440b.class);
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            s sVar4 = (s) it4.next();
            for (EnumC1440b enumC1440b2 : sVar4.f17832b) {
                enumMap.put((EnumMap) enumC1440b2, (EnumC1440b) sVar4);
                z10 = true;
            }
        }
        if (z10) {
            return new z(enumMap);
        }
        return zVar;
    }

    public final Object c(Object obj, C4291c c4291c) {
        for (Object obj2 : e(obj)) {
            if (AbstractC3557B.K(d(obj2), c4291c)) {
                return obj2;
            }
        }
        return null;
    }

    public abstract C4291c d(Object obj);

    public abstract Iterable e(Object obj);

    public final boolean f(Object obj, C4291c c4291c) {
        Iterable<Object> e10 = e(obj);
        if ((e10 instanceof Collection) && ((Collection) e10).isEmpty()) {
            return false;
        }
        for (Object obj2 : e10) {
            if (AbstractC3557B.K(d(obj2), c4291c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r6.equals("ALWAYS") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
        if (r6.equals("NEVER") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
        if (r6.equals("MAYBE") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
        r6 = cg.EnumC2415f.f26629Z;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2416g g(Object obj, boolean z10) {
        EnumC2415f enumC2415f;
        C4291c d10 = d(obj);
        if (d10 == null) {
            return null;
        }
        I i10 = (I) this.f17801a.f17849b.invoke(d10);
        i10.getClass();
        if (i10 == I.f17765Z) {
            return null;
        }
        boolean z11 = false;
        if (E.f17749g.contains(d10)) {
            enumC2415f = EnumC2415f.f26629Z;
        } else if (E.f17752j.contains(d10)) {
            enumC2415f = EnumC2415f.f26630h0;
        } else if (AbstractC3557B.K(d10, E.f17743a) || AbstractC3557B.K(d10, E.f17746d)) {
            enumC2415f = EnumC2415f.f26629Z;
        } else if (AbstractC3557B.K(d10, E.f17744b) || AbstractC3557B.K(d10, E.f17747e)) {
            enumC2415f = EnumC2415f.f26628Y;
        } else if (AbstractC3557B.K(d10, E.f17750h)) {
            String str = (String) kf.t.g2(a(obj, false));
            if (str != null) {
                switch (str.hashCode()) {
                    case 73135176:
                        break;
                    case 74175084:
                        break;
                    case 433141802:
                        if (str.equals("UNKNOWN")) {
                            enumC2415f = EnumC2415f.f26628Y;
                            break;
                        }
                        return null;
                    case 1933739535:
                        break;
                    default:
                        return null;
                }
            }
            enumC2415f = EnumC2415f.f26630h0;
        } else if (AbstractC3557B.K(d10, E.f17753k)) {
            enumC2415f = EnumC2415f.f26629Z;
        } else if (AbstractC3557B.K(d10, E.f17754l)) {
            enumC2415f = EnumC2415f.f26630h0;
        } else if (AbstractC3557B.K(d10, E.f17756n)) {
            enumC2415f = EnumC2415f.f26630h0;
        } else if (!AbstractC3557B.K(d10, E.f17755m)) {
            return null;
        } else {
            enumC2415f = EnumC2415f.f26629Z;
        }
        if (i10 == I.f17766h0 || z10) {
            z11 = true;
        }
        return new C2416g(enumC2415f, z11);
    }

    public final I h(Object obj) {
        String str;
        y yVar = this.f17801a;
        I i10 = (I) yVar.f17848a.f17722c.get(d(obj));
        if (i10 != null) {
            return i10;
        }
        Object c10 = c(obj, AbstractC1441c.f17813d);
        if (c10 == null || (str = (String) kf.t.g2(a(c10, false))) == null) {
            return null;
        }
        I i11 = yVar.f17848a.f17721b;
        if (i11 == null) {
            int hashCode = str.hashCode();
            if (hashCode != -2137067054) {
                if (hashCode != -1838656823) {
                    if (hashCode != 2656902 || !str.equals("WARN")) {
                        return null;
                    }
                    return I.f17766h0;
                } else if (!str.equals("STRICT")) {
                    return null;
                } else {
                    return I.f17767i0;
                }
            } else if (!str.equals("IGNORE")) {
                return null;
            } else {
                return I.f17765Z;
            }
        }
        return i11;
    }

    public final Object i(Object obj) {
        Object obj2;
        AbstractC3557B.c0("annotation", obj);
        if (this.f17801a.f17848a.f17723d) {
            return null;
        }
        if (!kf.t.X1(AbstractC1441c.f17816g, d(obj)) && !f(obj, AbstractC1441c.f17811b)) {
            if (!f(obj, AbstractC1441c.f17810a)) {
                return null;
            }
            ConcurrentHashMap concurrentHashMap = this.f17802b;
            AbstractC0997f d10 = AbstractC5493d.d((Nf.c) obj);
            AbstractC3557B.Z(d10);
            Object obj3 = concurrentHashMap.get(d10);
            if (obj3 == null) {
                Iterator it = e(obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = i(it.next());
                        if (obj2 != null) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if (obj2 == null) {
                    return null;
                }
                Object putIfAbsent = concurrentHashMap.putIfAbsent(d10, obj2);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return obj2;
            }
            return obj3;
        }
        return obj;
    }
}
