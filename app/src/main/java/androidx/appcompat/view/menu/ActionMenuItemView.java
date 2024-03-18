package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import kotlin.jvm.internal.m;
import l.AbstractC4308a;
import p.AbstractC5027c;
import p.C5026b;
import p.D;
import p.n;
import p.o;
import p.q;
import q.AbstractC5224n;
import q.C5215i0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C5215i0 implements D, View.OnClickListener, AbstractC5224n {

    /* renamed from: o0  reason: collision with root package name */
    public q f24418o0;

    /* renamed from: p0  reason: collision with root package name */
    public CharSequence f24419p0;

    /* renamed from: q0  reason: collision with root package name */
    public Drawable f24420q0;

    /* renamed from: r0  reason: collision with root package name */
    public n f24421r0;

    /* renamed from: s0  reason: collision with root package name */
    public C5026b f24422s0;

    /* renamed from: t0  reason: collision with root package name */
    public AbstractC5027c f24423t0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f24425v0;

    /* renamed from: w0  reason: collision with root package name */
    public final int f24426w0;

    /* renamed from: y0  reason: collision with root package name */
    public final int f24428y0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f24424u0 = m();

    /* renamed from: x0  reason: collision with root package name */
    public int f24427x0 = -1;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4308a.f37666c, 0, 0);
        this.f24426w0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f24428y0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setSaveEnabled(false);
    }

    @Override // q.AbstractC5224n
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p.D
    public final void b(q qVar) {
        int i10;
        this.f24418o0 = qVar;
        setIcon(qVar.getIcon());
        setTitle(qVar.getTitleCondensed());
        setId(qVar.f41635a);
        if (qVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setEnabled(qVar.isEnabled());
        if (qVar.hasSubMenu() && this.f24422s0 == null) {
            this.f24422s0 = new C5026b(this);
        }
    }

    @Override // q.AbstractC5224n
    public final boolean c() {
        if ((!TextUtils.isEmpty(getText())) && this.f24418o0.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p.D
    public q getItemData() {
        return this.f24418o0;
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480 && ((i10 < 640 || i11 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    public final void n() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f24419p0);
        if (this.f24420q0 != null && ((this.f24418o0.f41659y & 4) != 4 || (!this.f24424u0 && !this.f24425v0))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence3 = null;
        if (z12) {
            charSequence = this.f24419p0;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f24418o0.f41651q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z12) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f24418o0.f41639e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f24418o0.f41652r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z12) {
                charSequence3 = this.f24418o0.f41639e;
            }
            m.I(this, charSequence3);
            return;
        }
        m.I(this, charSequence5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n nVar = this.f24421r0;
        if (nVar != null) {
            nVar.a(this.f24418o0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f24424u0 = m();
        n();
    }

    @Override // q.C5215i0, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean z10 = !TextUtils.isEmpty(getText());
        if (z10 && (i13 = this.f24427x0) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i14 = this.f24426w0;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, i14);
        } else {
            i12 = i14;
        }
        if (mode != 1073741824 && i14 > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (!z10 && this.f24420q0 != null) {
            super.setPadding((getMeasuredWidth() - this.f24420q0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C5026b c5026b;
        if (this.f24418o0.hasSubMenu() && (c5026b = this.f24422s0) != null && c5026b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f24425v0 != z10) {
            this.f24425v0 = z10;
            q qVar = this.f24418o0;
            if (qVar != null) {
                o oVar = qVar.f41648n;
                oVar.f41615k = true;
                oVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f24420q0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f24428y0;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        n();
    }

    public void setItemInvoker(n nVar) {
        this.f24421r0 = nVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f24427x0 = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(AbstractC5027c abstractC5027c) {
        this.f24423t0 = abstractC5027c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f24419p0 = charSequence;
        n();
    }
}
