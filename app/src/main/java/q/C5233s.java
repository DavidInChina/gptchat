package q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import c1.AbstractC2279d;

/* renamed from: q.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5233s extends Button implements H1.A {

    /* renamed from: h0  reason: collision with root package name */
    public final r f43548h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C5207f0 f43549i0;

    /* renamed from: j0  reason: collision with root package name */
    public A f43550j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5233s(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q1.a(context);
        p1.a(this, getContext());
        r rVar = new r(this);
        this.f43548h0 = rVar;
        rVar.e(attributeSet, i10);
        C5207f0 c5207f0 = new C5207f0(this);
        this.f43549i0 = c5207f0;
        c5207f0.f(attributeSet, i10);
        c5207f0.b();
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    private A getEmojiTextViewHelper() {
        if (this.f43550j0 == null) {
            this.f43550j0 = new A(this);
        }
        return this.f43550j0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f43548h0;
        if (rVar != null) {
            rVar.a();
        }
        C5207f0 c5207f0 = this.f43549i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (G1.f43294b) {
            return super.getAutoSizeMaxTextSize();
        }
        C5207f0 c5207f0 = this.f43549i0;
        if (c5207f0 != null) {
            return Math.round(c5207f0.f43423i.f43514e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (G1.f43294b) {
            return super.getAutoSizeMinTextSize();
        }
        C5207f0 c5207f0 = this.f43549i0;
        if (c5207f0 != null) {
            return Math.round(c5207f0.f43423i.f43513d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (G1.f43294b) {
            return super.getAutoSizeStepGranularity();
        }
        C5207f0 c5207f0 = this.f43549i0;
        if (c5207f0 != null) {
            return Math.round(c5207f0.f43423i.f43512c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (G1.f43294b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C5207f0 c5207f0 = this.f43549i0;
        if (c5207f0 != null) {
            return c5207f0.f43423i.f43515f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (G1.f43294b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C5207f0 c5207f0 = this.f43549i0;
        if (c5207f0 == null) {
            return 0;
        }
        return c5207f0.f43423i.f43510a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC2279d.B(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f43548h0;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f43548h0;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43549i0.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43549i0.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C5207f0 c5207f0 = this.f43549i0;
        if (c5207f0 != null && !G1.f43294b) {
            c5207f0.f43423i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C5207f0 c5207f0 = this.f43549i0;
        if (c5207f0 != null && !G1.f43294b) {
            C5229p0 c5229p0 = c5207f0.f43423i;
            if (c5229p0.f()) {
                c5229p0.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (G1.f43294b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C5207f0 c5207f0 = this.f43549i0;
        if (c5207f0 != null) {
            c5207f0.h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (G1.f43294b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C5207f0 c5207f0 = this.f43549i0;
        if (c5207f0 != null) {
            c5207f0.i(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (G1.f43294b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C5207f0 c5207f0 = this.f43549i0;
        if (c5207f0 != null) {
            c5207f0.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f43548h0;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f43548h0;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC2279d.E(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((P5.c) getEmojiTextViewHelper().f43214b.f5033Z).D(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        C5207f0 c5207f0 = this.f43549i0;
        if (c5207f0 != null) {
            c5207f0.f43415a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f43548h0;
        if (rVar != null) {
            rVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f43548h0;
        if (rVar != null) {
            rVar.k(mode);
        }
    }

    @Override // H1.A
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5207f0 c5207f0 = this.f43549i0;
        c5207f0.k(colorStateList);
        c5207f0.b();
    }

    @Override // H1.A
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5207f0 c5207f0 = this.f43549i0;
        c5207f0.l(mode);
        c5207f0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5207f0 c5207f0 = this.f43549i0;
        if (c5207f0 != null) {
            c5207f0.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f6) {
        boolean z10 = G1.f43294b;
        if (z10) {
            super.setTextSize(i10, f6);
            return;
        }
        C5207f0 c5207f0 = this.f43549i0;
        if (c5207f0 != null && !z10) {
            C5229p0 c5229p0 = c5207f0.f43423i;
            if (!c5229p0.f()) {
                c5229p0.g(i10, f6);
            }
        }
    }
}
