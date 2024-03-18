package qa;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import wf.AbstractC6216a;
import wf.n;

/* renamed from: qa.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5292b extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44010Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f44011Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5295e f44012h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f44013i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f44014j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f44015k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f44016l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5292b(Tc.f fVar, C5295e c5295e, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f44010Y = i12;
        this.f44011Z = fVar;
        this.f44012h0 = c5295e;
        this.f44013i0 = abstractC6216a;
        this.f44014j0 = abstractC4326r;
        this.f44015k0 = i10;
        this.f44016l0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f44010Y;
        int i12 = this.f44015k0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                K8.d.p(this.f44011Z, this.f44012h0, this.f44013i0, this.f44014j0, abstractC1725n, p10, this.f44016l0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                K8.d.q(this.f44011Z, this.f44012h0, this.f44013i0, this.f44014j0, abstractC1725n, p11, this.f44016l0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f44010Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
