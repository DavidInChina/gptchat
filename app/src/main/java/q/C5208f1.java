package q;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: q.f1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5208f1 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f43428a;

    public C5208f1(SearchView searchView) {
        this.f43428a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        this.f43428a.s();
        return true;
    }
}
