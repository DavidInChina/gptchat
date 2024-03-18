package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class B extends ImageButton {

    /* renamed from: h0  reason: collision with root package name */
    public final r f43227h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C f43228i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f43229j0 = false;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q1.a(context);
        p1.a(this, getContext());
        r rVar = new r(this);
        this.f43227h0 = rVar;
        rVar.e(attributeSet, i10);
        C c10 = new C(this);
        this.f43228i0 = c10;
        c10.c(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f43227h0;
        if (rVar != null) {
            rVar.a();
        }
        C c10 = this.f43228i0;
        if (c10 != null) {
            c10.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f43227h0;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f43227h0;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        r1 r1Var;
        C c10 = this.f43228i0;
        if (c10 == null || (r1Var = (r1) c10.f43234h0) == null) {
            return null;
        }
        return (ColorStateList) r1Var.f43546d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        r1 r1Var;
        C c10 = this.f43228i0;
        if (c10 == null || (r1Var = (r1) c10.f43234h0) == null) {
            return null;
        }
        return (PorterDuff.Mode) r1Var.f43547e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(((ImageView) this.f43228i0.f43233Z).getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f43227h0;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f43227h0;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C c10 = this.f43228i0;
        if (c10 != null) {
            c10.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C c10 = this.f43228i0;
        if (c10 != null && drawable != null && !this.f43229j0) {
            c10.f43232Y = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c10 != null) {
            c10.a();
            if (!this.f43229j0) {
                ImageView imageView = (ImageView) c10.f43233Z;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(c10.f43232Y);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f43229j0 = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f43228i0.d(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C c10 = this.f43228i0;
        if (c10 != null) {
            c10.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f43227h0;
        if (rVar != null) {
            rVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f43227h0;
        if (rVar != null) {
            rVar.k(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C c10 = this.f43228i0;
        if (c10 != null) {
            c10.e(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C c10 = this.f43228i0;
        if (c10 != null) {
            c10.f(mode);
        }
    }
}
