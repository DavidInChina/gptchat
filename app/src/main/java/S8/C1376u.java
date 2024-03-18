package S8;

import E.g0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import java.util.List;
import jf.AbstractC3953c;
import l0.AbstractC4326r;

/* renamed from: S8.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1376u extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16375Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f16376Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f16377h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f16378i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f16379j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3953c f16380k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f16381l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1376u(int i10, float f6, g0 g0Var, wf.o oVar, wf.o oVar2, int i11) {
        super(2);
        this.f16376Z = i10;
        this.f16377h0 = f6;
        this.f16379j0 = g0Var;
        this.f16380k0 = oVar;
        this.f16381l0 = oVar2;
        this.f16378i0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f16375Y;
        int i12 = this.f16378i0;
        Object obj = this.f16381l0;
        AbstractC3953c abstractC3953c = this.f16380k0;
        Object obj2 = this.f16379j0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                AbstractC1377v.b(this.f16376Z, this.f16377h0, (g0) obj2, (wf.o) abstractC3953c, (wf.o) obj, abstractC1725n, p10);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                K8.d.V(this.f16376Z, (List) obj2, (wf.k) abstractC3953c, this.f16377h0, (AbstractC4326r) obj, abstractC1725n, p11);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f16375Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1376u(int i10, List list, wf.k kVar, float f6, AbstractC4326r abstractC4326r, int i11) {
        super(2);
        this.f16376Z = i10;
        this.f16379j0 = list;
        this.f16380k0 = kVar;
        this.f16377h0 = f6;
        this.f16381l0 = abstractC4326r;
        this.f16378i0 = i11;
    }
}
