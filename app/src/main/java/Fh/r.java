package Fh;

import wh.AbstractC6250o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class r extends Enum implements t {

    /* renamed from: Y  reason: collision with root package name */
    public static final r f5399Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ r[] f5400Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Fh.r] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f5399Y = r12;
        f5400Z = new r[]{r12};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f5400Z.clone();
    }

    @Override // Fh.t
    public final i a(Nh.l lVar, AbstractC6250o abstractC6250o) {
        return new C0544e(lVar);
    }
}
