package w3;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class L extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public Y f47767a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f47768b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public boolean f47769c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f47770d = false;

    public L(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public L(int i10, int i11) {
        super(i10, i11);
    }

    public L(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public L(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public L(L l10) {
        super((ViewGroup.LayoutParams) l10);
    }
}
