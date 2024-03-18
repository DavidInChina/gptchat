package z;

import id.AbstractC3557B;

/* renamed from: z.D0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6658D0 implements AbstractC6654B0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC6728v f51129Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC6726u f51130Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC6726u f51131h0;

    /* renamed from: i0  reason: collision with root package name */
    public AbstractC6726u f51132i0;

    public C6658D0(C.b bVar) {
        this.f51129Y = bVar;
    }

    @Override // z.AbstractC6654B0
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // z.AbstractC6654B0
    public final AbstractC6726u c(long j6, AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        if (this.f51130Z == null) {
            this.f51130Z = abstractC6726u.c();
        }
        AbstractC6726u abstractC6726u4 = this.f51130Z;
        if (abstractC6726u4 != null) {
            int b10 = abstractC6726u4.b();
            for (int i10 = 0; i10 < b10; i10++) {
                AbstractC6726u abstractC6726u5 = this.f51130Z;
                if (abstractC6726u5 != null) {
                    abstractC6726u5.e(i10, ((C.b) this.f51129Y).g(i10).e(j6, abstractC6726u.a(i10), abstractC6726u2.a(i10), abstractC6726u3.a(i10)));
                } else {
                    AbstractC3557B.C2("valueVector");
                    throw null;
                }
            }
            AbstractC6726u abstractC6726u6 = this.f51130Z;
            if (abstractC6726u6 != null) {
                return abstractC6726u6;
            }
            AbstractC3557B.C2("valueVector");
            throw null;
        }
        AbstractC3557B.C2("valueVector");
        throw null;
    }

    @Override // z.AbstractC6654B0
    public final AbstractC6726u d(AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        if (this.f51132i0 == null) {
            this.f51132i0 = abstractC6726u3.c();
        }
        AbstractC6726u abstractC6726u4 = this.f51132i0;
        if (abstractC6726u4 != null) {
            int b10 = abstractC6726u4.b();
            for (int i10 = 0; i10 < b10; i10++) {
                AbstractC6726u abstractC6726u5 = this.f51132i0;
                if (abstractC6726u5 != null) {
                    abstractC6726u5.e(i10, ((C.b) this.f51129Y).g(i10).d(abstractC6726u.a(i10), abstractC6726u2.a(i10), abstractC6726u3.a(i10)));
                } else {
                    AbstractC3557B.C2("endVelocityVector");
                    throw null;
                }
            }
            AbstractC6726u abstractC6726u6 = this.f51132i0;
            if (abstractC6726u6 != null) {
                return abstractC6726u6;
            }
            AbstractC3557B.C2("endVelocityVector");
            throw null;
        }
        AbstractC3557B.C2("endVelocityVector");
        throw null;
    }

    @Override // z.AbstractC6654B0
    public final long f(AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        Cf.f it = com.google.android.gms.internal.play_billing.N.D0(0, abstractC6726u.b()).iterator();
        long j6 = 0;
        while (it.f3111h0) {
            int a5 = it.a();
            j6 = Math.max(j6, ((C.b) this.f51129Y).g(a5).c(abstractC6726u.a(a5), abstractC6726u2.a(a5), abstractC6726u3.a(a5)));
        }
        return j6;
    }

    @Override // z.AbstractC6654B0
    public final AbstractC6726u h(long j6, AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        if (this.f51131h0 == null) {
            this.f51131h0 = abstractC6726u3.c();
        }
        AbstractC6726u abstractC6726u4 = this.f51131h0;
        if (abstractC6726u4 != null) {
            int b10 = abstractC6726u4.b();
            for (int i10 = 0; i10 < b10; i10++) {
                AbstractC6726u abstractC6726u5 = this.f51131h0;
                if (abstractC6726u5 != null) {
                    abstractC6726u5.e(i10, ((C.b) this.f51129Y).g(i10).b(j6, abstractC6726u.a(i10), abstractC6726u2.a(i10), abstractC6726u3.a(i10)));
                } else {
                    AbstractC3557B.C2("velocityVector");
                    throw null;
                }
            }
            AbstractC6726u abstractC6726u6 = this.f51131h0;
            if (abstractC6726u6 != null) {
                return abstractC6726u6;
            }
            AbstractC3557B.C2("velocityVector");
            throw null;
        }
        AbstractC3557B.C2("velocityVector");
        throw null;
    }

    public C6658D0(AbstractC6661F abstractC6661F) {
        this(new C.b(abstractC6661F));
    }
}
