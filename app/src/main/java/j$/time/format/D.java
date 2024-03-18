package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: a  reason: collision with root package name */
    public static final D f34976a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.D, java.lang.Object] */
    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(char c10) {
        int i10 = c10 - '0';
        if (i10 < 0 || i10 > 9) {
            return -1;
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        ((D) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 182;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
