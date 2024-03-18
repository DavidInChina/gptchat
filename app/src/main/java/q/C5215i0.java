package q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import c1.AbstractC2279d;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import s1.AbstractC5528j;

/* renamed from: q.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5215i0 extends TextView implements H1.A {

    /* renamed from: h0  reason: collision with root package name */
    public final r f43435h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C5207f0 f43436i0;

    /* renamed from: j0  reason: collision with root package name */
    public final U3.e f43437j0;

    /* renamed from: k0  reason: collision with root package name */
    public A f43438k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f43439l0;

    /* renamed from: m0  reason: collision with root package name */
    public J0.a f43440m0;

    /* renamed from: n0  reason: collision with root package name */
    public Future f43441n0;

    public C5215i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private A getEmojiTextViewHelper() {
        if (this.f43438k0 == null) {
            this.f43438k0 = new A(this);
        }
        return this.f43438k0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f43435h0;
        if (rVar != null) {
            rVar.a();
        }
        C5207f0 c5207f0 = this.f43436i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (G1.f43294b) {
            return super.getAutoSizeMaxTextSize();
        }
        C5207f0 c5207f0 = this.f43436i0;
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
        C5207f0 c5207f0 = this.f43436i0;
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
        C5207f0 c5207f0 = this.f43436i0;
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
        C5207f0 c5207f0 = this.f43436i0;
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
        C5207f0 c5207f0 = this.f43436i0;
        if (c5207f0 == null) {
            return 0;
        }
        return c5207f0.f43423i.f43510a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC2279d.B(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public AbstractC5210g0 getSuperCaller() {
        if (this.f43440m0 == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                this.f43440m0 = new C5213h0(this);
            } else if (i10 >= 26) {
                this.f43440m0 = new J0.a(this);
            }
        }
        return this.f43440m0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f43435h0;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f43435h0;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43436i0.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43436i0.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        l();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        U3.e eVar;
        if (Build.VERSION.SDK_INT < 28 && (eVar = this.f43437j0) != null) {
            TextClassifier textClassifier = (TextClassifier) eVar.f17401Z;
            if (textClassifier == null) {
                return X.a((TextView) eVar.f17400Y);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public B1.i getTextMetricsParamsCompat() {
        return AbstractC2279d.p(this);
    }

    public final void l() {
        Future future = this.f43441n0;
        if (future != null) {
            try {
                this.f43441n0 = null;
                AbstractC2469q0.p(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC2279d.p(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f43436i0.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            G1.c.a(editorInfo, getText());
        }
        A7.b.p1(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C5207f0 c5207f0 = this.f43436i0;
        if (c5207f0 != null && !G1.f43294b) {
            c5207f0.f43423i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        l();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C5207f0 c5207f0 = this.f43436i0;
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
        C5207f0 c5207f0 = this.f43436i0;
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
        C5207f0 c5207f0 = this.f43436i0;
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
        C5207f0 c5207f0 = this.f43436i0;
        if (c5207f0 != null) {
            c5207f0.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f43435h0;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f43435h0;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5207f0 c5207f0 = this.f43436i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5207f0 c5207f0 = this.f43436i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5207f0 c5207f0 = this.f43436i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5207f0 c5207f0 = this.f43436i0;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((P5.c) getEmojiTextViewHelper().f43214b.f5033Z).D(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().y(i10);
        } else {
            AbstractC2279d.x(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().o(i10);
        } else {
            AbstractC2279d.y(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        R4.b.T(i10);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(B1.j jVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC2279d.p(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f43435h0;
        if (rVar != null) {
            rVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f43435h0;
        if (rVar != null) {
            rVar.k(mode);
        }
    }

    @Override // H1.A
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5207f0 c5207f0 = this.f43436i0;
        c5207f0.k(colorStateList);
        c5207f0.b();
    }

    @Override // H1.A
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5207f0 c5207f0 = this.f43436i0;
        c5207f0.l(mode);
        c5207f0.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5207f0 c5207f0 = this.f43436i0;
        if (c5207f0 != null) {
            c5207f0.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        U3.e eVar;
        if (Build.VERSION.SDK_INT >= 28 || (eVar = this.f43437j0) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            eVar.f17401Z = textClassifier;
        }
    }

    public void setTextFuture(Future<B1.j> future) {
        this.f43441n0 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(B1.i iVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = iVar.f1721b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        H1.t.h(this, i10);
        getPaint().set(iVar.f1720a);
        H1.u.e(this, iVar.f1722c);
        H1.u.h(this, iVar.f1723d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f6) {
        boolean z10 = G1.f43294b;
        if (z10) {
            super.setTextSize(i10, f6);
            return;
        }
        C5207f0 c5207f0 = this.f43436i0;
        if (c5207f0 != null && !z10) {
            C5229p0 c5229p0 = c5207f0.f43423i;
            if (!c5229p0.f()) {
                c5229p0.g(i10, f6);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typeface2;
        if (this.f43439l0) {
            return;
        }
        if (typeface != null && i10 > 0) {
            Context context = getContext();
            J0.a aVar = AbstractC5528j.f45113a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i10);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f43439l0 = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f43439l0 = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v6, types: [U3.e, java.lang.Object] */
    public C5215i0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q1.a(context);
        this.f43439l0 = false;
        this.f43440m0 = null;
        p1.a(this, getContext());
        r rVar = new r(this);
        this.f43435h0 = rVar;
        rVar.e(attributeSet, i10);
        C5207f0 c5207f0 = new C5207f0(this);
        this.f43436i0 = c5207f0;
        c5207f0.f(attributeSet, i10);
        c5207f0.b();
        ?? obj = new Object();
        obj.f17400Y = this;
        this.f43437j0 = obj;
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable u10 = i10 != 0 ? kotlin.jvm.internal.m.u(context, i10) : null;
        Drawable u11 = i11 != 0 ? kotlin.jvm.internal.m.u(context, i11) : null;
        Drawable u12 = i12 != 0 ? kotlin.jvm.internal.m.u(context, i12) : null;
        if (i13 != 0) {
            drawable = kotlin.jvm.internal.m.u(context, i13);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(u10, u11, u12, drawable);
        C5207f0 c5207f0 = this.f43436i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable u10 = i10 != 0 ? kotlin.jvm.internal.m.u(context, i10) : null;
        Drawable u11 = i11 != 0 ? kotlin.jvm.internal.m.u(context, i11) : null;
        Drawable u12 = i12 != 0 ? kotlin.jvm.internal.m.u(context, i12) : null;
        if (i13 != 0) {
            drawable = kotlin.jvm.internal.m.u(context, i13);
        }
        setCompoundDrawablesWithIntrinsicBounds(u10, u11, u12, drawable);
        C5207f0 c5207f0 = this.f43436i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }
}
