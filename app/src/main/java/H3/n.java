package H3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f7410a;

    /* renamed from: b  reason: collision with root package name */
    public m f7411b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f7412c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f7413d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7414e;

    /* renamed from: f  reason: collision with root package name */
    public Bitmap f7415f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f7416g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f7417h;

    /* renamed from: i  reason: collision with root package name */
    public int f7418i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7419j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7420k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f7421l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f7410a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
