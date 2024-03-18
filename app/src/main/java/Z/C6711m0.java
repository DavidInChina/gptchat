package z;

/* renamed from: z.m0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6711m0 implements AbstractC6706k {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6654B0 f51320a;

    /* renamed from: b  reason: collision with root package name */
    public final C6737z0 f51321b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f51322c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f51323d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC6726u f51324e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC6726u f51325f;

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC6726u f51326g;

    /* renamed from: h  reason: collision with root package name */
    public final long f51327h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC6726u f51328i;

    public C6711m0(AbstractC6714o abstractC6714o, C6737z0 c6737z0, Object obj, Object obj2, AbstractC6726u abstractC6726u) {
        AbstractC6726u abstractC6726u2;
        AbstractC6654B0 mo121a = abstractC6714o.mo121a(c6737z0);
        this.f51320a = mo121a;
        this.f51321b = c6737z0;
        this.f51322c = obj;
        this.f51323d = obj2;
        AbstractC6726u abstractC6726u3 = (AbstractC6726u) c6737z0.f51416a.invoke(obj);
        this.f51324e = abstractC6726u3;
        wf.k kVar = c6737z0.f51416a;
        AbstractC6726u abstractC6726u4 = (AbstractC6726u) kVar.invoke(obj2);
        this.f51325f = abstractC6726u4;
        if (abstractC6726u != null) {
            abstractC6726u2 = AbstractC6696f.k(abstractC6726u);
        } else {
            abstractC6726u2 = ((AbstractC6726u) kVar.invoke(obj)).c();
        }
        this.f51326g = abstractC6726u2;
        this.f51327h = mo121a.f(abstractC6726u3, abstractC6726u4, abstractC6726u2);
        this.f51328i = mo121a.d(abstractC6726u3, abstractC6726u4, abstractC6726u2);
    }

    @Override // z.AbstractC6706k
    public final boolean a() {
        return this.f51320a.a();
    }

    @Override // z.AbstractC6706k
    public final long b() {
        return this.f51327h;
    }

    @Override // z.AbstractC6706k
    public final C6737z0 c() {
        return this.f51321b;
    }

    @Override // z.AbstractC6706k
    public final AbstractC6726u d(long j6) {
        if (!AbstractC6708l.a(this, j6)) {
            return this.f51320a.h(j6, this.f51324e, this.f51325f, this.f51326g);
        }
        return this.f51328i;
    }

    @Override // z.AbstractC6706k
    public final /* synthetic */ boolean e(long j6) {
        return AbstractC6708l.a(this, j6);
    }

    @Override // z.AbstractC6706k
    public final Object f(long j6) {
        if (!AbstractC6708l.a(this, j6)) {
            AbstractC6726u c10 = this.f51320a.c(j6, this.f51324e, this.f51325f, this.f51326g);
            int b10 = c10.b();
            for (int i10 = 0; i10 < b10; i10++) {
                if (!(!Float.isNaN(c10.a(i10)))) {
                    throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + c10 + ". Animation: " + this + ", playTimeNanos: " + j6).toString());
                }
            }
            return this.f51321b.f51417b.invoke(c10);
        }
        return this.f51323d;
    }

    @Override // z.AbstractC6706k
    public final Object g() {
        return this.f51323d;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f51322c + " -> " + this.f51323d + ",initial velocity: " + this.f51326g + ", duration: " + (this.f51327h / 1000000) + " ms,animationSpec: " + this.f51320a;
    }
}
