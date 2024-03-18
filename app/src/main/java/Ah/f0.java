package Ah;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class f0 extends Enum implements h0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final f0 f938Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ f0[] f939Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Ah.f0, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f938Y = r12;
        f939Z = new f0[]{r12};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f939Z.clone();
    }

    @Override // Ah.h0
    public final e0 a() {
        return d0.f933Y;
    }
}
