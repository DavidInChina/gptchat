package W;

import Z.AbstractC1725n;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class L2 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19335Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E.A0 f19336Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ E0.o0 f19337h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ List f19338i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f19339j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ List f19340k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Integer f19341l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.o f19342m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L2(E.A0 a02, E0.o0 o0Var, ArrayList arrayList, int i10, ArrayList arrayList2, Integer num, wf.o oVar, int i11) {
        super(2);
        this.f19335Y = i11;
        this.f19336Z = a02;
        this.f19337h0 = o0Var;
        this.f19338i0 = arrayList;
        this.f19339j0 = i10;
        this.f19340k0 = arrayList2;
        this.f19341l0 = num;
        this.f19342m0 = oVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        float f6;
        float f10;
        float f11;
        float f12;
        int i11 = this.f19335Y;
        wf.o oVar = this.f19342m0;
        Integer num = this.f19341l0;
        List list = this.f19340k0;
        int i12 = this.f19339j0;
        List list2 = this.f19338i0;
        E0.o0 o0Var = this.f19337h0;
        E.A0 a02 = this.f19336Z;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                E.U u10 = new E.U(a02, o0Var);
                if (list2.isEmpty()) {
                    f6 = u10.d();
                } else {
                    f6 = o0Var.J(i12);
                }
                if (!list.isEmpty() && num != null) {
                    f10 = o0Var.J(num.intValue());
                } else {
                    f10 = u10.a();
                }
                oVar.invoke(new E.i0(androidx.compose.foundation.layout.a.h(u10, o0Var.getLayoutDirection()), f6, androidx.compose.foundation.layout.a.g(u10, o0Var.getLayoutDirection()), f10), abstractC1725n, 0);
                return;
            default:
                if ((i10 & 3) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                E.U u11 = new E.U(a02, o0Var);
                if (list2.isEmpty()) {
                    f11 = u11.d();
                } else {
                    f11 = o0Var.J(i12);
                }
                if (!list.isEmpty() && num != null) {
                    f12 = o0Var.J(num.intValue());
                } else {
                    f12 = u11.a();
                }
                oVar.invoke(new E.i0(androidx.compose.foundation.layout.a.h(u11, o0Var.getLayoutDirection()), f11, androidx.compose.foundation.layout.a.g(u11, o0Var.getLayoutDirection()), f12), abstractC1725n, 0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f19335Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
