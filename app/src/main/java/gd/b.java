package Gd;

import Fd.v;
import Qg.AbstractC1206i;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import wf.k;
import wf.n;

/* loaded from: classes.dex */
public final class b extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6271Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f6272Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f6273h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f6274i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f6275j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f6276k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f6277l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AbstractC1206i abstractC1206i, Ld.c cVar, Ld.c cVar2, AbstractC4326r abstractC4326r, int i10, int i11) {
        super(2);
        this.f6275j0 = abstractC1206i;
        this.f6276k0 = cVar;
        this.f6277l0 = cVar2;
        this.f6272Z = abstractC4326r;
        this.f6273h0 = i10;
        this.f6274i0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f6271Y;
        int i12 = this.f6273h0;
        Object obj = this.f6277l0;
        Object obj2 = this.f6276k0;
        Object obj3 = this.f6275j0;
        switch (i11) {
            case 0:
                AbstractC3557B.G((AbstractC1206i) obj3, (Ld.c) obj2, (Ld.c) obj, this.f6272Z, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f6274i0);
                return;
            default:
                int p10 = AbstractC1734s.p(i12 | 1);
                int i13 = this.f6274i0;
                r.f.a((Tc.f) obj3, (k) obj2, this.f6272Z, (v) obj, abstractC1725n, p10, i13);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f6271Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Tc.f fVar, k kVar, AbstractC4326r abstractC4326r, v vVar, int i10, int i11) {
        super(2);
        this.f6275j0 = fVar;
        this.f6276k0 = kVar;
        this.f6272Z = abstractC4326r;
        this.f6277l0 = vVar;
        this.f6273h0 = i10;
        this.f6274i0 = i11;
    }
}
