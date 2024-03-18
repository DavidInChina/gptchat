package V1;

import android.app.Dialog;
import android.view.View;
import n.AbstractC4694e;

/* renamed from: V1.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1474o extends AbstractC4694e {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC4694e f18224Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ DialogInterface$OnCancelListenerC1475p f18225Z;

    public C1474o(DialogInterface$OnCancelListenerC1475p dialogInterface$OnCancelListenerC1475p, C1477s c1477s) {
        this.f18225Z = dialogInterface$OnCancelListenerC1475p;
        this.f18224Y = c1477s;
    }

    @Override // n.AbstractC4694e
    public final View k(int i10) {
        AbstractC4694e abstractC4694e = this.f18224Y;
        if (abstractC4694e.l()) {
            return abstractC4694e.k(i10);
        }
        Dialog dialog = this.f18225Z.f18235l1;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // n.AbstractC4694e
    public final boolean l() {
        if (!this.f18224Y.l() && !this.f18225Z.f18239p1) {
            return false;
        }
        return true;
    }
}
