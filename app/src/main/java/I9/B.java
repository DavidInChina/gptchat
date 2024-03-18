package I9;

import Mb.AbstractC0949d0;
import Rb.C1276w;
import Uc.C1424i;
import Z.AbstractC1708e0;
import Z.AbstractC1710f0;
import aa.C1939b;
import ab.C1962p;
import android.content.Context;
import android.net.Uri;
import bb.C2149A;
import bb.C2152D;
import cb.C2332A;
import cb.C2350T;
import cb.C2364e;
import cb.C2379t;
import fa.C2976e;
import fa.C2979h;
import fb.AbstractC2992k;
import fb.C2986e;
import fb.C2995n;
import id.AbstractC3557B;
import java.util.List;
import jc.C3942j;
import lc.AbstractC4394S;
import lc.C4395T;
import lc.C4401Z;
import m.AbstractActivityC4532l;
import m.C4507D;
import na.D1;
import nf.AbstractC4828h;
import p9.C5100b;
import rd.AbstractC5482f;
import s3.C5545H;
import va.C6001b;
import wd.AbstractC6211y;
import wd.C6205s;
import wf.AbstractC6216a;
import za.C6803t;
import za.C6804u;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8141Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f8142Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f8143h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C2379t c2379t, wf.k kVar) {
        super(0);
        this.f8141Y = 9;
        this.f8143h0 = c2379t;
        this.f8142Z = kVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        switch (this.f8141Y) {
            case 0:
                mo122invoke();
                return yVar;
            case 1:
                mo122invoke();
                return yVar;
            case 2:
                mo122invoke();
                return yVar;
            case 3:
                mo122invoke();
                return yVar;
            case 4:
                mo122invoke();
                return yVar;
            case 5:
                mo122invoke();
                return yVar;
            case 6:
                mo122invoke();
                return yVar;
            case 7:
                mo122invoke();
                return yVar;
            case 8:
                mo122invoke();
                return yVar;
            case 9:
                mo122invoke();
                return yVar;
            case 10:
                mo122invoke();
                return yVar;
            case 11:
                mo122invoke();
                return yVar;
            case 12:
                mo122invoke();
                return yVar;
            case 13:
                mo122invoke();
                return yVar;
            case 14:
                mo122invoke();
                return yVar;
            case 15:
                mo122invoke();
                return yVar;
            case 16:
                mo122invoke();
                return yVar;
            case 17:
                mo122invoke();
                return yVar;
            case 18:
                mo122invoke();
                return yVar;
            case 19:
                mo122invoke();
                return yVar;
            case 20:
                mo122invoke();
                return yVar;
            case 21:
                mo122invoke();
                return yVar;
            case 22:
                mo122invoke();
                return yVar;
            case 23:
                mo122invoke();
                return yVar;
            case 24:
                mo122invoke();
                return yVar;
            case 25:
                mo122invoke();
                return yVar;
            case 26:
                mo122invoke();
                return yVar;
            case 27:
                mo122invoke();
                return yVar;
            case 28:
                mo122invoke();
                return yVar;
            default:
                return P1.e.a(Ad.l.g(((Ng.F) this.f8142Z).i().plus(Ng.Q.f12906c)), new zc.u(3, (AbstractC5482f) this.f8143h0), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(Object obj, int i10, Object obj2) {
        super(0);
        this.f8141Y = i10;
        this.f8142Z = obj;
        this.f8143h0 = obj2;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo122invoke() {
        Object obj;
        C2332A c2332a;
        String str;
        int i10 = this.f8141Y;
        Object obj2 = this.f8143h0;
        Object obj3 = this.f8142Z;
        switch (i10) {
            case 0:
                wf.k kVar = (wf.k) obj3;
                Z0.i iVar = (Z0.i) ((C5100b) obj2).f42762b.getValue();
                kVar.invoke(new Z0.i(iVar != null ? iVar.f22799a : Z0.i.f22797b));
                return;
            case 1:
                List list = (List) obj3;
                if (!(!list.isEmpty())) {
                    return;
                }
                if (list.size() > 1) {
                    ((List) obj2).add(new C2979h(kf.t.K2(list)));
                } else {
                    ((List) obj2).add(new C2976e((wd.Y) kf.t.f2(list)));
                }
                list.clear();
                return;
            case 2:
                C5545H c5545h = ((Tc.f) obj3).f17057b;
                C1424i c1424i = C1424i.f17679i;
                String str2 = ((D1) obj2).f39766e;
                AbstractC3557B.c0("conversationId", str2);
                String concat = "conversation/details?id=".concat(str2);
                AbstractC3557B.c0("internalRoute", concat);
                Bi.c.r1(c5545h, concat);
                return;
            case 3:
                ((wf.k) obj3).invoke(new C6803t((AbstractC6211y) obj2));
                return;
            case 4:
                ((wf.k) obj3).invoke(new C6804u((Uri) obj2));
                return;
            case 5:
                ((wf.k) obj3).invoke((C2364e) obj2);
                return;
            case 6:
                wf.k kVar2 = (wf.k) obj3;
                if (((D1) obj2).f39779r) {
                    obj = na.X.f39888a;
                } else {
                    obj = na.W.f39885a;
                }
                kVar2.invoke(obj);
                return;
            case 7:
                Ad.l.O0((Ng.F) obj3, null, null, new C6001b((B.H) obj2, null), 3);
                return;
            case 8:
                ((wf.k) obj3).invoke((j0.u) obj2);
                return;
            case 9:
                C2379t c2379t = (C2379t) obj2;
                if (c2379t == null || (c2332a = c2379t.f26551c) == null || (str = c2332a.f26427d) == null) {
                    return;
                }
                ((wf.k) obj3).invoke(new C1962p(str));
                return;
            case 10:
                ((wf.k) obj3).invoke(new C2149A(!((C2152D) obj2).f25698f));
                return;
            case 11:
                ((wf.k) obj3).invoke(new bb.N((C2350T) ((wd.n0) ((bb.H0) obj2).f25720a).f48446a));
                return;
            case 12:
                ((AbstractC2992k) obj3).j(new C2986e((C2995n) obj2));
                return;
            case 13:
                if (((String) obj3) == null) {
                    return;
                }
                ((AbstractC6216a) obj2).mo122invoke();
                return;
            case 14:
                String str3 = ((wi.h) obj2).f48596k;
                AbstractC3557B.b0("getLiteral(...)", str3);
                ((wf.k) obj3).invoke(Lg.n.U2(str3).toString());
                return;
            case 15:
                ((wf.k) obj3).invoke(new gb.V((C1939b) obj2));
                return;
            case 16:
                ((AbstractC0949d0) obj3).m((AbstractActivityC4532l) obj2);
                return;
            case 17:
                Context context = (Context) obj2;
                Mb.S s10 = (Mb.S) ((Mb.H) obj3);
                s10.getClass();
                AbstractC3557B.c0("activity", context);
                s10.f11839n.b(Z8.l1.f23378m, kf.w.f37484Y);
                Ad.l.O0(AbstractC4828h.Q(s10), null, null, new Mb.O(s10, context, null), 3);
                return;
            case 18:
                Mb.F0 f02 = (Mb.F0) obj3;
                Context context2 = (Context) obj2;
                f02.getClass();
                AbstractC3557B.c0("activity", context2);
                f02.f11773j.b(Z8.l1.f23385t, kf.w.f37484Y);
                Ad.l.O0(AbstractC4828h.Q(f02), null, null, new Mb.B0(f02, context2, null), 3);
                return;
            case 19:
                x8.W.F(Pc.e.a(), "OTP retriever unregistering receiver", null, 6);
                ((Context) obj3).unregisterReceiver((C4507D) obj2);
                return;
            case 20:
                ((wf.k) obj3).invoke((Qb.e) obj2);
                return;
            case 21:
                ((wf.k) obj3).invoke(new C1276w(((Rb.C) obj2).f15256h));
                return;
            case 22:
                ((Sb.g) ((Rb.O) obj3)).l(Sb.a.f16481h0);
                ((AbstractC6216a) obj2).mo122invoke();
                return;
            case 23:
                ((wf.k) obj3).invoke((C6205s) obj2);
                return;
            case 24:
                ((wf.k) obj3).invoke(new ic.I((C3942j) obj2));
                return;
            case 25:
                Z.U0 u02 = (Z.U0) ((AbstractC1708e0) obj2);
                u02.i(u02.h() + 1);
                if (u02.h() != 10) {
                    return;
                }
                Bi.c.r1(((Tc.f) obj3).f17057b, Uc.r.f17694k.o1());
                return;
            case 26:
                Context context3 = (Context) obj2;
                C4401Z c4401z = (C4401Z) ((AbstractC4394S) obj3);
                c4401z.getClass();
                AbstractC3557B.c0("activity", context3);
                Ad.l.O0(AbstractC4828h.Q(c4401z), null, null, new C4395T(c4401z, context3, null), 3);
                return;
            case 27:
                ((AbstractC1710f0) obj3).setValue(Boolean.TRUE);
                ((AbstractC1710f0) obj2).setValue(Boolean.FALSE);
                return;
            default:
                if (((Tc.f) obj3).f17057b.p()) {
                    return;
                }
                ((AbstractActivityC4532l) obj2).finish();
                return;
        }
    }
}
