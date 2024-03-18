package A;

import q0.AbstractC5249a;
import q0.C5254f;
import r0.AbstractC5350n;
import t0.AbstractC5646e;
import t0.AbstractC5648g;
import t0.C5643b;
import t0.C5644c;
import t0.C5645d;
import t0.C5654m;

/* renamed from: A.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0047v extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f306Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC5350n f307Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f308h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ float f309i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ float f310j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ long f311k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ long f312l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ C5654m f313m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0047v(boolean z10, AbstractC5350n abstractC5350n, long j6, float f6, float f10, long j10, long j11, C5654m c5654m) {
        super(1);
        this.f306Y = z10;
        this.f307Z = abstractC5350n;
        this.f308h0 = j6;
        this.f309i0 = f6;
        this.f310j0 = f10;
        this.f311k0 = j10;
        this.f312l0 = j11;
        this.f313m0 = c5654m;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        G0.J j6 = (G0.J) ((AbstractC5646e) obj);
        j6.a();
        if (this.f306Y) {
            AbstractC5648g.l(j6, this.f307Z, 0L, 0L, this.f308h0, null, 246);
        } else {
            long j10 = this.f308h0;
            float b10 = AbstractC5249a.b(j10);
            float f6 = this.f309i0;
            if (b10 < f6) {
                C5644c c5644c = j6.f5596Y;
                float d10 = C5254f.d(c5644c.g());
                float f10 = this.f310j0;
                float b11 = C5254f.b(c5644c.g()) - f10;
                C5643b c5643b = c5644c.f45612Z;
                long b12 = c5643b.b();
                c5643b.a().h();
                C5645d c5645d = c5643b.f45609a;
                float f11 = this.f310j0;
                c5645d.a(f11, f11, d10 - f10, b11, 0);
                AbstractC5648g.l(j6, this.f307Z, 0L, 0L, this.f308h0, null, 246);
                c5643b.a().q();
                c5643b.c(b12);
            } else {
                AbstractC5648g.l(j6, this.f307Z, this.f311k0, this.f312l0, androidx.compose.foundation.a.m(f6, j10), this.f313m0, 208);
            }
        }
        return jf.y.f36177a;
    }
}
