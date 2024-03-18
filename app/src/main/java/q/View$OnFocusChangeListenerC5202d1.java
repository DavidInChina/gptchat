package q;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: q.d1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnFocusChangeListenerC5202d1 implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f43410a;

    public View$OnFocusChangeListenerC5202d1(SearchView searchView) {
        this.f43410a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        SearchView searchView = this.f43410a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f24549R0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z10);
        }
    }
}
