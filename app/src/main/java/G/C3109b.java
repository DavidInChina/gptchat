package g;

import android.window.BackEvent;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;

/* renamed from: g.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3109b {

    /* renamed from: a  reason: collision with root package name */
    public final float f30941a;

    /* renamed from: b  reason: collision with root package name */
    public final float f30942b;

    /* renamed from: c  reason: collision with root package name */
    public final float f30943c;

    /* renamed from: d  reason: collision with root package name */
    public final int f30944d;

    public C3109b(BackEvent backEvent) {
        AbstractC3557B.c0("backEvent", backEvent);
        C3108a c3108a = C3108a.f30940a;
        float d10 = c3108a.d(backEvent);
        float e10 = c3108a.e(backEvent);
        float b10 = c3108a.b(backEvent);
        int c10 = c3108a.c(backEvent);
        this.f30941a = d10;
        this.f30942b = e10;
        this.f30943c = b10;
        this.f30944d = c10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.f30941a);
        sb2.append(", touchY=");
        sb2.append(this.f30942b);
        sb2.append(", progress=");
        sb2.append(this.f30943c);
        sb2.append(", swipeEdge=");
        return AbstractC2469q0.j(sb2, this.f30944d, '}');
    }
}
