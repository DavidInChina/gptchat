package th;

import java.lang.annotation.IncompleteAnnotationException;

/* renamed from: th.X  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5791X extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Class f46199a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46200b;

    public C5791X(Class cls, String str) {
        this.f46199a = cls;
        this.f46200b = str;
    }

    @Override // th.a0
    public final int a() {
        return 1;
    }

    @Override // th.a0
    public final boolean b(Object obj) {
        return false;
    }

    @Override // th.a0
    public final Object c() {
        throw new IncompleteAnnotationException(this.f46199a, this.f46200b);
    }
}
