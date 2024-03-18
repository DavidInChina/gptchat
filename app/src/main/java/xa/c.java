package Xa;

import E.AbstractC0438w;
import Tc.f;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import cb.C2334C;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import wf.k;
import wf.n;
import x8.W;

/* loaded from: classes.dex */
public final class c extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f21808Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC0438w f21809Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ f f21810h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C2334C f21811i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f21812j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ k f21813k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f21814l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f21815m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AbstractC0438w abstractC0438w, f fVar, C2334C c2334c, AbstractC4326r abstractC4326r, k kVar, int i10, int i11, int i12) {
        super(2);
        this.f21808Y = i12;
        this.f21809Z = abstractC0438w;
        this.f21810h0 = fVar;
        this.f21811i0 = c2334c;
        this.f21812j0 = abstractC4326r;
        this.f21813k0 = kVar;
        this.f21814l0 = i10;
        this.f21815m0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f21808Y;
        int i12 = this.f21814l0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                W.i(this.f21809Z, this.f21810h0, this.f21811i0, this.f21812j0, this.f21813k0, abstractC1725n, p10, this.f21815m0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                W.i(this.f21809Z, this.f21810h0, this.f21811i0, this.f21812j0, this.f21813k0, abstractC1725n, p11, this.f21815m0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f21808Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
