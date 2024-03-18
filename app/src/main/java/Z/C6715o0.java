package z;

import Z.C1724m0;
import Z.o1;
import nf.AbstractC4828h;

/* renamed from: z.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6715o0 {

    /* renamed from: a  reason: collision with root package name */
    public final C6737z0 f51342a;

    /* renamed from: b  reason: collision with root package name */
    public final C1724m0 f51343b = AbstractC4828h.Z(null, o1.f22665a);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C6729v0 f51344c;

    public C6715o0(C6729v0 c6729v0, C6737z0 c6737z0, String str) {
        this.f51344c = c6729v0;
        this.f51342a = c6737z0;
    }

    public final C6713n0 a(wf.k kVar, wf.k kVar2) {
        C1724m0 c1724m0 = this.f51343b;
        C6713n0 c6713n0 = (C6713n0) c1724m0.getValue();
        C6729v0 c6729v0 = this.f51344c;
        if (c6713n0 == null) {
            Object invoke = kVar2.invoke(c6729v0.b());
            Object invoke2 = kVar2.invoke(c6729v0.b());
            C6737z0 c6737z0 = this.f51342a;
            AbstractC6726u abstractC6726u = (AbstractC6726u) c6737z0.f51416a.invoke(invoke2);
            abstractC6726u.d();
            C6721r0 c6721r0 = new C6721r0(c6729v0, invoke, abstractC6726u, c6737z0);
            c6713n0 = new C6713n0(this, c6721r0, kVar, kVar2);
            c1724m0.setValue(c6713n0);
            c6729v0.f51391h.add(c6721r0);
        }
        c6713n0.f51340h0 = kVar2;
        c6713n0.f51339Z = kVar;
        c6713n0.b(c6729v0.c());
        return c6713n0;
    }
}
