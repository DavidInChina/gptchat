package n;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import w.AbstractC6051C;
import w.C6050B;
import w.C6066m;
import x.AbstractC6262a;

/* renamed from: n.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4691b extends AbstractC4700k {

    /* renamed from: I  reason: collision with root package name */
    public C6066m f39517I;

    /* renamed from: J  reason: collision with root package name */
    public C6050B f39518J;

    public C4691b(C4691b c4691b, C4695f c4695f, Resources resources) {
        super(c4691b, c4695f, resources);
        if (c4691b != null) {
            this.f39578H = c4691b.f39578H;
        } else {
            this.f39578H = new int[this.f39544g.length];
        }
        if (c4691b != null) {
            this.f39517I = c4691b.f39517I;
            this.f39518J = c4691b.f39518J;
            return;
        }
        this.f39517I = new C6066m();
        this.f39518J = new C6050B();
    }

    public final int e(int i10) {
        Object obj;
        if (i10 < 0) {
            return 0;
        }
        C6050B c6050b = this.f39518J;
        Integer num = 0;
        c6050b.getClass();
        Object obj2 = AbstractC6051C.f47565a;
        int a5 = AbstractC6262a.a(c6050b.f47564i0, i10, c6050b.f47562Z);
        if (a5 >= 0 && (obj = c6050b.f47563h0[a5]) != AbstractC6051C.f47565a) {
            num = obj;
        }
        return num.intValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C4695f(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C4695f(this, resources);
    }
}
