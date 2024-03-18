package Ca;

import Df.H;
import com.google.android.gms.internal.play_billing.N;
import me.T;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import ve.AbstractC6034c;
import x8.W;

/* renamed from: Ca.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0290g {

    /* renamed from: a  reason: collision with root package name */
    public final Yc.a f2836a;

    public C0290g(Yc.a aVar) {
        this.f2836a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Type inference failed for: r8v10, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        C0284a c0284a;
        int i10;
        Vc.x xVar;
        if (abstractC4825e instanceof C0284a) {
            c0284a = (C0284a) abstractC4825e;
            int i11 = c0284a.f2820h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0284a.f2820h0 = i11 - Integer.MIN_VALUE;
                Object obj = c0284a.f2818Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0284a.f2820h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    ?? abstractC5163j = new AbstractC5163j(2, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(q.class);
                    Je.a n22 = R4.b.n2(H.O(a5), kotlin.jvm.internal.C.f37623a.b(q.class), a5);
                    c0284a.f2820h0 = 1;
                    Yc.a aVar = this.f2836a;
                    aVar.getClass();
                    obj = W.S(aVar, n22, abstractC5163j, c0284a);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (Vc.x) obj;
                if (!(xVar instanceof Vc.w)) {
                    q qVar = (q) ((Vc.w) xVar).f18565a;
                    return new Vc.w(new Ba.c(qVar.f2847b, qVar.f2848c, qVar.f2846a));
                } else if ((xVar instanceof Vc.q) || (xVar instanceof Vc.r)) {
                    return xVar;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        c0284a = new C0284a(this, abstractC4825e);
        Object obj2 = c0284a.f2818Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0284a.f2820h0;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:2|(2:4|(8:6|8|39|(1:(1:(4:12|13|34|42)(2:15|16))(1:17))(2:18|(1:20))|21|(1:23)(2:25|(1:41)(2:27|(2:29|(4:31|(1:33)|34|42))(2:37|38)))|24|36))|7|8|39|(0)(0)|21|(0)(0)|24|36) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
        x8.W.W(Pc.e.a(), "Failed to parse error response", r11, null, 4);
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Type inference failed for: r10v18, types: [Vc.r] */
    /* JADX WARN: Type inference failed for: r10v9, types: [Vc.r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Ba.c cVar, AbstractC4825e abstractC4825e) {
        C0286c c0286c;
        int i10;
        Object obj;
        Vc.x xVar;
        if (abstractC4825e instanceof C0286c) {
            c0286c = (C0286c) abstractC4825e;
            int i11 = c0286c.f2826i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0286c.f2826i0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c0286c.f2824Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0286c.f2826i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            ?? r10 = c0286c.f2823Y;
                            N.B0(obj2);
                            cVar = r10;
                            return new Vc.t(new D((C) obj2));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.B0(obj2);
                } else {
                    N.B0(obj2);
                    C0287d c0287d = new C0287d(cVar, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(q.class);
                    Je.a n22 = R4.b.n2(H.O(a5), kotlin.jvm.internal.C.f37623a.b(q.class), a5);
                    c0286c.f2826i0 = 1;
                    Yc.a aVar = this.f2836a;
                    aVar.getClass();
                    obj2 = W.S(aVar, n22, c0287d, c0286c);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (Vc.x) obj2;
                if (!(xVar instanceof Vc.w)) {
                    q qVar = (q) ((Vc.w) xVar).f18565a;
                    obj = new Vc.w(new Ba.c(qVar.f2847b, qVar.f2848c, qVar.f2846a));
                } else if (!(xVar instanceof Vc.q)) {
                    if (xVar instanceof Vc.r) {
                        ?? r102 = (Vc.r) xVar;
                        Throwable th2 = r102.f18561a;
                        obj = r102;
                        if (th2 instanceof T) {
                            AbstractC6034c abstractC6034c = ((T) th2).f39189Y;
                            Df.w a10 = kotlin.jvm.internal.C.a(t.class);
                            Je.a n23 = R4.b.n2(H.O(a10), kotlin.jvm.internal.C.f37623a.b(t.class), a10);
                            c0286c.f2823Y = r102;
                            c0286c.f2826i0 = 2;
                            obj2 = abstractC6034c.b().a(n23, c0286c);
                            cVar = r102;
                            if (obj2 == enumC5000a) {
                                return enumC5000a;
                            }
                            return new Vc.t(new D((C) obj2));
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    return xVar;
                }
                return obj;
            }
        }
        c0286c = new C0286c(this, abstractC4825e);
        Object obj22 = c0286c.f2824Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0286c.f2826i0;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj22;
        if (!(xVar instanceof Vc.w)) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(boolean z10, AbstractC4825e abstractC4825e) {
        C0288e c0288e;
        int i10;
        Vc.x xVar;
        if (abstractC4825e instanceof C0288e) {
            c0288e = (C0288e) abstractC4825e;
            int i11 = c0288e.f2832h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0288e.f2832h0 = i11 - Integer.MIN_VALUE;
                Object obj = c0288e.f2830Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0288e.f2832h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    C0289f c0289f = new C0289f(z10, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(k.class);
                    Je.a n22 = R4.b.n2(H.O(a5), kotlin.jvm.internal.C.f37623a.b(k.class), a5);
                    c0288e.f2832h0 = 1;
                    Yc.a aVar = this.f2836a;
                    aVar.getClass();
                    obj = W.S(aVar, n22, c0289f, c0288e);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (Vc.x) obj;
                if (!(xVar instanceof Vc.w)) {
                    return new Vc.w(Boolean.valueOf(((k) ((Vc.w) xVar).f18565a).f2840a));
                }
                if ((xVar instanceof Vc.q) || (xVar instanceof Vc.r)) {
                    return xVar;
                }
                throw new RuntimeException();
            }
        }
        c0288e = new C0288e(this, abstractC4825e);
        Object obj2 = c0288e.f2830Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0288e.f2832h0;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }
}
