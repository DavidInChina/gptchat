package r8;

import android.app.PendingIntent;

/* renamed from: r8.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5373b extends AbstractC5372a {

    /* renamed from: Y  reason: collision with root package name */
    public final PendingIntent f44461Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f44462Z;

    public C5373b(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent != null) {
            this.f44461Y = pendingIntent;
            this.f44462Z = z10;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5372a) {
            AbstractC5372a abstractC5372a = (AbstractC5372a) obj;
            if (this.f44461Y.equals(((C5373b) abstractC5372a).f44461Y) && this.f44462Z == ((C5373b) abstractC5372a).f44462Z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f44461Y.hashCode() ^ 1000003) * 1000003;
        if (true != this.f44462Z) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        String obj = this.f44461Y.toString();
        return "ReviewInfo{pendingIntent=" + obj + ", isNoOp=" + this.f44462Z + "}";
    }
}
