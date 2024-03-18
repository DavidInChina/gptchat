package cf;

/* renamed from: cf.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2403b {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f26609a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f26610b;

    static {
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set(Boolean.FALSE);
        f26610b = threadLocal;
    }
}
