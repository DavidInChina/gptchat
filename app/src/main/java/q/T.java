package q;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.openai.chatgpt.R;
import m.C4523c;
import p.ViewTreeObserver$OnGlobalLayoutListenerC5029e;

/* loaded from: classes.dex */
public final class T extends N0 implements V {

    /* renamed from: I0  reason: collision with root package name */
    public CharSequence f43354I0;

    /* renamed from: J0  reason: collision with root package name */
    public ListAdapter f43355J0;

    /* renamed from: K0  reason: collision with root package name */
    public final Rect f43356K0 = new Rect();

    /* renamed from: L0  reason: collision with root package name */
    public int f43357L0;

    /* renamed from: M0  reason: collision with root package name */
    public final /* synthetic */ W f43358M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(W w10, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f43358M0 = w10;
        this.f43335t0 = w10;
        this.f43319D0 = true;
        this.f43320E0.setFocusable(true);
        this.f43336u0 = new C4523c(this, 1, w10);
    }

    @Override // q.V
    public final CharSequence d() {
        return this.f43354I0;
    }

    @Override // q.V
    public final void i(CharSequence charSequence) {
        this.f43354I0 = charSequence;
    }

    @Override // q.V
    public final void l(int i10) {
        this.f43357L0 = i10;
    }

    @Override // q.V
    public final void m(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        F f6 = this.f43320E0;
        boolean isShowing = f6.isShowing();
        r();
        this.f43320E0.setInputMethodMode(2);
        f();
        A0 a02 = this.f43323h0;
        a02.setChoiceMode(1);
        N.d(a02, i10);
        N.c(a02, i11);
        W w10 = this.f43358M0;
        int selectedItemPosition = w10.getSelectedItemPosition();
        A0 a03 = this.f43323h0;
        if (f6.isShowing() && a03 != null) {
            a03.setListSelectionHidden(false);
            a03.setSelection(selectedItemPosition);
            if (a03.getChoiceMode() != 0) {
                a03.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = w10.getViewTreeObserver()) != null) {
            ViewTreeObserver$OnGlobalLayoutListenerC5029e viewTreeObserver$OnGlobalLayoutListenerC5029e = new ViewTreeObserver$OnGlobalLayoutListenerC5029e(3, this);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC5029e);
            this.f43320E0.setOnDismissListener(new S(this, viewTreeObserver$OnGlobalLayoutListenerC5029e));
        }
    }

    @Override // q.N0, q.V
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f43355J0 = listAdapter;
    }

    public final void r() {
        int i10;
        int i11;
        F f6 = this.f43320E0;
        Drawable background = f6.getBackground();
        W w10 = this.f43358M0;
        if (background != null) {
            background.getPadding(w10.f43371o0);
            boolean a5 = G1.a(w10);
            Rect rect = w10.f43371o0;
            if (a5) {
                i10 = rect.right;
            } else {
                i10 = -rect.left;
            }
        } else {
            Rect rect2 = w10.f43371o0;
            rect2.right = 0;
            rect2.left = 0;
            i10 = 0;
        }
        int paddingLeft = w10.getPaddingLeft();
        int paddingRight = w10.getPaddingRight();
        int width = w10.getWidth();
        int i12 = w10.f43370n0;
        if (i12 == -2) {
            int a10 = w10.a((SpinnerAdapter) this.f43355J0, f6.getBackground());
            int i13 = w10.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = w10.f43371o0;
            int i14 = (i13 - rect3.left) - rect3.right;
            if (a10 > i14) {
                a10 = i14;
            }
            q(Math.max(a10, (width - paddingLeft) - paddingRight));
        } else if (i12 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i12);
        }
        if (G1.a(w10)) {
            i11 = (((width - paddingRight) - this.f43325j0) - this.f43357L0) + i10;
        } else {
            i11 = paddingLeft + this.f43357L0 + i10;
        }
        this.f43326k0 = i11;
    }
}
