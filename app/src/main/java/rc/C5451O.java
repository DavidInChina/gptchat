package rc;

import bb.B0;
import id.AbstractC3557B;
import java.util.Iterator;
import ld.C4428a;
import na.V0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import vc.C6013c;
import vc.C6019i;
import vc.C6020j;
import vc.C6024n;
import w.C6053E;
import wd.p0;
import wd.u0;
import wd.v0;

/* renamed from: rc.O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5451O implements xd.g {

    /* renamed from: a  reason: collision with root package name */
    public final C6024n f44812a;

    /* renamed from: b  reason: collision with root package name */
    public final C5440D f44813b;

    /* renamed from: c  reason: collision with root package name */
    public final Ia.j f44814c;

    public C5451O(C6024n c6024n, C5440D c5440d, C4428a c4428a) {
        this.f44812a = c6024n;
        this.f44813b = c5440d;
        this.f44814c = c5440d.f44961e;
        Ad.l.O0(c4428a, null, null, new C5442F(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, AbstractC4825e abstractC4825e) {
        C5444H c5444h;
        int i10;
        if (abstractC4825e instanceof C5444H) {
            c5444h = (C5444H) abstractC4825e;
            int i11 = c5444h.f44782h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5444h.f44782h0 = i11 - Integer.MIN_VALUE;
                Object obj = c5444h.f44780Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5444h.f44782h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c5444h.f44782h0 = 1;
                    C6024n c6024n = this.f44812a;
                    c6024n.getClass();
                    C6020j c6020j = new C6020j(str, null, false);
                    Df.w a5 = kotlin.jvm.internal.C.a(jf.y.class);
                    Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(jf.y.class), a5);
                    Yc.a aVar = c6024n.f47468a;
                    aVar.getClass();
                    obj = x8.W.S(aVar, n22, c6020j, c5444h);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((Vc.x) obj).b();
            }
        }
        c5444h = new C5444H(this, abstractC4825e);
        Object obj2 = c5444h.f44780Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5444h.f44782h0;
        if (i10 == 0) {
        }
        return ((Vc.x) obj2).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Type inference failed for: r4v3, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C5445I c5445i;
        int i10;
        zd.g gVar;
        C5451O c5451o;
        Vc.x xVar;
        Object obj;
        if (abstractC4825e instanceof C5445I) {
            c5445i = (C5445I) abstractC4825e;
            int i11 = c5445i.f44786i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5445i.f44786i0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c5445i.f44784Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5445i.f44786i0;
                zd.q qVar = null;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            gVar = (zd.g) c5445i.f44783Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                            return new u0(gVar);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5451o = (C5451O) c5445i.f44783Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    c5445i.f44783Y = this;
                    c5445i.f44786i0 = 1;
                    C6024n c6024n = this.f44812a;
                    c6024n.getClass();
                    ?? abstractC5163j = new AbstractC5163j(2, null);
                    Df.w a5 = kotlin.jvm.internal.C.a(C6013c.class);
                    Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(C6013c.class), a5);
                    Yc.a aVar = c6024n.f47468a;
                    aVar.getClass();
                    obj2 = x8.W.S(aVar, n22, abstractC5163j, c5445i);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    c5451o = this;
                }
                xVar = (Vc.x) obj2;
                if (!(xVar instanceof Vc.w)) {
                    Vc.w wVar = (Vc.w) xVar;
                    C6013c c6013c = (C6013c) wVar.f18565a;
                    C6019i c6019i = c6013c.f47440a;
                    Boolean bool = c6019i.f47450a;
                    Boolean bool2 = c6019i.f47451b;
                    Boolean bool3 = c6019i.f47452c;
                    zd.c cVar = c6013c.f47441b;
                    Iterator it = AbstractC5443G.f44779a.iterator();
                    while (true) {
                        C6053E c6053e = (C6053E) it;
                        boolean hasNext = c6053e.hasNext();
                        obj = wVar.f18565a;
                        if (!hasNext) {
                            break;
                        }
                        Object next = c6053e.next();
                        if (AbstractC3557B.K(((zd.q) next).f52002Y, ((C6013c) obj).f47440a.f47453d)) {
                            qVar = next;
                            break;
                        }
                    }
                    C6013c c6013c2 = (C6013c) obj;
                    zd.g gVar2 = new zd.g(bool, bool2, bool3, cVar, qVar, c6013c2.f47440a.f47454e, c6013c2.f47442c.keySet(), kf.t.P2(c6013c2.f47443d));
                    C5440D c5440d = c5451o.f44813b;
                    V0 v02 = new V0(gVar2, 3);
                    c5445i.f44783Y = gVar2;
                    c5445i.f44786i0 = 2;
                    if (c5440d.b(v02, c5445i) == enumC5000a) {
                        return enumC5000a;
                    }
                    gVar = gVar2;
                    return new u0(gVar);
                } else if (xVar instanceof Vc.q) {
                    return p0.f48449a;
                } else {
                    if (xVar instanceof Vc.r) {
                        xVar.getClass();
                        return Vc.x.a((Vc.r) xVar);
                    }
                    throw new RuntimeException();
                }
            }
        }
        c5445i = new C5445I(this, abstractC4825e);
        Object obj22 = c5445i.f44784Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5445i.f44786i0;
        zd.q qVar2 = null;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj22;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(boolean z10, AbstractC4825e abstractC4825e) {
        C5446J c5446j;
        int i10;
        v0 v0Var;
        C5451O c5451o;
        v0 b10;
        if (abstractC4825e instanceof C5446J) {
            c5446j = (C5446J) abstractC4825e;
            int i11 = c5446j.f44791j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5446j.f44791j0 = i11 - Integer.MIN_VALUE;
                Object obj = c5446j.f44789h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5446j.f44791j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            v0Var = (v0) c5446j.f44787Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return v0Var;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = c5446j.f44788Z;
                    c5451o = (C5451O) c5446j.f44787Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Boolean valueOf = Boolean.valueOf(z10);
                    c5446j.f44787Y = this;
                    c5446j.f44788Z = z10;
                    c5446j.f44791j0 = 1;
                    obj = this.f44812a.a("sunshine", valueOf, c5446j);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c5451o = this;
                }
                b10 = ((Vc.x) obj).b();
                if (!(b10 instanceof u0)) {
                    jf.y yVar = (jf.y) ((u0) b10).f48468a;
                    C5440D c5440d = c5451o.f44813b;
                    J.c cVar = new J.c(8, z10);
                    c5446j.f44787Y = b10;
                    c5446j.f44791j0 = 2;
                    if (c5440d.b(cVar, c5446j) == enumC5000a) {
                        return enumC5000a;
                    }
                    v0Var = b10;
                    return v0Var;
                }
                return b10;
            }
        }
        c5446j = new C5446J(this, abstractC4825e);
        Object obj2 = c5446j.f44789h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5446j.f44791j0;
        if (i10 == 0) {
        }
        b10 = ((Vc.x) obj2).b();
        if (!(b10 instanceof u0)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(boolean z10, AbstractC4825e abstractC4825e) {
        C5447K c5447k;
        Object obj;
        EnumC5000a enumC5000a;
        int i10;
        v0 v0Var;
        C5451O c5451o;
        v0 b10;
        if (abstractC4825e instanceof C5447K) {
            c5447k = (C5447K) abstractC4825e;
            int i11 = c5447k.f44796j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5447k.f44796j0 = i11 - Integer.MIN_VALUE;
                obj = c5447k.f44794h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c5447k.f44796j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                v0Var = (v0) c5447k.f44792Y;
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                return v0Var;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z10 = c5447k.f44793Z;
                        c5451o = (C5451O) c5447k.f44792Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        b10 = ((Vc.x) obj).b();
                        if (b10 instanceof u0) {
                            jf.y yVar = (jf.y) ((u0) b10).f48468a;
                            C5440D c5440d = c5451o.f44813b;
                            J.c cVar = new J.c(9, z10);
                            c5447k.f44792Y = b10;
                            c5447k.f44796j0 = 3;
                            if (c5440d.b(cVar, c5447k) == enumC5000a) {
                                return enumC5000a;
                            }
                            v0Var = b10;
                            return v0Var;
                        }
                        return b10;
                    }
                    z10 = c5447k.f44793Z;
                    c5451o = (C5451O) c5447k.f44792Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (!z10) {
                        c5447k.f44792Y = this;
                        c5447k.f44793Z = z10;
                        c5447k.f44796j0 = 1;
                        if (g(false, c5447k) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    c5451o = this;
                }
                C6024n c6024n = c5451o.f44812a;
                Boolean valueOf = Boolean.valueOf(z10);
                c5447k.f44792Y = c5451o;
                c5447k.f44793Z = z10;
                c5447k.f44796j0 = 2;
                obj = c6024n.a("training_allowed", valueOf, c5447k);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                b10 = ((Vc.x) obj).b();
                if (b10 instanceof u0) {
                }
            }
        }
        c5447k = new C5447K(this, abstractC4825e);
        obj = c5447k.f44794h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c5447k.f44796j0;
        if (i10 == 0) {
        }
        C6024n c6024n2 = c5451o.f44812a;
        Boolean valueOf2 = Boolean.valueOf(z10);
        c5447k.f44792Y = c5451o;
        c5447k.f44793Z = z10;
        c5447k.f44796j0 = 2;
        obj = c6024n2.a("training_allowed", valueOf2, c5447k);
        if (obj == enumC5000a) {
        }
        b10 = ((Vc.x) obj).b();
        if (b10 instanceof u0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(zd.q qVar, AbstractC4825e abstractC4825e) {
        C5448L c5448l;
        int i10;
        v0 v0Var;
        C5451O c5451o;
        v0 b10;
        if (abstractC4825e instanceof C5448L) {
            c5448l = (C5448L) abstractC4825e;
            int i11 = c5448l.f44801j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5448l.f44801j0 = i11 - Integer.MIN_VALUE;
                Object obj = c5448l.f44799h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5448l.f44801j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            v0Var = (v0) c5448l.f44797Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return v0Var;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = c5448l.f44798Z;
                    c5451o = (C5451O) c5448l.f44797Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    String str = qVar.f52002Y;
                    c5448l.f44797Y = this;
                    c5448l.f44798Z = qVar;
                    c5448l.f44801j0 = 1;
                    obj = this.f44812a.a("voice_name", str, c5448l);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c5451o = this;
                }
                b10 = ((Vc.x) obj).b();
                if (!(b10 instanceof u0)) {
                    jf.y yVar = (jf.y) ((u0) b10).f48468a;
                    C5440D c5440d = c5451o.f44813b;
                    nb.d dVar = new nb.d(22, qVar);
                    c5448l.f44797Y = b10;
                    c5448l.f44798Z = null;
                    c5448l.f44801j0 = 2;
                    if (c5440d.b(dVar, c5448l) == enumC5000a) {
                        return enumC5000a;
                    }
                    v0Var = b10;
                    return v0Var;
                }
                return b10;
            }
        }
        c5448l = new C5448L(this, abstractC4825e);
        Object obj2 = c5448l.f44799h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5448l.f44801j0;
        if (i10 == 0) {
        }
        b10 = ((Vc.x) obj2).b();
        if (!(b10 instanceof u0)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, AbstractC4825e abstractC4825e) {
        C5449M c5449m;
        int i10;
        v0 v0Var;
        C5451O c5451o;
        v0 b10;
        if (abstractC4825e instanceof C5449M) {
            c5449m = (C5449M) abstractC4825e;
            int i11 = c5449m.f44806j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5449m.f44806j0 = i11 - Integer.MIN_VALUE;
                Object obj = c5449m.f44804h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5449m.f44806j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            v0Var = (v0) c5449m.f44802Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return v0Var;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = c5449m.f44803Z;
                    c5451o = (C5451O) c5449m.f44802Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c5449m.f44802Y = this;
                    c5449m.f44803Z = str;
                    c5449m.f44806j0 = 1;
                    obj = this.f44812a.a("voice_main_language", str, c5449m);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c5451o = this;
                }
                b10 = ((Vc.x) obj).b();
                if (!(b10 instanceof u0)) {
                    jf.y yVar = (jf.y) ((u0) b10).f48468a;
                    C5440D c5440d = c5451o.f44813b;
                    B0 b02 = new B0(str, 7);
                    c5449m.f44802Y = b10;
                    c5449m.f44803Z = null;
                    c5449m.f44806j0 = 2;
                    if (c5440d.b(b02, c5449m) == enumC5000a) {
                        return enumC5000a;
                    }
                    v0Var = b10;
                    return v0Var;
                }
                return b10;
            }
        }
        c5449m = new C5449M(this, abstractC4825e);
        Object obj2 = c5449m.f44804h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5449m.f44806j0;
        if (i10 == 0) {
        }
        b10 = ((Vc.x) obj2).b();
        if (!(b10 instanceof u0)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(boolean z10, AbstractC4825e abstractC4825e) {
        C5450N c5450n;
        int i10;
        v0 v0Var;
        C5451O c5451o;
        v0 b10;
        if (abstractC4825e instanceof C5450N) {
            c5450n = (C5450N) abstractC4825e;
            int i11 = c5450n.f44811j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5450n.f44811j0 = i11 - Integer.MIN_VALUE;
                Object obj = c5450n.f44809h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5450n.f44811j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            v0Var = (v0) c5450n.f44807Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return v0Var;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = c5450n.f44808Z;
                    c5451o = (C5451O) c5450n.f44807Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Boolean valueOf = Boolean.valueOf(z10);
                    c5450n.f44807Y = this;
                    c5450n.f44808Z = z10;
                    c5450n.f44811j0 = 1;
                    obj = this.f44812a.a("voice_training_allowed", valueOf, c5450n);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c5451o = this;
                }
                b10 = ((Vc.x) obj).b();
                if (!(b10 instanceof u0)) {
                    jf.y yVar = (jf.y) ((u0) b10).f48468a;
                    C5440D c5440d = c5451o.f44813b;
                    J.c cVar = new J.c(10, z10);
                    c5450n.f44807Y = b10;
                    c5450n.f44811j0 = 2;
                    if (c5440d.b(cVar, c5450n) == enumC5000a) {
                        return enumC5000a;
                    }
                    v0Var = b10;
                    return v0Var;
                }
                return b10;
            }
        }
        c5450n = new C5450N(this, abstractC4825e);
        Object obj2 = c5450n.f44809h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5450n.f44811j0;
        if (i10 == 0) {
        }
        b10 = ((Vc.x) obj2).b();
        if (!(b10 instanceof u0)) {
        }
    }
}
