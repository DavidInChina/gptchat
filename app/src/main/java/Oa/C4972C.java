package oa;

import L9.AbstractC0905k;
import L9.C0906l;
import L9.C0907m;
import L9.C0910p;
import L9.C0912s;
import L9.C0915v;
import L9.C0918y;
import L9.I;
import Ng.AbstractC1073l0;
import Ng.D0;
import Ng.Q;
import Qg.F0;
import Qg.l0;
import Qg.s0;
import Z8.A0;
import Z8.AbstractC1809m0;
import Z8.C1826v0;
import Z8.C1828w0;
import android.gov.nist.javax.sip.header.ParameterNames;
import b9.AbstractC2133b;
import ca.C2310b;
import ca.C2311c;
import cb.C2334C;
import com.google.android.gms.internal.play_billing.N;
import e9.C2814g;
import fa.AbstractC2965B;
import fa.C2964A;
import fa.C2969F;
import fa.C2976e;
import fa.C2979h;
import fa.EnumC2971H;
import ha.X;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import jd.AbstractC3949a;
import jf.C3959i;
import ka.C4206b;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import na.L0;
import nf.AbstractC4825e;
import o9.C4953a;
import of.EnumC5000a;
import wd.C6168C;
import wd.C6174I;
import wd.C6180b0;
import wd.C6182c0;
import wd.C6190g0;
import wd.L;
import wd.Y;
import wd.p0;
import wd.q0;
import wd.t0;
import wd.u0;
import wd.v0;
import x8.W;
import y.AbstractC6463a;

