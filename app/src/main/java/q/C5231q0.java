package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: q.q0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5231q0 extends ToggleButton implements H1.A {

    /* renamed from: h0  reason: collision with root package name */
    public final r f43532h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C5207f0 f43533i0;

    /* renamed from: j0  reason: collision with root package name */
    public A f43534j0;

    public C5231q0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        p1.a(this, getContext());
        r rVar = new r(this);
        this.f43532h0 = rVar;
        rVar.e(attributeSet, 16842827);
        C5207f0 c5207f0 = new C5207f0(this);
        this.f43533i0 = c5207f0;
        c5207f0.f(attributeSet, 16842827);
        getEmojiTextViewHelper().a(attributeSet, 16842827);
    }

    private A getEmojiTextViewHelper() {
        if (this.f43534j0 == null) {
            this.f43534j0 = new A(this);
        }
        return this.f43534j0;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f43532h0;
        if (rVar != null) {
            rVar.a();
        }
        C5207f0 c5207f0 = this.f43533i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f43532h0;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f43532h0;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43533i0.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43533i0.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f43532h0;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f43532h0;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5207f0 c5207f0 = this.f43533i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5207f0 c5207f0 = this.f43533i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((P5.c) getEmojiTextViewHelper().f43214b.f5033Z).D(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f43532h0;
        if (rVar != null) {
            rVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f43532h0;
        if (rVar != null) {
            rVar.k(mode);
        }
    }

    @Override // H1.A
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5207f0 c5207f0 = this.f43533i0;
        c5207f0.k(colorStateList);
        c5207f0.b();
    }

    @Override // H1.A
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5207f0 c5207f0 = this.f43533i0;
        c5207f0.l(mode);
        c5207f0.b();
    }
}
