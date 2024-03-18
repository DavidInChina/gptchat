package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.openai.chatgpt.R;
import t1.AbstractC5656b;

/* renamed from: q.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5220l extends D implements AbstractC5224n {

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C5222m f43449k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5220l(C5222m c5222m, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f43449k0 = c5222m;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        kotlin.jvm.internal.m.I(this, getContentDescription());
        setOnTouchListener(new C5218k(this, this, c5222m, 0));
    }

    @Override // q.AbstractC5224n
    public final boolean a() {
        return false;
    }

    @Override // q.AbstractC5224n
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f43449k0.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC5656b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
