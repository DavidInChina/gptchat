package S7;

import D1.AbstractC0366n0;
import D1.J0;
import D1.v0;
import U3.l;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends AbstractC0366n0 {

    /* renamed from: h0  reason: collision with root package name */
    public final View f16200h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f16201i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f16202j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int[] f16203k0 = new int[2];

    public d(View view) {
        super(0);
        this.f16200h0 = view;
    }

    @Override // D1.AbstractC0366n0
    public final void a(v0 v0Var) {
        this.f16200h0.setTranslationY(0.0f);
    }

    @Override // D1.AbstractC0366n0
    public final void b() {
        View view = this.f16200h0;
        int[] iArr = this.f16203k0;
        view.getLocationOnScreen(iArr);
        this.f16201i0 = iArr[1];
    }

    @Override // D1.AbstractC0366n0
    public final J0 c(J0 j02, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            v0 v0Var = (v0) it.next();
            if ((v0Var.f3309a.c() & 8) != 0) {
                int i10 = this.f16202j0;
                this.f16200h0.setTranslationY(P7.a.c(v0Var.f3309a.b(), i10, 0));
                break;
            }
        }
        return j02;
    }

    @Override // D1.AbstractC0366n0
    public final l d(l lVar) {
        View view = this.f16200h0;
        int[] iArr = this.f16203k0;
        view.getLocationOnScreen(iArr);
        int i10 = this.f16201i0 - iArr[1];
        this.f16202j0 = i10;
        view.setTranslationY(i10);
        return lVar;
    }
}
