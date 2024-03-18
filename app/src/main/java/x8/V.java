package x8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class V extends Enum implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public static final V f49537Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ V[] f49538Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, x8.V] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f49537Y = r12;
        f49538Z = new V[]{r12};
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) f49538Z.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
