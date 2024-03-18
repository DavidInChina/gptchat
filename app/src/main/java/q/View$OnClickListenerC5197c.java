package q;

import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionBarContextView;
import p.C5025a;

/* renamed from: q.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnClickListenerC5197c implements View.OnClickListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f43403Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f43404Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f43405h0;

    public View$OnClickListenerC5197c(ActionBarContextView actionBarContextView, androidx.appcompat.view.c cVar) {
        this.f43405h0 = actionBarContextView;
        this.f43404Z = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f43403Y;
        Object obj = this.f43404Z;
        switch (i10) {
            case 0:
                ((androidx.appcompat.view.c) obj).a();
                return;
            default:
                z1 z1Var = (z1) this.f43405h0;
                Window.Callback callback = z1Var.f43608k;
                if (callback != null && z1Var.f43609l) {
                    callback.onMenuItemSelected(0, (C5025a) obj);
                    return;
                }
                return;
        }
    }

    public View$OnClickListenerC5197c(z1 z1Var) {
        this.f43405h0 = z1Var;
        this.f43404Z = new C5025a(z1Var.f43598a.getContext(), z1Var.f43605h);
    }
}
