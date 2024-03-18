package q;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: q.b1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5196b1 implements TextWatcher {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f43401Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f43402Z;

    public /* synthetic */ C5196b1(ViewGroup viewGroup, int i10) {
        this.f43401Y = i10;
        this.f43402Z = viewGroup;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f43401Y) {
            case 0:
                return;
            default:
                TextInputLayout textInputLayout = (TextInputLayout) this.f43402Z;
                textInputLayout.u(!textInputLayout.f27264D1, false);
                if (textInputLayout.f27313r0) {
                    textInputLayout.n(editable);
                }
                if (textInputLayout.f27329z0) {
                    textInputLayout.v(editable);
                    return;
                }
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f43401Y) {
            case 0:
                SearchView searchView = (SearchView) this.f43402Z;
                Editable text = searchView.f24566w0.getText();
                searchView.f24559c1 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.x(!isEmpty);
                int i13 = 8;
                if (searchView.b1 && !searchView.f24552U0 && isEmpty) {
                    searchView.f24533B0.setVisibility(8);
                    i13 = 0;
                }
                searchView.f24535D0.setVisibility(i13);
                searchView.t();
                searchView.w();
                charSequence.toString();
                searchView.getClass();
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
