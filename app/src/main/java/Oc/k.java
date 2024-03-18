package oc;

import android.content.Intent;
import ca.C2311c;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import kf.v;
import nc.q;
import nc.r;
import nc.s;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import oa.C4972C;
import of.EnumC5000a;
import rb.C5426p;
import rc.h0;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import x8.W;

/* loaded from: classes.dex */
public final class k extends nc.h {

    /* renamed from: j  reason: collision with root package name */
    public final T9.a f41274j;

    /* renamed from: k  reason: collision with root package name */
    public final Q9.j f41275k;

    public k(xd.j jVar, T9.a aVar, Q9.j jVar2) {
        super(new s(null, null, false, v.f37483Y, null, null, null, false, null, false));
        this.f41274j = aVar;
        this.f41275k = jVar2;
        L4.a.E0(L4.a.I0(new C4986a(this, null), new C5426p(((h0) jVar).f44886e, 5)), AbstractC4828h.Q(this));
        L4.a.E0(L4.a.I0(new C4987b(this, null), ((C4972C) aVar).f41060o), AbstractC4828h.Q(this));
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new C4988c(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(k kVar, String str, AbstractC4825e abstractC4825e) {
        C4989d c4989d;
        int i10;
        v0 v0Var;
        kVar.getClass();
        if (abstractC4825e instanceof C4989d) {
            c4989d = (C4989d) abstractC4825e;
            int i11 = c4989d.f41252i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4989d.f41252i0 = i11 - Integer.MIN_VALUE;
                Object obj = c4989d.f41250Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4989d.f41252i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        kVar = c4989d.f41249Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    c4989d.f41249Y = kVar;
                    c4989d.f41252i0 = 1;
                    obj = ((Oa.e) kVar.f41275k).b(str, c4989d);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (v0) obj;
                if (!(v0Var instanceof u0)) {
                    y yVar = (y) ((u0) v0Var).f48468a;
                    kVar.f(nc.i.f40241a);
                } else if (v0Var instanceof q0) {
                    q0 q0Var = (q0) v0Var;
                    W.W(Pc.e.a(), "Failed to delete conversation", q0Var.f48450a, null, 4);
                    kVar.f(new nc.k(q0Var));
                } else if (!(v0Var instanceof p0)) {
                    throw new RuntimeException();
                }
                return y.f36177a;
            }
        }
        c4989d = new C4989d(kVar, abstractC4825e);
        Object obj2 = c4989d.f41250Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4989d.f41252i0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj2;
        if (!(v0Var instanceof u0)) {
        }
        return y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(k kVar, C2311c c2311c, boolean z10, AbstractC4825e abstractC4825e) {
        e eVar;
        int i10;
        v0 v0Var;
        kVar.getClass();
        if (abstractC4825e instanceof e) {
            eVar = (e) abstractC4825e;
            int i11 = eVar.f41256i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f41256i0 = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f41254Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = eVar.f41256i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        kVar = eVar.f41253Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    String str = c2311c.f26374a;
                    String str2 = c2311c.f26378e;
                    if (str2 == null) {
                        str2 = null;
                    }
                    eVar.f41253Y = kVar;
                    eVar.f41256i0 = 1;
                    obj = ((Oa.e) kVar.f41275k).a(str, str2, eVar, z10);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (v0) obj;
                if (!(v0Var instanceof u0)) {
                    kVar.l(new nb.d(18, (Q9.i) ((u0) v0Var).f48468a));
                } else if (v0Var instanceof q0) {
                    q0 q0Var = (q0) v0Var;
                    W.W(Pc.e.a(), "Failed to fetch conversation", q0Var.f48450a, null, 4);
                    kVar.f(new nc.k(q0Var));
                } else if (!(v0Var instanceof p0)) {
                    throw new RuntimeException();
                }
                return y.f36177a;
            }
        }
        eVar = new e(kVar, abstractC4825e);
        Object obj2 = eVar.f41254Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = eVar.f41256i0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj2;
        if (!(v0Var instanceof u0)) {
        }
        return y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(k kVar, String str, boolean z10, String str2, AbstractC4825e abstractC4825e) {
        h hVar;
        int i10;
        v0 v0Var;
        kVar.getClass();
        if (abstractC4825e instanceof h) {
            hVar = (h) abstractC4825e;
            int i11 = hVar.f41265i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f41265i0 = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f41263Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = hVar.f41265i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        kVar = hVar.f41262Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    kVar.l(i.f41266Z);
                    hVar.f41262Y = kVar;
                    hVar.f41265i0 = 1;
                    obj = ((Oa.e) kVar.f41275k).d(str, str2, hVar, z10);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (v0) obj;
                if (!(v0Var instanceof u0)) {
                    y yVar = (y) ((u0) v0Var).f48468a;
                    s sVar = (s) kVar.f808e.getValue();
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TITLE", sVar.f40250b);
                    intent.putExtra("android.intent.extra.TEXT", sVar.f40249a);
                    Intent createChooser = Intent.createChooser(intent, null);
                    AbstractC3557B.Z(createChooser);
                    kVar.f(new nc.j(createChooser));
                } else if (v0Var instanceof q0) {
                    q0 q0Var = (q0) v0Var;
                    W.W(Pc.e.a(), "Failed to publish conversation", q0Var.f48450a, null, 4);
                    kVar.f(new nc.k(q0Var));
                } else if (!(v0Var instanceof p0)) {
                    throw new RuntimeException();
                }
                kVar.l(i.f41267h0);
                return y.f36177a;
            }
        }
        hVar = new h(kVar, abstractC4825e);
        Object obj2 = hVar.f41263Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = hVar.f41265i0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj2;
        if (!(v0Var instanceof u0)) {
        }
        kVar.l(i.f41267h0);
        return y.f36177a;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        r rVar = (r) iVar;
        AbstractC3557B.c0("intent", rVar);
        if (rVar instanceof nc.o) {
            l(new nb.d(19, rVar));
        } else if (rVar instanceof q) {
            l(i.f41268i0);
        } else if (rVar instanceof nc.p) {
            h(new f(this, null));
        } else if (rVar instanceof nc.n) {
            Intent intent = new Intent();
            A7.b.G0(intent, "https://help.openai.com/en/articles/7925741-chatgpt-shared-links-faq");
            f(new nc.j(intent));
        } else if (rVar instanceof nc.m) {
            h(new g(this, rVar, null));
        }
    }
}
