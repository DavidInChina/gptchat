package Ah;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Ah.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0085d extends Enum implements Enumeration {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0085d f931Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC0085d[] f932Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Ah.d, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f931Y = r12;
        f932Z = new EnumC0085d[]{r12};
    }

    public static EnumC0085d valueOf(String str) {
        return (EnumC0085d) Enum.valueOf(EnumC0085d.class, str);
    }

    public static EnumC0085d[] values() {
        return (EnumC0085d[]) f932Z.clone();
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return false;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        throw new NoSuchElementException();
    }
}
