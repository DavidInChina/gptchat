package T7;

import D1.I;
import D1.Z;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.openai.chatgpt.R;
import d8.AbstractC2605a;
import f8.f;
import f8.g;
import f8.j;
import f8.u;
import java.util.WeakHashMap;
import t1.AbstractC5656b;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f16929a;

    /* renamed from: b  reason: collision with root package name */
    public j f16930b;

    /* renamed from: c  reason: collision with root package name */
    public int f16931c;

    /* renamed from: d  reason: collision with root package name */
    public int f16932d;

    /* renamed from: e  reason: collision with root package name */
    public int f16933e;

    /* renamed from: f  reason: collision with root package name */
    public int f16934f;

    /* renamed from: g  reason: collision with root package name */
    public int f16935g;

    /* renamed from: h  reason: collision with root package name */
    public int f16936h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f16937i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f16938j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f16939k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f16940l;

    /* renamed from: m  reason: collision with root package name */
    public g f16941m;

    /* renamed from: q  reason: collision with root package name */
    public boolean f16945q;

    /* renamed from: s  reason: collision with root package name */
    public RippleDrawable f16947s;

    /* renamed from: t  reason: collision with root package name */
    public int f16948t;

    /* renamed from: n  reason: collision with root package name */
    public boolean f16942n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16943o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f16944p = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f16946r = true;

    public c(MaterialButton materialButton, j jVar) {
        this.f16929a = materialButton;
        this.f16930b = jVar;
    }

    public final u a() {
        RippleDrawable rippleDrawable = this.f16947s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            if (this.f16947s.getNumberOfLayers() > 2) {
                return (u) this.f16947s.getDrawable(2);
            }
            return (u) this.f16947s.getDrawable(1);
        }
        return null;
    }

    public final g b(boolean z10) {
        RippleDrawable rippleDrawable = this.f16947s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.f16947s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
        }
        return null;
    }

    public final void c(j jVar) {
        this.f16930b = jVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(jVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(jVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(jVar);
        }
    }

    public final void d(int i10, int i11) {
        WeakHashMap weakHashMap = Z.f3247a;
        MaterialButton materialButton = this.f16929a;
        int f6 = I.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e10 = I.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f16933e;
        int i13 = this.f16934f;
        this.f16934f = i11;
        this.f16933e = i10;
        if (!this.f16943o) {
            e();
        }
        I.k(materialButton, f6, (paddingTop + i10) - i12, e10, (paddingBottom + i11) - i13);
    }

    public final void e() {
        int i10;
        g gVar = new g(this.f16930b);
        MaterialButton materialButton = this.f16929a;
        gVar.i(materialButton.getContext());
        AbstractC5656b.h(gVar, this.f16938j);
        PorterDuff.Mode mode = this.f16937i;
        if (mode != null) {
            AbstractC5656b.i(gVar, mode);
        }
        ColorStateList colorStateList = this.f16939k;
        gVar.f29688Y.f29675k = this.f16936h;
        gVar.invalidateSelf();
        f fVar = gVar.f29688Y;
        if (fVar.f29668d != colorStateList) {
            fVar.f29668d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f16930b);
        gVar2.setTint(0);
        float f6 = this.f16936h;
        if (this.f16942n) {
            i10 = P4.a.R(materialButton, R.attr.colorSurface);
        } else {
            i10 = 0;
        }
        gVar2.f29688Y.f29675k = f6;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        f fVar2 = gVar2.f29688Y;
        if (fVar2.f29668d != valueOf) {
            fVar2.f29668d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f16930b);
        this.f16941m = gVar3;
        AbstractC5656b.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC2605a.a(this.f16940l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f16931c, this.f16933e, this.f16932d, this.f16934f), this.f16941m);
        this.f16947s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b10 = b(false);
        if (b10 != null) {
            b10.j(this.f16948t);
            b10.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i10 = 0;
        g b10 = b(false);
        g b11 = b(true);
        if (b10 != null) {
            ColorStateList colorStateList = this.f16939k;
            b10.f29688Y.f29675k = this.f16936h;
            b10.invalidateSelf();
            f fVar = b10.f29688Y;
            if (fVar.f29668d != colorStateList) {
                fVar.f29668d = colorStateList;
                b10.onStateChange(b10.getState());
            }
            if (b11 != null) {
                float f6 = this.f16936h;
                if (this.f16942n) {
                    i10 = P4.a.R(this.f16929a, R.attr.colorSurface);
                }
                b11.f29688Y.f29675k = f6;
                b11.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i10);
                f fVar2 = b11.f29688Y;
                if (fVar2.f29668d != valueOf) {
                    fVar2.f29668d = valueOf;
                    b11.onStateChange(b11.getState());
                }
            }
        }
    }
}
