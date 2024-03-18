package Ig;

import K4.C0823k;
import Lf.p;
import hg.C3431j;
import id.AbstractC3557B;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import kf.t;
import kf.v;
import l8.AbstractC4344b;
import wf.k;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final C3431j f8606a = new C3431j(14);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f8607b = 0;

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i10) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final void b(Object obj, AbstractCollection abstractCollection) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List e(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                arrayList.trimToSize();
                return arrayList;
            }
            return AbstractC4344b.F0(t.f2(arrayList));
        }
        return v.f37483Y;
    }

    public static Object f(List list, a aVar, i iVar) {
        C0823k c0823k = new C0823k(1);
        for (Object obj : list) {
            g(obj, aVar, c0823k, iVar);
        }
        return iVar.j();
    }

    public static void g(Object obj, a aVar, C0823k c0823k, i iVar) {
        if (obj != null) {
            if (!c0823k.f9441a.add(obj) || !iVar.d(obj)) {
                return;
            }
            for (Object obj2 : aVar.c(obj)) {
                g(obj2, aVar, c0823k, iVar);
            }
            iVar.c(obj);
            return;
        }
        a(22);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean h(List list, a aVar, k kVar) {
        return (Boolean) f(list, aVar, new p((Serializable) kVar, new boolean[1], 2));
    }

    public static final boolean i(Throwable th2) {
        Class<?> cls = th2.getClass();
        while (!AbstractC3557B.K(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static void k(Object obj) {
        if (obj instanceof h) {
            Throwable th2 = ((h) obj).f8605a;
            if (th2 != null) {
                throw th2;
            }
            h.a(1);
            throw null;
        }
    }

    public abstract boolean d(Object obj);

    public abstract Object j();

    public void c(Object obj) {
    }
}
