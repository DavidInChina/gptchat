package Ng;

/* loaded from: classes2.dex */
public abstract class G0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f12872a = new ThreadLocal();

    public static AbstractC1053b0 a() {
        ThreadLocal threadLocal = f12872a;
        AbstractC1053b0 abstractC1053b0 = (AbstractC1053b0) threadLocal.get();
        if (abstractC1053b0 == null) {
            C1064h c1064h = new C1064h(Thread.currentThread());
            threadLocal.set(c1064h);
            return c1064h;
        }
        return abstractC1053b0;
    }
}
