package dg;

import Mf.V;
import Mf.h0;
import Pf.c0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kg.C4290b;
import kg.C4294f;
import pg.C5164a;
import pg.C5169f;
import pg.C5172i;
import pg.C5182s;
import pg.C5187x;

/* renamed from: dg.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2671k implements z {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f28330a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C2673m f28331b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C4294f f28332c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C2672l f28333d;

    public C2671k(C2673m c2673m, C4294f c4294f, C2672l c2672l) {
        this.f28331b = c2673m;
        this.f28332c = c4294f;
        this.f28333d = c2672l;
    }

    @Override // dg.z
    public final void a() {
        ArrayList arrayList = this.f28330a;
        C2672l c2672l = this.f28333d;
        c2672l.getClass();
        AbstractC3557B.c0("elements", arrayList);
        C4294f c4294f = this.f28332c;
        if (c4294f != null) {
            h0 W6 = N.W(c4294f, c2672l.f28337d);
            if (W6 != null) {
                HashMap hashMap = c2672l.f28335b;
                List e10 = Ig.i.e(arrayList);
                Bg.A type = ((c0) W6).getType();
                AbstractC3557B.b0("getType(...)", type);
                hashMap.put(c4294f, new C5187x(e10, type));
            } else if (c2672l.f28336c.o(c2672l.f28338e) && AbstractC3557B.K(c4294f.b(), "value")) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof C5164a) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    c2672l.f28339f.add((Nf.c) ((C5164a) it2.next()).f43144a);
                }
            }
        }
    }

    @Override // dg.z
    public final void b(C4290b c4290b, C4294f c4294f) {
        this.f28330a.add(new C5172i(c4290b, c4294f));
    }

    @Override // dg.z
    public final void c(Object obj) {
        this.f28330a.add(C2673m.t(this.f28331b, this.f28332c, obj));
    }

    @Override // dg.z
    public final y d(C4290b c4290b) {
        ArrayList arrayList = new ArrayList();
        return new C2670j(this.f28331b.p(c4290b, V.f12075a, arrayList), this, arrayList);
    }

    @Override // dg.z
    public final void e(C5169f c5169f) {
        this.f28330a.add(new C5182s(c5169f));
    }
}
