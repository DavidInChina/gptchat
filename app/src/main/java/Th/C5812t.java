package th;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC4194d;

/* renamed from: th.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5812t extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f46233a;

    /* renamed from: b  reason: collision with root package name */
    public transient /* synthetic */ int f46234b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f46235c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f46236d;

    public C5812t(Object obj, int i10, Object obj2) {
        this.f46233a = i10;
        this.f46235c = obj;
        this.f46236d = obj2;
    }

    @Override // th.a0
    public final int a() {
        switch (this.f46233a) {
            case 0:
                return 3;
            default:
                for (a0 a0Var : (List) this.f46236d) {
                    if (!AbstractC4194d.b(a0Var.a())) {
                        return 2;
                    }
                }
                return 3;
        }
    }

    @Override // th.a0
    public final boolean b(Object obj) {
        int i10 = this.f46233a;
        Object obj2 = this.f46236d;
        Object obj3 = this.f46235c;
        switch (i10) {
            case 0:
                return ((AbstractC5783O) obj2).a(obj3, obj);
            default:
                if (!(obj instanceof Object[]) || obj.getClass().getComponentType() != ((Class) obj3)) {
                    return false;
                }
                Object[] objArr = (Object[]) obj;
                List list = (List) obj2;
                if (list.size() != objArr.length) {
                    return false;
                }
                Iterator it = list.iterator();
                for (Object obj4 : objArr) {
                    if (!((a0) it.next()).b(obj4)) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // th.a0
    public final Object c() {
        int i10 = this.f46233a;
        Object obj = this.f46236d;
        Object obj2 = this.f46235c;
        switch (i10) {
            case 0:
                return ((AbstractC5783O) obj).d(obj2);
            default:
                List<a0> list = (List) obj;
                Object newInstance = Array.newInstance((Class) obj2, list.size());
                int i11 = 0;
                for (a0 a0Var : list) {
                    Array.set(newInstance, i11, a0Var.c());
                    i11++;
                }
                return newInstance;
        }
    }

    public final boolean equals(Object obj) {
        int i10 = this.f46233a;
        Object obj2 = this.f46236d;
        switch (i10) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof a0)) {
                        return false;
                    }
                    a0 a0Var = (a0) obj;
                    if (!AbstractC4194d.b(a0Var.a()) || !((AbstractC5783O) obj2).a(this.f46235c, a0Var.c())) {
                        return false;
                    }
                }
                return true;
            default:
                if (this != obj) {
                    if (!(obj instanceof a0)) {
                        return false;
                    }
                    a0 a0Var2 = (a0) obj;
                    if (!AbstractC4194d.b(a0Var2.a())) {
                        return false;
                    }
                    Object c10 = a0Var2.c();
                    if (!(c10 instanceof Object[])) {
                        return false;
                    }
                    Object[] objArr = (Object[]) c10;
                    List list = (List) obj2;
                    if (list.size() != objArr.length) {
                        return false;
                    }
                    Iterator it = list.iterator();
                    for (Object obj3 : objArr) {
                        a0 a0Var3 = (a0) it.next();
                        if (!AbstractC4194d.b(a0Var3.a()) || !a0Var3.c().equals(obj3)) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    public final int hashCode() {
        int i10 = this.f46233a;
        Object obj = this.f46236d;
        int i11 = 0;
        switch (i10) {
            case 0:
                if (this.f46234b == 0) {
                    i11 = ((AbstractC5783O) obj).b(this.f46235c);
                }
                if (i11 == 0) {
                    return this.f46234b;
                }
                this.f46234b = i11;
                return i11;
            default:
                if (this.f46234b == 0) {
                    i11 = 1;
                    for (a0 a0Var : (List) obj) {
                        i11 = (i11 * 31) + a0Var.hashCode();
                    }
                }
                if (i11 == 0) {
                    return this.f46234b;
                }
                this.f46234b = i11;
                return i11;
        }
    }

    public final String toString() {
        int i10 = this.f46233a;
        Object obj = this.f46236d;
        switch (i10) {
            case 0:
                return ((AbstractC5783O) obj).c(this.f46235c);
            default:
                return g0.JAVA_19_CAPABLE_VM.h((List) obj);
        }
    }
}
