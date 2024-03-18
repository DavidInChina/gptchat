package r9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import wf.AbstractC6216a;
import x8.W;

/* renamed from: r9.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5386c extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44533Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f44534Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f44535h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f44536i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f44537j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5386c(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f44533Y = i12;
        this.f44534Z = abstractC6216a;
        this.f44535h0 = abstractC4326r;
        this.f44536i0 = i10;
        this.f44537j0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f44533Y;
        AbstractC4326r abstractC4326r = this.f44535h0;
        AbstractC6216a abstractC6216a = this.f44534Z;
        int i12 = this.f44537j0;
        int i13 = this.f44536i0;
        switch (i11) {
            case 0:
                K8.d.e(abstractC6216a, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 1:
                W.l(abstractC6216a, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            default:
                K8.d.C(abstractC6216a, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f44533Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
