package B;

import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import pf.AbstractC5161h;

/* loaded from: classes2.dex */
public final class N0 extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public int f1136Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f1137h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4831k f1138i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.n f1139j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(AbstractC4825e abstractC4825e, AbstractC4831k abstractC4831k, wf.n nVar) {
        super(2, abstractC4825e);
        this.f1138i0 = abstractC4831k;
        this.f1139j0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        N0 n02 = new N0(abstractC4825e, this.f1138i0, this.f1139j0);
        n02.f1137h0 = obj;
        return n02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((N0) create((B0.N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [B0.N, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0057 -> B:12:0x0028). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x006c -> B:12:0x0028). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CancellationException e10;
        Object p10;
        B0.N n10;
        B0.N n11;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        B0.N n12 = this.f1136Z;
        AbstractC4831k abstractC4831k = this.f1138i0;
        try {
        } catch (CancellationException e11) {
            e10 = e11;
            if (!Ad.l.G0(abstractC4831k)) {
            }
        }
        if (n12 != 0) {
            if (n12 != 1) {
                if (n12 != 2) {
                    if (n12 == 3) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        n11 = (B0.N) this.f1137h0;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    B0.N n13 = (B0.N) this.f1137h0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    n11 = n13;
                }
                n10 = n11;
                if (Ad.l.G0(abstractC4831k)) {
                    try {
                    } catch (CancellationException e12) {
                        n12 = n10;
                        e10 = e12;
                        if (!Ad.l.G0(abstractC4831k)) {
                            this.f1137h0 = n12;
                            this.f1136Z = 3;
                            Object p11 = Df.H.p(n12, this);
                            n11 = n12;
                            if (p11 == enumC5000a) {
                                return enumC5000a;
                            }
                            n10 = n11;
                            if (Ad.l.G0(abstractC4831k)) {
                            }
                        } else {
                            throw e10;
                        }
                    }
                    wf.n nVar = this.f1139j0;
                    this.f1137h0 = n10;
                    this.f1136Z = 1;
                    if (nVar.invoke(n10, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    n12 = n10;
                    this.f1137h0 = n12;
                    this.f1136Z = 2;
                    p10 = Df.H.p(n12, this);
                    n11 = n12;
                    if (p10 == enumC5000a) {
                        return enumC5000a;
                    }
                    n10 = n11;
                    if (Ad.l.G0(abstractC4831k)) {
                        return jf.y.f36177a;
                    }
                }
            } else {
                B0.N n14 = (B0.N) this.f1137h0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                n12 = n14;
                this.f1137h0 = n12;
                this.f1136Z = 2;
                p10 = Df.H.p(n12, this);
                n11 = n12;
                if (p10 == enumC5000a) {
                }
                n10 = n11;
                if (Ad.l.G0(abstractC4831k)) {
                }
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            n10 = (B0.N) this.f1137h0;
            if (Ad.l.G0(abstractC4831k)) {
            }
        }
    }
}
