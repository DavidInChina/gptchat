package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import l.AbstractC4308a;

/* loaded from: classes.dex */
public final class C implements E1.B {

    /* renamed from: Y  reason: collision with root package name */
    public int f43232Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final View f43233Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f43234h0;

    public C(ImageView imageView) {
        this.f43233Z = imageView;
    }

    public final void a() {
        r1 r1Var;
        ImageView imageView = (ImageView) this.f43233Z;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC5238u0.a(drawable);
        }
        if (drawable != null && (r1Var = (r1) this.f43234h0) != null) {
            C5243x.e(drawable, r1Var, imageView.getDrawableState());
        }
    }

    @Override // E1.B
    public final boolean b(View view) {
        throw null;
    }

    public final void c(AttributeSet attributeSet, int i10) {
        int z10;
        View view = this.f43233Z;
        ImageView imageView = (ImageView) view;
        Context context = imageView.getContext();
        int[] iArr = AbstractC4308a.f37669f;
        U3.u I10 = U3.u.I(context, attributeSet, iArr, i10, 0);
        D1.Z.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) I10.f17493h0, i10);
        try {
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null && (z10 = I10.z(1, -1)) != -1 && (drawable = kotlin.jvm.internal.m.u(((ImageView) view).getContext(), z10)) != null) {
                ((ImageView) view).setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC5238u0.a(drawable);
            }
            if (I10.E(2)) {
                H1.f.c((ImageView) view, I10.p(2));
            }
            if (I10.E(3)) {
                H1.f.d((ImageView) view, AbstractC5238u0.b(I10.x(3, -1), null));
            }
            I10.N();
        } catch (Throwable th2) {
            I10.N();
            throw th2;
        }
    }

    public final void d(int i10) {
        View view = this.f43233Z;
        if (i10 != 0) {
            ImageView imageView = (ImageView) view;
            Drawable u10 = kotlin.jvm.internal.m.u(imageView.getContext(), i10);
            if (u10 != null) {
                AbstractC5238u0.a(u10);
            }
            imageView.setImageDrawable(u10);
        } else {
            ((ImageView) view).setImageDrawable(null);
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (((r1) this.f43234h0) == null) {
            this.f43234h0 = new r1(0);
        }
        r1 r1Var = (r1) this.f43234h0;
        r1Var.f43546d = colorStateList;
        r1Var.f43545c = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (((r1) this.f43234h0) == null) {
            this.f43234h0 = new r1(0);
        }
        r1 r1Var = (r1) this.f43234h0;
        r1Var.f43547e = mode;
        r1Var.f43544b = true;
        a();
    }
}
