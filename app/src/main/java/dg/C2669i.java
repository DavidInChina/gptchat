package dg;

import java.util.ArrayList;
import kg.C4290b;
import kg.C4294f;
import pg.C5164a;
import pg.C5169f;

/* renamed from: dg.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2669i implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f28321a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y f28322b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C2672l f28323c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C4294f f28324d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList f28325e;

    public C2669i(C2672l c2672l, C2672l c2672l2, C4294f c4294f, ArrayList arrayList) {
        this.f28322b = c2672l;
        this.f28323c = c2672l2;
        this.f28324d = c4294f;
        this.f28325e = arrayList;
        this.f28321a = c2672l;
    }

    @Override // dg.y
    public final void a() {
        this.f28322b.a();
        this.f28323c.g(this.f28324d, new C5164a((Nf.c) kf.t.B2(this.f28325e)));
    }

    @Override // dg.y
    public final y b(C4290b c4290b, C4294f c4294f) {
        return this.f28321a.b(c4290b, c4294f);
    }

    @Override // dg.y
    public final void c(C4294f c4294f, C5169f c5169f) {
        this.f28321a.c(c4294f, c5169f);
    }

    @Override // dg.y
    public final z d(C4294f c4294f) {
        return this.f28321a.d(c4294f);
    }

    @Override // dg.y
    public final void e(C4294f c4294f, C4290b c4290b, C4294f c4294f2) {
        this.f28321a.e(c4294f, c4290b, c4294f2);
    }

    @Override // dg.y
    public final void f(Object obj, C4294f c4294f) {
        this.f28321a.f(obj, c4294f);
    }
}
