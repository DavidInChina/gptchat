package yh;

import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: yh.e1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6605e1 extends Enum implements k1 {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC6605e1 f50998Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC6605e1[] f50999Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [yh.e1, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f50998Y = r12;
        f50999Z = new EnumC6605e1[]{r12};
    }

    public static EnumC6605e1 valueOf(String str) {
        return (EnumC6605e1) Enum.valueOf(EnumC6605e1.class, str);
    }

    public static EnumC6605e1[] values() {
        return (EnumC6605e1[]) f50999Z.clone();
    }

    @Override // yh.k1
    public final Object a(l1.a aVar) {
        return aVar.p0();
    }

    @Override // yh.k1
    public final Object b(l1.a aVar) {
        return aVar.p0();
    }

    @Override // yh.k1
    public final Object c(l1.a aVar) {
        return aVar.p0();
    }

    @Override // yh.k1
    public final Object d(l1.a aVar) {
        throw new IllegalArgumentException("Cannot erase a wildcard type: " + aVar);
    }

    @Override // yh.k1
    public final Object e(l1.a aVar) {
        return aVar.p0();
    }
}
