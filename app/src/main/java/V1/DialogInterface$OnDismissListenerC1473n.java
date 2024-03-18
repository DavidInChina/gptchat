package V1;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: V1.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterface$OnDismissListenerC1473n implements DialogInterface.OnDismissListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ DialogInterface$OnCancelListenerC1475p f18223Y;

    public DialogInterface$OnDismissListenerC1473n(DialogInterface$OnCancelListenerC1475p dialogInterface$OnCancelListenerC1475p) {
        this.f18223Y = dialogInterface$OnCancelListenerC1475p;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterface$OnCancelListenerC1475p dialogInterface$OnCancelListenerC1475p = this.f18223Y;
        Dialog dialog = dialogInterface$OnCancelListenerC1475p.f18235l1;
        if (dialog != null) {
            dialogInterface$OnCancelListenerC1475p.onDismiss(dialog);
        }
    }
}
