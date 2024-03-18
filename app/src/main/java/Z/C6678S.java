package z;

import Z.AbstractC1710f0;
import Z.l1;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC2084t;
import androidx.lifecycle.C2074i;
import id.AbstractC3557B;
import java.util.List;
import java.util.WeakHashMap;
import mh.C4663H;
import mh.C4686p;
import s3.AbstractC5566p;
import s3.AbstractC5568s;
import s3.C5562l;

/* renamed from: z.S  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6678S implements Z.M {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f51188a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f51189b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f51190c;

    public /* synthetic */ C6678S(Object obj, int i10, Object obj2) {
        this.f51188a = i10;
        this.f51189b = obj;
        this.f51190c = obj2;
    }

    @Override // Z.M
    public final void dispose() {
        C6721r0 c6721r0;
        boolean z10;
        int i10 = this.f51188a;
        Object obj = this.f51189b;
        Object obj2 = this.f51190c;
        switch (i10) {
            case 0:
                ((C6676P) obj).f51179a.m((C6671K) obj2);
                return;
            case 1:
                ((C6729v0) obj).f51392i.remove((C6729v0) obj2);
                return;
            case 2:
                C6729v0 c6729v0 = (C6729v0) obj;
                c6729v0.getClass();
                C6713n0 c6713n0 = (C6713n0) ((C6715o0) obj2).f51343b.getValue();
                if (c6713n0 != null && (c6721r0 = c6713n0.f51338Y) != null) {
                    c6729v0.f51391h.remove(c6721r0);
                    return;
                }
                return;
            case 3:
                ((C6729v0) obj).f51391h.remove((C6721r0) obj2);
                return;
            case 4:
                E.B0 b02 = (E.B0) obj;
                View view = (View) obj2;
                int i11 = b02.f3756t - 1;
                b02.f3756t = i11;
                if (i11 == 0) {
                    WeakHashMap weakHashMap = D1.Z.f3247a;
                    D1.N.u(view, null);
                    D1.Z.n(view, null);
                    view.removeOnAttachStateChangeListener(b02.f3757u);
                    return;
                }
                return;
            case 5:
                ((G.c0) obj).f5490c.add(obj2);
                return;
            case 6:
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj;
                D.p pVar = (D.p) abstractC1710f0.getValue();
                if (pVar != null) {
                    D.o oVar = new D.o(pVar);
                    D.m mVar = (D.m) obj2;
                    if (mVar != null) {
                        mVar.c(oVar);
                    }
                    abstractC1710f0.setValue(null);
                    return;
                }
                return;
            case 7:
                ((Context) obj).getApplicationContext().unregisterComponentCallbacks((H0.Y) obj2);
                return;
            case 8:
                ((C5562l) obj).f45312m0.g((AbstractC2084t) obj2);
                return;
            case 9:
                for (C5562l c5562l : (List) ((l1) obj).getValue()) {
                    ((t3.i) obj2).b().b(c5562l);
                }
                return;
            case 10:
                AbstractC5568s abstractC5568s = (AbstractC5568s) obj;
                AbstractC5566p abstractC5566p = (AbstractC5566p) obj2;
                abstractC5568s.getClass();
                AbstractC3557B.c0("listener", abstractC5566p);
                abstractC5568s.f45356q.remove(abstractC5566p);
                return;
            case 11:
                C2074i c2074i = (C2074i) obj;
                AbstractC5568s abstractC5568s2 = (AbstractC5568s) c2074i.f25372Z;
                AbstractC5566p abstractC5566p2 = (AbstractC5566p) c2074i.f25373h0;
                abstractC5568s2.getClass();
                AbstractC3557B.c0("listener", abstractC5566p2);
                abstractC5568s2.f45356q.remove(abstractC5566p2);
                ((androidx.lifecycle.S) obj2).g(c2074i);
                return;
            default:
                AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) obj2;
                Float f6 = (Float) ((C4686p) ((C4663H) obj).f39404a).f39486f.getValue();
                if (f6 != null && f6.floatValue() > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                abstractC1710f02.setValue(Boolean.valueOf(z10));
                return;
        }
    }
}
