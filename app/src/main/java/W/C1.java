package W;

import E.AbstractC0441z;
import Rb.C1272s;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import h0.C3288a;
import java.util.List;
import kb.AbstractC4208B;
import kb.C4209C;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class C1 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19011Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f19012Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f19013h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f19014i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f19015j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f19016k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f19017l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(2);
        this.f19011Y = i11;
        this.f19013h0 = obj;
        this.f19014i0 = obj2;
        this.f19015j0 = obj3;
        this.f19016k0 = obj4;
        this.f19017l0 = obj5;
        this.f19012Z = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f19011Y;
        Object obj = this.f19017l0;
        Object obj2 = this.f19016k0;
        Object obj3 = this.f19015j0;
        Object obj4 = this.f19014i0;
        int i12 = this.f19012Z;
        Object obj5 = this.f19013h0;
        switch (i11) {
            case 0:
                E1.b((wf.n) obj5, (wf.n) obj4, (wf.n) obj3, (wf.n) obj2, (wf.n) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 1:
                ((C3288a) obj5).f(this.f19014i0, this.f19015j0, this.f19016k0, this.f19017l0, abstractC1725n, AbstractC1734s.p(i12) | 1);
                return;
            case 2:
                na.D0.e((AbstractC0441z) obj5, (na.D1) obj4, (AbstractC6216a) obj3, (AbstractC6216a) obj2, (AbstractC6216a) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 3:
                AbstractC4208B.d((C4209C) obj5, (H.F) obj4, (x9.l) obj3, (wf.k) obj2, (List) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 4:
                Bi.c.K((AbstractC0441z) obj5, (C1272s) obj4, (Rb.C) obj3, (Rb.M) obj2, (wf.k) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            default:
                Bi.c.H((String) obj5, (String) obj4, (id.y) obj3, (AbstractC6216a) obj2, (AbstractC6216a) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f19011Y) {
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
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
