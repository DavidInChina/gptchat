package Uf;

import jf.C3956f;
import jf.C3959i;
import kf.AbstractC4268D;
import kg.C4291c;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public static final C4291c f17838a;

    /* renamed from: b  reason: collision with root package name */
    public static final C4291c[] f17839b;

    /* renamed from: c  reason: collision with root package name */
    public static final H f17840c;

    /* renamed from: d  reason: collision with root package name */
    public static final w f17841d;

    static {
        C4291c c4291c = new C4291c("org.jspecify.nullness");
        C4291c c4291c2 = new C4291c("org.jspecify.annotations");
        f17838a = c4291c2;
        C4291c c4291c3 = new C4291c("io.reactivex.rxjava3.annotations");
        C4291c c4291c4 = new C4291c("org.checkerframework.checker.nullness.compatqual");
        String b10 = c4291c3.b();
        f17839b = new C4291c[]{new C4291c(b10.concat(".Nullable")), new C4291c(b10.concat(".NonNull"))};
        C4291c c4291c5 = new C4291c("org.jetbrains.annotations");
        w wVar = w.f17842d;
        C3959i c3959i = new C3959i(c4291c5, wVar);
        C3959i c3959i2 = new C3959i(new C4291c("androidx.annotation"), wVar);
        C3959i c3959i3 = new C3959i(new C4291c("android.support.annotation"), wVar);
        C3959i c3959i4 = new C3959i(new C4291c("android.annotation"), wVar);
        C3959i c3959i5 = new C3959i(new C4291c("com.android.annotations"), wVar);
        C3959i c3959i6 = new C3959i(new C4291c("org.eclipse.jdt.annotation"), wVar);
        C3959i c3959i7 = new C3959i(new C4291c("org.checkerframework.checker.nullness.qual"), wVar);
        C3959i c3959i8 = new C3959i(c4291c4, wVar);
        C3959i c3959i9 = new C3959i(new C4291c("javax.annotation"), wVar);
        C3959i c3959i10 = new C3959i(new C4291c("edu.umd.cs.findbugs.annotations"), wVar);
        C3959i c3959i11 = new C3959i(new C4291c("io.reactivex.annotations"), wVar);
        C4291c c4291c6 = new C4291c("androidx.annotation.RecentlyNullable");
        I i10 = I.f17766h0;
        C3959i c3959i12 = new C3959i(c4291c6, new w(i10, 4));
        C3959i c3959i13 = new C3959i(new C4291c("androidx.annotation.RecentlyNonNull"), new w(i10, 4));
        C3959i c3959i14 = new C3959i(new C4291c("lombok"), wVar);
        C3956f c3956f = new C3956f(2, 0, 0);
        I i11 = I.f17767i0;
        f17840c = new H(AbstractC4268D.a1(c3959i, c3959i2, c3959i3, c3959i4, c3959i5, c3959i6, c3959i7, c3959i8, c3959i9, c3959i10, c3959i11, c3959i12, c3959i13, c3959i14, new C3959i(c4291c, new w(i10, c3956f, i11)), new C3959i(c4291c2, new w(i10, new C3956f(2, 0, 0), i11)), new C3959i(c4291c3, new w(i10, new C3956f(1, 8, 0), i11))));
        f17841d = new w(i10, 4);
    }
}
