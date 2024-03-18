package Wh;

/* loaded from: classes2.dex */
public enum x {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: Y  reason: collision with root package name */
    public final String f21330Y;

    x(String str) {
        this.f21330Y = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f21330Y;
    }
}
