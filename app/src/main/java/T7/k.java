package t7;

import V1.C1460a;
import V1.DialogInterface$OnCancelListenerC1475p;
import V1.K;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public class k extends DialogInterface$OnCancelListenerC1475p {

    /* renamed from: q1  reason: collision with root package name */
    public Dialog f45781q1;

    /* renamed from: r1  reason: collision with root package name */
    public DialogInterface.OnCancelListener f45782r1;

    /* renamed from: s1  reason: collision with root package name */
    public AlertDialog f45783s1;

    @Override // V1.DialogInterface$OnCancelListenerC1475p
    public final Dialog P() {
        Dialog dialog = this.f45781q1;
        if (dialog == null) {
            this.f18231h1 = false;
            if (this.f45783s1 == null) {
                Context m10 = m();
                A7.b.k0(m10);
                this.f45783s1 = new AlertDialog.Builder(m10).create();
            }
            return this.f45783s1;
        }
        return dialog;
    }

    public final void Q(K k10, String str) {
        this.f18237n1 = false;
        this.f18238o1 = true;
        k10.getClass();
        C1460a c1460a = new C1460a(k10);
        c1460a.f18146o = true;
        c1460a.e(0, this, str, 1);
        c1460a.d(false);
    }

    @Override // V1.DialogInterface$OnCancelListenerC1475p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f45782r1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
