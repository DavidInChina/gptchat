package E8;

import U3.l;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f4546a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f4547b;

    public c(String str, Map map) {
        this.f4546a = str;
        this.f4547b = map;
    }

    public static l a(String str) {
        return new l(18, str);
    }

    public static c b(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4546a.equals(cVar.f4546a) && this.f4547b.equals(cVar.f4547b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4547b.hashCode() + (this.f4546a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f4546a + ", properties=" + this.f4547b.values() + "}";
    }
}
