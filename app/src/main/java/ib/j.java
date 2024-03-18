package ib;

import A.C0046u0;
import H.F;
import L.M;
import W.AbstractC1522a0;
import W.S2;
import Z.AbstractC1725n;
import Z.r;
import java.util.List;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import r9.C5383F;
import wf.AbstractC6216a;
import wf.n;

/* loaded from: classes.dex */
public final class j extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32928Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f32929Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f32930h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f32931i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ List f32932j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ F f32933k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ wf.k f32934l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(AbstractC6216a abstractC6216a, boolean z10, wf.k kVar, List list, F f6, wf.k kVar2, int i10) {
        super(2);
        this.f32928Y = i10;
        this.f32929Z = abstractC6216a;
        this.f32930h0 = z10;
        this.f32931i0 = kVar;
        this.f32932j0 = list;
        this.f32933k0 = f6;
        this.f32934l0 = kVar2;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f32928Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("ImagesDialog");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC1522a0.d(d.f32916a, a5, R4.b.X(abstractC1725n, 1763513114, new C5383F(this.f32929Z, 2)), R4.b.X(abstractC1725n, -896825647, new M(this.f32930h0, this.f32931i0, this.f32932j0, this.f32933k0, this.f32934l0, 3)), null, null, null, abstractC1725n, 3462, 114);
                return;
            default:
                AbstractC4326r a10 = io.sentry.compose.b.a("ImagesDialog");
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                S2.b(a10, R4.b.X(abstractC1725n, 898707616, new j(this.f32929Z, this.f32930h0, this.f32931i0, this.f32932j0, this.f32933k0, this.f32934l0, 0)), null, null, null, 0, 0L, 0L, null, R4.b.X(abstractC1725n, -798480277, new C0046u0(this.f32933k0, 15, this.f32932j0)), abstractC1725n, 805306416, 509);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f32928Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
