package H0;

import android.view.ActionMode;
import android.view.View;

/* loaded from: classes.dex */
public final class V0 {

    /* renamed from: a  reason: collision with root package name */
    public static final V0 f6882a = new Object();

    public final void a(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(View view, ActionMode.Callback callback, int i10) {
        return view.startActionMode(callback, i10);
    }
}
