package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import io.sentry.android.core.AbstractC3612c;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ SearchView f24621Y;

    public a(SearchView searchView) {
        this.f24621Y = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        SearchView searchView = this.f24621Y;
        ImageView imageView = searchView.f24532A0;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f24566w0;
        if (view == imageView) {
            searchView.y(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f24550S0;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
            }
        } else if (view == searchView.f24534C0) {
            searchView.o();
        } else if (view == searchView.f24533B0) {
            searchView.s();
        } else if (view == searchView.f24535D0) {
            SearchableInfo searchableInfo = searchView.f24562f1;
            if (searchableInfo != null) {
                try {
                    if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        Intent intent = new Intent(searchView.f24546O0);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        if (searchActivity == null) {
                            str = null;
                        } else {
                            str = searchActivity.flattenToShortString();
                        }
                        intent.putExtra("calling_package", str);
                        searchView.getContext().startActivity(intent);
                    } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.m(searchView.f24547P0, searchableInfo));
                    }
                } catch (ActivityNotFoundException unused) {
                    AbstractC3612c.r("SearchView", "Could not find voice search activity");
                }
            }
        } else if (view == searchAutoComplete) {
            searchView.n();
        }
    }
}
