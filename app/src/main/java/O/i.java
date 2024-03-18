package O;

import W.I2;
import Z.l1;
import jf.y;
import kotlin.jvm.internal.o;
import r0.G;
import t0.AbstractC5650i;
import t0.C5654m;
import z.C6671K;

/* loaded from: classes.dex */
public final class i extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f13247Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f13248Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5654m f13249h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l1 f13250i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ l1 f13251j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ l1 f13252k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ l1 f13253l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ float f13254m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ long f13255n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j6, C5654m c5654m, float f6, long j10, C6671K c6671k, C6671K c6671k2, C6671K c6671k3, C6671K c6671k4) {
        super(1);
        this.f13248Z = j6;
        this.f13249h0 = c5654m;
        this.f13254m0 = f6;
        this.f13255n0 = j10;
        this.f13250i0 = c6671k;
        this.f13251j0 = c6671k2;
        this.f13252k0 = c6671k3;
        this.f13253l0 = c6671k4;
    }

    public final void a(AbstractC5650i abstractC5650i) {
        float f6;
        float f10;
        int i10 = this.f13247Y;
        float f11 = this.f13254m0;
        l1 l1Var = this.f13253l0;
        l1 l1Var2 = this.f13252k0;
        l1 l1Var3 = this.f13251j0;
        l1 l1Var4 = this.f13250i0;
        C5654m c5654m = this.f13249h0;
        switch (i10) {
            case 0:
                l.b(abstractC5650i, 0.0f, 360.0f, this.f13248Z, c5654m);
                float abs = Math.abs(((Number) l1Var3.getValue()).floatValue() - ((Number) l1Var2.getValue()).floatValue());
                float floatValue = ((Number) l1Var2.getValue()).floatValue() + ((Number) l1Var.getValue()).floatValue() + (((((Number) l1Var4.getValue()).intValue() * 216.0f) % 360.0f) - 90.0f);
                if (G.f(c5654m.f45625c, 0)) {
                    f6 = 0.0f;
                } else {
                    f6 = ((f11 / (l.f13267a / 2)) * 57.29578f) / 2.0f;
                }
                l.b(abstractC5650i, floatValue + f6, Math.max(abs, 0.1f), this.f13255n0, c5654m);
                return;
            default:
                I2.e(abstractC5650i, 0.0f, 360.0f, this.f13248Z, c5654m);
                float abs2 = Math.abs(((Number) l1Var3.getValue()).floatValue() - ((Number) l1Var2.getValue()).floatValue());
                float floatValue2 = ((Number) l1Var2.getValue()).floatValue() + ((Number) l1Var.getValue()).floatValue() + (((((Number) l1Var4.getValue()).floatValue() * 216.0f) % 360.0f) - 90.0f);
                if (G.f(c5654m.f45625c, 0)) {
                    f10 = 0.0f;
                } else {
                    f10 = ((f11 / (I2.f19222e / 2)) * 57.29578f) / 2.0f;
                }
                I2.e(abstractC5650i, floatValue2 + f10, Math.max(abs2, 0.1f), this.f13255n0, c5654m);
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f13247Y) {
            case 0:
                a((AbstractC5650i) obj);
                return yVar;
            default:
                a((AbstractC5650i) obj);
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j6, C5654m c5654m, C6671K c6671k, C6671K c6671k2, C6671K c6671k3, C6671K c6671k4, float f6, long j10) {
        super(1);
        this.f13248Z = j6;
        this.f13249h0 = c5654m;
        this.f13250i0 = c6671k;
        this.f13251j0 = c6671k2;
        this.f13252k0 = c6671k3;
        this.f13253l0 = c6671k4;
        this.f13254m0 = f6;
        this.f13255n0 = j10;
    }
}
