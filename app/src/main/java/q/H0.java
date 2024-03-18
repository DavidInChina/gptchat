package q;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class H0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f43299Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f43300Z;

    public /* synthetic */ H0(int i10, Object obj) {
        this.f43299Y = i10;
        this.f43300Z = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j6) {
        A0 a02;
        int i11 = this.f43299Y;
        Object obj = this.f43300Z;
        switch (i11) {
            case 0:
                if (i10 != -1 && (a02 = ((N0) obj).f43323h0) != null) {
                    a02.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) obj).q(i10);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
