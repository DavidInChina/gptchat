package Qh;

/* loaded from: classes.dex */
public enum H {
    PUBLIC(1, "isPublic()"),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(4, "isProtected()"),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(2, "isPrivate()"),
    FINAL(16, "isFinal()"),
    /* JADX INFO: Fake field, exist only in values array */
    STATIC(8, "isStatic()"),
    /* JADX INFO: Fake field, exist only in values array */
    SYNCHRONIZED(32, "isSynchronized()"),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE(256, "isNative()"),
    /* JADX INFO: Fake field, exist only in values array */
    STRICT(2048, "isStrict()"),
    /* JADX INFO: Fake field, exist only in values array */
    VAR_ARGS(128, "isVarArgs()"),
    SYNTHETIC(4096, "isSynthetic()"),
    /* JADX INFO: Fake field, exist only in values array */
    BRIDGE(64, "isBridge()"),
    /* JADX INFO: Fake field, exist only in values array */
    ABSTRACT(1024, "isAbstract()"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERFACE(512, "isInterface()"),
    /* JADX INFO: Fake field, exist only in values array */
    ANNOTATION(8192, "isAnnotation()"),
    /* JADX INFO: Fake field, exist only in values array */
    VOLATILE(64, "isVolatile()"),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSIENT(128, "isTransient()"),
    /* JADX INFO: Fake field, exist only in values array */
    MANDATED(32768, "isMandated()"),
    /* JADX INFO: Fake field, exist only in values array */
    ENUMERATION(16384, "isEnum()");
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f14970Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f14971Z;

    /* renamed from: h0  reason: collision with root package name */
    public final I f14972h0 = new I(this);

    H(int i10, String str) {
        this.f14970Y = i10;
        this.f14971Z = str;
    }
}
