package V1;

import android.app.Dialog;
import android.content.DialogInterface;
import c5.C2294f;
import f5.C2937a;

/* renamed from: V1.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterface$OnCancelListenerC1472m implements DialogInterface.OnCancelListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f18221Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ DialogInterface$OnCancelListenerC1475p f18222Z;

    public /* synthetic */ DialogInterface$OnCancelListenerC1472m(DialogInterface$OnCancelListenerC1475p dialogInterface$OnCancelListenerC1475p, int i10) {
        this.f18221Y = i10;
        this.f18222Z = dialogInterface$OnCancelListenerC1475p;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f18221Y;
        DialogInterface$OnCancelListenerC1475p dialogInterface$OnCancelListenerC1475p = this.f18222Z;
        switch (i10) {
            case 0:
                Dialog dialog = dialogInterface$OnCancelListenerC1475p.f18235l1;
                if (dialog != null) {
                    dialogInterface$OnCancelListenerC1475p.onCancel(dialog);
                    return;
                }
                return;
            default:
                C2294f c2294f = (C2294f) dialogInterface$OnCancelListenerC1475p;
                boolean z10 = c2294f.f26257C1;
                if (!z10) {
                    C2937a.c("Exception", "EC was dismissed before Ready.", new Throwable[0]);
                    c2294f.T("EC was dismissed before Ready");
                    return;
                } else if (z10) {
                    C2937a.d("Info", "OnHide Triggered", new Throwable[0]);
                    c2294f.V();
                    return;
                } else {
                    return;
                }
        }
    }
}
