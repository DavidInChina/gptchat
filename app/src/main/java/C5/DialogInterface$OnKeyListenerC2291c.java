package c5;

import android.content.DialogInterface;
import android.view.KeyEvent;
import f5.C2937a;

/* renamed from: c5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterface$OnKeyListenerC2291c implements DialogInterface.OnKeyListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C2294f f26250Y;

    public DialogInterface$OnKeyListenerC2291c(C2294f c2294f) {
        this.f26250Y = c2294f;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        if (i10 == 4 && keyEvent.getAction() == 1) {
            C2294f c2294f = this.f26250Y;
            if (!c2294f.f26255A1) {
                return true;
            }
            C2937a.d("Info", "OnHide Triggered", new Throwable[0]);
            c2294f.V();
        }
        return false;
    }
}
