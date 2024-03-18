package io.sentry;

import java.io.File;

/* renamed from: io.sentry.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3670o {

    /* renamed from: a  reason: collision with root package name */
    public final G f34444a;

    /* renamed from: b  reason: collision with root package name */
    public final H f34445b;

    /* renamed from: c  reason: collision with root package name */
    public final long f34446c;

    /* renamed from: d  reason: collision with root package name */
    public final E1 f34447d;

    public AbstractC3670o(G g10, H h10, long j6, int i10) {
        this.f34444a = g10;
        this.f34445b = h10;
        this.f34446c = j6;
        this.f34447d = new E1(new C3646g(i10));
    }

    public abstract boolean b(String str);

    public abstract void c(File file, C3686u c3686u);
}
