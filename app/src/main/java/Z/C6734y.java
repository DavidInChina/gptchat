package z;

import id.AbstractC3557B;

/* renamed from: z.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6734y implements AbstractC6706k {

    /* renamed from: a  reason: collision with root package name */
    public final C6660E0 f51404a;

    /* renamed from: b  reason: collision with root package name */
    public final C6737z0 f51405b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f51406c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC6726u f51407d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC6726u f51408e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC6726u f51409f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f51410g;

    /* renamed from: h  reason: collision with root package name */
    public final long f51411h;

    public C6734y(C6736z c6736z, C6737z0 c6737z0, Object obj, AbstractC6726u abstractC6726u) {
        C6660E0 c6660e0 = new C6660E0(c6736z.f51415a);
        this.f51404a = c6660e0;
        this.f51405b = c6737z0;
        this.f51406c = obj;
        AbstractC6726u abstractC6726u2 = (AbstractC6726u) c6737z0.f51416a.invoke(obj);
        this.f51407d = abstractC6726u2;
        this.f51408e = AbstractC6696f.k(abstractC6726u);
        this.f51410g = c6737z0.f51417b.invoke(c6660e0.a(abstractC6726u2, abstractC6726u));
        if (c6660e0.f51135c == null) {
            c6660e0.f51135c = abstractC6726u2.c();
        }
        AbstractC6726u abstractC6726u3 = c6660e0.f51135c;
        if (abstractC6726u3 != null) {
            int b10 = abstractC6726u3.b();
            long j6 = 0;
            for (int i10 = 0; i10 < b10; i10++) {
                abstractC6726u2.getClass();
                j6 = Math.max(j6, c6660e0.f51133a.d(abstractC6726u.a(i10)));
            }
            this.f51411h = j6;
            AbstractC6726u k10 = AbstractC6696f.k(this.f51404a.b(j6, this.f51407d, abstractC6726u));
            this.f51409f = k10;
            int b11 = k10.b();
            for (int i11 = 0; i11 < b11; i11++) {
                AbstractC6726u abstractC6726u4 = this.f51409f;
                float a5 = abstractC6726u4.a(i11);
                float f6 = this.f51404a.f51137e;
                abstractC6726u4.e(i11, com.google.android.gms.internal.play_billing.N.o(a5, -f6, f6));
            }
            return;
        }
        AbstractC3557B.C2("velocityVector");
        throw null;
    }

    @Override // z.AbstractC6706k
    public final boolean a() {
        return false;
    }

    @Override // z.AbstractC6706k
    public final long b() {
        return this.f51411h;
    }

    @Override // z.AbstractC6706k
    public final C6737z0 c() {
        return this.f51405b;
    }

    @Override // z.AbstractC6706k
    public final AbstractC6726u d(long j6) {
        if (!AbstractC6708l.a(this, j6)) {
            return this.f51404a.b(j6, this.f51407d, this.f51408e);
        }
        return this.f51409f;
    }

    @Override // z.AbstractC6706k
    public final /* synthetic */ boolean e(long j6) {
        return AbstractC6708l.a(this, j6);
    }

    @Override // z.AbstractC6706k
    public final Object f(long j6) {
        if (!AbstractC6708l.a(this, j6)) {
            wf.k kVar = this.f51405b.f51417b;
            C6660E0 c6660e0 = this.f51404a;
            AbstractC6726u abstractC6726u = c6660e0.f51134b;
            AbstractC6726u abstractC6726u2 = this.f51407d;
            if (abstractC6726u == null) {
                c6660e0.f51134b = abstractC6726u2.c();
            }
            AbstractC6726u abstractC6726u3 = c6660e0.f51134b;
            if (abstractC6726u3 != null) {
                int b10 = abstractC6726u3.b();
                for (int i10 = 0; i10 < b10; i10++) {
                    AbstractC6726u abstractC6726u4 = c6660e0.f51134b;
                    if (abstractC6726u4 != null) {
                        abstractC6726u4.e(i10, c6660e0.f51133a.c(abstractC6726u2.a(i10), this.f51408e.a(i10), j6));
                    } else {
                        AbstractC3557B.C2("valueVector");
                        throw null;
                    }
                }
                AbstractC6726u abstractC6726u5 = c6660e0.f51134b;
                if (abstractC6726u5 != null) {
                    return kVar.invoke(abstractC6726u5);
                }
                AbstractC3557B.C2("valueVector");
                throw null;
            }
            AbstractC3557B.C2("valueVector");
            throw null;
        }
        return this.f51410g;
    }

    @Override // z.AbstractC6706k
    public final Object g() {
        return this.f51410g;
    }
}
