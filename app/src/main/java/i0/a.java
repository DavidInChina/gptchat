package I0;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import q0.C5252d;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class a extends ActionMode.Callback2 {

    /* renamed from: a  reason: collision with root package name */
    public final b f7942a;

    public a(b bVar) {
        this.f7942a = bVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f7942a.c(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f7942a.d(actionMode, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        AbstractC6216a abstractC6216a = this.f7942a.f7943a;
        if (abstractC6216a != null) {
            abstractC6216a.mo122invoke();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C5252d c5252d = this.f7942a.f7944b;
        if (rect != null) {
            rect.set((int) c5252d.f43625a, (int) c5252d.f43626b, (int) c5252d.f43627c, (int) c5252d.f43628d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f7942a.e(actionMode, menu);
    }
}
