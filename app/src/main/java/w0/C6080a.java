package w0;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import org.xmlpull.v1.XmlPullParser;
import r9.y;

/* renamed from: w0.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6080a {

    /* renamed from: a  reason: collision with root package name */
    public final XmlPullParser f47647a;

    /* renamed from: b  reason: collision with root package name */
    public int f47648b = 0;

    public C6080a(XmlResourceParser xmlResourceParser) {
        this.f47647a = xmlResourceParser;
    }

    public final float a(TypedArray typedArray, String str, int i10, float f6) {
        if (y.z0(this.f47647a, str)) {
            f6 = typedArray.getFloat(i10, f6);
        }
        b(typedArray.getChangingConfigurations());
        return f6;
    }

    public final void b(int i10) {
        this.f47648b = i10 | this.f47648b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6080a)) {
            return false;
        }
        C6080a c6080a = (C6080a) obj;
        if (AbstractC3557B.K(this.f47647a, c6080a.f47647a) && this.f47648b == c6080a.f47648b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f47647a.hashCode() * 31) + this.f47648b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f47647a);
        sb2.append(", config=");
        return AbstractC2469q0.j(sb2, this.f47648b, ')');
    }
}
