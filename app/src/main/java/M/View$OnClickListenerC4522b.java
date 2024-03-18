package m;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import q.v1;

/* renamed from: m.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class View$OnClickListenerC4522b implements View.OnClickListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38728Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f38729Z;

    public /* synthetic */ View$OnClickListenerC4522b(int i10, Object obj) {
        this.f38728Y = i10;
        this.f38729Z = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p.q qVar;
        int i10 = this.f38728Y;
        Object obj = this.f38729Z;
        switch (i10) {
            case 0:
                C4527g c4527g = (C4527g) obj;
                Button button = c4527g.f38750f;
                c4527g.f38767w.obtainMessage(1, c4527g.f38746b).sendToTarget();
                return;
            case 1:
                v1 v1Var = ((Toolbar) obj).f24592S0;
                if (v1Var == null) {
                    qVar = null;
                } else {
                    qVar = v1Var.f43571Z;
                }
                if (qVar != null) {
                    qVar.collapseActionView();
                    return;
                }
                return;
            default:
                com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) obj;
                int i11 = kVar.f27150e1;
                if (i11 == 2) {
                    kVar.P(1);
                    return;
                } else if (i11 == 1) {
                    kVar.P(2);
                    return;
                } else {
                    return;
                }
        }
    }
}
