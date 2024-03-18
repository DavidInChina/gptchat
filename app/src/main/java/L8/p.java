package L8;

import I8.E;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class p extends E {

    /* renamed from: a  reason: collision with root package name */
    public final Map f10827a;

    public p(LinkedHashMap linkedHashMap) {
        this.f10827a = linkedHashMap;
    }

    @Override // I8.E
    public final Object b(P8.b bVar) {
        if (bVar.R0() == 9) {
            bVar.A0();
            return null;
        }
        Object d10 = d();
        try {
            bVar.h();
            while (bVar.P()) {
                o oVar = (o) this.f10827a.get(bVar.u0());
                if (oVar != null && oVar.f10818e) {
                    f(d10, bVar, oVar);
                }
                bVar.X0();
            }
            bVar.m();
            return e(d10);
        } catch (IllegalAccessException e10) {
            r9.y yVar = N8.c.f12745a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalStateException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // I8.E
    public final void c(P8.c cVar, Object obj) {
        if (obj == null) {
            cVar.F();
            return;
        }
        cVar.i();
        try {
            for (o oVar : this.f10827a.values()) {
                oVar.a(cVar, obj);
            }
            cVar.m();
        } catch (IllegalAccessException e10) {
            r9.y yVar = N8.c.f12745a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, P8.b bVar, o oVar);
}
