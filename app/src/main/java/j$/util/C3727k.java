package j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.k  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3727k {

    /* renamed from: b  reason: collision with root package name */
    private static final C3727k f35365b = new C3727k();

    /* renamed from: a  reason: collision with root package name */
    private final Object f35366a;

    private C3727k() {
        this.f35366a = null;
    }

    private C3727k(Object obj) {
        this.f35366a = Objects.requireNonNull(obj);
    }

    public static C3727k a() {
        return f35365b;
    }

    public static C3727k d(Object obj) {
        return new C3727k(obj);
    }

    public final Object b() {
        Object obj = this.f35366a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f35366a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3727k) {
            return Objects.equals(this.f35366a, ((C3727k) obj).f35366a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f35366a);
    }

    public final String toString() {
        Object obj = this.f35366a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
