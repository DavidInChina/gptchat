package q4;

import android.graphics.drawable.Drawable;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class q extends k {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f43886a;

    /* renamed from: b  reason: collision with root package name */
    public final j f43887b;

    /* renamed from: c  reason: collision with root package name */
    public final h4.f f43888c;

    /* renamed from: d  reason: collision with root package name */
    public final o4.c f43889d;

    /* renamed from: e  reason: collision with root package name */
    public final String f43890e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f43891f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f43892g;

    public q(Drawable drawable, j jVar, h4.f fVar, o4.c cVar, String str, boolean z10, boolean z11) {
        this.f43886a = drawable;
        this.f43887b = jVar;
        this.f43888c = fVar;
        this.f43889d = cVar;
        this.f43890e = str;
        this.f43891f = z10;
        this.f43892g = z11;
    }

    @Override // q4.k
    public final Drawable a() {
        return this.f43886a;
    }

    @Override // q4.k
    public final j b() {
        return this.f43887b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (AbstractC3557B.K(this.f43886a, qVar.f43886a)) {
                if (AbstractC3557B.K(this.f43887b, qVar.f43887b) && this.f43888c == qVar.f43888c && AbstractC3557B.K(this.f43889d, qVar.f43889d) && AbstractC3557B.K(this.f43890e, qVar.f43890e) && this.f43891f == qVar.f43891f && this.f43892g == qVar.f43892g) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = (this.f43888c.hashCode() + ((this.f43887b.hashCode() + (this.f43886a.hashCode() * 31)) * 31)) * 31;
        int i12 = 0;
        o4.c cVar = this.f43889d;
        if (cVar != null) {
            i10 = cVar.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        String str = this.f43890e;
        if (str != null) {
            i12 = str.hashCode();
        }
        int i14 = (i13 + i12) * 31;
        int i15 = 1237;
        if (this.f43891f) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i16 = (i14 + i11) * 31;
        if (this.f43892g) {
            i15 = 1231;
        }
        return i16 + i15;
    }
}
