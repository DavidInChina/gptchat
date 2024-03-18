package Sf;

import java.lang.reflect.Member;

/* renamed from: Sf.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1382a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1382a f16599a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static U3.c f16600b;

    public static U3.c a(Member member) {
        Class<?> cls = member.getClass();
        try {
            return new U3.c(cls.getMethod("getParameters", new Class[0]), 25, AbstractC1385d.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new U3.c((Object) null, 25, (Object) null);
        }
    }
}
