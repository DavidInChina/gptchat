package k4;

import android.graphics.drawable.Drawable;
import id.AbstractC3557B;

/* renamed from: k4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4162d extends AbstractC4163e {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f37005a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f37006b;

    /* renamed from: c  reason: collision with root package name */
    public final h4.f f37007c;

    public C4162d(Drawable drawable, boolean z10, h4.f fVar) {
        this.f37005a = drawable;
        this.f37006b = z10;
        this.f37007c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4162d) {
            C4162d c4162d = (C4162d) obj;
            if (AbstractC3557B.K(this.f37005a, c4162d.f37005a) && this.f37006b == c4162d.f37006b && this.f37007c == c4162d.f37007c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f37005a.hashCode() * 31;
        if (this.f37006b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return this.f37007c.hashCode() + ((hashCode + i10) * 31);
    }
}
