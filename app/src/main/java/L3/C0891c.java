package L3;

import android.net.Uri;
import id.AbstractC3557B;

/* renamed from: L3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0891c {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f10696a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10697b;

    public C0891c(boolean z10, Uri uri) {
        this.f10696a = uri;
        this.f10697b = z10;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(C0891c.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger", obj);
        C0891c c0891c = (C0891c) obj;
        if (AbstractC3557B.K(this.f10696a, c0891c.f10696a) && this.f10697b == c0891c.f10697b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f10696a.hashCode() * 31;
        if (this.f10697b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }
}
