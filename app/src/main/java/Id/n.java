package id;

import Z.AbstractC1725n;
import Z.AbstractC1734s;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f33108Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ x f33109Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C3556A f33110h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f33111i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f33112j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(x xVar, C3556A c3556a, wf.k kVar, int i10, int i11) {
        super(2);
        this.f33108Y = i11;
        this.f33109Z = xVar;
        this.f33110h0 = c3556a;
        this.f33111i0 = kVar;
        this.f33112j0 = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f33108Y;
        wf.k kVar = this.f33111i0;
        C3556A c3556a = this.f33110h0;
        x xVar = this.f33109Z;
        int i12 = this.f33112j0;
        switch (i11) {
            case 0:
                Bi.c.x(xVar, c3556a, kVar, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            default:
                Bi.c.y(xVar, c3556a, kVar, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f33108Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
