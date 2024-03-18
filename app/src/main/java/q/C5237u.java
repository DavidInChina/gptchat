package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import c1.AbstractC2279d;
import com.openai.chatgpt.R;

/* renamed from: q.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5237u extends CheckedTextView implements H1.A {

    /* renamed from: h0  reason: collision with root package name */
    public final C5239v f43557h0;

    /* renamed from: i0  reason: collision with root package name */
    public final r f43558i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C5207f0 f43559j0;

    /* renamed from: k0  reason: collision with root package name */
    public A f43560k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5237u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        q1.a(context);
        p1.a(this, getContext());
        C5207f0 c5207f0 = new C5207f0(this);
        this.f43559j0 = c5207f0;
        c5207f0.f(attributeSet, R.attr.checkedTextViewStyle);
        c5207f0.b();
        r rVar = new r(this);
        this.f43558i0 = rVar;
        rVar.e(attributeSet, R.attr.checkedTextViewStyle);
        C5239v c5239v = new C5239v(this, 0);
        this.f43557h0 = c5239v;
        c5239v.c(attributeSet, R.attr.checkedTextViewStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
    }

    private A getEmojiTextViewHelper() {
        if (this.f43560k0 == null) {
            this.f43560k0 = new A(this);
        }
        return this.f43560k0;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5207f0 c5207f0 = this.f43559j0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
        r rVar = this.f43558i0;
        if (rVar != null) {
            rVar.a();
        }
        C5239v c5239v = this.f43557h0;
        if (c5239v != null) {
            c5239v.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC2279d.B(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f43558i0;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f43558i0;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C5239v c5239v = this.f43557h0;
        if (c5239v != null) {
            return c5239v.f43564b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C5239v c5239v = this.f43557h0;
        if (c5239v != null) {
            return c5239v.f43565c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43559j0.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43559j0.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        A7.b.p1(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f43558i0;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f43558i0;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C5239v c5239v = this.f43557h0;
        if (c5239v != null) {
            if (c5239v.f43568f) {
                c5239v.f43568f = false;
                return;
            }
            c5239v.f43568f = true;
            c5239v.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5207f0 c5207f0 = this.f43559j0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5207f0 c5207f0 = this.f43559j0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC2279d.E(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f43558i0;
        if (rVar != null) {
            rVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f43558i0;
        if (rVar != null) {
            rVar.k(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C5239v c5239v = this.f43557h0;
        if (c5239v != null) {
            c5239v.f43564b = colorStateList;
            c5239v.f43566d = true;
            c5239v.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C5239v c5239v = this.f43557h0;
        if (c5239v != null) {
            c5239v.f43565c = mode;
            c5239v.f43567e = true;
            c5239v.b();
        }
    }

    @Override // H1.A
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5207f0 c5207f0 = this.f43559j0;
        c5207f0.k(colorStateList);
        c5207f0.b();
    }

    @Override // H1.A
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5207f0 c5207f0 = this.f43559j0;
        c5207f0.l(mode);
        c5207f0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5207f0 c5207f0 = this.f43559j0;
        if (c5207f0 != null) {
            c5207f0.g(context, i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(kotlin.jvm.internal.m.u(getContext(), i10));
    }
}
