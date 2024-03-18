package A;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: A.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0034o {

    /* renamed from: a  reason: collision with root package name */
    public static final C0034o f259a = new Object();

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final float c(EdgeEffect edgeEffect, float f6, float f10) {
        try {
            return edgeEffect.onPullDistance(f6, f10);
        } catch (Throwable unused) {
            edgeEffect.onPull(f6, f10);
            return 0.0f;
        }
    }
}
