package Td;

import E9.f;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Date;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f17177a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17178b;

    /* renamed from: c  reason: collision with root package name */
    public final Date f17179c;

    public a(int i10, String str) {
        Date date = new Date();
        AbstractC2469q0.q("kind", i10);
        AbstractC3557B.c0("message", str);
        this.f17177a = i10;
        this.f17178b = str;
        this.f17179c = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f17177a == aVar.f17177a && AbstractC3557B.K(this.f17178b, aVar.f17178b) && AbstractC3557B.K(this.f17179c, aVar.f17179c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17179c.hashCode() + f.v(this.f17178b, AbstractC6708l.f(this.f17177a) * 31, 31);
    }

    public final String toString() {
        return "LogMessage(kind=" + R.a.D(this.f17177a) + ", message=" + this.f17178b + ", dateTime=" + this.f17179c + ')';
    }
}
