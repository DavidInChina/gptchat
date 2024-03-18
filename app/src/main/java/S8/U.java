package S8;

import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import java.util.List;
import k6.AbstractC4194d;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class U extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16273Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f16274Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f16275h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(List list, int i10, int i11) {
        super(2);
        this.f16273Y = i11;
        this.f16274Z = list;
        this.f16275h0 = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        AbstractC1725n abstractC1725n2;
        String str;
        int i11 = this.f16273Y;
        int i12 = this.f16275h0;
        List<List> list = this.f16274Z;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    abstractC1725n2 = abstractC1725n;
                    Z.r rVar = (Z.r) abstractC1725n2;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                } else {
                    abstractC1725n2 = abstractC1725n;
                }
                for (List<wf.n> list2 : list) {
                    if (list2.size() == i12) {
                        for (wf.n nVar : list2) {
                            nVar.invoke(abstractC1725n2, 0);
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                return;
            default:
                AbstractC4326r a5 = io.sentry.compose.b.a("CopyLatexFormulaDropdownMenuItems");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                if (list.size() == 1) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    str = AbstractC4194d.u(rVar3, -2063839654, R.string.conversations_copy_latex_formula, rVar3, false);
                } else {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    rVar4.W(-2063839564);
                    str = Ng.H.w(R.string.conversations_copy_latex_formula_n, new Object[]{Integer.valueOf(i12)}, rVar4);
                    rVar4.t(false);
                }
                j4.b(str, a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f16273Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
