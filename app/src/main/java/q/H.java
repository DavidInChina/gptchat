package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.openai.chatgpt.R;

/* loaded from: classes.dex */
public class H extends RadioButton implements H1.z, H1.A {

    /* renamed from: h0  reason: collision with root package name */
    public final C5239v f43295h0;

    /* renamed from: i0  reason: collision with root package name */
    public final r f43296i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C5207f0 f43297j0;

    /* renamed from: k0  reason: collision with root package name */
    public A f43298k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        q1.a(context);
        p1.a(this, getContext());
        C5239v c5239v = new C5239v(this, 1);
        this.f43295h0 = c5239v;
        c5239v.c(attributeSet, R.attr.radioButtonStyle);
        r rVar = new r(this);
        this.f43296i0 = rVar;
        rVar.e(attributeSet, R.attr.radioButtonStyle);
        C5207f0 c5207f0 = new C5207f0(this);
        this.f43297j0 = c5207f0;
        c5207f0.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private A getEmojiTextViewHelper() {
        if (this.f43298k0 == null) {
            this.f43298k0 = new A(this);
        }
        return this.f43298k0;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f43296i0;
        if (rVar != null) {
            rVar.a();
        }
        C5207f0 c5207f0 = this.f43297j0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C5239v c5239v = this.f43295h0;
        if (c5239v != null) {
            c5239v.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f43296i0;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f43296i0;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    @Override // H1.z
    public ColorStateList getSupportButtonTintList() {
        C5239v c5239v = this.f43295h0;
        if (c5239v != null) {
            return c5239v.f43564b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C5239v c5239v = this.f43295h0;
        if (c5239v != null) {
            return c5239v.f43565c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43297j0.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43297j0.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f43296i0;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f43296i0;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C5239v c5239v = this.f43295h0;
        if (c5239v != null) {
            if (c5239v.f43568f) {
                c5239v.f43568f = false;
                return;
            }
            c5239v.f43568f = true;
            c5239v.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5207f0 c5207f0 = this.f43297j0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5207f0 c5207f0 = this.f43297j0;
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
        r rVar = this.f43296i0;
        if (rVar != null) {
            rVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f43296i0;
        if (rVar != null) {
            rVar.k(mode);
        }
    }

    @Override // H1.z
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C5239v c5239v = this.f43295h0;
        if (c5239v != null) {
            c5239v.f43564b = colorStateList;
            c5239v.f43566d = true;
            c5239v.a();
        }
    }

    @Override // H1.z
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C5239v c5239v = this.f43295h0;
        if (c5239v != null) {
            c5239v.f43565c = mode;
            c5239v.f43567e = true;
            c5239v.a();
        }
    }

    @Override // H1.A
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5207f0 c5207f0 = this.f43297j0;
        c5207f0.k(colorStateList);
        c5207f0.b();
    }

    @Override // H1.A
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5207f0 c5207f0 = this.f43297j0;
        c5207f0.l(mode);
        c5207f0.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(kotlin.jvm.internal.m.u(getContext(), i10));
    }
}
