package p;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import m.DialogInterfaceC4529i;

/* loaded from: classes.dex */
public final class p implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, B {

    /* renamed from: Y  reason: collision with root package name */
    public o f41629Y;

    /* renamed from: Z  reason: collision with root package name */
    public DialogInterfaceC4529i f41630Z;

    /* renamed from: h0  reason: collision with root package name */
    public k f41631h0;

    @Override // p.B
    public final boolean A(o oVar) {
        return false;
    }

    @Override // p.B
    public final void b(o oVar, boolean z10) {
        DialogInterfaceC4529i dialogInterfaceC4529i;
        if ((z10 || oVar == this.f41629Y) && (dialogInterfaceC4529i = this.f41630Z) != null) {
            dialogInterfaceC4529i.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        k kVar = this.f41631h0;
        if (kVar.f41597k0 == null) {
            kVar.f41597k0 = new j(kVar);
        }
        this.f41629Y.q(kVar.f41597k0.getItem(i10), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f41631h0.b(this.f41629Y, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        o oVar = this.f41629Y;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f41630Z.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f41630Z.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                oVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return oVar.performShortcut(i10, keyEvent, 0);
    }
}
