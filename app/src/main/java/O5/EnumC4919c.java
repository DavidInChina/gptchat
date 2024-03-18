package o5;

/* renamed from: o5.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4919c {
    US1("us1", "browser-intake-datadoghq.com"),
    /* JADX INFO: Fake field, exist only in values array */
    US3("us3"),
    /* JADX INFO: Fake field, exist only in values array */
    US5("us5"),
    /* JADX INFO: Fake field, exist only in values array */
    EU1("eu1", "browser-intake-datadoghq.eu"),
    /* JADX INFO: Fake field, exist only in values array */
    AP1("ap1"),
    /* JADX INFO: Fake field, exist only in values array */
    US1_FED("us1_fed", "browser-intake-ddog-gov.com"),
    /* JADX INFO: Fake field, exist only in values array */
    STAGING("staging", "browser-intake-datad0g.com");
    

    /* renamed from: Y  reason: collision with root package name */
    public final String f40608Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f40609Z;

    EnumC4919c(String str, String str2) {
        this.f40608Y = str;
        this.f40609Z = R.a.r("https://", str2);
    }

    EnumC4919c(String str) {
        this(str, android.gov.nist.core.a.A("browser-intake-", str, "-datadoghq.com"));
    }
}
