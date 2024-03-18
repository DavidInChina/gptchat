package oh;

import B.AbstractC0170v0;
import B.Z1;
import B0.C0196m;
import B0.N;
import B0.P;
import G0.AbstractC0579h;
import id.AbstractC3557B;
import mh.C4678h;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;
import q0.C5251c;
import q0.C5254f;

/* loaded from: classes.dex */
public final class r extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public B0.u f41444Z;

    /* renamed from: h0  reason: collision with root package name */
    public long f41445h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f41446i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f41447j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.k f41448k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ wf.k f41449l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.k f41450m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ B0.A f41451n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ wf.k f41452o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ wf.k f41453p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(B0.A a5, AbstractC4825e abstractC4825e, wf.k kVar, wf.k kVar2, wf.k kVar3, wf.k kVar4, wf.k kVar5) {
        super(2, abstractC4825e);
        this.f41448k0 = kVar;
        this.f41449l0 = kVar2;
        this.f41450m0 = kVar3;
        this.f41451n0 = a5;
        this.f41452o0 = kVar4;
        this.f41453p0 = kVar5;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        r rVar = new r(this.f41451n0, abstractC4825e, this.f41448k0, this.f41449l0, this.f41450m0, this.f41452o0, this.f41453p0);
        rVar.f41447j0 = obj;
        return rVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v11, types: [pf.h, wf.n] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j6;
        N n10;
        B0.u uVar;
        Object obj2;
        long j10;
        long j11;
        long j12;
        Object obj3;
        B0.u uVar2;
        N n11;
        B0.u uVar3;
        B0.u uVar4;
        Object obj4;
        Object obj5;
        N n12;
        B0.u uVar5;
        long j13;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41446i0;
        wf.k kVar = this.f41449l0;
        wf.k kVar2 = this.f41452o0;
        switch (i10) {
            case 0:
                com.google.android.gms.internal.play_billing.N.B0(obj);
                n12 = (N) this.f41447j0;
                this.f41447j0 = n12;
                this.f41446i0 = 1;
                obj5 = Z1.c(n12, this, 3);
                if (obj5 == enumC5000a) {
                    return enumC5000a;
                }
                uVar5 = (B0.u) obj5;
                uVar5.a();
                this.f41448k0.invoke(new C5251c(uVar5.f1672c));
                if (kVar == null) {
                    j13 = n12.e().b();
                } else {
                    j13 = 4611686018427387903L;
                }
                try {
                    ?? abstractC5161h = new AbstractC5161h(2, null);
                    this.f41447j0 = n12;
                    this.f41444Z = uVar5;
                    this.f41446i0 = 2;
                    obj4 = n12.f(j13, abstractC5161h, this);
                } catch (C0196m unused) {
                    uVar3 = null;
                    n10 = n12;
                    uVar4 = uVar5;
                    if (kVar != null) {
                        kVar.invoke(new C5251c(uVar4.f1672c));
                    }
                    this.f41447j0 = n10;
                    this.f41444Z = uVar3;
                    this.f41446i0 = 3;
                    if (P4.a.j(n10, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    n11 = n10;
                    uVar2 = uVar3;
                    n10 = n11;
                    if (uVar2 != null) {
                    }
                    return jf.y.f36177a;
                }
                if (obj4 != enumC5000a) {
                    return enumC5000a;
                }
                n10 = n12;
                uVar4 = uVar5;
                uVar3 = (B0.u) obj4;
                if (uVar3 != null) {
                    try {
                        uVar3.a();
                    } catch (C0196m unused2) {
                        if (kVar != null) {
                        }
                        this.f41447j0 = n10;
                        this.f41444Z = uVar3;
                        this.f41446i0 = 3;
                        if (P4.a.j(n10, this) == enumC5000a) {
                        }
                    }
                }
                uVar2 = uVar3;
                if (uVar2 != null) {
                    this.f41447j0 = n10;
                    this.f41444Z = uVar2;
                    this.f41446i0 = 4;
                    obj3 = n10.h(n10.e().a(), new o(uVar2, null), this);
                    if (obj3 == enumC5000a) {
                        return enumC5000a;
                    }
                    uVar = (B0.u) obj3;
                    int i11 = Mg.e.f12141b;
                    j6 = System.nanoTime() - Mg.e.f12140a;
                    if (uVar != null) {
                        uVar.a();
                    }
                    if (uVar != null) {
                        wf.k kVar3 = this.f41450m0;
                        if (kVar3 != null) {
                            kVar3.invoke(new C5251c(uVar2.f1672c));
                        }
                    } else {
                        P p10 = (P) this.f41451n0;
                        p10.getClass();
                        long g10 = R.a.g(AbstractC0579h.A(p10).f24861y0.c(), p10);
                        long g11 = C5251c.g(uVar.f1672c, uVar2.f1672c);
                        if (Math.abs(C5251c.d(g11)) < C5254f.d(g10) && Math.abs(C5251c.e(g11)) < C5254f.b(g10)) {
                            gc.l lVar = new gc.l(kVar2, 8, uVar);
                            this.f41447j0 = n10;
                            this.f41444Z = uVar;
                            this.f41445h0 = j6;
                            this.f41446i0 = 5;
                            obj2 = AbstractC0170v0.e(n10, uVar.f1670a, lVar, this);
                            if (obj2 == enumC5000a) {
                                return enumC5000a;
                            }
                            if (((B0.u) obj2) == null) {
                                long j14 = uVar.f1670a;
                                C4678h c4678h = new C4678h(kVar2, 4, uVar);
                                this.f41447j0 = null;
                                this.f41444Z = null;
                                this.f41446i0 = 6;
                                if (AbstractC0170v0.k(n10, j14, c4678h, this) == enumC5000a) {
                                    return enumC5000a;
                                }
                                kVar2.invoke(C5021h.f41420a);
                            } else {
                                int i12 = Mg.e.f12141b;
                                long nanoTime = System.nanoTime() - Mg.e.f12140a;
                                Mg.d dVar = Mg.d.f12132Z;
                                AbstractC3557B.c0("unit", dVar);
                                if (((j6 - 1) | 1) == Long.MAX_VALUE) {
                                    if (j6 < 0) {
                                        j12 = Mg.b.f12129i0;
                                    } else {
                                        j12 = Mg.b.f12128h0;
                                    }
                                    j10 = Mg.b.o(j12);
                                } else {
                                    long j15 = nanoTime - j6;
                                    if (((~(j15 ^ j6)) & (j15 ^ nanoTime)) < 0) {
                                        Mg.d dVar2 = Mg.d.f12133h0;
                                        if (dVar.compareTo(dVar2) < 0) {
                                            long w02 = A7.b.w0(1L, dVar2, dVar);
                                            Mg.a aVar = Mg.b.f12127Z;
                                            j10 = Mg.b.i(Df.H.y0((nanoTime / w02) - (j6 / w02), dVar2), Df.H.y0((nanoTime % w02) - (j6 % w02), dVar));
                                        } else {
                                            if (j15 < 0) {
                                                j11 = Mg.b.f12129i0;
                                            } else {
                                                j11 = Mg.b.f12128h0;
                                            }
                                            j10 = Mg.b.o(j11);
                                        }
                                    } else {
                                        j10 = Df.H.y0(j15, dVar);
                                    }
                                }
                                Mg.a aVar2 = Mg.b.f12127Z;
                                if (Mg.b.c(j10, Df.H.y0(n10.e().a(), Mg.d.f12133h0)) < 0) {
                                    this.f41453p0.invoke(new C5251c(uVar.f1672c));
                                }
                            }
                        }
                    }
                }
                return jf.y.f36177a;
            case 1:
                n12 = (N) this.f41447j0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                obj5 = obj;
                uVar5 = (B0.u) obj5;
                uVar5.a();
                this.f41448k0.invoke(new C5251c(uVar5.f1672c));
                if (kVar == null) {
                }
                ?? abstractC5161h2 = new AbstractC5161h(2, null);
                this.f41447j0 = n12;
                this.f41444Z = uVar5;
                this.f41446i0 = 2;
                obj4 = n12.f(j13, abstractC5161h2, this);
                if (obj4 != enumC5000a) {
                }
                break;
            case 2:
                uVar4 = this.f41444Z;
                n10 = (N) this.f41447j0;
                try {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    obj4 = obj;
                    uVar3 = (B0.u) obj4;
                    if (uVar3 != null) {
                    }
                    uVar2 = uVar3;
                } catch (C0196m unused3) {
                    uVar3 = null;
                    if (kVar != null) {
                    }
                    this.f41447j0 = n10;
                    this.f41444Z = uVar3;
                    this.f41446i0 = 3;
                    if (P4.a.j(n10, this) == enumC5000a) {
                    }
                }
                if (uVar2 != null) {
                }
                return jf.y.f36177a;
            case 3:
                uVar2 = this.f41444Z;
                n11 = (N) this.f41447j0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                n10 = n11;
                if (uVar2 != null) {
                }
                return jf.y.f36177a;
            case 4:
                uVar2 = this.f41444Z;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                n10 = (N) this.f41447j0;
                obj3 = obj;
                uVar = (B0.u) obj3;
                int i112 = Mg.e.f12141b;
                j6 = System.nanoTime() - Mg.e.f12140a;
                if (uVar != null) {
                }
                if (uVar != null) {
                }
                return jf.y.f36177a;
            case 5:
                long j16 = this.f41445h0;
                uVar = this.f41444Z;
                n10 = (N) this.f41447j0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                j6 = j16;
                obj2 = obj;
                if (((B0.u) obj2) == null) {
                }
                break;
            case 6:
                com.google.android.gms.internal.play_billing.N.B0(obj);
                kVar2.invoke(C5021h.f41420a);
                return jf.y.f36177a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
