package t7;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: t7.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogFragmentC5681c extends DialogFragment {

    /* renamed from: Y  reason: collision with root package name */
    public Dialog f45764Y;

    /* renamed from: Z  reason: collision with root package name */
    public DialogInterface.OnCancelListener f45765Z;

    /* renamed from: h0  reason: collision with root package name */
    public AlertDialog f45766h0;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f45765Z;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f45764Y;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f45766h0 == null) {
                Activity activity = getActivity();
                A7.b.k0(activity);
                this.f45766h0 = new AlertDialog.Builder(activity).create();
            }
            return this.f45766h0;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
