package s3;

import android.os.Bundle;

/* loaded from: classes2.dex */
public abstract class T {

    /* renamed from: b  reason: collision with root package name */
    public static final C5550M f45265b = new C5550M(5, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final C5550M f45266c = new C5550M(4);

    /* renamed from: d  reason: collision with root package name */
    public static final C5550M f45267d = new C5550M(7, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final C5550M f45268e = new C5550M(6);

    /* renamed from: f  reason: collision with root package name */
    public static final C5550M f45269f = new C5550M(3, 0);

    /* renamed from: g  reason: collision with root package name */
    public static final C5550M f45270g = new C5550M(2);

    /* renamed from: h  reason: collision with root package name */
    public static final C5550M f45271h = new C5550M(1, 0);

    /* renamed from: i  reason: collision with root package name */
    public static final C5550M f45272i = new C5550M(0);

    /* renamed from: j  reason: collision with root package name */
    public static final C5550M f45273j = new C5550M(10);

    /* renamed from: k  reason: collision with root package name */
    public static final C5550M f45274k = new C5550M(9);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f45275a;

    public T(boolean z10) {
        this.f45275a = z10;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public abstract Object c(String str);

    public Object d(String str, Object obj) {
        return c(str);
    }

    public abstract void e(Bundle bundle, String str, Object obj);

    public final String toString() {
        return b();
    }
}
