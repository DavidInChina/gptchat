package H3;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class d extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f7358a;

    public d(Drawable.ConstantState constantState) {
        this.f7358a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f7358a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f7358a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        e eVar = new e(null);
        Drawable newDrawable = this.f7358a.newDrawable();
        eVar.f7366Y = newDrawable;
        newDrawable.setCallback(eVar.f7364k0);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        e eVar = new e(null);
        Drawable newDrawable = this.f7358a.newDrawable(resources);
        eVar.f7366Y = newDrawable;
        newDrawable.setCallback(eVar.f7364k0);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null);
        Drawable newDrawable = this.f7358a.newDrawable(resources, theme);
        eVar.f7366Y = newDrawable;
        newDrawable.setCallback(eVar.f7364k0);
        return eVar;
    }
}
