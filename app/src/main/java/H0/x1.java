package H0;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import android.view.View;
import android.view.ViewParent;
import com.openai.chatgpt.R;
import java.util.Set;
import k0.AbstractC4152b;
import xf.AbstractC6438a;
import xf.AbstractC6443f;

/* loaded from: classes.dex */
public final class x1 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f7067Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ y1 f7068Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f7069h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(y1 y1Var, wf.n nVar, int i10) {
        super(2);
        this.f7067Y = i10;
        this.f7068Z = y1Var;
        this.f7069h0 = nVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        boolean z10;
        Set set;
        View view;
        Object obj;
        int i11 = this.f7067Y;
        wf.n nVar = this.f7069h0;
        y1 y1Var = this.f7068Z;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Z.a(y1Var.f7144Y, nVar, abstractC1725n, 8);
                return;
            default:
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                Object tag = y1Var.f7144Y.getTag(R.id.inspection_slot_table_set);
                if ((tag instanceof Set) && (!(tag instanceof AbstractC6438a) || (tag instanceof AbstractC6443f))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    set = (Set) tag;
                } else {
                    set = null;
                }
                C0714y c0714y = y1Var.f7144Y;
                if (set == null) {
                    ViewParent parent = c0714y.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        obj = view.getTag(R.id.inspection_slot_table_set);
                    } else {
                        obj = null;
                    }
                    if ((obj instanceof Set) && (!(obj instanceof AbstractC6438a) || (obj instanceof AbstractC6443f))) {
                        set = (Set) obj;
                    } else {
                        set = null;
                    }
                }
                if (set != null) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    set.add(rVar3.f22698c);
                    rVar3.f22711p = true;
                    rVar3.f22682B = true;
                }
                AbstractC1734s.e(c0714y, new w1(y1Var, null), abstractC1725n);
                A7.b.k(AbstractC4152b.f36764a.b(set), R4.b.X(abstractC1725n, -1193460702, new x1(y1Var, nVar, 0)), abstractC1725n, 56);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f7067Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
