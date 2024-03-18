package V8;

import B.B0;
import B.Z1;
import B0.C0196m;
import B0.N;
import B0.u;
import Ng.F;
import jf.y;
import kotlin.jvm.internal.B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;
import q0.C5251c;
import wf.n;
import wf.o;

/* loaded from: classes2.dex */
public final class g extends AbstractC5161h implements n {

    /* renamed from: Z  reason: collision with root package name */
    public Object f18461Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f18462h0;

    /* renamed from: i0  reason: collision with root package name */
    public B f18463i0;

    /* renamed from: j0  reason: collision with root package name */
    public long f18464j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f18465k0;

    /* renamed from: l0  reason: collision with root package name */
    public /* synthetic */ Object f18466l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.k f18467m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ m f18468n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ o f18469o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ F f18470p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ wf.k f18471q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ wf.k f18472r0;

    /* renamed from: s0  reason: collision with root package name */
    public final /* synthetic */ wf.k f18473s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(wf.k kVar, m mVar, o oVar, F f6, wf.k kVar2, wf.k kVar3, wf.k kVar4, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18467m0 = kVar;
        this.f18468n0 = mVar;
        this.f18469o0 = oVar;
        this.f18470p0 = f6;
        this.f18471q0 = kVar2;
        this.f18472r0 = kVar3;
        this.f18473s0 = kVar4;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        g gVar = new g(this.f18467m0, this.f18468n0, this.f18469o0, this.f18470p0, this.f18471q0, this.f18472r0, this.f18473s0, abstractC4825e);
        gVar.f18466l0 = obj;
        return gVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((N) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106 A[Catch: m -> 0x0072, TryCatch #3 {m -> 0x0072, blocks: (B:12:0x006b, B:36:0x0100, B:38:0x0106, B:39:0x0110), top: B:86:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110 A[Catch: m -> 0x0072, TRY_LEAVE, TryCatch #3 {m -> 0x0072, blocks: (B:12:0x006b, B:36:0x0100, B:38:0x0106, B:39:0x0110), top: B:86:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0210  */
    /* JADX WARN: Type inference failed for: r15v5, types: [pf.h, wf.n] */
    /* JADX WARN: Type inference failed for: r2v28, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35 */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        boolean z10;
        N n10;
        B b10;
        u uVar;
        B b11;
        long j6;
        Object obj3;
        long j10;
        N n11;
        Object obj4;
        N n12;
        boolean z11;
        Object obj5;
        B b12;
        Object obj6;
        B b13;
        Object obj7;
        N n13;
        Object c10;
        u uVar2;
        Object obj8;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18465k0;
        y yVar = y.f36177a;
        F f6 = this.f18470p0;
        o oVar = this.f18469o0;
        wf.k kVar = this.f18473s0;
        wf.k kVar2 = this.f18471q0;
        m mVar = this.f18468n0;
        switch (i10) {
            case 0:
                com.google.android.gms.internal.play_billing.N.B0(obj);
                n13 = (N) this.f18466l0;
                this.f18466l0 = n13;
                this.f18465k0 = 1;
                c10 = Z1.c(n13, this, 3);
                if (c10 == enumC5000a) {
                    return enumC5000a;
                }
                n11 = n13;
                uVar2 = (u) c10;
                if (((Boolean) this.f18467m0.invoke(new C5251c(uVar2.f1672c))).booleanValue()) {
                    mVar.f18496i0.f(null);
                    mVar.f18494Z = false;
                    mVar.f18495h0 = false;
                    return yVar;
                }
                uVar2.a();
                mVar.f18496i0.f(null);
                mVar.f18494Z = false;
                mVar.f18495h0 = false;
                if (oVar != j.f18485a) {
                    Ad.l.O0(f6, null, null, new c(oVar, mVar, uVar2, null), 3);
                }
                if (kVar2 != null) {
                    j10 = n11.e().b();
                } else {
                    j10 = 4611686018427387903L;
                }
                obj8 = new Object();
                try {
                    ?? abstractC5161h = new AbstractC5161h(2, null);
                    this.f18466l0 = n11;
                    this.f18461Z = uVar2;
                    this.f18462h0 = obj8;
                    this.f18463i0 = obj8;
                    this.f18464j0 = j10;
                    this.f18465k0 = 2;
                    obj6 = n11.f(j10, abstractC5161h, this);
                } catch (C0196m unused) {
                    n12 = n11;
                    if (kVar2 != null) {
                        kVar2.invoke(new C5251c(uVar2.f1672c));
                    }
                    this.f18466l0 = n12;
                    this.f18461Z = obj8;
                    obj5 = null;
                    this.f18462h0 = null;
                    this.f18463i0 = null;
                    this.f18464j0 = j10;
                    this.f18465k0 = 3;
                    if (j.a(n12, this) != enumC5000a) {
                        return enumC5000a;
                    }
                    z11 = true;
                    b12 = obj8;
                    mVar.f18494Z = z11;
                    mVar.f18496i0.g(obj5);
                    n11 = n12;
                    b11 = b12;
                    obj4 = b11.f37622Y;
                    if (obj4 != null) {
                    }
                    return yVar;
                }
                if (obj6 == enumC5000a) {
                    return enumC5000a;
                }
                b11 = obj8;
                b13 = obj8;
                b13.f37622Y = obj6;
                obj7 = b11.f37622Y;
                if (obj7 != null) {
                    mVar.f18495h0 = true;
                    mVar.f18496i0.g(null);
                } else {
                    ((u) obj7).a();
                    mVar.f18494Z = true;
                    mVar.f18496i0.g(null);
                }
                obj4 = b11.f37622Y;
                if (obj4 != null) {
                    if (this.f18472r0 == null) {
                        if (kVar != null) {
                            kVar.invoke(new C5251c(((u) obj4).f1672c));
                        }
                    } else {
                        this.f18466l0 = n11;
                        this.f18461Z = b11;
                        this.f18462h0 = null;
                        this.f18463i0 = null;
                        this.f18464j0 = j10;
                        this.f18465k0 = 4;
                        B0 b02 = j.f18485a;
                        long j11 = j10;
                        obj3 = n11.h(n11.e().a(), new a((u) obj4, null), this);
                        if (obj3 == enumC5000a) {
                            return enumC5000a;
                        }
                        n10 = n11;
                        j6 = j11;
                        uVar = (u) obj3;
                        if (uVar != null) {
                            if (kVar != null) {
                                kVar.invoke(new C5251c(((u) b11.f37622Y).f1672c));
                            }
                        } else {
                            mVar.f18496i0.f(null);
                            mVar.f18494Z = false;
                            mVar.f18495h0 = false;
                            if (oVar != j.f18485a) {
                                Ad.l.O0(f6, null, null, new e(oVar, mVar, uVar, null), 3);
                            }
                            try {
                                f fVar = new f(this.f18468n0, this.f18472r0, this.f18473s0, b11, null);
                                this.f18466l0 = n10;
                                this.f18461Z = b11;
                                this.f18462h0 = uVar;
                                this.f18465k0 = 5;
                                if (n10.f(j6, fVar, this) == enumC5000a) {
                                    return enumC5000a;
                                }
                            } catch (C0196m unused2) {
                                b10 = b11;
                                if (kVar != null) {
                                }
                                if (kVar2 != null) {
                                }
                                obj2 = null;
                                this.f18466l0 = null;
                                this.f18461Z = null;
                                this.f18462h0 = null;
                                this.f18465k0 = 6;
                                if (j.a(n10, this) != enumC5000a) {
                                }
                            }
                        }
                    }
                }
                return yVar;
            case 1:
                n13 = (N) this.f18466l0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                c10 = obj;
                n11 = n13;
                uVar2 = (u) c10;
                if (((Boolean) this.f18467m0.invoke(new C5251c(uVar2.f1672c))).booleanValue()) {
                }
                break;
            case 2:
                j10 = this.f18464j0;
                B b14 = this.f18463i0;
                b11 = (B) this.f18462h0;
                uVar2 = (u) this.f18461Z;
                n11 = (N) this.f18466l0;
                try {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    obj6 = obj;
                    b13 = b14;
                    b13.f37622Y = obj6;
                    obj7 = b11.f37622Y;
                    if (obj7 != null) {
                    }
                } catch (C0196m unused3) {
                    obj8 = b11;
                    n12 = n11;
                    if (kVar2 != null) {
                    }
                    this.f18466l0 = n12;
                    this.f18461Z = obj8;
                    obj5 = null;
                    this.f18462h0 = null;
                    this.f18463i0 = null;
                    this.f18464j0 = j10;
                    this.f18465k0 = 3;
                    if (j.a(n12, this) != enumC5000a) {
                    }
                }
                obj4 = b11.f37622Y;
                if (obj4 != null) {
                }
                return yVar;
            case 3:
                j10 = this.f18464j0;
                n12 = (N) this.f18466l0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                z11 = true;
                obj5 = null;
                b12 = (B) this.f18461Z;
                mVar.f18494Z = z11;
                mVar.f18496i0.g(obj5);
                n11 = n12;
                b11 = b12;
                obj4 = b11.f37622Y;
                if (obj4 != null) {
                }
                return yVar;
            case 4:
                j6 = this.f18464j0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                n10 = (N) this.f18466l0;
                b11 = (B) this.f18461Z;
                obj3 = obj;
                uVar = (u) obj3;
                if (uVar != null) {
                }
                return yVar;
            case 5:
                uVar = (u) this.f18462h0;
                b10 = (B) this.f18461Z;
                n10 = (N) this.f18466l0;
                try {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } catch (C0196m unused4) {
                    if (kVar != null) {
                        kVar.invoke(new C5251c(((u) b10.f37622Y).f1672c));
                    }
                    if (kVar2 != null) {
                        kVar2.invoke(new C5251c(uVar.f1672c));
                    }
                    obj2 = null;
                    this.f18466l0 = null;
                    this.f18461Z = null;
                    this.f18462h0 = null;
                    this.f18465k0 = 6;
                    if (j.a(n10, this) != enumC5000a) {
                        return enumC5000a;
                    }
                    z10 = true;
                    mVar.f18494Z = z10;
                    mVar.f18496i0.g(obj2);
                    return yVar;
                }
                return yVar;
            case 6:
                com.google.android.gms.internal.play_billing.N.B0(obj);
                z10 = true;
                obj2 = null;
                mVar.f18494Z = z10;
                mVar.f18496i0.g(obj2);
                return yVar;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
