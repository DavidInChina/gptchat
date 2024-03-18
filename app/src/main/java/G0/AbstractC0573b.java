package G0;

import E0.AbstractC0442a;
import E0.AbstractC0445d;
import E0.C0458q;
import id.AbstractC3557B;
import java.util.HashMap;
import java.util.Map;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import q0.C5251c;

/* renamed from: G0.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0573b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0574c f5708a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5710c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5711d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5712e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5713f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5714g;

    /* renamed from: h  reason: collision with root package name */
    public AbstractC0574c f5715h;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5709b = true;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f5716i = new HashMap();

    public AbstractC0573b(AbstractC0574c abstractC0574c) {
        this.f5708a = abstractC0574c;
    }

    public static final void a(AbstractC0573b abstractC0573b, AbstractC0442a abstractC0442a, int i10, g0 g0Var) {
        int i11;
        abstractC0573b.getClass();
        float f6 = i10;
        long r10 = R4.b.r(f6, f6);
        while (true) {
            r10 = abstractC0573b.b(g0Var, r10);
            g0Var = g0Var.f5772p0;
            AbstractC3557B.Z(g0Var);
            if (AbstractC3557B.K(g0Var, abstractC0573b.f5708a.e())) {
                break;
            } else if (abstractC0573b.c(g0Var).containsKey(abstractC0442a)) {
                float d10 = abstractC0573b.d(g0Var, abstractC0442a);
                r10 = R4.b.r(d10, d10);
            }
        }
        if (abstractC0442a instanceof C0458q) {
            i11 = AbstractC4344b.Y0(C5251c.e(r10));
        } else {
            i11 = AbstractC4344b.Y0(C5251c.d(r10));
        }
        HashMap hashMap = abstractC0573b.f5716i;
        if (hashMap.containsKey(abstractC0442a)) {
            int intValue = ((Number) AbstractC4268D.Z0(abstractC0442a, hashMap)).intValue();
            C0458q c0458q = AbstractC0445d.f4051a;
            i11 = ((Number) abstractC0442a.f4047a.invoke(Integer.valueOf(intValue), Integer.valueOf(i11))).intValue();
        }
        hashMap.put(abstractC0442a, Integer.valueOf(i11));
    }

    public abstract long b(g0 g0Var, long j6);

    public abstract Map c(g0 g0Var);

    public abstract int d(g0 g0Var, AbstractC0442a abstractC0442a);

    public final boolean e() {
        if (!this.f5710c && !this.f5712e && !this.f5713f && !this.f5714g) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        i();
        if (this.f5715h != null) {
            return true;
        }
        return false;
    }

    public final void g() {
        this.f5709b = true;
        AbstractC0574c abstractC0574c = this.f5708a;
        AbstractC0574c h10 = abstractC0574c.h();
        if (h10 == null) {
            return;
        }
        if (this.f5710c) {
            h10.N();
        } else if (this.f5712e || this.f5711d) {
            h10.requestLayout();
        }
        if (this.f5713f) {
            abstractC0574c.N();
        }
        if (this.f5714g) {
            abstractC0574c.requestLayout();
        }
        h10.a().g();
    }

    public final void h() {
        HashMap hashMap = this.f5716i;
        hashMap.clear();
        C0571a c0571a = new C0571a(0, this);
        AbstractC0574c abstractC0574c = this.f5708a;
        abstractC0574c.A(c0571a);
        hashMap.putAll(c(abstractC0574c.e()));
        this.f5709b = false;
    }

    public final void i() {
        AbstractC0573b a5;
        AbstractC0573b a10;
        boolean e10 = e();
        AbstractC0574c abstractC0574c = this.f5708a;
        if (!e10) {
            AbstractC0574c h10 = abstractC0574c.h();
            if (h10 == null) {
                return;
            }
            abstractC0574c = h10.a().f5715h;
            if (abstractC0574c == null || !abstractC0574c.a().e()) {
                AbstractC0574c abstractC0574c2 = this.f5715h;
                if (abstractC0574c2 != null && !abstractC0574c2.a().e()) {
                    AbstractC0574c h11 = abstractC0574c2.h();
                    if (h11 != null && (a10 = h11.a()) != null) {
                        a10.i();
                    }
                    AbstractC0574c h12 = abstractC0574c2.h();
                    if (h12 != null && (a5 = h12.a()) != null) {
                        abstractC0574c = a5.f5715h;
                    } else {
                        abstractC0574c = null;
                    }
                } else {
                    return;
                }
            }
        }
        this.f5715h = abstractC0574c;
    }
}
