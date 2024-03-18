package l5;

import Lg.n;
import id.AbstractC3557B;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f37838a;

    /* renamed from: b  reason: collision with root package name */
    public final InputStream f37839b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f37840c;

    public g(int i10, InputStream inputStream, TreeMap treeMap) {
        AbstractC3557B.c0("body", inputStream);
        this.f37838a = i10;
        this.f37839b = inputStream;
        this.f37840c = treeMap;
    }

    public final boolean a() {
        Map map = this.f37840c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P4.a.n0(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Locale locale = Locale.getDefault();
            AbstractC3557B.b0("getDefault()", locale);
            String lowerCase = ((String) entry.getKey()).toLowerCase(locale);
            AbstractC3557B.b0("this as java.lang.String).toLowerCase(locale)", lowerCase);
            linkedHashMap.put(lowerCase, entry.getValue());
        }
        List<String> list = (List) linkedHashMap.get("content-type");
        if (list != null) {
            for (String str : list) {
                if (n.Z1(str, "application/json", true)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f37838a == gVar.f37838a && AbstractC3557B.K(this.f37839b, gVar.f37839b) && AbstractC3557B.K(this.f37840c, gVar.f37840c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f37839b.hashCode();
        return this.f37840c.hashCode() + ((hashCode + (this.f37838a * 31)) * 31);
    }

    public final String toString() {
        return "ServerResponse(statusCode=" + this.f37838a + ", body=" + this.f37839b + ", headers=" + this.f37840c + ')';
    }
}
