package N;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.AbstractC3953c;
import l0.AbstractC4326r;
import q9.AbstractC5285b;
import wf.AbstractC6216a;

/* renamed from: N.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1021e extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12307Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f12308Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f12309h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f12310i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f12311j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1021e(int i10, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, boolean z10) {
        super(2);
        this.f12307Y = 4;
        this.f12308Z = z10;
        this.f12311j0 = abstractC6216a;
        this.f12310i0 = abstractC6216a2;
        this.f12309h0 = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f12307Y;
        boolean z10 = this.f12308Z;
        int i12 = this.f12309h0;
        Object obj = this.f12310i0;
        Object obj2 = this.f12311j0;
        switch (i11) {
            case 0:
                M3.H.i((AbstractC4326r) obj, (AbstractC6216a) obj2, z10, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 1:
                Ng.H.g(z10, (Y0.h) obj, (t0) obj2, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 2:
                M3.H.c((S8.M) obj, z10, (wf.p) obj2, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 3:
                AbstractC5285b.a((String) obj, z10, (wf.o) obj2, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            default:
                Id.f.b(z10, (AbstractC6216a) obj2, (AbstractC6216a) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f12307Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1021e(Object obj, boolean z10, AbstractC3953c abstractC3953c, int i10, int i11) {
        super(2);
        this.f12307Y = i11;
        this.f12310i0 = obj;
        this.f12308Z = z10;
        this.f12311j0 = abstractC3953c;
        this.f12309h0 = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1021e(AbstractC4326r abstractC4326r, AbstractC6216a abstractC6216a, boolean z10, int i10) {
        super(2);
        this.f12307Y = 0;
        this.f12310i0 = abstractC4326r;
        this.f12311j0 = abstractC6216a;
        this.f12308Z = z10;
        this.f12309h0 = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1021e(boolean z10, Y0.h hVar, t0 t0Var, int i10) {
        super(2);
        this.f12307Y = 1;
        this.f12308Z = z10;
        this.f12310i0 = hVar;
        this.f12311j0 = t0Var;
        this.f12309h0 = i10;
    }
}
