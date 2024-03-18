package S8;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* renamed from: S8.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1357a extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16291Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f16292Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ N f16293h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.o f16294i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f16295j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f16296k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1357a(AbstractC4326r abstractC4326r, N n10, wf.o oVar, int i10, int i11, int i12) {
        super(2);
        this.f16291Y = i12;
        this.f16292Z = abstractC4326r;
        this.f16293h0 = n10;
        this.f16294i0 = oVar;
        this.f16295j0 = i10;
        this.f16296k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f16291Y;
        int i12 = this.f16295j0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                P4.a.c(this.f16292Z, this.f16293h0, this.f16294i0, abstractC1725n, p10, this.f16296k0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                T8.e.a(this.f16292Z, this.f16293h0, this.f16294i0, abstractC1725n, p11, this.f16296k0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f16291Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
