package z;

import id.AbstractC3557B;

/* renamed from: z.E0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6660E0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6663G f51133a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC6726u f51134b;

    /* renamed from: c  reason: collision with root package name */
    public AbstractC6726u f51135c;

    /* renamed from: d  reason: collision with root package name */
    public AbstractC6726u f51136d;

    /* renamed from: e  reason: collision with root package name */
    public final float f51137e;

    public C6660E0(AbstractC6663G abstractC6663G) {
        this.f51133a = abstractC6663G;
        this.f51137e = abstractC6663G.a();
    }

    public final AbstractC6726u a(AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2) {
        if (this.f51136d == null) {
            this.f51136d = abstractC6726u.c();
        }
        AbstractC6726u abstractC6726u3 = this.f51136d;
        if (abstractC6726u3 != null) {
            int b10 = abstractC6726u3.b();
            for (int i10 = 0; i10 < b10; i10++) {
                AbstractC6726u abstractC6726u4 = this.f51136d;
                if (abstractC6726u4 != null) {
                    abstractC6726u4.e(i10, this.f51133a.e(abstractC6726u.a(i10), abstractC6726u2.a(i10)));
                } else {
                    AbstractC3557B.C2("targetVector");
                    throw null;
                }
            }
            AbstractC6726u abstractC6726u5 = this.f51136d;
            if (abstractC6726u5 != null) {
                return abstractC6726u5;
            }
            AbstractC3557B.C2("targetVector");
            throw null;
        }
        AbstractC3557B.C2("targetVector");
        throw null;
    }

    public final AbstractC6726u b(long j6, AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2) {
        if (this.f51135c == null) {
            this.f51135c = abstractC6726u.c();
        }
        AbstractC6726u abstractC6726u3 = this.f51135c;
        if (abstractC6726u3 != null) {
            int b10 = abstractC6726u3.b();
            for (int i10 = 0; i10 < b10; i10++) {
                AbstractC6726u abstractC6726u4 = this.f51135c;
                if (abstractC6726u4 != null) {
                    abstractC6726u.getClass();
                    abstractC6726u4.e(i10, this.f51133a.b(abstractC6726u2.a(i10), j6));
                } else {
                    AbstractC3557B.C2("velocityVector");
                    throw null;
                }
            }
            AbstractC6726u abstractC6726u5 = this.f51135c;
            if (abstractC6726u5 != null) {
                return abstractC6726u5;
            }
            AbstractC3557B.C2("velocityVector");
            throw null;
        }
        AbstractC3557B.C2("velocityVector");
        throw null;
    }
}
