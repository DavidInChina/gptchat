package q;

import a1.C1915c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.openai.chatgpt.R;

/* loaded from: classes.dex */
public final class E extends MultiAutoCompleteTextView implements H1.A {

    /* renamed from: k0  reason: collision with root package name */
    public static final int[] f43268k0 = {16843126};

    /* renamed from: h0  reason: collision with root package name */
    public final r f43269h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C5207f0 f43270i0;

    /* renamed from: j0  reason: collision with root package name */
    public final U3.c f43271j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        q1.a(context);
        p1.a(this, getContext());
        U3.u I10 = U3.u.I(getContext(), attributeSet, f43268k0, R.attr.autoCompleteTextViewStyle, 0);
        if (I10.E(0)) {
            setDropDownBackgroundDrawable(I10.t(0));
        }
        I10.N();
        r rVar = new r(this);
        this.f43269h0 = rVar;
        rVar.e(attributeSet, R.attr.autoCompleteTextViewStyle);
        C5207f0 c5207f0 = new C5207f0(this);
        this.f43270i0 = c5207f0;
        c5207f0.f(attributeSet, R.attr.autoCompleteTextViewStyle);
        c5207f0.b();
        U3.c cVar = new U3.c(this);
        this.f43271j0 = cVar;
        cVar.x(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener r10 = cVar.r(keyListener);
            if (r10 != keyListener) {
                super.setKeyListener(r10);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f43269h0;
        if (rVar != null) {
            rVar.a();
        }
        C5207f0 c5207f0 = this.f43270i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f43269h0;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f43269h0;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43270i0.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43270i0.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        A7.b.p1(this, editorInfo, onCreateInputConnection);
        return this.f43271j0.z(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f43269h0;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f43269h0;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5207f0 c5207f0 = this.f43270i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5207f0 c5207f0 = this.f43270i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(kotlin.jvm.internal.m.u(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        ((C1915c) ((S1.b) this.f43271j0.f17397h0).f16066c).v(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f43271j0.r(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f43269h0;
        if (rVar != null) {
            rVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f43269h0;
        if (rVar != null) {
            rVar.k(mode);
        }
    }

    @Override // H1.A
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5207f0 c5207f0 = this.f43270i0;
        c5207f0.k(colorStateList);
        c5207f0.b();
    }

    @Override // H1.A
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5207f0 c5207f0 = this.f43270i0;
        c5207f0.l(mode);
        c5207f0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5207f0 c5207f0 = this.f43270i0;
        if (c5207f0 != null) {
            c5207f0.g(context, i10);
        }
    }
}
