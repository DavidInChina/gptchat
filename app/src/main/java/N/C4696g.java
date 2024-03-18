package n;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import nf.AbstractC4828h;
import q0.C5254f;

/* renamed from: n.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4696g implements Drawable.Callback {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39529Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f39530Z;

    public C4696g() {
        this.f39529Y = 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        long j6;
        switch (this.f39529Y) {
            case 0:
                return;
            case 1:
                ((H3.e) this.f39530Z).invalidateSelf();
                return;
            default:
                AbstractC3557B.c0("d", drawable);
                Z6.a aVar = (Z6.a) this.f39530Z;
                aVar.f23225l0.setValue(Integer.valueOf(((Number) aVar.f23225l0.getValue()).intValue() + 1));
                Z6.a aVar2 = (Z6.a) this.f39530Z;
                Drawable drawable2 = aVar2.f23224k0;
                AbstractC3957g abstractC3957g = Z6.c.f23229a;
                if (drawable2.getIntrinsicWidth() >= 0 && drawable2.getIntrinsicHeight() >= 0) {
                    j6 = AbstractC4828h.i(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                } else {
                    j6 = C5254f.f43638c;
                }
                aVar2.f23226m0.setValue(new C5254f(j6));
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        switch (this.f39529Y) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f39530Z;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j6);
                    return;
                }
                return;
            case 1:
                ((H3.e) this.f39530Z).scheduleSelf(runnable, j6);
                return;
            default:
                AbstractC3557B.c0("d", drawable);
                AbstractC3557B.c0("what", runnable);
                ((Handler) Z6.c.f23229a.getValue()).postAtTime(runnable, j6);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f39529Y) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f39530Z;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 1:
                ((H3.e) this.f39530Z).unscheduleSelf(runnable);
                return;
            default:
                AbstractC3557B.c0("d", drawable);
                AbstractC3557B.c0("what", runnable);
                ((Handler) Z6.c.f23229a.getValue()).removeCallbacks(runnable);
                return;
        }
    }

    public /* synthetic */ C4696g(int i10, Object obj) {
        this.f39529Y = i10;
        this.f39530Z = obj;
    }
}
