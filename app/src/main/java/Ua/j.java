package Ua;

import q4.n;
import wd.C6209w;

/* loaded from: classes2.dex */
public final class j implements n4.b {
    @Override // n4.b
    public final Object a(Object obj, n nVar) {
        String str = (String) obj;
        if (!Lg.n.I2(str, "file-service://", false)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return new C6209w(str);
    }
}
