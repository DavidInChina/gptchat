package io.ktor.utils.io.jvm.javaio;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f33508a = new ThreadLocal();

    public static final j a() {
        j jVar = (j) f33508a.get();
        if (jVar == null) {
            return f.f33498a;
        }
        return jVar;
    }
}
