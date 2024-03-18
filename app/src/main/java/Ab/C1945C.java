package ab;

import A.C0039q0;
import Df.H;
import Uc.AbstractC1438x;
import Uc.C1436v;
import android.content.Intent;
import androidx.lifecycle.P;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import x8.W;
import x9.C6383b;
import z.C6686a;
import zb.AbstractC6810a;

/* renamed from: ab.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1945C extends AbstractC1966t {

    /* renamed from: j  reason: collision with root package name */
    public final Va.e f24060j;

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC6810a f24061k;

    /* renamed from: l  reason: collision with root package name */
    public final String f24062l;

    public C1945C(P p10, Va.e eVar, AbstractC6810a abstractC6810a) {
        super(new C1965s(true, kf.v.f37483Y, null, null));
        this.f24060j = eVar;
        this.f24061k = abstractC6810a;
        C1436v.f17698l.getClass();
        this.f24062l = AbstractC1438x.o1(p10);
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new C1967u(AbstractC4344b.G0(Ad.l.O0(AbstractC4828h.Q(this), null, null, new v(this, null), 3), Ad.l.O0(AbstractC4828h.Q(this), null, null, new w(this, null), 3)), this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(C1945C c1945c, String str, AbstractC4825e abstractC4825e) {
        x xVar;
        int i10;
        C1945C c1945c2;
        String str2;
        C0039q0 c0039q0;
        String str3;
        Vc.x xVar2;
        c1945c.getClass();
        if (abstractC4825e instanceof x) {
            xVar = (x) abstractC4825e;
            int i11 = xVar.f24139j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f24139j0 = i11 - Integer.MIN_VALUE;
                Object obj = xVar.f24137h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = xVar.f24139j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                str2 = xVar.f24136Z;
                                c1945c2 = xVar.f24135Y;
                                N.B0(obj);
                                c0039q0 = new C0039q0(str2, 28);
                                c1945c2.l(c0039q0);
                                return jf.y.f36177a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = xVar.f24136Z;
                        c1945c2 = xVar.f24135Y;
                        N.B0(obj);
                        c0039q0 = new C0039q0(str3, 28);
                        c1945c2.l(c0039q0);
                        return jf.y.f36177a;
                    }
                    str = xVar.f24136Z;
                    c1945c = xVar.f24135Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    c1945c.l(new C0039q0(str, 27));
                    xVar.f24135Y = c1945c;
                    xVar.f24136Z = str;
                    xVar.f24139j0 = 1;
                    Bb.c cVar = (Bb.c) c1945c.f24061k;
                    cVar.getClass();
                    Bb.a aVar = new Bb.a(str, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(jf.y.class);
                    Je.a n22 = R4.b.n2(H.O(a5), kotlin.jvm.internal.C.f37623a.b(jf.y.class), a5);
                    Yc.a aVar2 = cVar.f2044a;
                    aVar2.getClass();
                    obj = W.S(aVar2, n22, aVar, xVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar2 = (Vc.x) obj;
                if (!(xVar2 instanceof Vc.w)) {
                    jf.y yVar = (jf.y) ((Vc.w) xVar2).f18565a;
                    xVar.f24135Y = c1945c;
                    xVar.f24136Z = str;
                    xVar.f24139j0 = 2;
                    if (c1945c.o(xVar) != enumC5000a) {
                        String str4 = str;
                        c1945c2 = c1945c;
                        str3 = str4;
                        c0039q0 = new C0039q0(str3, 28);
                        c1945c2.l(c0039q0);
                        return jf.y.f36177a;
                    }
                    return enumC5000a;
                } else if (xVar2 instanceof Vc.r) {
                    c1945c.f(new C1959m(Vc.x.a((Vc.r) xVar2)));
                    c1945c.l(new C0039q0(str, 29));
                    return jf.y.f36177a;
                } else if (xVar2 instanceof Vc.q) {
                    xVar.f24135Y = c1945c;
                    xVar.f24136Z = str;
                    xVar.f24139j0 = 3;
                    if (c1945c.o(xVar) != enumC5000a) {
                        String str5 = str;
                        c1945c2 = c1945c;
                        str2 = str5;
                        c0039q0 = new C0039q0(str2, 28);
                        c1945c2.l(c0039q0);
                        return jf.y.f36177a;
                    }
                    return enumC5000a;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        xVar = new x(c1945c, abstractC4825e);
        Object obj2 = xVar.f24137h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = xVar.f24139j0;
        if (i10 == 0) {
        }
        xVar2 = (Vc.x) obj2;
        if (!(xVar2 instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Type inference failed for: r15v4, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v6, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(C1945C c1945c, C1963q c1963q, AbstractC4825e abstractC4825e) {
        C1943A c1943a;
        int i10;
        Wa.n nVar;
        Object obj;
        v0 v0Var;
        c1945c.getClass();
        if (abstractC4825e instanceof C1943A) {
            c1943a = (C1943A) abstractC4825e;
            int i11 = c1943a.f24055k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1943a.f24055k0 = i11 - Integer.MIN_VALUE;
                C1943A c1943a2 = c1943a;
                Object obj2 = c1943a2.f24053i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1943a2.f24055k0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        Wa.n nVar2 = c1943a2.f24052h0;
                        c1963q = c1943a2.f24051Z;
                        C1945C c1945c2 = c1943a2.f24050Y;
                        N.B0(obj2);
                        obj = obj2;
                        nVar = nVar2;
                        c1945c = c1945c2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj2);
                    String str = c1963q.f24120a;
                    ?? obj3 = new Object();
                    c1945c.l(new C6686a(str, (Object) obj3, c1963q.f24122c, c1963q.f24123d, 12));
                    nVar = (Wa.n) obj3.f37622Y;
                    c1943a2.f24050Y = c1945c;
                    c1943a2.f24051Z = c1963q;
                    c1943a2.f24052h0 = nVar;
                    c1943a2.f24055k0 = 1;
                    obj = ((Ya.r) c1945c.f24060j).o(c1963q.f24120a, c1963q.f24121b, c1963q.f24122c, c1963q.f24123d, c1943a2);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (v0) obj;
                if (v0Var instanceof q0) {
                    q0 q0Var = (q0) v0Var;
                    String str2 = c1963q.f24120a;
                    if (nVar == null) {
                        nVar = Wa.n.f20862Z;
                    }
                    Wa.n nVar3 = nVar;
                    c1945c.getClass();
                    ?? obj4 = new Object();
                    c1945c.l(new C6686a(str2, (Object) obj4, c1963q.f24122c, nVar3, 12));
                    Wa.n nVar4 = (Wa.n) obj4.f37622Y;
                    c1945c.f(new C1959m(q0Var));
                }
                return jf.y.f36177a;
            }
        }
        c1943a = new C1943A(c1945c, abstractC4825e);
        C1943A c1943a22 = c1943a;
        Object obj22 = c1943a22.f24053i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1943a22.f24055k0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj;
        if (v0Var instanceof q0) {
        }
        return jf.y.f36177a;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC1964r abstractC1964r = (AbstractC1964r) iVar;
        AbstractC3557B.c0("intent", abstractC1964r);
        if (abstractC1964r instanceof C1961o) {
            h(new y(this, abstractC1964r, null));
        } else if (abstractC1964r instanceof C1962p) {
            Intent intent = new Intent();
            A7.b.G0(intent, ((C1962p) abstractC1964r).f24119a);
            f(new C1958l(intent));
        } else if (abstractC1964r instanceof C1963q) {
            h(new z(this, abstractC1964r, null));
        } else {
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(AbstractC4825e abstractC4825e) {
        C1944B c1944b;
        int i10;
        C1945C c1945c;
        v0 v0Var;
        if (abstractC4825e instanceof C1944B) {
            c1944b = (C1944B) abstractC4825e;
            int i11 = c1944b.f24059i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1944b.f24059i0 = i11 - Integer.MIN_VALUE;
                Object obj = c1944b.f24057Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1944b.f24059i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c1945c = c1944b.f24056Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    c1944b.f24056Y = this;
                    c1944b.f24059i0 = 1;
                    obj = ((Ya.r) this.f24060j).e(this.f24062l, c1944b);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c1945c = this;
                }
                v0Var = (v0) obj;
                if (!(v0Var instanceof u0)) {
                    c1945c.l(new C6383b(26, (Wa.j) ((u0) v0Var).f48468a));
                } else if (v0Var instanceof q0) {
                    c1945c.f(new C1959m((q0) v0Var));
                } else if (v0Var instanceof p0) {
                    c1945c.l(new C6383b(26, null));
                } else {
                    throw new RuntimeException();
                }
                return jf.y.f36177a;
            }
        }
        c1944b = new C1944B(this, abstractC4825e);
        Object obj2 = c1944b.f24057Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1944b.f24059i0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj2;
        if (!(v0Var instanceof u0)) {
        }
        return jf.y.f36177a;
    }
}
