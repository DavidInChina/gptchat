package q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.openai.chatgpt.R;

/* loaded from: classes.dex */
public final class K extends SeekBar {

    /* renamed from: h0  reason: collision with root package name */
    public final L f43302h0;

    public K(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        p1.a(this, getContext());
        L l10 = new L(this);
        this.f43302h0 = l10;
        l10.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        L l10 = this.f43302h0;
        Drawable drawable = l10.f43306e;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = l10.f43305d;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f43302h0.f43306e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f43302h0.d(canvas);
    }
}
