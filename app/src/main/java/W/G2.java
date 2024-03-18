package W;

import q0.C5254f;
import t0.AbstractC5650i;
import z.C6671K;

/* loaded from: classes.dex */
public final class G2 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ long f19165Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f19166Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Z.l1 f19167h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Z.l1 f19168i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f19169j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Z.l1 f19170k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Z.l1 f19171l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G2(long j6, int i10, C6671K c6671k, C6671K c6671k2, long j10, C6671K c6671k3, C6671K c6671k4) {
        super(1);
        this.f19165Y = j6;
        this.f19166Z = i10;
        this.f19167h0 = c6671k;
        this.f19168i0 = c6671k2;
        this.f19169j0 = j10;
        this.f19170k0 = c6671k3;
        this.f19171l0 = c6671k4;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        AbstractC5650i abstractC5650i = (AbstractC5650i) obj;
        float b10 = C5254f.b(abstractC5650i.g());
        I2.f(abstractC5650i, 0.0f, 1.0f, this.f19165Y, b10, this.f19166Z);
        Z.l1 l1Var = this.f19167h0;
        float floatValue = ((Number) l1Var.getValue()).floatValue();
        Z.l1 l1Var2 = this.f19168i0;
        if (floatValue - ((Number) l1Var2.getValue()).floatValue() > 0.0f) {
            I2.f(abstractC5650i, ((Number) l1Var.getValue()).floatValue(), ((Number) l1Var2.getValue()).floatValue(), this.f19169j0, b10, this.f19166Z);
        }
        Z.l1 l1Var3 = this.f19170k0;
        float floatValue2 = ((Number) l1Var3.getValue()).floatValue();
        Z.l1 l1Var4 = this.f19171l0;
        if (floatValue2 - ((Number) l1Var4.getValue()).floatValue() > 0.0f) {
            I2.f(abstractC5650i, ((Number) l1Var3.getValue()).floatValue(), ((Number) l1Var4.getValue()).floatValue(), this.f19169j0, b10, this.f19166Z);
        }
        return jf.y.f36177a;
    }
}
