package Ga;

import L9.AbstractC0905k;
import L9.C0906l;
import L9.L;
import L9.X;
import L9.a0;
import Qg.AbstractC1207j;
import Qg.C1209l;
import Qg.H;
import e9.C2814g;
import id.AbstractC3557B;
import jd.AbstractC3949a;
import kd.C4255s;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;
import rb.C5426p;
import wf.AbstractC6216a;
import x8.W;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a  reason: collision with root package name */
    public final ge.d f6195a;

    /* renamed from: b  reason: collision with root package name */
    public final Yc.a f6196b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC3949a f6197c;

    public E(ge.d dVar, Yc.a aVar, AbstractC3949a abstractC3949a) {
        this.f6195a = dVar;
        this.f6196b = aVar;
        this.f6197c = abstractC3949a;
    }

    public static final Object a(E e10, AbstractC1207j abstractC1207j, String str, AbstractC6216a abstractC6216a, AbstractC4825e abstractC4825e) {
        Object c10;
        e10.getClass();
        boolean I22 = Lg.n.I2(str, "{", false);
        jf.y yVar = jf.y.f36177a;
        if (I22) {
            try {
                L l10 = (L) md.b.f39132a.b(L.Companion.serializer(), str);
                abstractC6216a.mo122invoke();
                String str2 = l10.f10885b;
                C4255s c4255s = (C4255s) e10.f6197c;
                c4255s.e(str2, l10.f10887d);
                String str3 = l10.f10884a;
                AbstractC3557B.c0("conversationId", str3);
                c10 = new C5426p(new C2814g(c4255s.f37354g, str3, l10.f10886c, 3), 16).b(new y.F(e10, abstractC1207j, abstractC6216a, 2), abstractC4825e);
                if (c10 != EnumC5000a.f41328Y) {
                    return yVar;
                }
            } catch (IllegalArgumentException e11) {
                c10 = abstractC1207j.c(new C0906l(e11), abstractC4825e);
                if (c10 != EnumC5000a.f41328Y) {
                    return yVar;
                }
            }
        } else if (!Lg.n.n2(str)) {
            s.f6236d.getClass();
            AbstractC0905k e12 = s.e(str);
            if (e12 == null || (c10 = abstractC1207j.c(e12, abstractC4825e)) != EnumC5000a.f41328Y) {
                return yVar;
            }
        } else {
            return yVar;
        }
        return c10;
    }

    public final H b(L9.B b10, String str, AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("request", b10);
        AbstractC3557B.c0("onSwitchToWebsockets", abstractC6216a);
        return new H(new C1209l(new C(this, b10, str, abstractC6216a, null)), new Q3.h(7, null));
    }

    public final Object c(X x10, String str, AbstractC5156c abstractC5156c) {
        D d10 = new D(x10, str, null);
        Df.w a5 = kotlin.jvm.internal.C.a(a0.class);
        Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(a0.class), a5);
        Yc.a aVar = this.f6196b;
        aVar.getClass();
        return W.S(aVar, n22, d10, abstractC5156c);
    }
}
