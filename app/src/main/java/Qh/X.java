package Qh;

/* loaded from: classes2.dex */
public enum X {
    EQUALS_FULLY("equals"),
    /* JADX INFO: Fake field, exist only in values array */
    EQUALS_FULLY_IGNORE_CASE("equalsIgnoreCase"),
    STARTS_WITH("startsWith"),
    /* JADX INFO: Fake field, exist only in values array */
    STARTS_WITH_IGNORE_CASE("startsWithIgnoreCase"),
    /* JADX INFO: Fake field, exist only in values array */
    ENDS_WITH("endsWith"),
    /* JADX INFO: Fake field, exist only in values array */
    ENDS_WITH_IGNORE_CASE("endsWithIgnoreCase"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTAINS("contains"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTAINS_IGNORE_CASE("containsIgnoreCase"),
    /* JADX INFO: Fake field, exist only in values array */
    MATCHES("matches");
    

    /* renamed from: Y  reason: collision with root package name */
    public final String f14981Y;

    X(String str) {
        this.f14981Y = str;
    }

    public abstract boolean a(String str, String str2);
}
