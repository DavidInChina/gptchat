package z;

import Z.C1724m0;
import Z.o1;
import nf.AbstractC4828h;
import wf.AbstractC6216a;

/* renamed from: z.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6712n {

    /* renamed from: a  reason: collision with root package name */
    public final C6737z0 f51329a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f51330b;

    /* renamed from: c  reason: collision with root package name */
    public final long f51331c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC6216a f51332d;

    /* renamed from: e  reason: collision with root package name */
    public final C1724m0 f51333e;

    /* renamed from: f  reason: collision with root package name */
    public AbstractC6726u f51334f;

    /* renamed from: g  reason: collision with root package name */
    public long f51335g;

    /* renamed from: h  reason: collision with root package name */
    public long f51336h = Long.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public final C1724m0 f51337i;

    public C6712n(Object obj, C6737z0 c6737z0, AbstractC6726u abstractC6726u, long j6, Object obj2, long j10, C6705j0 c6705j0) {
        this.f51329a = c6737z0;
        this.f51330b = obj2;
        this.f51331c = j10;
        this.f51332d = c6705j0;
        o1 o1Var = o1.f22665a;
        this.f51333e = AbstractC4828h.Z(obj, o1Var);
        this.f51334f = AbstractC6696f.k(abstractC6726u);
        this.f51335g = j6;
        this.f51337i = AbstractC4828h.Z(Boolean.TRUE, o1Var);
    }

    public final void a() {
        this.f51337i.setValue(Boolean.FALSE);
        this.f51332d.mo122invoke();
    }
}
