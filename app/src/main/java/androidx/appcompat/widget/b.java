package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ SearchView f24622Y;

    public b(SearchView searchView) {
        this.f24622Y = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        int i11;
        SearchView searchView = this.f24622Y;
        if (searchView.f24562f1 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f24566w0;
        if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
            if (searchView.f24562f1 == null || searchView.f24553V0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i10 != 66 && i10 != 84 && i10 != 61) {
                if (i10 != 21 && i10 != 22) {
                    if (i10 != 19) {
                        return false;
                    }
                    searchAutoComplete.getListSelection();
                    return false;
                }
                if (i10 == 21) {
                    i11 = 0;
                } else {
                    i11 = searchAutoComplete.length();
                }
                searchAutoComplete.setSelection(i11);
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.a();
            } else {
                searchView.p(searchAutoComplete.getListSelection());
            }
            return true;
        } else if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
            return false;
        } else {
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.l("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
    }
}
