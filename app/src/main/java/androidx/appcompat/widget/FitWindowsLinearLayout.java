package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import m.C4538s;
import q.B0;

/* loaded from: classes2.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: h0  reason: collision with root package name */
    public B0 f24530h0;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        B0 b02 = this.f24530h0;
        if (b02 != null) {
            rect.top = ((C4538s) b02).f38791Y.K(null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(B0 b02) {
        this.f24530h0 = b02;
    }
}
