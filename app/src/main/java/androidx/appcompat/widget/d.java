package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f24623Y;

    public d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f24623Y = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f24623Y;
        if (searchAutoComplete.f24572n0) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f24572n0 = false;
        }
    }
}
