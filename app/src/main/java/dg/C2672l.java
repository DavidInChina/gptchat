package dg;

import Mf.AbstractC0997f;
import Mf.V;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kg.C4290b;
import kg.C4294f;
import pg.AbstractC5170g;
import pg.C5169f;
import pg.C5172i;
import pg.C5180q;
import pg.C5182s;

/* renamed from: dg.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2672l implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C2673m f28334a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f28335b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C2673m f28336c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AbstractC0997f f28337d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C4290b f28338e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ List f28339f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ V f28340g;

    public C2672l(C2673m c2673m, AbstractC0997f abstractC0997f, C4290b c4290b, List list, V v10) {
        this.f28336c = c2673m;
        this.f28337d = abstractC0997f;
        this.f28338e = c4290b;
        this.f28339f = list;
        this.f28340g = v10;
        this.f28334a = c2673m;
    }

    @Override // dg.y
    public final void a() {
        C5182s c5182s;
        HashMap hashMap = this.f28335b;
        C2673m c2673m = this.f28336c;
        c2673m.getClass();
        C4290b c4290b = this.f28338e;
        AbstractC3557B.c0("annotationClassId", c4290b);
        AbstractC3557B.c0("arguments", hashMap);
        if (AbstractC3557B.K(c4290b, If.b.f8593b)) {
            Object obj = hashMap.get(C4294f.e("value"));
            C5180q c5180q = null;
            if (obj instanceof C5182s) {
                c5182s = (C5182s) obj;
            } else {
                c5182s = null;
            }
            if (c5182s != null) {
                Object obj2 = c5182s.f43144a;
                if (obj2 instanceof C5180q) {
                    c5180q = (C5180q) obj2;
                }
                if (c5180q != null && c2673m.o(c5180q.f43157a.f43142a)) {
                    return;
                }
            }
        }
        if (c2673m.o(c4290b)) {
            return;
        }
        this.f28339f.add(new Nf.d(this.f28337d.n(), hashMap, this.f28340g));
    }

    @Override // dg.y
    public final y b(C4290b c4290b, C4294f c4294f) {
        ArrayList arrayList = new ArrayList();
        return new C2669i(this.f28334a.p(c4290b, V.f12075a, arrayList), this, c4294f, arrayList);
    }

    @Override // dg.y
    public final void c(C4294f c4294f, C5169f c5169f) {
        g(c4294f, new C5182s(c5169f));
    }

    @Override // dg.y
    public final z d(C4294f c4294f) {
        return new C2671k(this.f28334a, c4294f, this);
    }

    @Override // dg.y
    public final void e(C4294f c4294f, C4290b c4290b, C4294f c4294f2) {
        g(c4294f, new C5172i(c4290b, c4294f2));
    }

    @Override // dg.y
    public final void f(Object obj, C4294f c4294f) {
        g(c4294f, C2673m.t(this.f28334a, c4294f, obj));
    }

    public final void g(C4294f c4294f, AbstractC5170g abstractC5170g) {
        if (c4294f != null) {
            this.f28335b.put(c4294f, abstractC5170g);
        }
    }
}
