package g4;

import E0.AbstractC0454m;
import E0.C0453l;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import u0.AbstractC5824b;

/* renamed from: g4.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3182j extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f31224Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f31225Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C3188p f31226h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3182j(C3188p c3188p, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31226h0 = c3188p;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C3182j c3182j = new C3182j(this.f31226h0, abstractC4825e);
        c3182j.f31225Z = obj;
        return c3182j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3182j) create((q4.j) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C3188p c3188p;
        AbstractC5824b abstractC5824b;
        r4.g gVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31224Y;
        if (i10 != 0) {
            if (i10 == 1) {
                c3188p = (C3188p) this.f31225Z;
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            q4.j jVar = (q4.j) this.f31225Z;
            C3188p c3188p2 = this.f31226h0;
            f4.i iVar = (f4.i) c3188p2.f31251y0.getValue();
            q4.h a5 = q4.j.a(jVar);
            a5.f43806d = new C3185m(c3188p2, 0);
            a5.b();
            q4.d dVar = jVar.f43840L;
            if (dVar.f43769b == null) {
                a5.f43798K = new C3187o(c3188p2);
                a5.b();
            }
            if (dVar.f43770c == null) {
                AbstractC0454m abstractC0454m = c3188p2.f31246t0;
                r4.e eVar = AbstractC3172A.f31191b;
                if (AbstractC3557B.K(abstractC0454m, C0453l.f4074b) || AbstractC3557B.K(abstractC0454m, C0453l.f4075c)) {
                    gVar = r4.g.f44438Z;
                } else {
                    gVar = r4.g.f44437Y;
                }
                a5.f43799L = gVar;
            }
            if (dVar.f43776i != r4.d.f44432Y) {
                a5.f43812j = r4.d.f44433Z;
            }
            q4.j a10 = a5.a();
            this.f31225Z = c3188p2;
            this.f31224Y = 1;
            obj = ((f4.q) iVar).b(a10, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
            c3188p = c3188p2;
        }
        q4.k kVar = (q4.k) obj;
        c3188p.getClass();
        if (kVar instanceof q4.q) {
            q4.q qVar = (q4.q) kVar;
            return new C3180h(c3188p.j(qVar.f43886a), qVar);
        } else if (kVar instanceof q4.e) {
            Drawable a11 = kVar.a();
            if (a11 != null) {
                abstractC5824b = c3188p.j(a11);
            } else {
                abstractC5824b = null;
            }
            return new C3178f(abstractC5824b, (q4.e) kVar);
        } else {
            throw new RuntimeException();
        }
    }
}
