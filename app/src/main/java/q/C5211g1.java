package q;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import i8.C3503u;

/* renamed from: q.g1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5211g1 implements AdapterView.OnItemClickListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f43429Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ View f43430Z;

    public /* synthetic */ C5211g1(View view, int i10) {
        this.f43429Y = i10;
        this.f43430Z = view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j6) {
        Object obj;
        int selectedItemPosition;
        int i11 = this.f43429Y;
        View view2 = this.f43430Z;
        switch (i11) {
            case 0:
                ((SearchView) view2).p(i10);
                return;
            default:
                View view3 = null;
                C3503u c3503u = (C3503u) view2;
                if (i10 < 0) {
                    N0 n02 = c3503u.f32855l0;
                    if (!n02.f43320E0.isShowing()) {
                        obj = null;
                    } else {
                        obj = n02.f43323h0.getSelectedItem();
                    }
                } else {
                    obj = c3503u.getAdapter().getItem(i10);
                }
                C3503u c3503u2 = (C3503u) view2;
                C3503u.a(c3503u2, obj);
                AdapterView.OnItemClickListener onItemClickListener = c3503u2.getOnItemClickListener();
                N0 n03 = c3503u2.f32855l0;
                if (onItemClickListener != null) {
                    if (view == null || i10 < 0) {
                        if (n03.f43320E0.isShowing()) {
                            view3 = n03.f43323h0.getSelectedView();
                        }
                        view = view3;
                        if (!n03.f43320E0.isShowing()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = n03.f43323h0.getSelectedItemPosition();
                        }
                        i10 = selectedItemPosition;
                        if (!n03.f43320E0.isShowing()) {
                            j6 = Long.MIN_VALUE;
                        } else {
                            j6 = n03.f43323h0.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(n03.f43323h0, view, i10, j6);
                }
                n03.dismiss();
                return;
        }
    }
}
