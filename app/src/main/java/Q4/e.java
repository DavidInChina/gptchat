package q4;

import android.graphics.drawable.Drawable;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f43783a;

    /* renamed from: b  reason: collision with root package name */
    public final j f43784b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f43785c;

    public e(Drawable drawable, j jVar, Throwable th2) {
        this.f43783a = drawable;
        this.f43784b = jVar;
        this.f43785c = th2;
    }

    @Override // q4.k
    public final Drawable a() {
        return this.f43783a;
    }

    @Override // q4.k
    public final j b() {
        return this.f43784b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (AbstractC3557B.K(this.f43783a, eVar.f43783a)) {
                if (AbstractC3557B.K(this.f43784b, eVar.f43784b) && AbstractC3557B.K(this.f43785c, eVar.f43785c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Drawable drawable = this.f43783a;
        if (drawable != null) {
            i10 = drawable.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode = this.f43784b.hashCode();
        return this.f43785c.hashCode() + ((hashCode + (i10 * 31)) * 31);
    }
}
