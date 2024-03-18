package Kf;

import Lg.n;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kg.C4291c;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final m f9809b = new m(AbstractC4344b.G0(g.f9801c, j.f9804c, h.f9802c, i.f9803c));

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f9810a;

    public m(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C4291c c4291c = ((k) obj).f9805a;
            Object obj2 = linkedHashMap.get(c4291c);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(c4291c, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f9810a = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l a(String str, C4291c c4291c) {
        Integer num;
        AbstractC3557B.c0("packageFqName", c4291c);
        List<k> list = (List) this.f9810a.get(c4291c);
        if (list == null) {
            return null;
        }
        for (k kVar : list) {
            if (n.I2(str, kVar.f9806b, false)) {
                String substring = str.substring(kVar.f9806b.length());
                AbstractC3557B.b0("substring(...)", substring);
                if (substring.length() != 0) {
                    int length = substring.length();
                    int i10 = 0;
                    for (int i11 = 0; i11 < length; i11++) {
                        int charAt = substring.charAt(i11) - '0';
                        if (charAt >= 0 && charAt < 10) {
                            i10 = (i10 * 10) + charAt;
                        }
                    }
                    num = Integer.valueOf(i10);
                    if (num == null) {
                        return new l(kVar, num.intValue());
                    }
                }
                num = null;
                if (num == null) {
                }
            }
        }
        return null;
    }
}
