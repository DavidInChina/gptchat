package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.openai.chatgpt.R;
import l.AbstractC4308a;
import t1.AbstractC5656b;
import t1.AbstractC5657c;

/* loaded from: classes.dex */
public final class L extends G {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f43305d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f43306e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f43307f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f43308g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f43309h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f43310i = false;

    public L(SeekBar seekBar) {
        super(seekBar);
        this.f43305d = seekBar;
    }

    @Override // q.G
    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f43305d;
        Context context = seekBar.getContext();
        int[] iArr = AbstractC4308a.f37670g;
        U3.u I10 = U3.u.I(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        D1.Z.k(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) I10.f17493h0, R.attr.seekBarStyle);
        Drawable u10 = I10.u(0);
        if (u10 != null) {
            seekBar.setThumb(u10);
        }
        Drawable t10 = I10.t(1);
        Drawable drawable = this.f43306e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f43306e = t10;
        if (t10 != null) {
            t10.setCallback(seekBar);
            AbstractC5657c.b(t10, D1.I.d(seekBar));
            if (t10.isStateful()) {
                t10.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (I10.E(3)) {
            this.f43308g = AbstractC5238u0.b(I10.x(3, -1), this.f43308g);
            this.f43310i = true;
        }
        if (I10.E(2)) {
            this.f43307f = I10.p(2);
            this.f43309h = true;
        }
        I10.N();
        c();
    }

    public final void c() {
        Drawable drawable = this.f43306e;
        if (drawable != null) {
            if (this.f43309h || this.f43310i) {
                Drawable mutate = drawable.mutate();
                this.f43306e = mutate;
                if (this.f43309h) {
                    AbstractC5656b.h(mutate, this.f43307f);
                }
                if (this.f43310i) {
                    AbstractC5656b.i(this.f43306e, this.f43308g);
                }
                if (this.f43306e.isStateful()) {
                    this.f43306e.setState(this.f43305d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        SeekBar seekBar;
        int i10;
        if (this.f43306e != null) {
            int max = this.f43305d.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f43306e.getIntrinsicWidth();
                int intrinsicHeight = this.f43306e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f43306e.setBounds(-i10, -i11, i10, i11);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f43306e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
