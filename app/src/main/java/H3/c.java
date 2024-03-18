package H3;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import w.C6059f;

/* loaded from: classes2.dex */
public final class c extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public p f7354a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f7355b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f7356c;

    /* renamed from: d  reason: collision with root package name */
    public C6059f f7357d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
