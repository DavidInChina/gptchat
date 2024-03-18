package z;

import Z.C1724m0;
import Z.o1;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;

/* renamed from: z.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6694e {

    /* renamed from: a  reason: collision with root package name */
    public final C6737z0 f51228a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f51229b;

    /* renamed from: c  reason: collision with root package name */
    public final C6716p f51230c;

    /* renamed from: d  reason: collision with root package name */
    public final C1724m0 f51231d;

    /* renamed from: e  reason: collision with root package name */
    public final C1724m0 f51232e;

    /* renamed from: f  reason: collision with root package name */
    public Object f51233f;

    /* renamed from: g  reason: collision with root package name */
    public Object f51234g;

    /* renamed from: h  reason: collision with root package name */
    public final C6691c0 f51235h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC6726u f51236i;

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC6726u f51237j;

    /* renamed from: k  reason: collision with root package name */
    public AbstractC6726u f51238k;

    /* renamed from: l  reason: collision with root package name */
    public AbstractC6726u f51239l;

    public /* synthetic */ C6694e(Object obj, C6737z0 c6737z0, Object obj2, int i10) {
        this(obj, c6737z0, (i10 & 4) != 0 ? null : obj2);
    }

    public static final void a(C6694e c6694e) {
        C6716p c6716p = c6694e.f51230c;
        c6716p.f51347h0.d();
        c6716p.f51348i0 = Long.MIN_VALUE;
        c6694e.f51231d.setValue(Boolean.FALSE);
    }

    public static Object b(C6694e c6694e, Float f6, C6736z c6736z, AbstractC4825e abstractC4825e) {
        Object e10 = c6694e.e();
        C6737z0 c6737z0 = c6694e.f51228a;
        return C6691c0.a(c6694e.f51235h, new C6688b(c6694e, f6, new C6734y(c6736z, c6737z0, e10, (AbstractC6726u) c6737z0.f51416a.invoke(f6)), c6694e.f51230c.f51348i0, null, null), abstractC4825e);
    }

    public static Object c(C6694e c6694e, Object obj, AbstractC6714o abstractC6714o, wf.k kVar, AbstractC4825e abstractC4825e, int i10) {
        wf.k kVar2;
        Object invoke = c6694e.f51228a.f51417b.invoke(c6694e.f51230c.f51347h0);
        if ((i10 & 8) != 0) {
            kVar2 = null;
        } else {
            kVar2 = kVar;
        }
        Object e10 = c6694e.e();
        C6737z0 c6737z0 = c6694e.f51228a;
        return C6691c0.a(c6694e.f51235h, new C6688b(c6694e, invoke, new C6711m0(abstractC6714o, c6737z0, e10, obj, (AbstractC6726u) c6737z0.f51416a.invoke(invoke)), c6694e.f51230c.f51348i0, kVar2, null), abstractC4825e);
    }

    public final Object d(Object obj) {
        if (AbstractC3557B.K(this.f51238k, this.f51236i) && AbstractC3557B.K(this.f51239l, this.f51237j)) {
            return obj;
        }
        C6737z0 c6737z0 = this.f51228a;
        AbstractC6726u abstractC6726u = (AbstractC6726u) c6737z0.f51416a.invoke(obj);
        int b10 = abstractC6726u.b();
        boolean z10 = false;
        for (int i10 = 0; i10 < b10; i10++) {
            if (abstractC6726u.a(i10) < this.f51238k.a(i10) || abstractC6726u.a(i10) > this.f51239l.a(i10)) {
                abstractC6726u.e(i10, com.google.android.gms.internal.play_billing.N.o(abstractC6726u.a(i10), this.f51238k.a(i10), this.f51239l.a(i10)));
                z10 = true;
            }
        }
        if (z10) {
            return c6737z0.f51417b.invoke(abstractC6726u);
        }
        return obj;
    }

    public final Object e() {
        return this.f51230c.f51346Z.getValue();
    }

    public final Object f(Object obj, AbstractC4825e abstractC4825e) {
        Object a5 = C6691c0.a(this.f51235h, new C6690c(this, obj, null), abstractC4825e);
        if (a5 == EnumC5000a.f41328Y) {
            return a5;
        }
        return jf.y.f36177a;
    }

    public final void g(Object obj, Object obj2) {
        AbstractC6726u abstractC6726u;
        AbstractC6726u abstractC6726u2;
        C6737z0 c6737z0 = this.f51228a;
        if (obj == null || (abstractC6726u = (AbstractC6726u) c6737z0.f51416a.invoke(obj)) == null) {
            abstractC6726u = this.f51236i;
        }
        if (obj2 == null || (abstractC6726u2 = (AbstractC6726u) c6737z0.f51416a.invoke(obj2)) == null) {
            abstractC6726u2 = this.f51237j;
        }
        int b10 = abstractC6726u.b();
        for (int i10 = 0; i10 < b10; i10++) {
            if (abstractC6726u.a(i10) > abstractC6726u2.a(i10)) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + abstractC6726u + " is greater than upper bound " + abstractC6726u2 + " on index " + i10).toString());
            }
        }
        this.f51238k = abstractC6726u;
        this.f51239l = abstractC6726u2;
        this.f51234g = obj2;
        this.f51233f = obj;
        if (!((Boolean) this.f51231d.getValue()).booleanValue()) {
            Object d10 = d(e());
            if (!AbstractC3557B.K(d10, e())) {
                this.f51230c.f51346Z.setValue(d10);
            }
        }
    }

    public C6694e(Object obj, C6737z0 c6737z0, Object obj2) {
        AbstractC6726u abstractC6726u;
        AbstractC6726u abstractC6726u2;
        this.f51228a = c6737z0;
        this.f51229b = obj2;
        C6716p c6716p = new C6716p(c6737z0, obj, null, 60);
        this.f51230c = c6716p;
        Boolean bool = Boolean.FALSE;
        o1 o1Var = o1.f22665a;
        this.f51231d = AbstractC4828h.Z(bool, o1Var);
        this.f51232e = AbstractC4828h.Z(obj, o1Var);
        this.f51235h = new C6691c0();
        AbstractC6726u abstractC6726u3 = c6716p.f51347h0;
        boolean z10 = abstractC6726u3 instanceof C6718q;
        if (z10) {
            abstractC6726u = AbstractC6696f.f51251e;
        } else if (abstractC6726u3 instanceof C6720r) {
            abstractC6726u = AbstractC6696f.f51252f;
        } else {
            abstractC6726u = abstractC6726u3 instanceof C6722s ? AbstractC6696f.f51253g : AbstractC6696f.f51254h;
        }
        this.f51236i = abstractC6726u;
        if (z10) {
            abstractC6726u2 = AbstractC6696f.f51247a;
        } else if (abstractC6726u3 instanceof C6720r) {
            abstractC6726u2 = AbstractC6696f.f51248b;
        } else {
            abstractC6726u2 = abstractC6726u3 instanceof C6722s ? AbstractC6696f.f51249c : AbstractC6696f.f51250d;
        }
        this.f51237j = abstractC6726u2;
        this.f51238k = abstractC6726u;
        this.f51239l = abstractC6726u2;
    }
}
