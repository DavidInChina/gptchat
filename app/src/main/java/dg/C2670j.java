package dg;

import java.util.ArrayList;
import kg.C4290b;
import kg.C4294f;
import pg.C5164a;
import pg.C5169f;

/* renamed from: dg.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2670j implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f28326a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y f28327b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C2671k f28328c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f28329d;

    public C2670j(C2672l c2672l, C2671k c2671k, ArrayList arrayList) {
        this.f28327b = c2672l;
        this.f28328c = c2671k;
        this.f28329d = arrayList;
        this.f28326a = c2672l;
    }

    @Override // dg.y
    public final void a() {
        this.f28327b.a();
        this.f28328c.f28330a.add(new C5164a((Nf.c) kf.t.B2(this.f28329d)));
    }

    @Override // dg.y
    public final y b(C4290b c4290b, C4294f c4294f) {
        return this.f28326a.b(c4290b, c4294f);
    }

    @Override // dg.y
    public final void c(C4294f c4294f, C5169f c5169f) {
        this.f28326a.c(c4294f, c5169f);
    }

    @Override // dg.y
    public final z d(C4294f c4294f) {
        return this.f28326a.d(c4294f);
    }

    @Override // dg.y
    public final void e(C4294f c4294f, C4290b c4290b, C4294f c4294f2) {
        this.f28326a.e(c4294f, c4290b, c4294f2);
    }

    @Override // dg.y
    public final void f(Object obj, C4294f c4294f) {
        this.f28326a.f(obj, c4294f);
    }
}
