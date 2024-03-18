package H0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import r0.AbstractC5340d;
import r0.AbstractC5352p;

/* renamed from: H0.x0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0713x0 extends ViewGroup {

    /* renamed from: h0  reason: collision with root package name */
    public boolean f7066h0;

    public C0713x0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(AbstractC5352p abstractC5352p, View view, long j6) {
        super.drawChild(AbstractC5340d.a(abstractC5352p), view, j6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer", childAt);
            if (((c1) childAt).f6923o0) {
                this.f7066h0 = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f7066h0 = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f7066h0) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
