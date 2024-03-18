package q;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import com.openai.chatgpt.R;

/* renamed from: q.e1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnLayoutChangeListenerC5205e1 implements View.OnLayoutChangeListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f43413Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f43414Z;

    public /* synthetic */ View$OnLayoutChangeListenerC5205e1(int i10, Object obj) {
        this.f43413Y = i10;
        this.f43414Z = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        int i20 = this.f43413Y;
        Object obj = this.f43414Z;
        switch (i20) {
            case 0:
                SearchView searchView = (SearchView) obj;
                View view2 = searchView.f24536E0;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f24568y0.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a5 = G1.a(searchView);
                    if (searchView.f24551T0) {
                        i18 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                    } else {
                        i18 = 0;
                    }
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f24566w0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    if (a5) {
                        i19 = -rect.left;
                    } else {
                        i19 = paddingLeft - (rect.left + i18);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i19);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i18) - paddingLeft);
                    return;
                }
                return;
            default:
                ((BottomAppBar$Behavior) obj).getClass();
                throw null;
        }
    }
}
