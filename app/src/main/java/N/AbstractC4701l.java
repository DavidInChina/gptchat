package n;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: n.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4701l extends AbstractC4698i {

    /* renamed from: s0  reason: collision with root package name */
    public AbstractC4700k f39579s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f39580t0;

    @Override // n.AbstractC4698i, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // n.AbstractC4698i, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f39580t0) {
            super.mutate();
            C4691b c4691b = (C4691b) this.f39579s0;
            c4691b.f39517I = c4691b.f39517I.clone();
            c4691b.f39518J = c4691b.f39518J.clone();
            this.f39580t0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public abstract boolean onStateChange(int[] iArr);
}
