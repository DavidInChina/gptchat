package L8;

import I8.C;
import I8.D;
import I8.E;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class n extends E {

    /* renamed from: c  reason: collision with root package name */
    public static final l f10811c = new l(1, C.f8095Y);

    /* renamed from: a  reason: collision with root package name */
    public final I8.n f10812a;

    /* renamed from: b  reason: collision with root package name */
    public final D f10813b;

    public n(I8.n nVar, D d10) {
        this.f10812a = nVar;
        this.f10813b = d10;
    }

    @Override // I8.E
    public final Object b(P8.b bVar) {
        Object obj;
        String str;
        Serializable serializable;
        boolean z10;
        int R02 = bVar.R0();
        int f6 = AbstractC6708l.f(R02);
        if (f6 != 0) {
            if (f6 != 2) {
                obj = null;
            } else {
                bVar.h();
                obj = new K8.m(true);
            }
        } else {
            bVar.a();
            obj = new ArrayList();
        }
        if (obj == null) {
            return d(bVar, R02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (bVar.P()) {
                if (obj instanceof Map) {
                    str = bVar.u0();
                } else {
                    str = null;
                }
                int R03 = bVar.R0();
                int f10 = AbstractC6708l.f(R03);
                if (f10 != 0) {
                    if (f10 != 2) {
                        serializable = null;
                    } else {
                        bVar.h();
                        serializable = new K8.m(true);
                    }
                } else {
                    bVar.a();
                    serializable = new ArrayList();
                }
                if (serializable != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (serializable == null) {
                    serializable = d(bVar, R03);
                }
                if (obj instanceof List) {
                    ((List) obj).add(serializable);
                } else {
                    ((Map) obj).put(str, serializable);
                }
                if (z10) {
                    arrayDeque.addLast(obj);
                    obj = serializable;
                }
            } else {
                if (obj instanceof List) {
                    bVar.k();
                } else {
                    bVar.m();
                }
                if (arrayDeque.isEmpty()) {
                    return obj;
                }
                obj = arrayDeque.removeLast();
            }
        }
    }

    @Override // I8.E
    public final void c(P8.c cVar, Object obj) {
        if (obj == null) {
            cVar.F();
            return;
        }
        Class<?> cls = obj.getClass();
        I8.n nVar = this.f10812a;
        nVar.getClass();
        E f6 = nVar.f(TypeToken.get((Class) cls));
        if (f6 instanceof n) {
            cVar.i();
            cVar.m();
            return;
        }
        f6.c(cVar, obj);
    }

    public final Serializable d(P8.b bVar, int i10) {
        int f6 = AbstractC6708l.f(i10);
        if (f6 != 5) {
            if (f6 != 6) {
                if (f6 != 7) {
                    if (f6 == 8) {
                        bVar.A0();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(E9.f.L(i10)));
                }
                return Boolean.valueOf(bVar.a0());
            }
            return this.f10813b.a(bVar);
        }
        return bVar.H0();
    }
}
