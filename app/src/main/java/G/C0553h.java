package G;

import B.AbstractC0130h1;
import z.C6712n;
import z.C6716p;

/* renamed from: G.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0553h extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC0556k f5504Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f5505Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f5506h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f5507i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0130h1 f5508j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f5509k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f5510l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ float f5511m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z f5512n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ int f5513o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ int f5514p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f5515q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0553h(AbstractC0556k abstractC0556k, int i10, float f6, kotlin.jvm.internal.y yVar, AbstractC0130h1 abstractC0130h1, kotlin.jvm.internal.x xVar, boolean z10, float f10, kotlin.jvm.internal.z zVar, int i11, int i12, kotlin.jvm.internal.B b10) {
        super(1);
        this.f5504Y = abstractC0556k;
        this.f5505Z = i10;
        this.f5506h0 = f6;
        this.f5507i0 = yVar;
        this.f5508j0 = abstractC0130h1;
        this.f5509k0 = xVar;
        this.f5510l0 = z10;
        this.f5511m0 = f10;
        this.f5512n0 = zVar;
        this.f5513o0 = i11;
        this.f5514p0 = i12;
        this.f5515q0 = b10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        float f6;
        C6712n c6712n = (C6712n) obj;
        AbstractC0556k abstractC0556k = this.f5504Y;
        int i10 = this.f5505Z;
        boolean a5 = AbstractC0555j.a(abstractC0556k, i10);
        kotlin.jvm.internal.x xVar = this.f5509k0;
        int i11 = this.f5514p0;
        boolean z10 = this.f5510l0;
        if (!a5) {
            float f10 = this.f5506h0;
            if (f10 > 0.0f) {
                f6 = com.google.android.gms.internal.play_billing.N.l(((Number) c6712n.f51333e.getValue()).floatValue(), f10);
            } else {
                f6 = com.google.android.gms.internal.play_billing.N.j(((Number) c6712n.f51333e.getValue()).floatValue(), f10);
            }
            kotlin.jvm.internal.y yVar = this.f5507i0;
            float f11 = f6 - yVar.f37646Y;
            float a10 = this.f5508j0.a(f11);
            if (!AbstractC0555j.a(abstractC0556k, i10) && !C0554i.p(z10, abstractC0556k, i10, i11)) {
                if (f11 == a10) {
                    yVar.f37646Y += f11;
                    float f12 = this.f5511m0;
                    if (z10) {
                        if (((Number) c6712n.f51333e.getValue()).floatValue() > f12) {
                            c6712n.a();
                        }
                    } else if (((Number) c6712n.f51333e.getValue()).floatValue() < (-f12)) {
                        c6712n.a();
                    }
                    int i12 = this.f5513o0;
                    kotlin.jvm.internal.z zVar = this.f5512n0;
                    if (z10) {
                        if (zVar.f37647Y >= 2 && i10 - abstractC0556k.b() > i12) {
                            abstractC0556k.e(i10 - i12, 0);
                        }
                    } else if (zVar.f37647Y >= 2 && abstractC0556k.g() - i10 > i12) {
                        abstractC0556k.e(i12 + i10, 0);
                    }
                } else {
                    c6712n.a();
                    xVar.f37645Y = false;
                    return jf.y.f36177a;
                }
            }
        }
        if (C0554i.p(z10, abstractC0556k, i10, i11)) {
            abstractC0556k.e(i10, i11);
            xVar.f37645Y = false;
            c6712n.a();
        } else if (AbstractC0555j.a(abstractC0556k, i10)) {
            throw new C0552g(abstractC0556k.c(i10), (C6716p) this.f5515q0.f37622Y);
        }
        return jf.y.f36177a;
    }
}
