package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;
import q0.C5251c;
import wf.AbstractC6216a;

/* renamed from: B.r0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0158r0 extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public kotlin.jvm.internal.y f1472Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f1473h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f1474i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f1475j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.n f1476k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f1477l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f1478m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0158r0(wf.k kVar, wf.n nVar, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1475j0 = kVar;
        this.f1476k0 = nVar;
        this.f1477l0 = abstractC6216a;
        this.f1478m0 = abstractC6216a2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0158r0 c0158r0 = new C0158r0(this.f1475j0, this.f1476k0, this.f1477l0, this.f1478m0, abstractC4825e);
        c0158r0.f1474i0 = obj;
        return c0158r0;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0158r0) create((B0.N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.jvm.internal.y] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        B0.N n10;
        kotlin.jvm.internal.y yVar;
        B0.u uVar;
        B0.N n11;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1473h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            this.f1477l0.mo122invoke();
                        } else {
                            this.f1478m0.mo122invoke();
                        }
                        return jf.y.f36177a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = this.f1472Z;
                n10 = (B0.N) this.f1474i0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                uVar = (B0.u) obj;
                if (uVar != null) {
                    this.f1475j0.invoke(new C5251c(uVar.f1672c));
                    Float f6 = new Float(yVar.f37646Y);
                    wf.n nVar = this.f1476k0;
                    nVar.invoke(uVar, f6);
                    C0147n0 c0147n0 = new C0147n0(nVar, 2);
                    this.f1474i0 = null;
                    this.f1472Z = null;
                    this.f1473h0 = 3;
                    obj = AbstractC0170v0.k(n10, uVar.f1670a, c0147n0, this);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
                return jf.y.f36177a;
            }
            n11 = (B0.N) this.f1474i0;
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            B0.N n12 = (B0.N) this.f1474i0;
            this.f1474i0 = n12;
            this.f1473h0 = 1;
            Object c10 = Z1.c(n12, this, 2);
            if (c10 == enumC5000a) {
                return enumC5000a;
            }
            n11 = n12;
            obj = c10;
        }
        B0.u uVar2 = (B0.u) obj;
        ?? obj2 = new Object();
        long j6 = uVar2.f1670a;
        C0153p0 c0153p0 = new C0153p0(obj2, 1);
        this.f1474i0 = n11;
        this.f1472Z = obj2;
        this.f1473h0 = 2;
        obj = AbstractC0170v0.d(n11, j6, uVar2.f1678i, c0153p0, this);
        if (obj == enumC5000a) {
            return enumC5000a;
        }
        n10 = n11;
        yVar = obj2;
        uVar = (B0.u) obj;
        if (uVar != null) {
        }
        return jf.y.f36177a;
    }
}