/* renamed from: oa.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4972C implements T9.a {

    /* renamed from: a  reason: collision with root package name */
    public final T9.d f41046a;

    /* renamed from: b  reason: collision with root package name */
    public final Ea.a f41047b;

    /* renamed from: c  reason: collision with root package name */
    public final C4975F f41048c;

    /* renamed from: d  reason: collision with root package name */
    public final xd.h f41049d;

    /* renamed from: e  reason: collision with root package name */
    public final ld.i f41050e;

    /* renamed from: f  reason: collision with root package name */
    public final C4953a f41051f;

    /* renamed from: g  reason: collision with root package name */
    public final Na.a f41052g;

    /* renamed from: h  reason: collision with root package name */
    public final Yc.l f41053h;

    /* renamed from: i  reason: collision with root package name */
    public final N9.c f41054i;

    /* renamed from: j  reason: collision with root package name */
    public final p000if.a f41055j;

    /* renamed from: k  reason: collision with root package name */
    public final Pc.g f41056k = Bi.c.i1(Pc.b.f13929Z);

    /* renamed from: l  reason: collision with root package name */
    public String f41057l;

    /* renamed from: m  reason: collision with root package name */
    public final Rg.o f41058m;

    /* renamed from: n  reason: collision with root package name */
    public final F0 f41059n;

    /* renamed from: o  reason: collision with root package name */
    public final C2814g f41060o;

    /* renamed from: p  reason: collision with root package name */
    public final D0 f41061p;

    /* renamed from: q  reason: collision with root package name */
    public AbstractC1073l0 f41062q;

    /* JADX WARN: Type inference failed for: r10v0, types: [wf.n, kotlin.jvm.internal.j] */
    public C4972C(T9.d dVar, Ea.a aVar, C4975F c4975f, xd.h hVar, ld.i iVar, C4953a c4953a, Na.a aVar2, Yc.l lVar, N9.c cVar, p000if.a aVar3, AbstractC3949a abstractC3949a) {
        this.f41046a = dVar;
        this.f41047b = aVar;
        this.f41048c = c4975f;
        this.f41049d = hVar;
        this.f41050e = iVar;
        this.f41051f = c4953a;
        this.f41052g = aVar2;
        this.f41053h = lVar;
        this.f41054i = cVar;
        this.f41055j = aVar3;
        C4206b c4206b = (C4206b) dVar;
        this.f41057l = c4206b.f37208a.f23426b;
        Rg.o V02 = L4.a.V0(new M1.w(c4206b.f37209b, 12), new p((AbstractC4825e) null, this));
        this.f41058m = V02;
        F0 c10 = s0.c(T9.i.f16976a);
        this.f41059n = c10;
        C2814g q02 = L4.a.q0(c10, V02, new p(this, (AbstractC4825e) null));
        this.f41060o = q02;
        L4.a.E0(L4.a.I0(new C4976a(this, null), L4.a.i0(new M1.w(q02, 13))), iVar);
        this.f41061p = L4.a.E0(L4.a.I0(new kotlin.jvm.internal.j(2, this, C4972C.class, "handleStreamData", "handleStreamData(Lcom/openai/feature/conversations/api/conversation/ConversationStreamData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), new M1.w(L4.a.V0(c4206b.f37210c, new L0((AbstractC4825e) null, abstractC3949a, 1)), 14)), iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a0  */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.internal.j, Yc.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C4972C c4972c, AbstractC0905k abstractC0905k, AbstractC4825e abstractC4825e) {
        k kVar;
        int i10;
        v0 v0Var;
        l0 l0Var;
        Vc.q qVar;
        v0 v0Var2;
        v0 v0Var3;
        C4972C c4972c2 = c4972c;
        c4972c.getClass();
        if (abstractC4825e instanceof k) {
            kVar = (k) abstractC4825e;
            int i11 = kVar.f41124j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f41124j0 = i11 - Integer.MIN_VALUE;
                Object obj = kVar.f41122h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = kVar.f41124j0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 == 5) {
                                        c4972c2 = (C4972C) kVar.f41120Y;
                                        N.B0(obj);
                                        v0Var = (v0) obj;
                                        if (v0Var instanceof q0) {
                                            c4972c2.f41059n.setValue(new T9.f((q0) v0Var));
                                        }
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    N.B0(obj);
                                }
                            } else {
                                qVar = kVar.f41121Z;
                                l0Var = (l0) kVar.f41120Y;
                                N.B0(obj);
                                qVar.getClass();
                                l0Var.setValue(new T9.f(Vc.x.a((Vc.r) obj)));
                            }
                        } else {
                            c4972c2 = (C4972C) kVar.f41120Y;
                            N.B0(obj);
                            v0Var2 = (v0) obj;
                            if (v0Var2 instanceof q0) {
                                c4972c2.f41059n.setValue(new T9.f((q0) v0Var2));
                            }
                        }
                    } else {
                        c4972c2 = (C4972C) kVar.f41120Y;
                        N.B0(obj);
                        v0Var3 = (v0) obj;
                        if (v0Var3 instanceof q0) {
                            c4972c2.f41059n.setValue(new T9.f((q0) v0Var3));
                        }
                    }
                } else {
                    N.B0(obj);
                    if (abstractC0905k instanceof C0915v) {
                        C0915v c0915v = (C0915v) abstractC0905k;
                        C2969F a5 = C2969F.a(A7.b.R1(c0915v.f10952b, c0915v.f10951a, null, false), null, null, false, false, false, null, true, 134217727);
                        kVar.f41120Y = c4972c2;
                        kVar.f41124j0 = 1;
                        obj = c4972c2.e(a5, kVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        v0Var3 = (v0) obj;
                        if (v0Var3 instanceof q0) {
                        }
                    } else if (abstractC0905k instanceof C0918y) {
                        C0918y c0918y = (C0918y) abstractC0905k;
                        String str = c0918y.f10956b;
                        P9.c cVar = c0918y.f10958d;
                        P9.f fVar = new P9.f(str, cVar.f13879a, cVar.f13880b);
                        kVar.f41120Y = c4972c2;
                        kVar.f41124j0 = 2;
                        obj = c4972c2.f(fVar, kVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        v0Var2 = (v0) obj;
                        if (v0Var2 instanceof q0) {
                        }
                    } else {
                        boolean z10 = abstractC0905k instanceof C0910p;
                        F0 f02 = c4972c2.f41059n;
                        if (z10) {
                            C0910p c0910p = (C0910p) abstractC0905k;
                            String str2 = c0910p.f10945b;
                            AbstractC3557B.c0("message", str2);
                            f02.setValue(new T9.f(new t0(new Exception(str2), null, null, c0910p.f10945b)));
                        } else {
                            boolean z11 = abstractC0905k instanceof C0906l;
                            Pc.g gVar = c4972c2.f41056k;
                            if (z11) {
                                W.W(gVar, "Stream decoding error", ((C0906l) abstractC0905k).f10940a, null, 4);
                            } else if (abstractC0905k instanceof L9.F) {
                                L9.F f6 = (L9.F) abstractC0905k;
                                W.W(gVar, "Stream request error", f6.f10877a, null, 4);
                                Vc.q qVar2 = Vc.q.f18560a;
                                kVar.f41120Y = f02;
                                kVar.f41121Z = qVar2;
                                kVar.f41124j0 = 3;
                                Yc.l lVar = c4972c2.f41053h;
                                lVar.getClass();
                                Object a10 = lVar.a(f6.f10877a, new kotlin.jvm.internal.j(1, lVar.f22251a, AbstractC2133b.class, "onUnauthorizedLogout", "onUnauthorizedLogout(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), new Yc.j(lVar, null), kVar);
                                if (a10 != enumC5000a) {
                                    l0Var = f02;
                                    obj = a10;
                                    qVar = qVar2;
                                    qVar.getClass();
                                    l0Var.setValue(new T9.f(Vc.x.a((Vc.r) obj)));
                                } else {
                                    return enumC5000a;
                                }
                            } else if (abstractC0905k instanceof C0912s) {
                                String str3 = ((C0912s) abstractC0905k).f10948a;
                                da.c cVar2 = new da.c(str3);
                                kVar.f41124j0 = 4;
                                if (c4972c2.d(str3, cVar2, kVar) == enumC5000a) {
                                    return enumC5000a;
                                }
                            } else if (abstractC0905k instanceof I) {
                                String str4 = ((I) abstractC0905k).f10881b;
                                kVar.f41120Y = c4972c2;
                                kVar.f41124j0 = 5;
                                obj = c4972c2.q(new C4970A(c4972c2, str4, null), kVar);
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                                v0Var = (v0) obj;
                                if (v0Var instanceof q0) {
                                }
                            } else {
                                AbstractC3557B.K(abstractC0905k, C0907m.f10941a);
                            }
                        }
                    }
                }
                return yVar;
            }
        }
        kVar = new k(c4972c2, abstractC4825e);
        Object obj2 = kVar.f41122h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = kVar.f41124j0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        return yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C4979d c4979d;
        int i10;
        C4972C c4972c;
        C2311c c2311c;
        if (abstractC4825e instanceof C4979d) {
            c4979d = (C4979d) abstractC4825e;
            int i11 = c4979d.f41095i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4979d.f41095i0 = i11 - Integer.MIN_VALUE;
                Object obj = c4979d.f41093Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4979d.f41095i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c4972c = c4979d.f41092Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    c4979d.f41092Y = this;
                    c4979d.f41095i0 = 1;
                    obj = L4.a.m0(this.f41058m, c4979d);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c4972c = this;
                }
                c2311c = (C2311c) obj;
                if (c2311c != null) {
                    wd.s0 s0Var = new wd.s0(0, new Ad.t());
                    W.W(c4972c.f41056k, "Unable to find conversation", s0Var.f48450a, null, 4);
                    return s0Var;
                }
                return new u0(c2311c);
            }
        }
        c4979d = new C4979d(this, abstractC4825e);
        Object obj2 = c4979d.f41093Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4979d.f41095i0;
        if (i10 == 0) {
        }
        c2311c = (C2311c) obj2;
        if (c2311c != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(da.c cVar, AbstractC4825e abstractC4825e) {
        C4981f c4981f;
        int i10;
        v0 v0Var;
        if (abstractC4825e instanceof C4981f) {
            c4981f = (C4981f) abstractC4825e;
            int i11 = c4981f.f41101h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4981f.f41101h0 = i11 - Integer.MIN_VALUE;
                Object obj = c4981f.f41099Y;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = c4981f.f41101h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    String str = cVar.f28169a;
                    c4981f.f41101h0 = 1;
                    obj = d(str, null, c4981f);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                v0Var = (v0) obj;
                if (!(v0Var instanceof u0)) {
                    C2311c c2311c = (C2311c) ((u0) v0Var).f48468a;
                    return new u0(jf.y.f36177a);
                } else if ((v0Var instanceof p0) || (v0Var instanceof q0)) {
                    return v0Var;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        c4981f = new C4981f(this, abstractC4825e);
        Object obj3 = c4981f.f41099Y;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = c4981f.f41101h0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj3;
        if (!(v0Var instanceof u0)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, da.c cVar, AbstractC4825e abstractC4825e) {
        C4982g c4982g;
        int i10;
        C2311c c2311c;
        v0 v0Var;
        C4972C c4972c;
        Object obj;
        da.e eVar;
        String str2;
        v0 v0Var2;
        if (abstractC4825e instanceof C4982g) {
            c4982g = (C4982g) abstractC4825e;
            int i11 = c4982g.f41107k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4982g.f41107k0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c4982g.f41105i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4982g.f41107k0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            c2311c = (C2311c) c4982g.f41102Y;
                            N.B0(obj2);
                            v0Var = (v0) obj2;
                            if (!(v0Var instanceof q0)) {
                                return (q0) v0Var;
                            }
                            return new u0(c2311c);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = c4982g.f41104h0;
                    String str3 = c4982g.f41103Z;
                    c4972c = (C4972C) c4982g.f41102Y;
                    N.B0(obj2);
                    obj = obj2;
                    str2 = str3;
                } else {
                    N.B0(obj2);
                    c4982g.f41102Y = this;
                    str2 = str;
                    c4982g.f41103Z = str2;
                    eVar = cVar;
                    c4982g.f41104h0 = eVar;
                    c4982g.f41107k0 = 1;
                    obj = b(c4982g);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c4972c = this;
                }
                v0Var2 = (v0) obj;
                if (!(v0Var2 instanceof u0)) {
                    C2311c c2311c2 = (C2311c) ((u0) v0Var2).f48468a;
                    List list = c2311c2.f26384k;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (!AbstractC3557B.K(((da.c) ((da.e) obj3)).f28169a, str2)) {
                            arrayList.add(obj3);
                        }
                    }
                    C2311c a5 = C2311c.a(c2311c2, null, null, null, null, null, null, kf.t.d2(kf.t.x2(eVar, arrayList)), null, null, 15359);
                    c4982g.f41102Y = c2311c2;
                    c4982g.f41103Z = null;
                    c4982g.f41104h0 = null;
                    c4982g.f41107k0 = 2;
                    obj2 = c4972c.o(a5, false, c4982g);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    c2311c = c2311c2;
                    v0Var = (v0) obj2;
                    if (!(v0Var instanceof q0)) {
                    }
                } else {
                    return v0Var2;
                }
            }
        }
        c4982g = new C4982g(this, abstractC4825e);
        Object obj22 = c4982g.f41105i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4982g.f41107k0;
        if (i10 == 0) {
        }
        v0Var2 = (v0) obj;
        if (!(v0Var2 instanceof u0)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(C2969F c2969f, AbstractC4825e abstractC4825e) {
        h hVar;
        int i10;
        v0 v0Var;
        v0 v0Var2;
        C4972C c4972c;
        C2311c c2311c;
        i iVar;
        Qa.e eVar;
        String str;
        boolean z10;
        Object obj;
        C2969F c2969f2 = c2969f;
        if (abstractC4825e instanceof h) {
            hVar = (h) abstractC4825e;
            int i11 = hVar.f41112j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f41112j0 = i11 - Integer.MIN_VALUE;
                Object obj2 = hVar.f41110h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = hVar.f41112j0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                N.B0(obj2);
                                v0Var = (v0) obj2;
                                if (v0Var instanceof q0) {
                                    return (q0) v0Var;
                                }
                                return new u0(yVar);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        N.B0(obj2);
                        v0Var2 = (v0) obj2;
                        if (v0Var2 instanceof q0) {
                            return (q0) v0Var2;
                        }
                        return new u0(yVar);
                    }
                    c2969f2 = hVar.f41109Z;
                    c4972c = hVar.f41108Y;
                    N.B0(obj2);
                } else {
                    N.B0(obj2);
                    if (AbstractC4344b.G0(EnumC2971H.f30049i0, EnumC2971H.f30046Y).contains(c2969f2.f30011d) && !c2969f2.f30024q) {
                        return new u0(yVar);
                    }
                    boolean z11 = c2969f2.f30017j;
                    if (z11) {
                        obj = T9.i.f16976a;
                    } else if (!z11) {
                        obj = T9.j.f16977a;
                    } else {
                        throw new RuntimeException();
                    }
                    this.f41059n.setValue(obj);
                    hVar.f41108Y = this;
                    hVar.f41109Z = c2969f2;
                    hVar.f41112j0 = 1;
                    obj2 = L4.a.m0(this.f41058m, hVar);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    c4972c = this;
                }
                c2311c = (C2311c) obj2;
                if (c2311c == null) {
                    c2311c = c4972c.h(c2969f2.f30023p, null, false);
                }
                iVar = new i(c2969f2, 0);
                eVar = c2311c.f26387n;
                if (eVar.e(iVar) == null) {
                    String str2 = c2969f2.f30009b;
                    C6182c0 c6182c0 = new C6182c0(c2969f2.f30008a);
                    Yg.p.Companion.getClass();
                    C2311c a5 = C2311c.a(c2311c, null, str2, null, null, null, null, null, null, eVar.h(c6182c0, C2969F.a(c2969f2, null, new Yg.p(AbstractC6463a.n("instant(...)")), false, false, false, null, false, 268435199)), 8189);
                    if (c2311c.f26375b != null && !c2969f2.f30017j) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    hVar.f41108Y = null;
                    hVar.f41109Z = null;
                    hVar.f41112j0 = 2;
                    obj2 = c4972c.o(a5, z10, hVar);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    v0Var2 = (v0) obj2;
                    if (v0Var2 instanceof q0) {
                    }
                    return new u0(yVar);
                }
                Yg.p.Companion.getClass();
                Qa.h n10 = r9.y.n(C2969F.a(c2969f2, null, new Yg.p(AbstractC6463a.n("instant(...)")), false, false, false, null, false, 268435199));
                c4972c.f41057l = null;
                C6182c0 c6182c02 = (C6182c0) n10.f14554a;
                if (c6182c02 != null) {
                    str = c6182c02.f48393Y;
                } else {
                    str = null;
                }
                C2311c a10 = C2311c.a(c2311c, null, c2969f2.f30009b, null, str, null, null, null, null, eVar.a(c2311c.b().f14554a, n10), 8173);
                hVar.f41108Y = null;
                hVar.f41109Z = null;
                hVar.f41112j0 = 3;
                obj2 = c4972c.o(a10, true, hVar);
                if (obj2 == enumC5000a) {
                    return enumC5000a;
                }
                v0Var = (v0) obj2;
                if (v0Var instanceof q0) {
                }
                return new u0(yVar);
            }
        }
        hVar = new h(this, abstractC4825e);
        Object obj22 = hVar.f41110h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = hVar.f41112j0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        c2311c = (C2311c) obj22;
        if (c2311c == null) {
        }
        iVar = new i(c2969f2, 0);
        eVar = c2311c.f26387n;
        if (eVar.e(iVar) == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(P9.f fVar, AbstractC4825e abstractC4825e) {
        j jVar;
        int i10;
        v0 v0Var;
        C4972C c4972c;
        boolean z10;
        P9.f fVar2 = fVar;
        if (abstractC4825e instanceof j) {
            jVar = (j) abstractC4825e;
            int i11 = jVar.f41119j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f41119j0 = i11 - Integer.MIN_VALUE;
                Object obj = jVar.f41117h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = jVar.f41119j0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            v0Var = (v0) obj;
                            if (v0Var instanceof q0) {
                                return (q0) v0Var;
                            }
                            return new u0(yVar);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar2 = jVar.f41116Z;
                    c4972c = jVar.f41115Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    if (fVar2.f13885c || fVar2.f13884b) {
                        jVar.f41115Y = this;
                        jVar.f41116Z = fVar2;
                        jVar.f41119j0 = 1;
                        obj = b(jVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        c4972c = this;
                    }
                    return new u0(yVar);
                }
                v0 v0Var2 = (v0) obj;
                z10 = v0Var2 instanceof u0;
                if (!z10) {
                    C2311c c2311c = (C2311c) ((u0) v0Var2).f48468a;
                    C2311c a5 = C2311c.a(c2311c, null, null, null, null, null, AbstractC4268D.g1(c2311c.f26380g, new C3959i(new C6182c0(fVar2.f13883a), fVar2)), null, null, null, 16319);
                    jVar.f41115Y = null;
                    jVar.f41116Z = null;
                    jVar.f41119j0 = 2;
                    obj = c4972c.o(a5, true, jVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    v0Var = (v0) obj;
                    if (v0Var instanceof q0) {
                    }
                    return new u0(yVar);
                } else if (z10) {
                    C2311c c2311c2 = (C2311c) ((u0) v0Var2).f48468a;
                    return new u0(yVar);
                } else if ((v0Var2 instanceof p0) || (v0Var2 instanceof q0)) {
                    return v0Var2;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        jVar = new j(this, abstractC4825e);
        Object obj2 = jVar.f41117h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = jVar.f41119j0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        v0 v0Var22 = (v0) obj2;
        z10 = v0Var22 instanceof u0;
        if (!z10) {
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.jvm.internal.x] */
    public final void g(String str, boolean z10, String str2, List list, String str3, L9.E e10, String str4, String str5, List list2) {
        Na.e.Companion.getClass();
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("toString(...)", uuid);
        Na.a aVar = this.f41052g;
        aVar.getClass();
        AbstractC3557B.c0("model", str3);
        aVar.f12763b.put(new Na.e(uuid), new Na.f(str3));
        this.f41061p.k(null);
        AbstractC1073l0 abstractC1073l0 = this.f41062q;
        if (abstractC1073l0 != null) {
            abstractC1073l0.k(null);
        }
        this.f41062q = Ad.l.O0(this.f41050e, null, null, new l(this, str, str2, list, str3, z10, e10, str4, str5, list2, new Object(), uuid, null), 3);
    }

    public final C2311c h(String str, C2334C c2334c, boolean z10) {
        String str2;
        String str3;
        C2310b c2310b = C2311c.Companion;
        String str4 = ((C6168C) kf.t.o2((List) ((C4206b) this.f41046a).f37209b.getValue())).f48321a;
        String str5 = T9.b.f16964a;
        if (c2334c == null || (str2 = c2334c.f26446i) == null) {
            str2 = str;
        }
        c2310b.getClass();
        AbstractC3557B.c0(ParameterNames.ID, str4);
        AbstractC3557B.c0("rootMessageId", str5);
        AbstractC3557B.c0("model", str2);
        Yg.p.Companion.getClass();
        Yg.p pVar = new Yg.p(AbstractC6463a.n("instant(...)"));
        Yg.p pVar2 = new Yg.p(AbstractC6463a.n("instant(...)"));
        Qa.e eVar = new Qa.e(AbstractC4344b.F0(r9.y.n(r9.y.V(str4, str5, str2))));
        if (c2334c != null) {
            str3 = c2334c.f26438a;
        } else {
            str3 = null;
        }
        return new C2311c(str4, null, pVar, pVar2, null, null, null, str3, z10, eVar, 3826);
    }

    public final void i(AbstractC2965B abstractC2965B) {
        if (!(abstractC2965B instanceof C2976e) && !(abstractC2965B instanceof C2979h) && !(abstractC2965B instanceof fa.w)) {
            if (abstractC2965B instanceof fa.n) {
                this.f41051f.getClass();
                Ad.l.O0(this.f41050e, Q.f12904a, null, new m(abstractC2965B, null), 2);
            } else if (abstractC2965B instanceof fa.q) {
                for (AbstractC2965B abstractC2965B2 : ((fa.q) abstractC2965B).f30075b) {
                    i(abstractC2965B2);
                }
            } else if (!(abstractC2965B instanceof fa.t) && !AbstractC3557B.K(abstractC2965B, fa.y.INSTANCE)) {
                AbstractC3557B.K(abstractC2965B, C2964A.INSTANCE);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(C2969F c2969f, AbstractC4825e abstractC4825e) {
        o oVar;
        int i10;
        C4972C c4972c;
        C2969F c2969f2;
        C2311c c2311c;
        C2969F c2969f3;
        v0 v0Var;
        Object obj;
        C2969F c2969f4;
        boolean z10;
        Object obj2;
        String str;
        if (abstractC4825e instanceof o) {
            oVar = (o) abstractC4825e;
            int i11 = oVar.f41148l0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f41148l0 = i11 - Integer.MIN_VALUE;
                Object obj3 = oVar.f41146j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = oVar.f41148l0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                N.B0(obj3);
                                return new u0(yVar);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c2969f3 = oVar.f41145i0;
                        c2311c = oVar.f41144h0;
                        c2969f2 = oVar.f41143Z;
                        c4972c = oVar.f41142Y;
                        N.B0(obj3);
                        v0Var = (v0) obj3;
                        if (!(v0Var instanceof q0)) {
                            return (q0) v0Var;
                        }
                        c4972c.f41059n.setValue(T9.e.f16973a);
                        String str2 = c2311c.f26375b;
                        String str3 = c2969f3.f30008a;
                        List F02 = AbstractC4344b.F0(c2969f3);
                        String str4 = c2969f2.f30023p;
                        L9.E e10 = L9.E.f10875h0;
                        oVar.f41142Y = null;
                        oVar.f41143Z = null;
                        oVar.f41144h0 = null;
                        oVar.f41145i0 = null;
                        oVar.f41148l0 = 3;
                        c4972c.g(str2, c2311c.f26386m, str3, F02, str4, e10, null, null, null);
                        if (yVar == enumC5000a) {
                            return enumC5000a;
                        }
                        return new u0(yVar);
                    }
                    C2969F c2969f5 = oVar.f41143Z;
                    c4972c = oVar.f41142Y;
                    N.B0(obj3);
                    obj = obj3;
                    c2969f4 = c2969f5;
                } else {
                    N.B0(obj3);
                    oVar.f41142Y = this;
                    c2969f4 = c2969f;
                    oVar.f41143Z = c2969f4;
                    oVar.f41148l0 = 1;
                    obj = b(oVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c4972c = this;
                }
                v0 v0Var2 = (v0) obj;
                z10 = v0Var2 instanceof u0;
                if (!z10) {
                    C2311c c2311c2 = (C2311c) ((u0) v0Var2).f48468a;
                    Qa.h e11 = c2311c2.f26387n.e(new i(c2969f4, 1));
                    if (e11 != null) {
                        ArrayList d10 = c2311c2.f26387n.d(e11.f14554a);
                        ListIterator listIterator = d10.listIterator(d10.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                obj2 = listIterator.previous();
                                if (((C2969F) ((Qa.h) obj2).f14557d).f30011d == EnumC2971H.f30046Y) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        Qa.h hVar = (Qa.h) obj2;
                        if (hVar != null) {
                            C2969F c2969f6 = (C2969F) hVar.f14557d;
                            C6182c0 c6182c0 = (C6182c0) hVar.f14554a;
                            if (c6182c0 != null) {
                                str = c6182c0.f48393Y;
                            } else {
                                str = null;
                            }
                            C2311c a5 = C2311c.a(c2311c2, null, null, null, str, null, null, null, null, null, 16367);
                            oVar.f41142Y = c4972c;
                            oVar.f41143Z = c2969f4;
                            oVar.f41144h0 = c2311c2;
                            oVar.f41145i0 = c2969f6;
                            oVar.f41148l0 = 2;
                            Object o10 = c4972c.o(a5, true, oVar);
                            if (o10 == enumC5000a) {
                                return enumC5000a;
                            }
                            c2969f2 = c2969f4;
                            obj3 = o10;
                            c2311c = c2311c2;
                            c2969f3 = c2969f6;
                            v0Var = (v0) obj3;
                            if (!(v0Var instanceof q0)) {
                            }
                        }
                    }
                    return new wd.s0(0, new IllegalStateException("No user message found"));
                } else if (z10) {
                    C2311c c2311c3 = (C2311c) ((u0) v0Var2).f48468a;
                    return new u0(yVar);
                } else if ((v0Var2 instanceof p0) || (v0Var2 instanceof q0)) {
                    return v0Var2;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        oVar = new o(this, abstractC4825e);
        Object obj32 = oVar.f41146j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = oVar.f41148l0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        v0 v0Var22 = (v0) obj;
        z10 = v0Var22 instanceof u0;
        if (!z10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(C2969F c2969f, AbstractC4825e abstractC4825e) {
        t tVar;
        int i10;
        C4972C c4972c;
        if (abstractC4825e instanceof t) {
            tVar = (t) abstractC4825e;
            int i11 = tVar.f41166i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tVar.f41166i0 = i11 - Integer.MIN_VALUE;
                Object obj = tVar.f41164Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = tVar.f41166i0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c4972c = tVar.f41163Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    this.f41061p.k(null);
                    AbstractC1073l0 abstractC1073l0 = this.f41062q;
                    if (abstractC1073l0 != null) {
                        abstractC1073l0.k(null);
                    }
                    C2969F a5 = C2969F.a(c2969f, null, null, true, false, false, null, false, 268434943);
                    tVar.f41163Y = this;
                    tVar.f41166i0 = 1;
                    Object q10 = q(new y(a5, this, null), tVar);
                    if (q10 != enumC5000a) {
                        q10 = yVar;
                    }
                    if (q10 == enumC5000a) {
                        return enumC5000a;
                    }
                    c4972c = this;
                }
                c4972c.f41059n.setValue(T9.i.f16976a);
                return new u0(yVar);
            }
        }
        tVar = new t(this, abstractC4825e);
        Object obj2 = tVar.f41164Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = tVar.f41166i0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        c4972c.f41059n.setValue(T9.i.f16976a);
        return new u0(yVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0196  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x018f -> B:59:0x0192). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, String str2, ArrayList arrayList, C2334C c2334c, boolean z10, ArrayList arrayList2, AbstractC4825e abstractC4825e) {
        u uVar;
        int i10;
        C4972C c4972c;
        C2334C c2334c2;
        C2311c c2311c;
        C2311c c2311c2;
        Iterator it;
        boolean z11;
        List list;
        X9.b bVar;
        String str3;
        C4972C c4972c2;
        boolean z12;
        String str4;
        C4972C c4972c3;
        String str5;
        ArrayList arrayList3;
        C2334C c2334c3;
        Collection collection;
        C2311c c2311c3;
        String str6;
        if (abstractC4825e instanceof u) {
            uVar = (u) abstractC4825e;
            int i11 = uVar.f41176o0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uVar.f41176o0 = i11 - Integer.MIN_VALUE;
                Object obj = uVar.f41174m0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = uVar.f41176o0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                N.B0(obj);
                                return obj;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z11 = uVar.f41173l0;
                        it = (Iterator) uVar.f41172k0;
                        c2311c2 = (C2311c) uVar.f41170i0;
                        c2334c2 = (C2334C) uVar.f41168Z;
                        c4972c = uVar.f41167Y;
                        N.B0(obj);
                        list = (List) uVar.f41169h0;
                        c2311c = (C2311c) uVar.f41171j0;
                        bVar = (X9.b) obj;
                        if (!it.hasNext()) {
                            X9.a aVar = (X9.a) it.next();
                            if (c2311c2 == null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            uVar.f41167Y = c4972c;
                            uVar.f41168Z = c2334c2;
                            uVar.f41169h0 = list;
                            uVar.f41170i0 = c2311c2;
                            uVar.f41171j0 = c2311c;
                            uVar.f41172k0 = it;
                            uVar.f41173l0 = z11;
                            uVar.f41176o0 = 2;
                            obj = aVar.a(bVar, z12);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            bVar = (X9.b) obj;
                            if (!it.hasNext()) {
                                ArrayList x22 = kf.t.x2(bVar.f21802a, bVar.f21803b);
                                if (c2334c2 != null) {
                                    str3 = c2334c2.f26438a;
                                    c4972c2 = null;
                                } else {
                                    c4972c2 = null;
                                    str3 = null;
                                }
                                uVar.f41167Y = c4972c2;
                                uVar.f41168Z = c4972c2;
                                uVar.f41169h0 = c4972c2;
                                uVar.f41170i0 = c4972c2;
                                uVar.f41171j0 = c4972c2;
                                uVar.f41172k0 = c4972c2;
                                uVar.f41176o0 = 3;
                                obj = c4972c.n(x22, c2311c, z11, str3, list, uVar);
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                                return obj;
                            }
                        }
                    } else {
                        z11 = uVar.f41173l0;
                        c2334c3 = (C2334C) uVar.f41171j0;
                        Collection collection2 = (List) uVar.f41170i0;
                        str5 = (String) uVar.f41169h0;
                        C4972C c4972c4 = uVar.f41167Y;
                        N.B0(obj);
                        str4 = (String) uVar.f41168Z;
                        c4972c3 = c4972c4;
                        arrayList3 = (List) uVar.f41172k0;
                        collection = collection2;
                    }
                } else {
                    N.B0(obj);
                    AbstractC1809m0.a().b(A0.f23237c, kf.w.f37484Y);
                    uVar.f41167Y = this;
                    uVar.f41168Z = str;
                    uVar.f41169h0 = str2;
                    collection = arrayList;
                    uVar.f41170i0 = collection;
                    c2334c3 = c2334c;
                    uVar.f41171j0 = c2334c3;
                    arrayList3 = arrayList2;
                    uVar.f41172k0 = arrayList3;
                    uVar.f41173l0 = z10;
                    uVar.f41176o0 = 1;
                    Object m02 = L4.a.m0(this.f41058m, uVar);
                    if (m02 == enumC5000a) {
                        return enumC5000a;
                    }
                    str4 = str;
                    obj = m02;
                    c4972c3 = this;
                    str5 = str2;
                    z11 = z10;
                }
                c2311c3 = (C2311c) obj;
                if (c2311c3 != null) {
                    c2311c = c4972c3.h(str5, c2334c3, z11);
                } else {
                    c2311c = c2311c3;
                }
                Qa.h b10 = c2311c.b();
                C6182c0.Companion.getClass();
                String a5 = C6180b0.a();
                String str7 = ((C2969F) b10.f14557d).f30023p;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : collection) {
                    if (obj2 instanceof Y) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : collection) {
                    if (obj3 instanceof L) {
                        arrayList5.add(obj3);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : collection) {
                    if (obj4 instanceof C6174I) {
                        arrayList6.add(obj4);
                    }
                }
                if (c2334c3 == null) {
                    str6 = c2334c3.f26438a;
                } else {
                    str6 = null;
                }
                C2969F c2969f = new C2969F(a5, c2311c.f26375b, str4, str7, arrayList4, arrayList6, arrayList5, null, str6, false, 1408);
                Object obj5 = c4972c3.f41055j.get();
                AbstractC3557B.b0("get(...)", obj5);
                bVar = new X9.b(c2969f, kf.v.f37483Y);
                it = ((Iterable) obj5).iterator();
                list = arrayList3;
                c4972c = c4972c3;
                c2311c2 = c2311c3;
                c2334c2 = c2334c3;
                if (!it.hasNext()) {
                }
            }
        }
        uVar = new u(this, abstractC4825e);
        Object obj6 = uVar.f41174m0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = uVar.f41176o0;
        if (i10 == 0) {
        }
        c2311c3 = (C2311c) obj6;
        if (c2311c3 != null) {
        }
        Qa.h b102 = c2311c.b();
        C6182c0.Companion.getClass();
        String a52 = C6180b0.a();
        String str72 = ((C2969F) b102.f14557d).f30023p;
        ArrayList arrayList42 = new ArrayList();
        while (r16.hasNext()) {
        }
        ArrayList arrayList52 = new ArrayList();
        while (r8.hasNext()) {
        }
        ArrayList arrayList62 = new ArrayList();
        while (r6.hasNext()) {
        }
        if (c2334c3 == null) {
        }
        C2969F c2969f2 = new C2969F(a52, c2311c.f26375b, str4, str72, arrayList42, arrayList62, arrayList52, null, str6, false, 1408);
        Object obj52 = c4972c3.f41055j.get();
        AbstractC3557B.b0("get(...)", obj52);
        bVar = new X9.b(c2969f2, kf.v.f37483Y);
        it = ((Iterable) obj52).iterator();
        list = arrayList3;
        c4972c = c4972c3;
        c2311c2 = c2311c3;
        c2334c2 = c2334c3;
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(C2969F c2969f, AbstractC4825e abstractC4825e) {
        v vVar;
        int i10;
        C2969F c2969f2;
        C4972C c4972c;
        C2311c c2311c;
        String str;
        if (abstractC4825e instanceof v) {
            vVar = (v) abstractC4825e;
            int i11 = vVar.f41181j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                vVar.f41181j0 = i11 - Integer.MIN_VALUE;
                v vVar2 = vVar;
                Object obj = vVar2.f41179h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = vVar2.f41181j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2969F c2969f3 = vVar2.f41178Z;
                    C4972C c4972c2 = vVar2.f41177Y;
                    N.B0(obj);
                    c2969f2 = c2969f3;
                    c4972c = c4972c2;
                } else {
                    N.B0(obj);
                    vVar2.f41177Y = this;
                    vVar2.f41178Z = c2969f;
                    vVar2.f41181j0 = 1;
                    Object m02 = L4.a.m0(this.f41058m, vVar2);
                    if (m02 == enumC5000a) {
                        return enumC5000a;
                    }
                    c2969f2 = c2969f;
                    obj = m02;
                    c4972c = this;
                }
                c2311c = (C2311c) obj;
                if (c2311c != null) {
                    return new wd.s0(0, new Ad.t());
                }
                Qa.h b10 = c2311c.b();
                X x10 = c2969f2.f30021n;
                if (x10 == null || (str = x10.f32050g) == null) {
                    str = c2311c.f26382i;
                }
                String str2 = str;
                List F02 = AbstractC4344b.F0(C2969F.a(c2969f2, c2311c.f26375b, null, false, false, false, ((C2969F) b10.f14557d).f30023p, false, 268402685));
                vVar2.f41177Y = null;
                vVar2.f41178Z = null;
                vVar2.f41181j0 = 2;
                obj = c4972c.n(F02, c2311c, c2311c.f26386m, str2, null, vVar2);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                return obj;
            }
        }
        vVar = new v(this, abstractC4825e);
        v vVar22 = vVar;
        Object obj2 = vVar22.f41179h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = vVar22.f41181j0;
        if (i10 == 0) {
        }
        c2311c = (C2311c) obj2;
        if (c2311c != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a8 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0101 -> B:29:0x010b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(List list, C2311c c2311c, boolean z10, String str, List list2, AbstractC4825e abstractC4825e) {
        w wVar;
        int i10;
        List list3;
        String str2;
        List list4;
        String str3;
        C4972C c4972c;
        boolean z11;
        C2311c c2311c2;
        boolean z12;
        boolean z13;
        Qa.h g10;
        String str4;
        w wVar2;
        C4972C c4972c2;
        C2311c c2311c3;
        List list5;
        List list6;
        Iterator it;
        String str5;
        String str6;
        if (abstractC4825e instanceof w) {
            wVar = (w) abstractC4825e;
            int i11 = wVar.f41191o0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                wVar.f41191o0 = i11 - Integer.MIN_VALUE;
                Object obj = wVar.f41189m0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = wVar.f41191o0;
                jf.y yVar = jf.y.f36177a;
                boolean z14 = true;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                N.B0(obj);
                                AbstractC1809m0.a().b(C1828w0.f23417c, kf.w.f37484Y);
                                return new u0(yVar);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z12 = wVar.f41188l0;
                        List list7 = wVar.f41186j0;
                        String str7 = wVar.f41185i0;
                        C2311c c2311c4 = wVar.f41184h0;
                        List list8 = wVar.f41183Z;
                        c4972c = wVar.f41182Y;
                        N.B0(obj);
                        str3 = (String) wVar.f41187k0;
                        list3 = list7;
                        str2 = str7;
                        list4 = list8;
                        z11 = true;
                        c2311c2 = c2311c4;
                        if (((zd.n) obj).f51982a && !z12) {
                            z13 = false;
                        } else {
                            z13 = z11;
                        }
                        Qa.h b10 = c2311c2.b();
                        g10 = c2311c2.f26387n.g(b10);
                        if (g10 != null) {
                            b10 = g10;
                        }
                        String str8 = ((C6182c0) b10.f14554a).f48393Y;
                        String str9 = ((C2969F) kf.t.f2(list4)).f30023p;
                        L9.E e10 = L9.E.f10874Z;
                        String str10 = c4972c.f41057l;
                        wVar.f41182Y = null;
                        wVar.f41183Z = null;
                        wVar.f41184h0 = null;
                        wVar.f41185i0 = null;
                        wVar.f41186j0 = null;
                        wVar.f41187k0 = null;
                        wVar.f41191o0 = 3;
                        c4972c.g(str3, z13, str8, list4, str9, e10, str10, str2, list3);
                        if (yVar == enumC5000a) {
                            return enumC5000a;
                        }
                        AbstractC1809m0.a().b(C1828w0.f23417c, kf.w.f37484Y);
                        return new u0(yVar);
                    }
                    z12 = wVar.f41188l0;
                    Iterator it2 = (Iterator) wVar.f41187k0;
                    List list9 = wVar.f41186j0;
                    String str11 = wVar.f41185i0;
                    C2311c c2311c5 = wVar.f41184h0;
                    List list10 = wVar.f41183Z;
                    C4972C c4972c3 = wVar.f41182Y;
                    N.B0(obj);
                    wVar2 = wVar;
                    c2311c3 = c2311c5;
                    boolean z15 = true;
                    List list11 = list9;
                    c4972c2 = c4972c3;
                    str4 = str11;
                    v0 v0Var = (v0) obj;
                    if (!(v0Var instanceof q0)) {
                        q0 q0Var = (q0) v0Var;
                        AbstractC1809m0.a().b(C1826v0.f23415c, kf.w.f37484Y);
                        return q0Var;
                    }
                    list5 = list10;
                    list6 = list11;
                    z14 = z15;
                    it = it2;
                    if (!it.hasNext()) {
                        Qa.h n10 = r9.y.n((C2969F) it.next());
                        c4972c2.getClass();
                        C6182c0 c6182c0 = (C6182c0) n10.f14554a;
                        if (c6182c0 != null) {
                            str6 = c6182c0.f48393Y;
                        } else {
                            str6 = null;
                        }
                        C4972C c4972c4 = c4972c2;
                        Iterator it3 = it;
                        w wVar3 = wVar2;
                        List list12 = list6;
                        String str12 = str6;
                        String str13 = str4;
                        C2311c a5 = C2311c.a(c2311c3, null, null, null, str12, null, null, null, null, c2311c3.f26387n.a(c2311c3.b().f14554a, n10), 8175);
                        wVar3.f41182Y = c4972c4;
                        wVar3.f41183Z = list5;
                        wVar3.f41184h0 = c2311c3;
                        wVar3.f41185i0 = str13;
                        wVar3.f41186j0 = list12;
                        wVar3.f41187k0 = it3;
                        wVar3.f41188l0 = z12;
                        z15 = true;
                        wVar3.f41191o0 = 1;
                        Object o10 = c4972c4.o(a5, true, wVar3);
                        if (o10 == enumC5000a) {
                            return enumC5000a;
                        }
                        list10 = list5;
                        str4 = str13;
                        wVar2 = wVar3;
                        obj = o10;
                        it2 = it3;
                        c4972c2 = c4972c4;
                        list11 = list12;
                        v0 v0Var2 = (v0) obj;
                        if (!(v0Var2 instanceof q0)) {
                        }
                    } else {
                        z11 = z14;
                        C4972C c4972c5 = c4972c2;
                        w wVar4 = wVar2;
                        List list13 = list6;
                        String str14 = str4;
                        if (c4972c5.f41057l != null) {
                            str5 = null;
                        } else {
                            str5 = c2311c3.f26375b;
                        }
                        Ia.j jVar = ((rc.Q) c4972c5.f41049d).f44819b;
                        wVar4.f41182Y = c4972c5;
                        wVar4.f41183Z = list5;
                        wVar4.f41184h0 = c2311c3;
                        wVar4.f41185i0 = str14;
                        wVar4.f41186j0 = list13;
                        wVar4.f41187k0 = str5;
                        wVar4.f41188l0 = z12;
                        wVar4.f41191o0 = 2;
                        Object m02 = L4.a.m0(jVar, wVar4);
                        if (m02 == enumC5000a) {
                            return enumC5000a;
                        }
                        list4 = list5;
                        c4972c = c4972c5;
                        str2 = str14;
                        str3 = str5;
                        obj = m02;
                        list3 = list13;
                        c2311c2 = c2311c3;
                        wVar = wVar4;
                        if (((zd.n) obj).f51982a) {
                        }
                        z13 = z11;
                        Qa.h b102 = c2311c2.b();
                        g10 = c2311c2.f26387n.g(b102);
                        if (g10 != null) {
                        }
                        String str82 = ((C6182c0) b102.f14554a).f48393Y;
                        String str92 = ((C2969F) kf.t.f2(list4)).f30023p;
                        L9.E e102 = L9.E.f10874Z;
                        String str102 = c4972c.f41057l;
                        wVar.f41182Y = null;
                        wVar.f41183Z = null;
                        wVar.f41184h0 = null;
                        wVar.f41185i0 = null;
                        wVar.f41186j0 = null;
                        wVar.f41187k0 = null;
                        wVar.f41191o0 = 3;
                        c4972c.g(str3, z13, str82, list4, str92, e102, str102, str2, list3);
                        if (yVar == enumC5000a) {
                        }
                        AbstractC1809m0.a().b(C1828w0.f23417c, kf.w.f37484Y);
                        return new u0(yVar);
                    }
                } else {
                    N.B0(obj);
                    this.f41059n.setValue(T9.e.f16973a);
                    z12 = z10;
                    str4 = str;
                    list6 = list2;
                    c4972c2 = this;
                    it = list.iterator();
                    wVar2 = wVar;
                    list5 = list;
                    c2311c3 = c2311c;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
        wVar = new w(this, abstractC4825e);
        Object obj2 = wVar.f41189m0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = wVar.f41191o0;
        jf.y yVar2 = jf.y.f36177a;
        boolean z142 = true;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(C2311c c2311c, boolean z10, AbstractC4825e abstractC4825e) {
        x xVar;
        int i10;
        C4972C c4972c;
        boolean z11;
        F0 f02;
        Object value;
        List list;
        if (abstractC4825e instanceof x) {
            xVar = (x) abstractC4825e;
            int i11 = xVar.f41195i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f41195i0 = i11 - Integer.MIN_VALUE;
                Object obj = xVar.f41193Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = xVar.f41195i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c4972c = xVar.f41192Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    xVar.f41192Y = this;
                    xVar.f41195i0 = 1;
                    obj = ((Ia.l) ((xa.f) this.f41047b).f49715b).f(c2311c, z10, xVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c4972c = this;
                }
                v0 v0Var = (v0) obj;
                T9.d dVar = c4972c.f41046a;
                z11 = v0Var instanceof u0;
                if (!z11) {
                    String str = ((C6168C) ((u0) v0Var).f48468a).f48321a;
                    C4206b c4206b = (C4206b) dVar;
                    c4206b.getClass();
                    AbstractC3557B.c0("conversationId", str);
                    do {
                        f02 = c4206b.f37209b;
                        value = f02.getValue();
                        list = (List) value;
                        if (!list.contains(new C6168C(str))) {
                            list = kf.t.x2(new C6168C(str), list);
                        }
                    } while (!f02.e(value, list));
                    if (!z11) {
                        ((C6168C) ((u0) v0Var).f48468a).getClass();
                        return new u0(jf.y.f36177a);
                    } else if ((v0Var instanceof p0) || (v0Var instanceof q0)) {
                        return v0Var;
                    } else {
                        throw new RuntimeException();
                    }
                } else if (!z11) {
                }
            }
        }
        xVar = new x(this, abstractC4825e);
        Object obj2 = xVar.f41193Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = xVar.f41195i0;
        if (i10 == 0) {
        }
        v0 v0Var2 = (v0) obj2;
        T9.d dVar2 = c4972c.f41046a;
        z11 = v0Var2 instanceof u0;
        if (!z11) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088 A[PHI: r1 
      PHI: (r1v2 java.lang.Object) = (r1v8 java.lang.Object), (r1v1 java.lang.Object) binds: [B:24:0x0085, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, AbstractC4825e abstractC4825e) {
        z zVar;
        Object obj;
        EnumC5000a enumC5000a;
        int i10;
        String str2;
        C4972C c4972c;
        C2311c c2311c;
        if (abstractC4825e instanceof z) {
            zVar = (z) abstractC4825e;
            int i11 = zVar.f41204j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zVar.f41204j0 = i11 - Integer.MIN_VALUE;
                obj = zVar.f41202h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = zVar.f41204j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = zVar.f41201Z;
                    C4972C c4972c2 = zVar.f41200Y;
                    N.B0(obj);
                    str2 = str3;
                    c4972c = c4972c2;
                } else {
                    N.B0(obj);
                    zVar.f41200Y = this;
                    zVar.f41201Z = str;
                    zVar.f41204j0 = 1;
                    Object m02 = L4.a.m0(this.f41058m, zVar);
                    if (m02 == enumC5000a) {
                        return enumC5000a;
                    }
                    str2 = str;
                    obj = m02;
                    c4972c = this;
                }
                c2311c = (C2311c) obj;
                if (c2311c == null) {
                    C6190g0.Companion.getClass();
                    c2311c = c4972c.h("text-davinci-002-render-sha", null, false);
                }
                C2311c a5 = C2311c.a(c2311c, null, str2, null, null, null, null, null, null, null, 16381);
                zVar.f41200Y = null;
                zVar.f41201Z = null;
                zVar.f41204j0 = 2;
                obj = c4972c.o(a5, true, zVar);
                if (obj != enumC5000a) {
                    return enumC5000a;
                }
                return obj;
            }
        }
        zVar = new z(this, abstractC4825e);
        obj = zVar.f41202h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = zVar.f41204j0;
        if (i10 == 0) {
        }
        c2311c = (C2311c) obj;
        if (c2311c == null) {
        }
        C2311c a52 = C2311c.a(c2311c, null, str2, null, null, null, null, null, null, null, 16381);
        zVar.f41200Y = null;
        zVar.f41201Z = null;
        zVar.f41204j0 = 2;
        obj = c4972c.o(a52, true, zVar);
        if (obj != enumC5000a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(wf.n nVar, AbstractC4825e abstractC4825e) {
        C4971B c4971b;
        int i10;
        C4972C c4972c;
        C2311c c2311c;
        if (abstractC4825e instanceof C4971B) {
            c4971b = (C4971B) abstractC4825e;
            int i11 = c4971b.f41045j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4971b.f41045j0 = i11 - Integer.MIN_VALUE;
                Object obj = c4971b.f41043h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4971b.f41045j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = c4971b.f41042Z;
                    c4972c = c4971b.f41041Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    c4971b.f41041Y = this;
                    c4971b.f41042Z = nVar;
                    c4971b.f41045j0 = 1;
                    obj = L4.a.m0(this.f41058m, c4971b);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c4972c = this;
                }
                c2311c = (C2311c) obj;
                if (c2311c == null) {
                    c4971b.f41041Y = null;
                    c4971b.f41042Z = null;
                    c4971b.f41045j0 = 2;
                    obj = nVar.invoke(c2311c, c4971b);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    return obj;
                }
                wd.s0 s0Var = new wd.s0(0, new Ad.t());
                W.W(c4972c.f41056k, "withConversation exception", s0Var.f48450a, null, 4);
                return s0Var;
            }
        }
        c4971b = new C4971B(this, abstractC4825e);
        Object obj2 = c4971b.f41043h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4971b.f41045j0;
        if (i10 == 0) {
        }
        c2311c = (C2311c) obj2;
        if (c2311c == null) {
        }
    }
}
