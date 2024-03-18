package rc;

import Qg.r0;
import Qg.s0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import tc.C5739h;
import wd.C6200m;
import wd.p0;
import yd.AbstractC6580a;

/* renamed from: rc.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5463l implements xd.a {

    /* renamed from: a  reason: collision with root package name */
    public final C5465n f44904a;

    /* renamed from: b  reason: collision with root package name */
    public final nd.l f44905b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC6580a f44906c;

    /* renamed from: d  reason: collision with root package name */
    public final r0 f44907d;

    /* renamed from: e  reason: collision with root package name */
    public final r0 f44908e;

    public C5463l(C5465n c5465n, C5438B c5438b, nd.l lVar, AbstractC6580a abstractC6580a, ld.p pVar) {
        this.f44904a = c5465n;
        this.f44905b = lVar;
        this.f44906c = abstractC6580a;
        Ad.l.O0(pVar, null, null, new C5456e(c5438b, this, null), 3);
        r0 b10 = s0.b(0, 0, null, 7);
        this.f44907d = b10;
        this.f44908e = b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[PHI: r10 
      PHI: (r10v2 java.lang.Object) = (r10v3 java.lang.Object), (r10v1 java.lang.Object) binds: [B:21:0x0075, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Type inference failed for: r2v2, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        C5457f c5457f;
        Object obj;
        EnumC5000a enumC5000a;
        int i10;
        C5463l c5463l;
        if (abstractC4825e instanceof C5457f) {
            c5457f = (C5457f) abstractC4825e;
            int i11 = c5457f.f44869i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5457f.f44869i0 = i11 - Integer.MIN_VALUE;
                obj = c5457f.f44867Z;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c5457f.f44869i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5463l = c5457f.f44866Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c5457f.f44866Y = this;
                    c5457f.f44869i0 = 1;
                    C5739h c5739h = (C5739h) this.f44906c;
                    c5739h.getClass();
                    ?? abstractC5163j = new AbstractC5163j(2, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(jf.y.class);
                    Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(jf.y.class), a5);
                    Yc.f fVar = c5739h.f46083a;
                    fVar.getClass();
                    if (x8.W.S(fVar, n22, abstractC5163j, c5457f) == enumC5000a) {
                        return enumC5000a;
                    }
                    c5463l = this;
                }
                c5457f.f44866Y = null;
                c5457f.f44869i0 = 2;
                obj = c5463l.d(c5457f);
                if (obj != enumC5000a) {
                    return enumC5000a;
                }
                return obj;
            }
        }
        c5457f = new C5457f(this, abstractC4825e);
        obj = c5457f.f44867Z;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c5457f.f44869i0;
        if (i10 == 0) {
        }
        c5457f.f44866Y = null;
        c5457f.f44869i0 = 2;
        obj = c5463l.d(c5457f);
        if (obj != enumC5000a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Type inference failed for: r2v1, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C5458g c5458g;
        int i10;
        if (abstractC4825e instanceof C5458g) {
            c5458g = (C5458g) abstractC4825e;
            int i11 = c5458g.f44874h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5458g.f44874h0 = i11 - Integer.MIN_VALUE;
                Object obj = c5458g.f44872Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5458g.f44874h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c5458g.f44874h0 = 1;
                    C5739h c5739h = (C5739h) this.f44906c;
                    c5739h.getClass();
                    ?? abstractC5163j = new AbstractC5163j(2, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(jf.y.class);
                    Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(jf.y.class), a5);
                    Yc.f fVar = c5739h.f46083a;
                    fVar.getClass();
                    obj = x8.W.S(fVar, n22, abstractC5163j, c5458g);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((Vc.x) obj).b();
            }
        }
        c5458g = new C5458g(this, abstractC4825e);
        Object obj2 = c5458g.f44872Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5458g.f44874h0;
        if (i10 == 0) {
        }
        return ((Vc.x) obj2).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Type inference failed for: r2v1, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC4825e abstractC4825e) {
        C5459h c5459h;
        int i10;
        if (abstractC4825e instanceof C5459h) {
            c5459h = (C5459h) abstractC4825e;
            int i11 = c5459h.f44881h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5459h.f44881h0 = i11 - Integer.MIN_VALUE;
                Object obj = c5459h.f44879Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5459h.f44881h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c5459h.f44881h0 = 1;
                    C5739h c5739h = (C5739h) this.f44906c;
                    c5739h.getClass();
                    ?? abstractC5163j = new AbstractC5163j(2, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(jf.y.class);
                    Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(jf.y.class), a5);
                    Yc.f fVar = c5739h.f46083a;
                    fVar.getClass();
                    obj = x8.W.S(fVar, n22, abstractC5163j, c5459h);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((Vc.x) obj).b();
            }
        }
        c5459h = new C5459h(this, abstractC4825e);
        Object obj2 = c5459h.f44879Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5459h.f44881h0;
        if (i10 == 0) {
        }
        return ((Vc.x) obj2).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079 A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:28:0x0076, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC4825e abstractC4825e) {
        C5460i c5460i;
        Object obj;
        int i10;
        C5463l c5463l;
        if (abstractC4825e instanceof C5460i) {
            c5460i = (C5460i) abstractC4825e;
            int i11 = c5460i.f44890i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5460i.f44890i0 = i11 - Integer.MIN_VALUE;
                obj = c5460i.f44888Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5460i.f44890i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                return obj;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c5463l = c5460i.f44887Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        c5460i.f44887Y = null;
                        c5460i.f44890i0 = 3;
                        obj = c5463l.e((Vc.x) obj, c5460i);
                        if (obj != enumC5000a) {
                            return enumC5000a;
                        }
                        return obj;
                    }
                    c5463l = c5460i.f44887Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c5460i.f44887Y = this;
                    c5460i.f44890i0 = 1;
                    obj = ((b9.o) this.f44905b).a(c5460i);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c5463l = this;
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                AbstractC6580a abstractC6580a = c5463l.f44906c;
                c5460i.f44887Y = c5463l;
                c5460i.f44890i0 = 2;
                obj = ((C5739h) abstractC6580a).a(c5460i);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                c5460i.f44887Y = null;
                c5460i.f44890i0 = 3;
                obj = c5463l.e((Vc.x) obj, c5460i);
                if (obj != enumC5000a) {
                }
            }
        }
        c5460i = new C5460i(this, abstractC4825e);
        obj = c5460i.f44888Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5460i.f44890i0;
        if (i10 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Vc.x xVar, AbstractC4825e abstractC4825e) {
        C5461j c5461j;
        int i10;
        Vc.r rVar;
        Object obj;
        C6200m c6200m;
        if (abstractC4825e instanceof C5461j) {
            c5461j = (C5461j) abstractC4825e;
            int i11 = c5461j.f44898i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5461j.f44898i0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c5461j.f44896Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5461j.f44898i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            rVar = (Vc.r) c5461j.f44895Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                            x8.W.W(Pc.e.a(), "Error fetching accounts", rVar.f18561a, null, 4);
                            return null;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c6200m = (C6200m) c5461j.f44895Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    return c6200m;
                }
                com.google.android.gms.internal.play_billing.N.B0(obj2);
                if (xVar instanceof Vc.w) {
                    c6200m = (C6200m) ((Vc.w) xVar).f18565a;
                    nb.d dVar = new nb.d(21, c6200m);
                    c5461j.f44895Y = c6200m;
                    c5461j.f44898i0 = 1;
                    if (this.f44904a.b(dVar, c5461j) == enumC5000a) {
                        return enumC5000a;
                    }
                    return c6200m;
                } else if (xVar instanceof Vc.r) {
                    rVar = (Vc.r) xVar;
                    r0 r0Var = this.f44907d;
                    if (!(rVar instanceof Vc.w)) {
                        if (rVar instanceof Vc.q) {
                            obj = p0.f48449a;
                        } else if (rVar instanceof Vc.r) {
                            rVar.getClass();
                            obj = Vc.x.a(rVar);
                        } else {
                            throw new RuntimeException();
                        }
                        c5461j.f44895Y = rVar;
                        c5461j.f44898i0 = 2;
                        if (r0Var.c(obj, c5461j) == enumC5000a) {
                            return enumC5000a;
                        }
                        x8.W.W(Pc.e.a(), "Error fetching accounts", rVar.f18561a, null, 4);
                        return null;
                    }
                    ((Vc.w) rVar).getClass();
                    throw new RuntimeException();
                } else if (xVar instanceof Vc.q) {
                    return null;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        c5461j = new C5461j(this, abstractC4825e);
        Object obj22 = c5461j.f44896Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5461j.f44898i0;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(AbstractC4825e abstractC4825e) {
        C5462k c5462k;
        Object obj;
        int i10;
        C5463l c5463l;
        if (abstractC4825e instanceof C5462k) {
            c5462k = (C5462k) abstractC4825e;
            int i11 = c5462k.f44902i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5462k.f44902i0 = i11 - Integer.MIN_VALUE;
                obj = c5462k.f44900Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5462k.f44902i0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c5463l = c5462k.f44899Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        c5462k.f44899Y = null;
                        c5462k.f44902i0 = 3;
                        if (c5463l.e((Vc.x) obj, c5462k) != enumC5000a) {
                            return enumC5000a;
                        }
                        return yVar;
                    }
                    c5463l = c5462k.f44899Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c5462k.f44899Y = this;
                    c5462k.f44902i0 = 1;
                    obj = ((b9.o) this.f44905b).a(c5462k);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c5463l = this;
                }
                if (((Boolean) obj).booleanValue()) {
                    AbstractC6580a abstractC6580a = c5463l.f44906c;
                    c5462k.f44899Y = c5463l;
                    c5462k.f44902i0 = 2;
                    obj = ((C5739h) abstractC6580a).b(c5462k);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c5462k.f44899Y = null;
                    c5462k.f44902i0 = 3;
                    if (c5463l.e((Vc.x) obj, c5462k) != enumC5000a) {
                    }
                }
                return yVar;
            }
        }
        c5462k = new C5462k(this, abstractC4825e);
        obj = c5462k.f44900Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5462k.f44902i0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return yVar2;
    }
}
