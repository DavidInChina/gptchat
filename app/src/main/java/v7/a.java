package V7;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import t1.AbstractC5656b;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public H3.b f18411a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f18412b;

    public a(c cVar) {
        this.f18412b = cVar;
    }

    public final void a(Drawable drawable) {
        c cVar = this.f18412b;
        ColorStateList colorStateList = cVar.f18433v0;
        if (colorStateList != null) {
            AbstractC5656b.g(drawable, colorStateList.getColorForState(cVar.f18437z0, colorStateList.getDefaultColor()));
        }
    }
}
