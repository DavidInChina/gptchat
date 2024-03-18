package Ii;

import N.C1040y;
import ae.AbstractC1979e;
import android.view.KeyEvent;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final /* synthetic */ class D {
    public static AbstractC1979e a(KeyEvent keyEvent, wf.k kVar) {
        String str;
        AbstractC3557B.c0("keyEvent", keyEvent);
        AbstractC3557B.c0("dispatch", kVar);
        ThreadLocal threadLocal = G.f8631a;
        StringBuilder sb2 = new StringBuilder();
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    str = String.valueOf(keyEvent.getAction());
                } else {
                    str = "ACTION_MULTIPLE";
                }
            } else {
                str = "ACTION_UP";
            }
        } else {
            str = "ACTION_DOWN";
        }
        sb2.append(str);
        sb2.append(' ');
        sb2.append((Object) KeyEvent.keyCodeToString(keyEvent.getKeyCode()));
        String v22 = AbstractC3557B.v2(sb2.toString(), " Interaction");
        long nanoTime = System.nanoTime();
        Mg.a aVar = Mg.b.f12127Z;
        Mg.d dVar = Mg.d.f12132Z;
        long e10 = Mg.b.e(Df.H.y0(nanoTime, dVar));
        int i10 = (int) (nanoTime % Integer.MAX_VALUE);
        Hi.q.a(v22, i10);
        if (keyEvent.getEventTime() <= e10) {
            e10 = keyEvent.getEventTime();
        }
        Hi.j jVar = new Hi.j(keyEvent, Df.H.y0(nanoTime, dVar), Df.H.y0(e10, Mg.d.f12133h0), 0, new C1040y(v22, i10, 7));
        ThreadLocal threadLocal2 = G.f8632b;
        threadLocal2.set(jVar);
        try {
            AbstractC1979e abstractC1979e = (AbstractC1979e) kVar.invoke(keyEvent);
            threadLocal2.set(null);
            AbstractC6216a abstractC6216a = jVar.f7885e;
            jVar.f7885e = null;
            if (abstractC6216a != null) {
                abstractC6216a.mo122invoke();
            }
            return abstractC1979e;
        } catch (Throwable th2) {
            G.f8632b.set(null);
            AbstractC6216a abstractC6216a2 = jVar.f7885e;
            jVar.f7885e = null;
            if (abstractC6216a2 != null) {
                abstractC6216a2.mo122invoke();
            }
            throw th2;
        }
    }
}
