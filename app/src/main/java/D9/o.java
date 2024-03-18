package d9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import gb.D;
import l0.AbstractC4326r;
import r9.y;
import x8.W;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28159Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f28160Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f28161h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f28162i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f28159Y = i12;
        this.f28160Z = abstractC4326r;
        this.f28161h0 = i10;
        this.f28162i0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f28159Y;
        AbstractC4326r abstractC4326r = this.f28160Z;
        int i12 = this.f28162i0;
        int i13 = this.f28161h0;
        switch (i11) {
            case 0:
                q.b(abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 1:
                W.m(abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 2:
                K8.d.D(abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 3:
                A7.b.C(abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 4:
                Ad.l.C(abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 5:
                K8.d.l0(abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 6:
                L4.a.L(abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 7:
                L4.a.t(abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 8:
                D.c(abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 9:
                D.k(abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            default:
                y.L(abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f28159Y) {
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
            case 4:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 5:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 6:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 7:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 8:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 9:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
