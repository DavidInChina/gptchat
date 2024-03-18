package p0;

import b0.C2104h;
import java.util.LinkedHashMap;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f41714a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final C2104h f41715b = new C2104h(new AbstractC6216a[16]);

    /* renamed from: c  reason: collision with root package name */
    public boolean f41716c;

    public static final void a(r rVar) {
        C2104h c2104h = rVar.f41715b;
        int i10 = c2104h.f25569h0;
        if (i10 > 0) {
            Object[] objArr = c2104h.f25567Y;
            int i11 = 0;
            do {
                ((AbstractC6216a) objArr[i11]).mo122invoke();
                i11++;
            } while (i11 < i10);
            c2104h.f();
            rVar.f41714a.clear();
            rVar.f41716c = false;
        }
        c2104h.f();
        rVar.f41714a.clear();
        rVar.f41716c = false;
    }

    public static final void b(r rVar) {
        LinkedHashMap linkedHashMap = rVar.f41714a;
        for (q qVar : linkedHashMap.keySet()) {
            qVar.getClass();
            p pVar = (p) androidx.compose.ui.focus.a.F(qVar).f41714a.get(qVar);
            if (pVar != null) {
                qVar.f41713u0 = pVar;
            } else {
                throw new IllegalStateException("committing a node that was not updated in the current transaction".toString());
            }
        }
        linkedHashMap.clear();
        rVar.f41716c = false;
    }
}
