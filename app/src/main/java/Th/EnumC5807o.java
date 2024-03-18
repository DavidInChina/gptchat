package th;

import Qh.AbstractC1239q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: th.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5807o extends Enum implements AbstractC5808p {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC5807o f46228Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC5807o[] f46229Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [th.o, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f46228Y = r12;
        f46229Z = new EnumC5807o[]{r12};
    }

    public static EnumC5807o valueOf(String str) {
        return (EnumC5807o) Enum.valueOf(EnumC5807o.class, str);
    }

    public static EnumC5807o[] values() {
        return (EnumC5807o[]) f46229Z.clone();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [th.n, Qh.q] */
    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return new AbstractC1239q(1);
    }
}
