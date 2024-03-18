package q;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import io.sentry.android.core.AbstractC3612c;
import m.C4524d;
import m.C4528h;
import m.DialogInterfaceC4529i;

/* loaded from: classes.dex */
public final class P implements V, DialogInterface.OnClickListener {

    /* renamed from: Y  reason: collision with root package name */
    public DialogInterfaceC4529i f43342Y;

    /* renamed from: Z  reason: collision with root package name */
    public ListAdapter f43343Z;

    /* renamed from: h0  reason: collision with root package name */
    public CharSequence f43344h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ W f43345i0;

    public P(W w10) {
        this.f43345i0 = w10;
    }

    @Override // q.V
    public final boolean a() {
        DialogInterfaceC4529i dialogInterfaceC4529i = this.f43342Y;
        if (dialogInterfaceC4529i != null) {
            return dialogInterfaceC4529i.isShowing();
        }
        return false;
    }

    @Override // q.V
    public final int b() {
        return 0;
    }

    @Override // q.V
    public final void c(int i10) {
        AbstractC3612c.c("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // q.V
    public final CharSequence d() {
        return this.f43344h0;
    }

    @Override // q.V
    public final void dismiss() {
        DialogInterfaceC4529i dialogInterfaceC4529i = this.f43342Y;
        if (dialogInterfaceC4529i != null) {
            dialogInterfaceC4529i.dismiss();
            this.f43342Y = null;
        }
    }

    @Override // q.V
    public final Drawable e() {
        return null;
    }

    @Override // q.V
    public final void i(CharSequence charSequence) {
        this.f43344h0 = charSequence;
    }

    @Override // q.V
    public final void j(Drawable drawable) {
        AbstractC3612c.c("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // q.V
    public final void k(int i10) {
        AbstractC3612c.c("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // q.V
    public final void l(int i10) {
        AbstractC3612c.c("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // q.V
    public final void m(int i10, int i11) {
        if (this.f43343Z == null) {
            return;
        }
        W w10 = this.f43345i0;
        C4528h c4528h = new C4528h(w10.getPopupContext());
        CharSequence charSequence = this.f43344h0;
        if (charSequence != null) {
            ((C4524d) c4528h.f38770Z).f38736d = charSequence;
        }
        ListAdapter listAdapter = this.f43343Z;
        int selectedItemPosition = w10.getSelectedItemPosition();
        C4524d c4524d = (C4524d) c4528h.f38770Z;
        c4524d.f38739g = listAdapter;
        c4524d.f38740h = this;
        c4524d.f38742j = selectedItemPosition;
        c4524d.f38741i = true;
        DialogInterfaceC4529i k10 = c4528h.k();
        this.f43342Y = k10;
        AlertController$RecycleListView alertController$RecycleListView = k10.f38773k0.f38749e;
        N.d(alertController$RecycleListView, i10);
        N.c(alertController$RecycleListView, i11);
        this.f43342Y.show();
    }

    @Override // q.V
    public final int n() {
        return 0;
    }

    @Override // q.V
    public final void o(ListAdapter listAdapter) {
        this.f43343Z = listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        W w10 = this.f43345i0;
        w10.setSelection(i10);
        if (w10.getOnItemClickListener() != null) {
            w10.performItemClick(null, i10, this.f43343Z.getItemId(i10));
        }
        dismiss();
    }
}
