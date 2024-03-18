package xe;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;

/* renamed from: xe.r  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6429r {

    /* renamed from: a  reason: collision with root package name */
    public final String f49950a;

    /* renamed from: b  reason: collision with root package name */
    public final List f49951b;

    public AbstractC6429r(String str, List list) {
        AbstractC3557B.c0("content", str);
        AbstractC3557B.c0("parameters", list);
        this.f49950a = str;
        this.f49951b = list;
    }

    public final String a(String str) {
        AbstractC3557B.c0("name", str);
        List list = this.f49951b;
        int u02 = AbstractC4344b.u0(list);
        if (u02 >= 0) {
            int i10 = 0;
            while (true) {
                C6428q c6428q = (C6428q) list.get(i10);
                if (Lg.n.f2(c6428q.f49948a, str)) {
                    return c6428q.f49949b;
                }
                if (i10 != u02) {
                    i10++;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public final String toString() {
        List<C6428q> list = this.f49951b;
        boolean isEmpty = list.isEmpty();
        String str = this.f49950a;
        if (!isEmpty) {
            int length = str.length();
            int i10 = 0;
            int i11 = 0;
            for (C6428q c6428q : list) {
                i11 += c6428q.f49949b.length() + c6428q.f49948a.length() + 3;
            }
            StringBuilder sb2 = new StringBuilder(length + i11);
            sb2.append(str);
            int u02 = AbstractC4344b.u0(list);
            if (u02 >= 0) {
                while (true) {
                    C6428q c6428q2 = (C6428q) list.get(i10);
                    sb2.append("; ");
                    sb2.append(c6428q2.f49948a);
                    sb2.append(Separators.EQUALS);
                    String str2 = c6428q2.f49949b;
                    if (AbstractC6430s.a(str2)) {
                        sb2.append(AbstractC6430s.b(str2));
                    } else {
                        sb2.append(str2);
                    }
                    if (i10 == u02) {
                        break;
                    }
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            AbstractC3557B.b0("{\n            val size =\u2026   }.toString()\n        }", sb3);
            return sb3;
        }
        return str;
    }
}
