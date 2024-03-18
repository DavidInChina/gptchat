package C;

import B.AbstractC0130h1;
import Z.C1724m0;
import kotlin.jvm.internal.y;
import z.C6712n;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2468Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f2469Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ y f2470h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0130h1 f2471i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f2472j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(float f6, y yVar, AbstractC0130h1 abstractC0130h1, e eVar, int i10) {
        super(1);
        this.f2468Y = i10;
        this.f2469Z = f6;
        this.f2470h0 = yVar;
        this.f2471i0 = abstractC0130h1;
        this.f2472j0 = eVar;
    }

    public final void a(C6712n c6712n) {
        int i10 = this.f2468Y;
        wf.k kVar = this.f2472j0;
        AbstractC0130h1 abstractC0130h1 = this.f2471i0;
        y yVar = this.f2470h0;
        float f6 = this.f2469Z;
        switch (i10) {
            case 0:
                int i11 = (Math.abs(((Number) c6712n.f51333e.getValue()).floatValue()) > Math.abs(f6) ? 1 : (Math.abs(((Number) c6712n.f51333e.getValue()).floatValue()) == Math.abs(f6) ? 0 : -1));
                C1724m0 c1724m0 = c6712n.f51333e;
                if (i11 >= 0) {
                    float c10 = n.c(((Number) c1724m0.getValue()).floatValue(), f6);
                    float f10 = c10 - yVar.f37646Y;
                    float a5 = abstractC0130h1.a(f10);
                    kVar.invoke(Float.valueOf(a5));
                    if (Math.abs(f10 - a5) > 0.5f) {
                        c6712n.a();
                    }
                    c6712n.a();
                    yVar.f37646Y = c10;
                    return;
                }
                float floatValue = ((Number) c1724m0.getValue()).floatValue() - yVar.f37646Y;
                float a10 = abstractC0130h1.a(floatValue);
                kVar.invoke(Float.valueOf(a10));
                if (Math.abs(floatValue - a10) > 0.5f) {
                    c6712n.a();
                }
                yVar.f37646Y = ((Number) c1724m0.getValue()).floatValue();
                return;
            default:
                float c11 = n.c(((Number) c6712n.f51333e.getValue()).floatValue(), f6);
                float f11 = c11 - yVar.f37646Y;
                float a11 = abstractC0130h1.a(f11);
                kVar.invoke(Float.valueOf(a11));
                if (Math.abs(f11 - a11) > 0.5f || c11 != ((Number) c6712n.f51333e.getValue()).floatValue()) {
                    c6712n.a();
                }
                yVar.f37646Y += a11;
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f2468Y) {
            case 0:
                a((C6712n) obj);
                return yVar;
            default:
                a((C6712n) obj);
                return yVar;
        }
    }
}
