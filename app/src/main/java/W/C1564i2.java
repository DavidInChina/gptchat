package W;

import E.AbstractC0441z;
import Rb.C1272s;
import S8.AbstractC1377v;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import aa.C1939b;
import h0.C3288a;
import java.util.List;
import wf.AbstractC6216a;

/* renamed from: W.i2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1564i2 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20133Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f20134Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f20135h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f20136i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f20137j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f20138k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1564i2(int i10, Sc.c cVar, Sc.n nVar, AbstractC6216a abstractC6216a, wf.k kVar) {
        super(2);
        this.f20133Y = 3;
        this.f20136i0 = abstractC6216a;
        this.f20135h0 = nVar;
        this.f20137j0 = cVar;
        this.f20138k0 = kVar;
        this.f20134Z = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f20133Y;
        Object obj = this.f20138k0;
        Object obj2 = this.f20137j0;
        Object obj3 = this.f20136i0;
        int i12 = this.f20134Z;
        Object obj4 = this.f20135h0;
        switch (i11) {
            case 0:
                A7.b.I((P1) obj4, (AbstractC6216a) obj3, (E.A0) obj2, (wf.n) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 1:
                C3288a c3288a = (C3288a) obj4;
                int p10 = AbstractC1734s.p(i12) | 1;
                c3288a.e(this.f20136i0, this.f20137j0, this.f20138k0, abstractC1725n, p10);
                return;
            case 2:
                AbstractC1377v.a((S8.M) obj4, (S8.C) obj3, (List) obj2, (wf.p) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 3:
                A7.b.J((AbstractC6216a) obj3, (Sc.n) obj4, (Sc.c) obj2, (wf.k) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 4:
                ub.k.d((C1939b) obj4, (AbstractC6216a) obj3, (wf.k) obj2, (wf.k) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 5:
                Kb.q.c((wf.k) obj4, (AbstractC6216a) obj3, (List) obj2, (Fb.f) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            default:
                Bi.c.L((AbstractC0441z) obj4, (C1272s) obj3, (Rb.F) obj2, (wf.k) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f20133Y) {
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
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1564i2(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        super(2);
        this.f20133Y = i11;
        this.f20135h0 = obj;
        this.f20136i0 = obj2;
        this.f20137j0 = obj3;
        this.f20138k0 = obj4;
        this.f20134Z = i10;
    }
}
