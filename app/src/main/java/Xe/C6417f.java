package xe;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* renamed from: xe.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6417f extends AbstractC6429r {

    /* renamed from: e  reason: collision with root package name */
    public static final C6417f f49885e = new C6417f(Separators.STAR, Separators.STAR);

    /* renamed from: c  reason: collision with root package name */
    public final String f49886c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49887d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6417f(String str, String str2, List list) {
        this(str, str2, str + '/' + str2, list);
        AbstractC3557B.c0("contentType", str);
        AbstractC3557B.c0("contentSubtype", str2);
        AbstractC3557B.c0("parameters", list);
    }

    public final boolean b(C6417f c6417f) {
        AbstractC3557B.c0("pattern", c6417f);
        String str = c6417f.f49886c;
        if (!AbstractC3557B.K(str, Separators.STAR) && !Lg.n.f2(str, this.f49886c)) {
            return false;
        }
        String str2 = c6417f.f49887d;
        if (!AbstractC3557B.K(str2, Separators.STAR) && !Lg.n.f2(str2, this.f49887d)) {
            return false;
        }
        for (C6428q c6428q : c6417f.f49951b) {
            String str3 = c6428q.f49948a;
            boolean K10 = AbstractC3557B.K(str3, Separators.STAR);
            String str4 = c6428q.f49949b;
            if (K10) {
                if (!AbstractC3557B.K(str4, Separators.STAR)) {
                    List<C6428q> list = this.f49951b;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (C6428q c6428q2 : list) {
                            if (Lg.n.f2(c6428q2.f49949b, str4)) {
                                break;
                            }
                        }
                    }
                    return false;
                }
                continue;
            } else {
                String a5 = a(str3);
                if (AbstractC3557B.K(str4, Separators.STAR)) {
                    if (a5 == null) {
                        return false;
                    }
                } else if (!Lg.n.f2(a5, str4)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (Lg.n.f2(r1.f49949b, r6) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6417f c(String str, String str2) {
        AbstractC3557B.c0("value", str2);
        List<C6428q> list = this.f49951b;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                if (!list.isEmpty()) {
                    for (C6428q c6428q : list) {
                        if (Lg.n.f2(c6428q.f49948a, str) && Lg.n.f2(c6428q.f49949b, str2)) {
                            return this;
                        }
                    }
                }
            } else {
                C6428q c6428q2 = (C6428q) list.get(0);
                if (Lg.n.f2(c6428q2.f49948a, str)) {
                }
            }
        }
        ArrayList x22 = kf.t.x2(new C6428q(str, str2), list);
        return new C6417f(this.f49886c, this.f49887d, this.f49950a, x22);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6417f) {
            C6417f c6417f = (C6417f) obj;
            if (Lg.n.f2(this.f49886c, c6417f.f49886c) && Lg.n.f2(this.f49887d, c6417f.f49887d) && AbstractC3557B.K(this.f49951b, c6417f.f49951b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f49886c.toLowerCase(locale);
        AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase);
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.f49887d.toLowerCase(locale);
        AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase2);
        return (this.f49951b.hashCode() * 31) + lowerCase2.hashCode() + (hashCode * 31) + hashCode;
    }

    public C6417f(String str, String str2, String str3, List list) {
        super(str3, list);
        this.f49886c = str;
        this.f49887d = str2;
    }

    public /* synthetic */ C6417f(String str, String str2) {
        this(str, str2, kf.v.f37483Y);
    }
}
